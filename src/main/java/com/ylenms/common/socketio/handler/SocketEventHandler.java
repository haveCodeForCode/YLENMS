package com.ylenms.common.socketio.handler;

import com.corundumstudio.socketio.AckCallback;
import com.corundumstudio.socketio.AckRequest;
import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.SocketIOServer;
import com.corundumstudio.socketio.annotation.OnConnect;
import com.corundumstudio.socketio.annotation.OnDisconnect;
import com.corundumstudio.socketio.annotation.OnEvent;
import com.ylenms.common.socketio.model.SocketMessage;
import com.mysql.cj.x.protobuf.MysqlxExpect.Open.Condition.Key;

import java.util.ArrayList;
import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 消息事件处理器
 *
 * @author YLENMS
 * @version 1.0
 * @since 2018/1/19
 */
@Component
public class SocketEventHandler {

    private static List<SocketIOClient> clients = new ArrayList<SocketIOClient>();//用于保存所有客户端  
    public static boolean sendack=false;
    private static final Logger logger = LoggerFactory.getLogger(SocketEventHandler.class);

    public	String	sKey="2c13e5276423f0797456304821cbd8aa";
    //添加connect事件，当客户端发起连接时调用
    @OnConnect
    public void onConnect(SocketIOClient client) {
        if (client != null) {
            String key = client.getHandshakeData().getSingleUrlParam("key");
            String sn = client.getHandshakeData().getSingleUrlParam("sn");
            String sessionId = client.getSessionId().toString();

            if (key.equals(sKey)) {
				client.sendEvent("EVENT_AUDIT", "success");
	            logger.info("设备"+sn+"连接成功, key=" + key + ", sessionId=" + sessionId);
	            clients.add(client);
			}else {
				client.sendEvent("EVENT_AUDIT", "failure");
	            logger.info("设备"+sn+"连接失败, key校验失败 sessionId=" + sessionId);
				onDisconnect(client);
			}
        } else {
            logger.error("客户端为空");
        }
    }

    //添加@OnDisconnect事件，客户端断开连接时调用，刷新客户端信息
    @OnDisconnect
    public void onDisconnect(SocketIOClient client) {
        logger.info("客户端断开连接, sessionId=" + client.getSessionId().toString());
        client.disconnect();
    }

    // 消息接收入口
//    @OnEvent(value = "chatevent")
//    public void onEvent(SocketIOClient client, AckRequest ackRequest, SocketMessage chat) {
//        logger.info("接收到客户端消息");
//        if (ackRequest.isAckRequested()) {
//            // send ack response with data to client
//            ackRequest.sendAckData("服务器回答chatevent, userName=" + chat.getUserName() + ",message=" + chat.getMessage());
//            
//        }
//    }

    // 消息发送入口
    @OnEvent(value = "EVENT_CONTROL")
    public static void  sendData(String sn, SocketMessage socketMessage) {
   	
        logger.info("发送消息到客户端:"+sn);
        for(int i=0;i<clients.size();i++) {
        	if(clients.get(i).getHandshakeData().getSingleUrlParam("sn").equals(sn)) {
                // send data to client
               // ackRequest.sendAckData("服务器回答chatevent, userName=" + chat.getUserName() + ",message=" + chat.getMessage());
        		SocketIOClient	client=clients.get(i);
                // send message back to client with ack callback
                // WITH data
                client.sendEvent("EVENT_CONTROL", new AckCallback<String>(String.class) {
                    @Override
                    public void onSuccess(String result) {
                        logger.info("ack from client: " + client.getSessionId() + " data: " + result);
                        if (result.equals("success")) {
                            sendack=true;
						}
                    }
                }, socketMessage);
        	}
        }
    }
}
