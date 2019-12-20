package com.ylenms.project.module.creatdispatch.service;

import com.ylenms.project.module.creatdispatch.domain.Creatdispatch;
import java.util.List;

/**
 * 生产调度 服务层
 * 
 * @author ylenms
 * @date 2018-09-12
 */
public interface ICreatdispatchService 
{
	/**
     * 查询生产调度信息
     * 
     * @param id 生产调度ID
     * @return 生产调度信息
     */
	public Creatdispatch selectCreatdispatchById(Integer id);
	
	/**
     * 查询生产调度列表
     * 
     * @param creatdispatch 生产调度信息
     * @return 生产调度集合
     */
	public List<Creatdispatch> selectCreatdispatchList(Creatdispatch creatdispatch);
	
	/**
     * 新增生产调度
     * 
     * @param creatdispatch 生产调度信息
     * @return 结果
     */
	public int insertCreatdispatch(Creatdispatch creatdispatch);
	
	/**
     * 修改生产调度
     * 
     * @param creatdispatch 生产调度信息
     * @return 结果
     */
	public int updateCreatdispatch(Creatdispatch creatdispatch);
	
	/**
     * 保存生产调度
     * 
     * @param creatdispatch 生产调度信息
     * @return 结果
     */
	public int saveCreatdispatch(Creatdispatch creatdispatch);
	
	
	/**
     * 删除生产调度信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteCreatdispatchByIds(String ids);
	public int updateAuditflagByIds(String ids, int status);

	/**
	 * 查询调度单号当天最大流水号
	 */
	public String selectMaxDispatchid(String dispatchid);


	/**
	 * 区分权限调度单下达list
	 */
	public List<Creatdispatch> selectCreatdispatchListByStatus(Creatdispatch creatdispatch);
}
