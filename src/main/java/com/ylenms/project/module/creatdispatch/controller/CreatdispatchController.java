package com.ylenms.project.module.creatdispatch.controller;

import java.util.*;

import com.ylenms.common.utils.security.ShiroUtils;
import com.ylenms.common.utils.text.Convert;
import com.ylenms.framework.aspectj.lang.annotation.Log;
import com.ylenms.framework.aspectj.lang.enums.BusinessType;
import com.ylenms.project.module.order.domain.Order;
import com.ylenms.project.module.order.service.IOrderService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ylenms.project.module.creatdispatch.domain.Creatdispatch;
import com.ylenms.project.module.creatdispatch.service.ICreatdispatchService;
import com.ylenms.framework.web.controller.BaseController;
import com.ylenms.framework.web.page.TableDataInfo;
import com.ylenms.framework.web.domain.AjaxResult;

/**
 * 生产调度 信息操作处理
 * 
 * @author ylenms
 * @date 2018-09-12
 */
@Controller
@RequestMapping("/module/creatdispatch")
public class CreatdispatchController extends BaseController
{
    private String prefix = "module/creatdispatch";
	
	@Autowired
	private ICreatdispatchService creatdispatchService;

	@Autowired
	private IOrderService orderService;

	
	@RequiresPermissions("module:creatdispatch:view")
	@GetMapping()
	public String creatdispatch()
	{
	    return prefix + "/creatdispatch";
	}

	/**
	 * 查询生产调度列表
	 */
	@RequiresPermissions("module:creatdispatch:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Creatdispatch creatdispatch)
	{
		startPage();
        List<Creatdispatch> list = creatdispatchService.selectCreatdispatchList(creatdispatch);
		return getDataTable(list);
	}

	/**
	 * 调度单下达list
	 * @param creatdispatch
	 * @return
	 */
	@PostMapping("/auditList")
	@ResponseBody
	public TableDataInfo auditList(Creatdispatch creatdispatch)
	{
		startPage();
		//只有审核人和申请人可查看
		if(checkUser("module:creatdispatch:audit")) {
			creatdispatch.setInputname("");
		}else if(checkUser("module:creatdispatch:submit")){
			creatdispatch.setInputname(ShiroUtils.getSysUser().getUserName());
		}else{
			creatdispatch.setInputname("-1");
		}
        List<Creatdispatch> list = creatdispatchService.selectCreatdispatchListByStatus(creatdispatch);
		return getDataTable(list);
	}

	@RequiresPermissions("module:creatdispatch:view")
	@GetMapping("detail")
	public String detail()
	{
	    return prefix + "/detail";
	}



	/**
	 * 查询生产调度列表
	 */
	@RequiresPermissions("module:creatdispatch:list")
	@PostMapping("/detaillist")
	@ResponseBody
	public TableDataInfo detaillist(Creatdispatch creatdispatch)
	{
		startPage();
		creatdispatch.setStatus("1");
        List<Creatdispatch> list = creatdispatchService.selectCreatdispatchList(creatdispatch);
		return getDataTable(list);
	}

	/**
	 * 新增生产调度
	 */
	@RequiresPermissions("module:creatdispatch:add")
	@GetMapping("/add")

	public String add()
	{
	    return prefix + "/add";
	}

	/**
	 * 修改生产调度
	 */
	@RequiresPermissions("module:creatdispatch:edit")
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, Model model)
	{
		Creatdispatch creatdispatch = creatdispatchService.selectCreatdispatchById(id);
		model.addAttribute("creatdispatch", creatdispatch);
	    return prefix + "/edit";
	}

	//调度单时间编辑
	@GetMapping("/editTime/{id}")
	public String editTime(@PathVariable("id") Integer id, Model model)
	{
		Creatdispatch creatdispatch = creatdispatchService.selectCreatdispatchById(id);
		model.addAttribute("creatdispatch", creatdispatch);
	    return prefix + "/editTime";
	}

	/**
	 * 保存生产调度
	 */
	@PostMapping("/save")
	@ResponseBody
	@Log(title = "保存特殊调度单（分切等）", businessType = BusinessType.INSERT)
	public AjaxResult save(Creatdispatch creatdispatch)
	{

		if (creatdispatchService.saveCreatdispatch(creatdispatch) > 0)
		{
			return success();
		}
		return error();
	}


	/**
	 * 删除生产调度
	 */
	@RequiresPermissions("module:creatdispatch:remove")
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{
		int rows = creatdispatchService.deleteCreatdispatchByIds(ids);
		if (rows > 0)
        {
            return success();
        }
        return error();
	}

	/**
	 * 保存生产调度
	 */
	@PostMapping("/updateOptag")
	@ResponseBody
	public AjaxResult updateOptag(Creatdispatch creatdispatch)
	{
		if (creatdispatchService.saveCreatdispatch(creatdispatch) > 0)
		{
			return success();
		}
		return error();
	}
	/**
	 * 保存调度单排序
	 */
	@PostMapping("/sort")
	@ResponseBody
	@Log(title = "保存调度单排序", businessType = BusinessType.INSERT)
	public AjaxResult updateOptag(String ids,int optag)
	{
		int rows = 0;
		String str = "PX"+System.currentTimeMillis();//统一调度单号
		for (int i = 0; i < Convert.toIntArray(ids).length; i++) {
			Creatdispatch creatdispatch = creatdispatchService.selectCreatdispatchById(Convert.toIntArray(ids)[i]);
			creatdispatch.setSortnum(i+1);//排序序号
			creatdispatch.setSortid(str);
			creatdispatch.setOptag(optag);
			creatdispatch.setAuditflag("0");//审核状态
			creatdispatch.setPdstatus("0");//生产状态
			creatdispatch.setPdrate(0.0f);//生产进度
			creatdispatch.setStatus("2");
			rows = creatdispatchService.updateCreatdispatch(creatdispatch);
		}
		if (rows > 0)
		{
			return success();
		}
		return error();
	}



	/**
	 * 到物料需求页面
	 *
	 * @return
	 */
	@GetMapping("/material")
	public String material()
	{
		return "module/maschedule" + "/material";
	}
	/**
	 * 查询物料需求页面信息
	 * @param creatdispatch
	 * @return
	 */
	@PostMapping("/materiallist")
	@ResponseBody
	public TableDataInfo materiallist(Creatdispatch creatdispatch)
	{
		startPage();
		List<Creatdispatch> list = creatdispatchService.selectCreatdispatchList(creatdispatch);
		return getDataTable(list);
	}

    /**
     * 到工艺页面
     * @return
     */
	@GetMapping("/technology")
	public String technology()
	{
		return "module/order" + "/technology";
	}

	/**
	 * 查询以下达的生产调度单（工艺列表）
	 * @param creatdispatch
	 * @return
	 */
	@PostMapping("/techlist")
	@ResponseBody
	public TableDataInfo techlist(Creatdispatch creatdispatch)
	{
		startPage();
		List<Creatdispatch> list = creatdispatchService.selectCreatdispatchList(creatdispatch);
		return getDataTable(list);
	}


	/**
	 * 查询以下达的生产调度单（工艺列表）
	 * @param order
	 * @return
	 */
	@PostMapping("/technologyOrderlist")
	@ResponseBody
	public TableDataInfo technologyOrderlist(Order order)
	{
//		System.out.println("++++++++++根据调度单查询订单列表12++++++++++");
//		List<Order> list = new ArrayList<>();
//		return getDataTable(list);
		startPage();
		//判断是否拼幅宽关联号为空
		if(order.getRemark() == null || order.getRemark().equals("")){
			List<Order> list = new ArrayList<>();
			return getDataTable(list);
		}

		List<Order> orderList = new ArrayList<>();

		List<Order> list = new ArrayList<>();
		if(orderList != null && orderList.size()>0){
			list = orderList;
		}else{
			list = new ArrayList<>();
		}
		return getDataTable(list);
	}

	
	
	/**
	 * 工艺详情
	 */
	@GetMapping("/technologyDetails2/{id}")
	public String technologyDetails2(@PathVariable("id") String id,Model model)
	{
		model.addAttribute("id", id);
		model.addAttribute("url", prefix);
		return "module/technologyDetails2";
	}


	/**
	 *	排产预查
	 */
	@GetMapping("/sorted")
	public String sorted()
	{
		return prefix + "/sorted";
	}


	/**
	 *	调度单下达
	 */
	@GetMapping("/toAudit")
	public String toAudit()
	{
		return prefix + "/audit";
	}



	/**
	 * 申请-单个
	 */

	@RequiresPermissions("module:creatdispatch:submit")
	@PostMapping("/submit/{id}")
	@ResponseBody
	@Log(title = "调度单申请", businessType = BusinessType.OTHER)
	public AjaxResult updateSubmit(@PathVariable("id")String ids) {

		int rows = creatdispatchService.updateAuditflagByIds(ids, 1);
		Creatdispatch creatdispatch = creatdispatchService.selectCreatdispatchById(Integer.parseInt(ids));

		if (rows > 0) {
			return success();
		}
		return error();
	}




	/**
	 * 到审核理由
	 */
	@GetMapping("/toRession/{id}")
	public String toRession(@PathVariable("id") String id,Model model)
	{
		model.addAttribute("id", id);
		model.addAttribute("url", prefix);
		return "module/ression";
	}

	/**
	 * 退审
	 */
	@RequiresPermissions("module:creatdispatch:audit")
	@PostMapping("/unaudit")
	@ResponseBody
	@Log(title = "调度单退审", businessType = BusinessType.OTHER)
	public AjaxResult updateUnAudit(String id,String ression) {
		Creatdispatch creatdispatch = creatdispatchService.selectCreatdispatchById(Integer.parseInt(id));
		creatdispatch.setRession(ression);
		creatdispatch.setOptag(0);
		creatdispatchService.saveCreatdispatch(creatdispatch);
		int rows = creatdispatchService.updateAuditflagByIds(id, 3);

		return success();
	}

	/**
	 * 更新产品审核状态
	 */
	@RequiresPermissions("module:creatdispatch:audit")
	@PostMapping("/audit/{id}")
	@ResponseBody
	@Log(title = "调度单审核", businessType = BusinessType.OTHER)
	public AjaxResult updateAudit(@PathVariable("id") String ids) {
		Creatdispatch creatdispatch = creatdispatchService.selectCreatdispatchById(Integer.parseInt(ids));
		creatdispatch.setStatus("3");
		creatdispatch.setAuditname(ShiroUtils.getSysUser().getUserName());
		creatdispatch.setAudittime(new Date());
		creatdispatchService.updateCreatdispatch(creatdispatch);
		int rows = creatdispatchService.updateAuditflagByIds(ids, 2);


		return success();
	}
	/**
	 * 更新调度单下达状态
	 */
	@RequiresPermissions("module:creatdispatch:dispatch")
	@PostMapping("/dispatch/{id}")
	@ResponseBody
	@Log(title = "调度单下达", businessType = BusinessType.OTHER)
	public AjaxResult updateDispatch(@PathVariable("id") String ids) {
		int rows = creatdispatchService.updateAuditflagByIds(ids, 4);
		Creatdispatch creatdispatch = creatdispatchService.selectCreatdispatchById(Integer.parseInt(ids));
		creatdispatch.setOptag(2);
		creatdispatch.setStatus("5");
		creatdispatchService.updateCreatdispatch(creatdispatch);
		return success();
	}

    /**
     * 到生产进度页
     */
    @GetMapping("/rate")
    public String rate()
    {
        return prefix + "/rate";
    }


    /**
     * 到物料调度页
     */
    @GetMapping("/control")
    public String control()
    {
        return prefix + "/control";
    }


	/**
	 * 到库存不足解决方案界面
	 */
	@GetMapping("/solution/{id}")
	public String solution(@PathVariable("id") Integer id, Model model)
	{
		Creatdispatch creatdispatch = creatdispatchService.selectCreatdispatchById(id);
		model.addAttribute("creatdispatch", creatdispatch);
		return prefix + "/solution";
	}

	@ResponseBody
	@PostMapping("/saveSolution")
	@Log(title = "库存不足解决方案", businessType = BusinessType.UPDATE)
	public AjaxResult saveSolution(Creatdispatch creatdispatch)
	{
		if (creatdispatchService.saveCreatdispatch(creatdispatch) > 0)
		{
			return success();
		}
		return error();
	}

	@GetMapping("/addTarget/{id}")
	public String addTarget(@PathVariable("id") Integer id, Model model)
	{
		Creatdispatch creatdispatch = creatdispatchService.selectCreatdispatchById(id);
		model.addAttribute("creatdispatch", creatdispatch);
		return prefix + "/addTarget";
	}
}