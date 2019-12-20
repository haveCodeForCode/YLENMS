package com.ylenms.project.module.order.service;

import com.ylenms.project.module.order.domain.Order;
import java.util.List;

/**
 * 订单 服务层
 * 
 * @author ylenms
 * @date 2018-08-20
 */
public interface IOrderService 
{
	/**
     * 查询订单信息
     * 
     * @param id 订单ID
     * @return 订单信息
     */
	public Order selectOrderById(Integer id);
	
	/**
     * 查询订单列表
     * 
     * @param order 订单信息
     * @return 订单集合
     */
	public List<Order> selectOrderList(Order order);
	
	/**
     * 新增订单
     * 
     * @param order 订单信息
     * @return 结果
     */
	public int insertOrder(Order order);
	
	/**
     * 修改订单
     * 
     * @param order 订单信息
     * @return 结果
     */
	public int updateOrder(Order order);
	
	/**
     * 保存订单
     * 
     * @param order 订单信息
     * @return 结果
     */
	public int saveOrder(Order order);
	
	
	/**
     * 删除订单信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteOrderByIds(String ids);


	
}
