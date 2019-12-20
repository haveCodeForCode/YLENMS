package com.ylenms.project.basic.amdevice.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ylenms.framework.aspectj.lang.annotation.Log;
import com.ylenms.framework.aspectj.lang.enums.BusinessType;
import com.ylenms.project.basic.amdevice.domain.Amdevice;
import com.ylenms.project.basic.amdevice.service.IAmdeviceService;
import com.ylenms.framework.web.controller.BaseController;
import com.ylenms.framework.web.domain.AjaxResult;
import com.ylenms.common.utils.poi.ExcelUtil;
import com.ylenms.framework.web.page.TableDataInfo;

/**
 * 设备字典Controller
 * 
 * @author ylenms
 * @date 2019-12-14
 */
@Controller
@RequestMapping("/basic/amdevice")
public class AmdeviceController extends BaseController
{
    private String prefix = "basic/amdevice";

    @Autowired
    private IAmdeviceService amdeviceService;

    @RequiresPermissions("basic:amdevice:view")
    @GetMapping()
    public String amdevice()
    {
        return prefix + "/amdevice";
    }

    /**
     * 查询设备字典列表
     */
    @RequiresPermissions("basic:amdevice:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Amdevice amdevice)
    {
        startPage();
        amdevice.setDevtype(1);
        List<Amdevice> list = amdeviceService.selectAmdeviceList(amdevice);
        return getDataTable(list);
    }

    /**
     * 导出设备字典列表
     */
    @RequiresPermissions("basic:amdevice:export")
    @Log(title = "设备字典", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Amdevice amdevice)
    {
        List<Amdevice> list = amdeviceService.selectAmdeviceList(amdevice);
        ExcelUtil<Amdevice> util = new ExcelUtil<Amdevice>(Amdevice.class);
        return util.exportExcel(list, "amdevice");
    }

    /**
     * 新增设备字典
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存设备字典
     */
    @RequiresPermissions("basic:amdevice:add")
    @Log(title = "设备字典", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Amdevice amdevice)
    {
        return toAjax(amdeviceService.insertAmdevice(amdevice));
    }

    /**
     * 修改设备字典
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Amdevice amdevice = amdeviceService.selectAmdeviceById(id);
        mmap.put("amdevice", amdevice);
        return prefix + "/edit";
    }

    /**
     * 修改保存设备字典
     */
    @RequiresPermissions("basic:amdevice:edit")
    @Log(title = "设备字典", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(@Validated Amdevice amdevice)
    {
        return toAjax(amdeviceService.updateAmdevice(amdevice));
    }

    /**
     * 删除设备字典
     */
    @RequiresPermissions("basic:amdevice:remove")
    @Log(title = "设备字典", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(amdeviceService.deleteAmdeviceByIds(ids));
    }
}
