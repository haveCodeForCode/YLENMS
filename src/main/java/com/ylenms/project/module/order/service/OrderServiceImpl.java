package com.ylenms.project.module.order.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ylenms.common.utils.StringUtils;
import com.ylenms.common.utils.text.Convert;
import com.ylenms.project.module.order.mapper.OrderMapper;
import com.ylenms.project.module.order.domain.Order;

/**
 * 订单 服务层实现
 * 
 * @author ylenms
 * @date 2018-08-20
 */
@Service
public class OrderServiceImpl implements IOrderService 
{
	@Autowired
	private OrderMapper orderMapper;

	/**
     * 查询订单信息
     * 
     * @param id 订单ID
     * @return 订单信息
     */
    @Override
	public Order selectOrderById(Integer id)
	{
	    return orderMapper.selectOrderById(id);
	}
	
	/**
     * 查询订单列表
     * 
     * @param order 订单信息
     * @return 订单集合
     */
	@Override
	public List<Order> selectOrderList(Order order)
	{
	    return orderMapper.selectOrderList(order);
	}
	
    /**
     * 新增订单
     * 
     * @param order 订单信息
     * @return 结果
     */
	@Override
	public int insertOrder(Order order)
	{
	    return orderMapper.insertOrder(order);
	}
	
	/**
     * 修改订单
     * 
     * @param order 订单信息
     * @return 结果
     */
	@Override
	public int updateOrder(Order order)
	{
	    return orderMapper.updateOrder(order);
	}
	
	/**
     * 保存订单
     * 
     * @param order 订单信息
     * @return 结果
     */
	@Override
	public int saveOrder(Order order)
	{
	    Long id = order.getId();
		int rows = 0;
		if (StringUtils.isNotNull(id))
        {
		    rows = orderMapper.updateOrder(order);
		}
		else
        {
		    rows = orderMapper.insertOrder(order);
		}
		return rows;
	}
	
	/**
     * 删除订单对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteOrderByIds(String ids)
	{
		return orderMapper.deleteOrderByIds(Convert.toIntArray(ids));
	}
	
}
