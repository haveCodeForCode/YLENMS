package com.ylenms.project.module.creatdispatch.service;

import java.util.*;

import com.ylenms.common.utils.security.ShiroUtils;
import com.ylenms.common.utils.text.Convert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ylenms.common.utils.StringUtils;
import com.ylenms.project.module.creatdispatch.mapper.CreatdispatchMapper;
import com.ylenms.project.module.creatdispatch.domain.Creatdispatch;
import com.ylenms.project.module.creatdispatch.service.ICreatdispatchService;

/**
 * 生产调度 服务层实现
 * 
 * @author ylenms
 * @date 2018-09-12
 */
@Service
public class CreatdispatchServiceImpl implements ICreatdispatchService 
{
	@Autowired
	private CreatdispatchMapper creatdispatchMapper;

	/**
     * 查询生产调度信息
     * 
     * @param id 生产调度ID
     * @return 生产调度信息
     */
    @Override
	public Creatdispatch selectCreatdispatchById(Integer id)
	{
	    return creatdispatchMapper.selectCreatdispatchById(id);
	}
	
	/**
     * 查询生产调度列表
     * 
     * @param creatdispatch 生产调度信息
     * @return 生产调度集合
     */
	@Override
	public List<Creatdispatch> selectCreatdispatchList(Creatdispatch creatdispatch)
	{
	    return creatdispatchMapper.selectCreatdispatchList(creatdispatch);
	}
	
    /**
     * 新增生产调度
     * 
     * @param creatdispatch 生产调度信息
     * @return 结果
     */
	@Override
	public int insertCreatdispatch(Creatdispatch creatdispatch)
	{
		creatdispatch.setInputname(ShiroUtils.getSysUser().getUserName());
		creatdispatch.setInputtime(new Date());
	    return creatdispatchMapper.insertCreatdispatch(creatdispatch);
	}
	
	/**
     * 修改生产调度
     * 
     * @param creatdispatch 生产调度信息
     * @return 结果
     */
	@Override
	public int updateCreatdispatch(Creatdispatch creatdispatch)
	{
	    return creatdispatchMapper.updateCreatdispatch(creatdispatch);
	}
	
	/**
     * 保存生产调度
     * 
     * @param creatdispatch 生产调度信息
     * @return 结果
     */
	@Override
	public int saveCreatdispatch(Creatdispatch creatdispatch)
	{
	    Integer id = creatdispatch.getId();
		int rows = 0;
		if (StringUtils.isNotNull(id))
        {
		    rows = creatdispatchMapper.updateCreatdispatch(creatdispatch);
		}
		else
        {
			creatdispatch.setTransflag(0);
		    rows = creatdispatchMapper.insertCreatdispatch(creatdispatch);
		}
		return rows;
	}
	
	/**
     * 删除生产调度对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteCreatdispatchByIds(String ids)
	{
		return creatdispatchMapper.deleteCreatdispatchByIds(Convert.toIntArray(ids));
	}

	@Override
	public int updateAuditflagByIds(String ids, int status) {
		int i = 0;
		for (i = 0; i < Convert.toIntArray(ids).length; i++) {
			Creatdispatch creatdispatch = new Creatdispatch();
			creatdispatch.setId(Convert.toIntArray(ids)[i]);
			creatdispatch.setAuditflag("" + status);
			creatdispatchMapper.updateAuditflag(creatdispatch);
		}
		return i;
	}

	@Override
	public String selectMaxDispatchid(String dispatchid) {
		return creatdispatchMapper.selectMaxDispatchid(dispatchid);
	}

	/**
	 * 区分权限调度单下达list
	 */
	public List<Creatdispatch> selectCreatdispatchListByStatus(Creatdispatch creatdispatch){
		return creatdispatchMapper.selectCreatdispatchListByStatus(creatdispatch);
	}

}
