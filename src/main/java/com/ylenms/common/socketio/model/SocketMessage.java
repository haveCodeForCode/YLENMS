package com.ylenms.common.socketio.model;

/**
 * ChatMessage
 *
 * @author YLENMS
 * @version 1.0
 * @since 2018/1/30
 */
public class SocketMessage {
    private String msgType;
    private String msgName;
    private String msgContent;
	public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	public String getMsgName() {
		return msgName;
	}
	public void setMsgName(String msgName) {
		this.msgName = msgName;
	}
	public String getMsgContent() {
		return msgContent;
	}
	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}
    
}
