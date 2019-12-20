package com.ylenms.project.basic.waterdevice.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ylenms.project.basic.waterdevice.domain.Waterdevice;
import com.ylenms.project.basic.waterdevice.mapper.WaterdeviceMapper;
import com.ylenms.project.basic.waterdevice.service.IWaterdeviceService;
import com.ylenms.common.utils.text.Convert;

/**
 * 设备字典Service业务层处理
 * 
 * @author ylenms
 * @date 2019-12-14
 */
@Service
public class WaterdeviceServiceImpl implements IWaterdeviceService 
{
    @Autowired
    private WaterdeviceMapper watermeterMapper;

    /**
     * 查询设备字典
     * 
     * @param id 设备字典ID
     * @return 设备字典
     */
    @Override
    public Waterdevice selectWaterdeviceById(Long id)
    {
        return watermeterMapper.selectWaterdeviceById(id);
    }

    /**
     * 查询设备字典列表
     * 
     * @param watermeter 设备字典
     * @return 设备字典
     */
    @Override
    public List<Waterdevice> selectWaterdeviceList(Waterdevice watermeter)
    {
        return watermeterMapper.selectWaterdeviceList(watermeter);
    }

    /**
     * 新增设备字典
     * 
     * @param watermeter 设备字典
     * @return 结果
     */
    @Override
    public int insertWaterdevice(Waterdevice watermeter)
    {
        return watermeterMapper.insertWaterdevice(watermeter);
    }

    /**
     * 修改设备字典
     * 
     * @param watermeter 设备字典
     * @return 结果
     */
    @Override
    public int updateWaterdevice(Waterdevice watermeter)
    {
        return watermeterMapper.updateWaterdevice(watermeter);
    }

    /**
     * 删除设备字典对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteWaterdeviceByIds(String ids)
    {
        return watermeterMapper.deleteWaterdeviceByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除设备字典信息
     * 
     * @param id 设备字典ID
     * @return 结果
     */
    @Override
    public int deleteWaterdeviceById(Long id)
    {
        return watermeterMapper.deleteWaterdeviceById(id);
    }
}
