package com.ylenms.project.module.ammeter.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ylenms.project.module.ammeter.mapper.AmmeterMapper;
import com.ylenms.project.module.ammeter.domain.Ammeter;
import com.ylenms.common.utils.text.Convert;

/**
 * 电数据Service业务层处理
 * 
 * @author ylenms
 * @date 2019-12-14
 */
@Service
public class AmmeterServiceImpl implements IAmmeterService 
{
    @Autowired
    private AmmeterMapper ammeterMapper;

    /**
     * 查询电数据
     * 
     * @param id 电数据ID
     * @return 电数据
     */
    @Override
    public Ammeter selectAmmeterById(Long id)
    {
        return ammeterMapper.selectAmmeterById(id);
    }

    /**
     * 查询电数据列表
     * 
     * @param ammeter 电数据
     * @return 电数据
     */
    @Override
    public List<Ammeter> selectAmmeterList(Ammeter ammeter)
    {
        return ammeterMapper.selectAmmeterList(ammeter);
    }

    /**
     * 新增电数据
     * 
     * @param ammeter 电数据
     * @return 结果
     */
    @Override
    public int insertAmmeter(Ammeter ammeter)
    {
        return ammeterMapper.insertAmmeter(ammeter);
    }

    /**
     * 修改电数据
     * 
     * @param ammeter 电数据
     * @return 结果
     */
    @Override
    public int updateAmmeter(Ammeter ammeter)
    {
        return ammeterMapper.updateAmmeter(ammeter);
    }

    /**
     * 删除电数据对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteAmmeterByIds(String ids)
    {
        return ammeterMapper.deleteAmmeterByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除电数据信息
     * 
     * @param id 电数据ID
     * @return 结果
     */
    @Override
    public int deleteAmmeterById(Long id)
    {
        return ammeterMapper.deleteAmmeterById(id);
    }
}
