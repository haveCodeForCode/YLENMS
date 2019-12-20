package com.ylenms.project.sale.contract.controller;

import java.util.ArrayList;
import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.tomcat.jni.Mmap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ylenms.framework.aspectj.lang.annotation.Log;
import com.ylenms.framework.aspectj.lang.enums.BusinessType;
import com.ylenms.project.sale.contract.domain.Contract;
import com.ylenms.project.sale.contract.service.IContractService;
import com.ylenms.project.sale.customer.domain.Customer;
import com.ylenms.project.sale.customer.service.ICustomerService;
import com.ylenms.framework.web.controller.BaseController;
import com.ylenms.framework.web.domain.AjaxResult;
import com.ylenms.common.utils.poi.ExcelUtil;
import com.ylenms.common.utils.security.ShiroUtils;
import com.ylenms.framework.web.page.TableDataInfo;

/**
 * 合同Controller
 * 
 * @author ylenms
 * @date 2019-11-01
 */
@Controller
@RequestMapping("/sale/contract")
public class ContractController extends BaseController
{
    private String prefix = "sale/contract";

    @Autowired
    private IContractService ContractService;
    
	@Autowired
	private ICustomerService CustomerService;

    @RequiresPermissions("sale:contract:view")
    @GetMapping()
    public String contract()
    {
        return prefix + "/contract";
    }

	@RequiresPermissions("sale:contract:view")
	@GetMapping("/showContract")
	public String showContract()
	{
	    return prefix + "/showContract";
	}
    /**
     * 查询合同列表
     */
    @RequiresPermissions("sale:contract:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Contract Contract)
    {
        startPage();
        List<Contract> list = ContractService.selectContractList(Contract);
        return getDataTable(list);
    }
	/**
	 * 详情设备字典
	 */
    @RequiresPermissions("sale:contract:detail")
	@GetMapping("/detail/{id}")
	public String detail(@PathVariable("id") Long id, ModelMap mmap)
	{
        Contract Contract = ContractService.selectContractById(id);
        mmap.put("Contract", Contract);
        return prefix + "/detail";
	}

    /**
     * 导出合同列表
     */
    @RequiresPermissions("sale:contract:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Contract Contract)
    {
        List<Contract> list = ContractService.selectContractList(Contract);
        ExcelUtil<Contract> util = new ExcelUtil<Contract>(Contract.class);
        return util.exportExcel(list, "contract");
    }

    /**
     * 新增合同
     */
    @GetMapping("/add")
    public String add(ModelMap mmap)
    {
		Customer customer=new Customer();
		List<Customer> customerList =CustomerService.selectCustomerList(customer);
		
		mmap.put("customerList", customerList);
		mmap.put("userName", ShiroUtils.getLoginName());
        return prefix + "/add";
    }
    /**
     * 校验合同编号
     */
    @PostMapping("/checkCodeUnique")
    @ResponseBody
    public String checkCodeUnique(Contract contract)
    {
        String uniqueFlag = "0";
        if (contract.getCodeid() != null && !contract.getCodeid().equals(""))
        { 
        	List<Contract> contracts = ContractService.selectContractList(contract);
        	if(contracts != null && contracts.size()>0) {
        		uniqueFlag = "1";
        	}
        }
        return uniqueFlag;
    }
    /**
     * 新增保存合同
     */
    @RequiresPermissions("sale:contract:add")
    @Log(title = "合同", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Contract Contract)
    {
        return toAjax(ContractService.insertContract(Contract));
    }

    /**
     * 修改合同
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Contract Contract = ContractService.selectContractById(id);
        mmap.put("Contract", Contract);
        return prefix + "/edit";
    }

    /**
     * 修改保存合同
     */
    @RequiresPermissions("sale:contract:edit")
    @Log(title = "合同", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Contract Contract)
    {
        return toAjax(ContractService.updateContract(Contract));
    }

    /**
     * 删除合同
     */
    @RequiresPermissions("sale:contract:remove")
    @Log(title = "合同", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(ContractService.deleteContractByIds(ids));
    }
    
	/**
	 * 展示质量详情
	 */
	@GetMapping("/contractLink/{codeid}")
	public String cpqsLink(@PathVariable("codeid") String codeid, ModelMap mmap) {
		Contract contract = new Contract();
		contract.setCodeid(codeid);
		List<Contract> list = ContractService.selectContractList(contract);
		mmap.put("Contract", list.get(0));
		return prefix + "/detail";
	}
}
