package com.ylenms.project.module.ammeter.mapper;

import com.ylenms.project.module.ammeter.domain.Ammeter;
import java.util.List;

/**
 * 电数据Mapper接口
 * 
 * @author ylenms
 * @date 2019-12-14
 */
public interface AmmeterMapper 
{
    /**
     * 查询电数据
     * 
     * @param id 电数据ID
     * @return 电数据
     */
    public Ammeter selectAmmeterById(Long id);

    /**
     * 查询电数据列表
     * 
     * @param ammeter 电数据
     * @return 电数据集合
     */
    public List<Ammeter> selectAmmeterList(Ammeter ammeter);

    /**
     * 新增电数据
     * 
     * @param ammeter 电数据
     * @return 结果
     */
    public int insertAmmeter(Ammeter ammeter);

    /**
     * 修改电数据
     * 
     * @param ammeter 电数据
     * @return 结果
     */
    public int updateAmmeter(Ammeter ammeter);

    /**
     * 删除电数据
     * 
     * @param id 电数据ID
     * @return 结果
     */
    public int deleteAmmeterById(Long id);

    /**
     * 批量删除电数据
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteAmmeterByIds(String[] ids);
}
