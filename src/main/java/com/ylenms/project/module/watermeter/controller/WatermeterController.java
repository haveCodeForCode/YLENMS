package com.ylenms.project.module.watermeter.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
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
import com.ylenms.project.module.watermeter.domain.Watermeter;
import com.ylenms.project.module.watermeter.service.IWatermeterService;
import com.ylenms.framework.web.controller.BaseController;
import com.ylenms.framework.web.domain.AjaxResult;
import com.ylenms.common.utils.poi.ExcelUtil;
import com.ylenms.framework.web.page.TableDataInfo;

/**
 * 水信息Controller
 * 
 * @author ylenms
 * @date 2019-12-14
 */
@Controller
@RequestMapping("/module/watermeter")
public class WatermeterController extends BaseController
{
    private String prefix = "module/watermeter";

    @Autowired
    private IWatermeterService watermeterService;

    @RequiresPermissions("module:watermeter:view")
    @GetMapping()
    public String watermeter()
    {
        return prefix + "/watermeter";
    }

    @RequiresPermissions("module:watermeter:view")
    @GetMapping("waterinfo")
    public String waterinfo()
    {
        return prefix + "/waterinfo";
    }

    /**
     * 查询水信息列表
     */
    @RequiresPermissions("module:watermeter:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Watermeter watermeter)
    {
        startPage();
        List<Watermeter> list = watermeterService.selectWatermeterList(watermeter);
        return getDataTable(list);
    }

    /**
     * 导出水信息列表
     */
    @RequiresPermissions("module:watermeter:export")
    @Log(title = "水信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Watermeter watermeter)
    {
        List<Watermeter> list = watermeterService.selectWatermeterList(watermeter);
        ExcelUtil<Watermeter> util = new ExcelUtil<Watermeter>(Watermeter.class);
        return util.exportExcel(list, "watermeter");
    }

    /**
     * 新增水信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存水信息
     */
    @RequiresPermissions("module:watermeter:add")
    @Log(title = "水信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Watermeter watermeter)
    {
        return toAjax(watermeterService.insertWatermeter(watermeter));
    }

    /**
     * 修改水信息
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Watermeter watermeter = watermeterService.selectWatermeterById(id);
        mmap.put("watermeter", watermeter);
        return prefix + "/edit";
    }
    
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Long id, ModelMap mmap)
    {
        Watermeter watermeter = watermeterService.selectWatermeterById(id);
        mmap.put("watermeter", watermeter);
        return prefix + "/waterdetail";
    }

    /**
     * 修改保存水信息
     */
    @RequiresPermissions("module:watermeter:edit")
    @Log(title = "水信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Watermeter watermeter)
    {
        return toAjax(watermeterService.updateWatermeter(watermeter));
    }

    /**
     * 删除水信息
     */
    @RequiresPermissions("module:watermeter:remove")
    @Log(title = "水信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(watermeterService.deleteWatermeterByIds(ids));
    }
}
