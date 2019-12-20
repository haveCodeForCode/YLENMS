package com.ylenms.project.basic.amdevice.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ylenms.project.basic.amdevice.domain.Amdevice;
import com.ylenms.project.basic.amdevice.mapper.AmdeviceMapper;
import com.ylenms.project.basic.amdevice.service.IAmdeviceService;
import com.ylenms.common.utils.text.Convert;

/**
 * 设备字典Service业务层处理
 * 
 * @author ylenms
 * @date 2019-12-14
 */
@Service
public class AmdeviceServiceImpl implements IAmdeviceService 
{
    @Autowired
    private AmdeviceMapper ammeterMapper;

    /**
     * 查询设备字典
     * 
     * @param id 设备字典ID
     * @return 设备字典
     */
    @Override
    public Amdevice selectAmdeviceById(Long id)
    {
        return ammeterMapper.selectAmdeviceById(id);
    }

    /**
     * 查询设备字典列表
     * 
     * @param ammeter 设备字典
     * @return 设备字典
     */
    @Override
    public List<Amdevice> selectAmdeviceList(Amdevice ammeter)
    {
        return ammeterMapper.selectAmdeviceList(ammeter);
    }

    /**
     * 新增设备字典
     * 
     * @param ammeter 设备字典
     * @return 结果
     */
    @Override
    public int insertAmdevice(Amdevice ammeter)
    {
        return ammeterMapper.insertAmdevice(ammeter);
    }

    /**
     * 修改设备字典
     * 
     * @param ammeter 设备字典
     * @return 结果
     */
    @Override
    public int updateAmdevice(Amdevice ammeter)
    {
        return ammeterMapper.updateAmdevice(ammeter);
    }

    /**
     * 删除设备字典对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteAmdeviceByIds(String ids)
    {
        return ammeterMapper.deleteAmdeviceByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除设备字典信息
     * 
     * @param id 设备字典ID
     * @return 结果
     */
    @Override
    public int deleteAmdeviceById(Long id)
    {
        return ammeterMapper.deleteAmdeviceById(id);
    }
}
