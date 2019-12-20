package com.ylenms.project.produce.product.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ylenms.project.produce.product.mapper.ProductMapper;
import com.ylenms.project.produce.product.domain.Product;
import com.ylenms.project.produce.product.service.IProductService;
import com.ylenms.common.utils.text.Convert;

/**
 * 产品信息Service业务层处理
 * 
 * @author ylenms
 * @date 2019-11-10
 */
@Service
public class ProductServiceImpl implements IProductService 
{
    @Autowired
    private ProductMapper productMapper;

    /**
     * 查询产品信息
     * 
     * @param id 产品信息ID
     * @return 产品信息
     */
    @Override
    public Product selectProductById(Long id)
    {
        return productMapper.selectProductById(id);
    }

    /**
     * 查询产品信息列表
     * 
     * @param product 产品信息
     * @return 产品信息
     */
    @Override
    public List<Product> selectProductList(Product product)
    {
        return productMapper.selectProductList(product);
    }

    /**
     * 新增产品信息
     * 
     * @param product 产品信息
     * @return 结果
     */
    @Override
    public int insertProduct(Product product)
    {
        return productMapper.insertProduct(product);
    }

    /**
     * 修改产品信息
     * 
     * @param product 产品信息
     * @return 结果
     */
    @Override
    public int updateProduct(Product product)
    {
        return productMapper.updateProduct(product);
    }

    /**
     * 删除产品信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteProductByIds(String ids)
    {
        return productMapper.deleteProductByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除产品信息信息
     * 
     * @param id 产品信息ID
     * @return 结果
     */
    @Override
    public int deleteProductById(Long id)
    {
        return productMapper.deleteProductById(id);
    }
    
	@Override
	public Product selectProductByName(String pdname){
		return productMapper.selectProductByName(pdname);
	}
}
