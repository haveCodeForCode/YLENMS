package com.ylenms.project.module.ammeterevent.controller;

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
import com.ylenms.project.module.ammeterevent.domain.Ammeterevent;
import com.ylenms.project.module.ammeterevent.service.IAmmetereventService;
import com.ylenms.framework.web.controller.BaseController;
import com.ylenms.framework.web.domain.AjaxResult;
import com.ylenms.common.utils.poi.ExcelUtil;
import com.ylenms.framework.web.page.TableDataInfo;

/**
 * 电事件Controller
 * 
 * @author ylenms
 * @date 2019-12-14
 */
@Controller
@RequestMapping("/module/ammeterevent")
public class AmmetereventController extends BaseController
{
    private String prefix = "module/ammeterevent";

    @Autowired
    private IAmmetereventService ammetereventService;

    @RequiresPermissions("module:ammeterevent:view")
    @GetMapping()
    public String ammeterevent()
    {
        return prefix + "/ammeterevent";
    }

    /**
     * 查询电事件列表
     */
    @RequiresPermissions("module:ammeterevent:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Ammeterevent ammeterevent)
    {
        startPage();
        List<Ammeterevent> list = ammetereventService.selectAmmetereventList(ammeterevent);
        return getDataTable(list);
    }

    /**
     * 导出电事件列表
     */
    @RequiresPermissions("module:ammeterevent:export")
    @Log(title = "电事件", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Ammeterevent ammeterevent)
    {
        List<Ammeterevent> list = ammetereventService.selectAmmetereventList(ammeterevent);
        ExcelUtil<Ammeterevent> util = new ExcelUtil<Ammeterevent>(Ammeterevent.class);
        return util.exportExcel(list, "ammeterevent");
    }

    /**
     * 新增电事件
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存电事件
     */
    @RequiresPermissions("module:ammeterevent:add")
    @Log(title = "电事件", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Ammeterevent ammeterevent)
    {
        return toAjax(ammetereventService.insertAmmeterevent(ammeterevent));
    }

    /**
     * 修改电事件
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Ammeterevent ammeterevent = ammetereventService.selectAmmetereventById(id);
        mmap.put("ammeterevent", ammeterevent);
        return prefix + "/edit";
    }

    /**
     * 修改保存电事件
     */
    @RequiresPermissions("module:ammeterevent:edit")
    @Log(title = "电事件", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Ammeterevent ammeterevent)
    {
        return toAjax(ammetereventService.updateAmmeterevent(ammeterevent));
    }

    /**
     * 删除电事件
     */
    @RequiresPermissions("module:ammeterevent:remove")
    @Log(title = "电事件", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(ammetereventService.deleteAmmetereventByIds(ids));
    }
}
