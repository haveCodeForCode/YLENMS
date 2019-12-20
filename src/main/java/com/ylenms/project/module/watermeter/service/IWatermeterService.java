package com.ylenms.project.module.watermeter.service;

import com.ylenms.project.module.watermeter.domain.Watermeter;
import java.util.List;

/**
 * 水信息Service接口
 * 
 * @author ylenms
 * @date 2019-12-14
 */
public interface IWatermeterService 
{
    /**
     * 查询水信息
     * 
     * @param id 水信息ID
     * @return 水信息
     */
    public Watermeter selectWatermeterById(Long id);

    /**
     * 查询水信息列表
     * 
     * @param watermeter 水信息
     * @return 水信息集合
     */
    public List<Watermeter> selectWatermeterList(Watermeter watermeter);

    /**
     * 新增水信息
     * 
     * @param watermeter 水信息
     * @return 结果
     */
    public int insertWatermeter(Watermeter watermeter);

    /**
     * 修改水信息
     * 
     * @param watermeter 水信息
     * @return 结果
     */
    public int updateWatermeter(Watermeter watermeter);

    /**
     * 批量删除水信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteWatermeterByIds(String ids);

    /**
     * 删除水信息信息
     * 
     * @param id 水信息ID
     * @return 结果
     */
    public int deleteWatermeterById(Long id);
}
