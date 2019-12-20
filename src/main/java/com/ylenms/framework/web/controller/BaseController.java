package com.ylenms.framework.web.controller;

import java.util.Date;
import com.ylenms.framework.web.domain.AjaxResult.Type;
import java.util.List;
import java.beans.PropertyEditorSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ylenms.project.system.menu.domain.Menu;
import com.ylenms.project.system.menu.service.IMenuService;
import com.ylenms.project.system.role.domain.Role;
import com.ylenms.project.system.role.mapper.RoleMenuMapper;
import com.ylenms.project.system.role.service.IRoleService;
import com.ylenms.project.system.user.mapper.UserRoleMapper;
import com.ylenms.common.utils.StringUtils;
import com.ylenms.common.utils.security.ShiroUtils;
import com.ylenms.framework.web.domain.AjaxResult;
import com.ylenms.common.utils.DateUtils;
import com.ylenms.framework.web.page.PageDomain;
import com.ylenms.framework.web.page.TableDataInfo;
import com.ylenms.framework.web.page.TableSupport;
import com.ylenms.project.system.user.domain.User;
import com.ylenms.common.utils.sql.SqlUtil;
/**
 * web层通用数据处理
 * 
 * @author ylenms
 */
public class BaseController
{
	@Autowired
	private IRoleService roleService;
	@Autowired
	private UserRoleMapper userroleService;
	@Autowired
	private RoleMenuMapper roleMenuMapper;
	@Autowired
	private IMenuService menuService;
    /**
     * 将前台传递过来的日期格式的字符串，自动转化为Date类型
     */
    @InitBinder
    public void initBinder(WebDataBinder binder)
    {
        // Date 类型转换
        binder.registerCustomEditor(Date.class, new PropertyEditorSupport()
        {
            @Override
            public void setAsText(String text)
            {
                setValue(DateUtils.parseDate(text));
            }
        });
    }

    /**
     * 设置请求分页数据
     */
    protected void startPage()
    {
        PageDomain pageDomain = TableSupport.buildPageRequest();
        Integer pageNum = pageDomain.getPageNum();
        Integer pageSize = pageDomain.getPageSize();
        if (StringUtils.isNotNull(pageNum) && StringUtils.isNotNull(pageSize))
        {
            String orderBy = SqlUtil.escapeOrderBySql(pageDomain.getOrderBy());
            PageHelper.startPage(pageNum, pageSize, orderBy);
        }
    }

    /**
     * 响应请求分页数据
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    protected TableDataInfo getDataTable(List<?> list)
    {
        TableDataInfo rspData = new TableDataInfo();
        rspData.setCode(0);
        rspData.setRows(list);
        rspData.setTotal(new PageInfo(list).getTotal());
        return rspData;
    }

    /**
     * 响应返回结果
     * 
     * @param rows 影响行数
     * @return 操作结果
     */
    protected AjaxResult toAjax(int rows)
    {
        return rows > 0 ? success() : error();
    }
    
    /**
     * 响应返回结果
     * 
     * @param result 结果
     * @return 操作结果
     */
    protected AjaxResult toAjax(boolean result)
    {
        return result ? success() : error();
    }
    
    /**
     * 返回成功
     */
    public AjaxResult success()
    {
        return AjaxResult.success();
    }

    /**
     * 返回失败消息
     */
    public AjaxResult error()
    {
        return AjaxResult.error();
    }

    /**
     * 返回成功消息
     */
    public AjaxResult success(String message)
    {
        return AjaxResult.success(message);
    }

    /**
     * 返回失败消息
     */
    public AjaxResult error(String message)
    {
        return AjaxResult.error(message);
    }

    /**
     * 返回错误码消息
     */
    public AjaxResult error(Type type, String message)
    {
        return new AjaxResult(type, message);
    }

    /**
     * 页面跳转
     */
    public String redirect(String url)
    {
        return StringUtils.format("redirect:{}", url);
    }


    public User getSysUser()
    {
        return ShiroUtils.getSysUser();
    }

    public void setSysUser(User user)
    {
        ShiroUtils.setSysUser(user);
    }

    public Long getUserId()
    {
        return getSysUser().getUserId();
    }

    public String getLoginName()
    {
        return getSysUser().getLoginName();
    }
	//判断角色权限隐藏对应信息
	public boolean checkUser(String checkStr) {
		User user = ShiroUtils.getSysUser();
		
		Long userId = user.getUserId();
		Long[] roleIds = userroleService.selectByUserId(userId);
		System.out.println(roleIds);
		boolean isTrue = false;
		for(Long roleid : roleIds) {
			Role role = roleService.selectRoleById(roleid);
			Long[] menuIds = roleMenuMapper.selectByRoleId(role.getRoleId());
			for(Long menuid : menuIds) {
				Menu menu = menuService.selectMenuById(menuid);
				//System.out.println("menuid:"+menuid);
				//判断权限
				if (menu.getPerms() != null) {
					if(menu.getPerms().equals(checkStr)) {
						isTrue = true;
					}
				}
			}
		}
		return isTrue;
	}
}