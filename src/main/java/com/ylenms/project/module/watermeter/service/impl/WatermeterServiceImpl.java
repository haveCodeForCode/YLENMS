package com.ylenms.project.module.watermeter.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ylenms.project.module.watermeter.mapper.WatermeterMapper;
import com.ylenms.project.module.watermeter.domain.Watermeter;
import com.ylenms.project.module.watermeter.service.IWatermeterService;
import com.ylenms.common.utils.text.Convert;

/**
 * 水信息Service业务层处理
 * 
 * @author ylenms
 * @date 2019-12-14
 */
@Service
public class WatermeterServiceImpl implements IWatermeterService 
{
    @Autowired
    private WatermeterMapper watermeterMapper;

    /**
     * 查询水信息
     * 
     * @param id 水信息ID
     * @return 水信息
     */
    @Override
    public Watermeter selectWatermeterById(Long id)
    {
        return watermeterMapper.selectWatermeterById(id);
    }

    /**
     * 查询水信息列表
     * 
     * @param watermeter 水信息
     * @return 水信息
     */
    @Override
    public List<Watermeter> selectWatermeterList(Watermeter watermeter)
    {
        return watermeterMapper.selectWatermeterList(watermeter);
    }

    /**
     * 新增水信息
     * 
     * @param watermeter 水信息
     * @return 结果
     */
    @Override
    public int insertWatermeter(Watermeter watermeter)
    {
        return watermeterMapper.insertWatermeter(watermeter);
    }

    /**
     * 修改水信息
     * 
     * @param watermeter 水信息
     * @return 结果
     */
    @Override
    public int updateWatermeter(Watermeter watermeter)
    {
        return watermeterMapper.updateWatermeter(watermeter);
    }

    /**
     * 删除水信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteWatermeterByIds(String ids)
    {
        return watermeterMapper.deleteWatermeterByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除水信息信息
     * 
     * @param id 水信息ID
     * @return 结果
     */
    @Override
    public int deleteWatermeterById(Long id)
    {
        return watermeterMapper.deleteWatermeterById(id);
    }
}
