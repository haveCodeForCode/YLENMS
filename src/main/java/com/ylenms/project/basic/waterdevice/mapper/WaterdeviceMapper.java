package com.ylenms.project.basic.waterdevice.mapper;

import java.util.List;

import com.ylenms.project.basic.waterdevice.domain.Waterdevice;

/**
 * 设备字典Mapper接口
 * 
 * @author ylenms
 * @date 2019-12-14
 */
public interface WaterdeviceMapper 
{
    /**
     * 查询设备字典
     * 
     * @param id 设备字典ID
     * @return 设备字典
     */
    public Waterdevice selectWaterdeviceById(Long id);

    /**
     * 查询设备字典列表
     * 
     * @param watermeter 设备字典
     * @return 设备字典集合
     */
    public List<Waterdevice> selectWaterdeviceList(Waterdevice watermeter);

    /**
     * 新增设备字典
     * 
     * @param watermeter 设备字典
     * @return 结果
     */
    public int insertWaterdevice(Waterdevice watermeter);

    /**
     * 修改设备字典
     * 
     * @param watermeter 设备字典
     * @return 结果
     */
    public int updateWaterdevice(Waterdevice watermeter);

    /**
     * 删除设备字典
     * 
     * @param id 设备字典ID
     * @return 结果
     */
    public int deleteWaterdeviceById(Long id);

    /**
     * 批量删除设备字典
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteWaterdeviceByIds(String[] ids);
}
