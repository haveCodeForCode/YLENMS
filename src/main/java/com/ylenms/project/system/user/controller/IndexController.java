package com.ylenms.project.system.user.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import com.ylenms.framework.config.YLENMSConfig;
import com.ylenms.framework.web.controller.BaseController;
import com.ylenms.project.system.menu.domain.Menu;
import com.ylenms.project.system.menu.service.IMenuService;
import com.ylenms.project.system.user.domain.User;

/**
 * 首页 业务处理
 * 
 * @author ylenms
 */
@Controller
public class IndexController extends BaseController
{
    @Autowired
    private IMenuService menuService;

    @Autowired
    private YLENMSConfig YLENMSConfig;

    // 系统首页
    @GetMapping("/index")
    public String index(ModelMap mmap)
    {
        // 取身份信息
        User user = getSysUser();
        // 根据用户id取出菜单
        List<Menu> menus = menuService.selectMenusByUser(user);
        mmap.put("menus", menus);
        mmap.put("user", user);
        mmap.put("copyrightYear", YLENMSConfig.getCopyrightYear());
        mmap.put("demoEnabled", YLENMSConfig.isDemoEnabled());
        return "index";
    }
    // 切换主题
    @GetMapping("/system/switchSkin")
    public String switchSkin(ModelMap mmap)
    {
        return "skin";
    }

    // 系统介绍
    @GetMapping("/system/main")
    public String main(ModelMap mmap)
    {
        mmap.put("version", YLENMSConfig.getVersion());
        return "main";
    }

}
