package com.ylenms.project.sale.contract.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ylenms.project.sale.contract.mapper.ContractMapper;
import com.ylenms.project.sale.contract.domain.Contract;
import com.ylenms.project.sale.contract.service.IContractService;
import com.ylenms.common.utils.text.Convert;

/**
 * 合同Service业务层处理
 * 
 * @author ylenms
 * @date 2019-11-01
 */
@Service
public class ContractServiceImpl implements IContractService 
{
    @Autowired
    private ContractMapper ContractMapper;

    /**
     * 查询合同
     * 
     * @param id 合同ID
     * @return 合同
     */
    @Override
    public Contract selectContractById(Long id)
    {
        return ContractMapper.selectContractById(id);
    }

    /**
     * 查询合同列表
     * 
     * @param Contract 合同
     * @return 合同
     */
    @Override
    public List<Contract> selectContractList(Contract Contract)
    {
        return ContractMapper.selectContractList(Contract);
    }

    /**
     * 新增合同
     * 
     * @param Contract 合同
     * @return 结果
     */
    @Override
    public int insertContract(Contract Contract)
    {
        return ContractMapper.insertContract(Contract);
    }

    /**
     * 修改合同
     * 
     * @param Contract 合同
     * @return 结果
     */
    @Override
    public int updateContract(Contract Contract)
    {
        return ContractMapper.updateContract(Contract);
    }

    /**
     * 删除合同对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteContractByIds(String ids)
    {
        return ContractMapper.deleteContractByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除合同信息
     * 
     * @param id 合同ID
     * @return 结果
     */
    @Override
    public int deleteContractById(Long id)
    {
        return ContractMapper.deleteContractById(id);
    }
}
