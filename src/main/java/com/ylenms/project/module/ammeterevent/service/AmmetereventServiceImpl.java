package com.ylenms.project.module.ammeterevent.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ylenms.project.module.ammeterevent.mapper.AmmetereventMapper;
import com.ylenms.project.module.ammeterevent.domain.Ammeterevent;
import com.ylenms.common.utils.text.Convert;

/**
 * 电事件Service业务层处理
 * 
 * @author ylenms
 * @date 2019-12-14
 */
@Service
public class AmmetereventServiceImpl implements IAmmetereventService 
{
    @Autowired
    private AmmetereventMapper ammetereventMapper;

    /**
     * 查询电事件
     * 
     * @param id 电事件ID
     * @return 电事件
     */
    @Override
    public Ammeterevent selectAmmetereventById(Long id)
    {
        return ammetereventMapper.selectAmmetereventById(id);
    }

    /**
     * 查询电事件列表
     * 
     * @param ammeterevent 电事件
     * @return 电事件
     */
    @Override
    public List<Ammeterevent> selectAmmetereventList(Ammeterevent ammeterevent)
    {
        return ammetereventMapper.selectAmmetereventList(ammeterevent);
    }

    /**
     * 新增电事件
     * 
     * @param ammeterevent 电事件
     * @return 结果
     */
    @Override
    public int insertAmmeterevent(Ammeterevent ammeterevent)
    {
        return ammetereventMapper.insertAmmeterevent(ammeterevent);
    }

    /**
     * 修改电事件
     * 
     * @param ammeterevent 电事件
     * @return 结果
     */
    @Override
    public int updateAmmeterevent(Ammeterevent ammeterevent)
    {
        return ammetereventMapper.updateAmmeterevent(ammeterevent);
    }

    /**
     * 删除电事件对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteAmmetereventByIds(String ids)
    {
        return ammetereventMapper.deleteAmmetereventByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除电事件信息
     * 
     * @param id 电事件ID
     * @return 结果
     */
    @Override
    public int deleteAmmetereventById(Long id)
    {
        return ammetereventMapper.deleteAmmetereventById(id);
    }
}
