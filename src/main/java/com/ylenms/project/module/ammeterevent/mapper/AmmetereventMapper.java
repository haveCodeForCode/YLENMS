package com.ylenms.project.module.ammeterevent.mapper;

import com.ylenms.project.module.ammeterevent.domain.Ammeterevent;
import java.util.List;

/**
 * 电事件Mapper接口
 * 
 * @author ylenms
 * @date 2019-12-14
 */
public interface AmmetereventMapper 
{
    /**
     * 查询电事件
     * 
     * @param id 电事件ID
     * @return 电事件
     */
    public Ammeterevent selectAmmetereventById(Long id);

    /**
     * 查询电事件列表
     * 
     * @param ammeterevent 电事件
     * @return 电事件集合
     */
    public List<Ammeterevent> selectAmmetereventList(Ammeterevent ammeterevent);

    /**
     * 新增电事件
     * 
     * @param ammeterevent 电事件
     * @return 结果
     */
    public int insertAmmeterevent(Ammeterevent ammeterevent);

    /**
     * 修改电事件
     * 
     * @param ammeterevent 电事件
     * @return 结果
     */
    public int updateAmmeterevent(Ammeterevent ammeterevent);

    /**
     * 删除电事件
     * 
     * @param id 电事件ID
     * @return 结果
     */
    public int deleteAmmetereventById(Long id);

    /**
     * 批量删除电事件
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteAmmetereventByIds(String[] ids);
}
