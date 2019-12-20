package com.ylenms.project.module.order.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ylenms.project.module.order.domain.Order;
import com.ylenms.project.module.order.service.IOrderService;
import com.ylenms.framework.web.controller.BaseController;
import com.ylenms.framework.web.page.TableDataInfo;
import com.ylenms.framework.web.domain.AjaxResult;

/**
 * 订单 信息操作处理
 * 
 * @author ylenms
 * @date 2018-08-20
 */
@Controller
@RequestMapping("/module/order")
public class OrderController extends BaseController
{
    private String prefix = "module/order";
	
	@Autowired
	private IOrderService orderService;


	@RequiresPermissions("module:order:view")
	@GetMapping()
	public String order()
	{
	    return prefix + "/order";
	}

	@RequiresPermissions("module:creatdispatch:view")
	@GetMapping("/dispatch")
	public String dispatch()
	{
		return prefix + "/dispatch";
	}

	/**
	 * 查询订单列表
	 */
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Order order)
	{
		startPage();
        List<Order> list = orderService.selectOrderList(order);
		return getDataTable(list);
	}


	/**
	 * 装柜路径
	 * @return
	 */
	@RequiresPermissions("module:order:view")
	@GetMapping("/sark")
	public String sark()
	{
	    return prefix + "/sark";
	}
	/**
	 * 查询订单列表
	 */
	@RequiresPermissions("module:order:list")
	@PostMapping("/sarklist")
	@ResponseBody
	public TableDataInfo sarklist(Order order)
	{
		startPage();
        List<Order> list = orderService.selectOrderList(order);
		return getDataTable(list);
	}

	/**
	 * 已下单列表查询
	 */
	@RequiresPermissions("module:order:list")
	@PostMapping("/scheduling")
	@ResponseBody
	public TableDataInfo scheduling(Order order)
	{
		startPage();
		order.setStatus("4");//下单
        List<Order> list = orderService.selectOrderList(order);
		return getDataTable(list);
	}

	/**
	 * 新增订单
	 */
	@RequiresPermissions("module:order:add")
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}

	/**
	 * 修改订单
	 */
	@RequiresPermissions("module:order:edit")
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, Model model)
	{
		Order order = orderService.selectOrderById(id);
		model.addAttribute("order", order);
	    return prefix + "/edit";
	}
	
	/**
	 * 保存订单
	 */
	@RequiresPermissions("module:order:save")
	@PostMapping("/save")
	@ResponseBody
	public AjaxResult save(Order order)
	{
		if (orderService.saveOrder(order) > 0)
		{
			return success();
		}
		return error();
	}
	
	/**
	 * 删除订单
	 */
	@RequiresPermissions("module:order:remove")
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{
		int rows = orderService.deleteOrderByIds(ids);
		if (rows > 0)
        {
            return success();
        }
        return error();
	}


	/**
	 * 根据调度单查询订单列表
	 */
	@PostMapping("/dispatchOrderList")
	@ResponseBody
	public TableDataInfo dispatchOrderList(Order order)
	{
		startPage();
		//判断是否拼幅宽关联号为空
		if(order.getRemark() == null || order.getRemark().equals("")){
			List<Order> list = new ArrayList<>();
			return getDataTable(list);
		}
		List<Order> list = new ArrayList<>();
		List<Order> orderList = new ArrayList<>();
		if(order.getRemark().indexOf("D") == 0){//判断为拼柜
			//订单号字符串分割
			String[] strs = order.getRemark().split(",");
			for(String orderid:strs){
				Order orderReg = new Order();
				orderReg.setPdod(orderid);
				orderReg = orderService.selectOrderList(orderReg).get(0);
				orderList.add(orderReg);
			}
		}else{
		}
		if(orderList != null && orderList.size()>0){
			list = orderList;
		}else{
			list = new ArrayList<>();
		}
		return getDataTable(list);
	}
	
}
