package com.ylenms.project.basic.amdevice.service;

import java.util.List;

import com.ylenms.project.basic.amdevice.domain.Amdevice;

/**
 * 设备字典Service接口
 * 
 * @author ylenms
 * @date 2019-12-14
 */
public interface IAmdeviceService 
{
    /**
     * 查询设备字典
     * 
     * @param id 设备字典ID
     * @return 设备字典
     */
    public Amdevice selectAmdeviceById(Long id);

    /**
     * 查询设备字典列表
     * 
     * @param ammeter 设备字典
     * @return 设备字典集合
     */
    public List<Amdevice> selectAmdeviceList(Amdevice ammeter);

    /**
     * 新增设备字典
     * 
     * @param ammeter 设备字典
     * @return 结果
     */
    public int insertAmdevice(Amdevice ammeter);

    /**
     * 修改设备字典
     * 
     * @param ammeter 设备字典
     * @return 结果
     */
    public int updateAmdevice(Amdevice ammeter);

    /**
     * 批量删除设备字典
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteAmdeviceByIds(String ids);

    /**
     * 删除设备字典信息
     * 
     * @param id 设备字典ID
     * @return 结果
     */
    public int deleteAmdeviceById(Long id);
}
