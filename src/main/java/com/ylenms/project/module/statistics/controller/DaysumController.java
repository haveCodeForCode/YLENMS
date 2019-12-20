package com.ylenms.project.module.statistics.controller;

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
import com.ylenms.project.basic.waterdevice.service.IWaterdeviceService;
import com.ylenms.project.module.ammeter.domain.Ammeter;
import com.ylenms.project.module.ammeter.service.IAmmeterService;
import com.ylenms.project.module.watermeter.domain.Watermeter;
import com.ylenms.project.module.watermeter.service.IWatermeterService;
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
@RequestMapping("/statistics/daysum")
public class DaysumController extends BaseController
{
    private String prefix = "statistics/daysum";

    @Autowired
    private IAmmeterService ammeterService;

    @Autowired
    private IWatermeterService watermeterService;
    
    @RequiresPermissions("statistics:amdaysum:view")
    @GetMapping("amdaysum")
    public String amdaysum()
    {
        return prefix + "/amdaysum";
    }
    
    /**
     * 查询电数据日汇总
     */
    @RequiresPermissions("statistics:amdaysum:list")
    @PostMapping("/amlist")
    @ResponseBody
    public TableDataInfo amlist(Ammeter ammeter)
    {
        startPage();
        List<Ammeter> list = ammeterService.selectAmmeterList(ammeter);
        return getDataTable(list);
    }

    /**
     * 导出电数据列表
     */
    @RequiresPermissions("statistics:amdaysum:export")
    @Log(title = "电数据", businessType = BusinessType.EXPORT)
    @PostMapping("/amexport")
    @ResponseBody
    public AjaxResult amexport(Ammeter ammeter)
    {
        List<Ammeter> list = ammeterService.selectAmmeterList(ammeter);
        ExcelUtil<Ammeter> util = new ExcelUtil<Ammeter>(Ammeter.class);
        return util.exportExcel(list, "ammeter");
    }
    
    @RequiresPermissions("statistics:waterdaysum:view")
    @GetMapping("waterdaysum")
    public String waterdaysum()
    {
        return prefix + "/waterdaysum";
    }
    
    /**
     * 查询电数据日汇总
     */
    @RequiresPermissions("statistics:waterdaysum:list")
    @PostMapping("/waterlist")
    @ResponseBody
    public TableDataInfo waterlist(Watermeter watermeter)
    {
        startPage();
        List<Watermeter> list = watermeterService.selectWatermeterList(watermeter);
        return getDataTable(list);
    }

    /**
     * 导出电数据列表
     */
    @RequiresPermissions("statistics:waterdaysum:export")
    @Log(title = "电数据", businessType = BusinessType.EXPORT)
    @PostMapping("/waterexport")
    @ResponseBody
    public AjaxResult waterexport(Watermeter watermeter)
    {
        List<Watermeter> list = watermeterService.selectWatermeterList(watermeter);
        ExcelUtil<Watermeter> util = new ExcelUtil<Watermeter>(Watermeter.class);
        return util.exportExcel(list, "ammeter");
    }
}
