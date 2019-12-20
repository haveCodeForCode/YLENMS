package com.ylenms.project.basic.waterdevice.controller;

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
import com.ylenms.project.basic.waterdevice.domain.Waterdevice;
import com.ylenms.project.basic.waterdevice.service.IWaterdeviceService;
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
@RequestMapping("/basic/waterdevice")
public class WaterdeviceController extends BaseController
{
    private String prefix = "basic/waterdevice";

    @Autowired
    private IWaterdeviceService waterdeviceService;

    @RequiresPermissions("basic:waterdevice:view")
    @GetMapping()
    public String waterdevice()
    {
        return prefix + "/waterdevice";
    }

    /**
     * 查询设备字典列表
     */
    @RequiresPermissions("basic:waterdevice:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Waterdevice waterdevice)
    {
        startPage();
        waterdevice.setDevtype(2);
        List<Waterdevice> list = waterdeviceService.selectWaterdeviceList(waterdevice);
        return getDataTable(list);
    }

    /**
     * 导出设备字典列表
     */
    @RequiresPermissions("basic:waterdevice:export")
    @Log(title = "设备字典", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Waterdevice waterdevice)
    {
        List<Waterdevice> list = waterdeviceService.selectWaterdeviceList(waterdevice);
        ExcelUtil<Waterdevice> util = new ExcelUtil<Waterdevice>(Waterdevice.class);
        return util.exportExcel(list, "waterdevice");
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
    @RequiresPermissions("basic:waterdevice:add")
    @Log(title = "设备字典", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Waterdevice waterdevice)
    {
        return toAjax(waterdeviceService.insertWaterdevice(waterdevice));
    }

    /**
     * 修改设备字典
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Waterdevice waterdevice = waterdeviceService.selectWaterdeviceById(id);
        mmap.put("waterdevice", waterdevice);
        return prefix + "/edit";
    }

    /**
     * 修改保存设备字典
     */
    @RequiresPermissions("basic:waterdevice:edit")
    @Log(title = "设备字典", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(@Validated Waterdevice waterdevice)
    {
        return toAjax(waterdeviceService.updateWaterdevice(waterdevice));
    }

    /**
     * 删除设备字典
     */
    @RequiresPermissions("basic:waterdevice:remove")
    @Log(title = "设备字典", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(waterdeviceService.deleteWaterdeviceByIds(ids));
    }
}
