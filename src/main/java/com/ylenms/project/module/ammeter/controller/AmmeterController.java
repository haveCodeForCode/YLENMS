package com.ylenms.project.module.ammeter.controller;

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
import com.ylenms.project.module.ammeter.domain.Ammeter;
import com.ylenms.project.module.ammeter.service.IAmmeterService;
import com.ylenms.framework.web.controller.BaseController;
import com.ylenms.framework.web.domain.AjaxResult;
import com.ylenms.common.utils.poi.ExcelUtil;
import com.ylenms.framework.web.page.TableDataInfo;

/**
 * 电数据Controller
 * 
 * @author ylenms
 * @date 2019-12-14
 */
@Controller
@RequestMapping("/module/ammeter")
public class AmmeterController extends BaseController
{
    private String prefix = "module/ammeter";

    @Autowired
    private IAmmeterService ammeterService;

    @RequiresPermissions("module:ammeter:view")
    @GetMapping()
    public String ammeter()
    {
        return prefix + "/ammeter";
    }
    
    @RequiresPermissions("module:ammeter:view")
    @GetMapping("/ammeterinfo")
    public String ammeterinfo()
    {
        return prefix + "/ammeterinfo";
    }

    /**
     * 查询电数据列表
     */
    @RequiresPermissions("module:ammeter:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Ammeter ammeter)
    {
        startPage();
        List<Ammeter> list = ammeterService.selectAmmeterList(ammeter);
        return getDataTable(list);
    }

    /**
     * 导出电数据列表
     */
    @RequiresPermissions("module:ammeter:export")
    @Log(title = "电数据", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Ammeter ammeter)
    {
        List<Ammeter> list = ammeterService.selectAmmeterList(ammeter);
        ExcelUtil<Ammeter> util = new ExcelUtil<Ammeter>(Ammeter.class);
        return util.exportExcel(list, "ammeter");
    }

    /**
     * 新增电数据
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存电数据
     */
    @RequiresPermissions("module:ammeter:add")
    @Log(title = "电数据", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Ammeter ammeter)
    {
        return toAjax(ammeterService.insertAmmeter(ammeter));
    }

    /**
     * 修改电数据
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Ammeter ammeter = ammeterService.selectAmmeterById(id);
        mmap.put("ammeter", ammeter);
        return prefix + "/edit";
    }
    
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Long id, ModelMap mmap)
    {
        Ammeter ammeter = ammeterService.selectAmmeterById(id);
        mmap.put("ammeter", ammeter);
        return prefix + "/amdetail";
    }

    /**
     * 修改保存电数据
     */
    @RequiresPermissions("module:ammeter:edit")
    @Log(title = "电数据", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Ammeter ammeter)
    {
        return toAjax(ammeterService.updateAmmeter(ammeter));
    }

    /**
     * 删除电数据
     */
    @RequiresPermissions("module:ammeter:remove")
    @Log(title = "电数据", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(ammeterService.deleteAmmeterByIds(ids));
    }
}
