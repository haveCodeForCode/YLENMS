package com.ylenms.project.produce.product.mapper;

import com.ylenms.project.produce.product.domain.Product;
import java.util.List;

/**
 * 产品信息Mapper接口
 * 
 * @author ylenms
 * @date 2019-11-10
 */
public interface ProductMapper 
{
    /**
     * 查询产品信息
     * 
     * @param id 产品信息ID
     * @return 产品信息
     */
    public Product selectProductById(Long id);

    /**
     * 查询产品信息列表
     * 
     * @param product 产品信息
     * @return 产品信息集合
     */
    public List<Product> selectProductList(Product product);

    /**
     * 新增产品信息
     * 
     * @param product 产品信息
     * @return 结果
     */
    public int insertProduct(Product product);

    /**
     * 修改产品信息
     * 
     * @param product 产品信息
     * @return 结果
     */
    public int updateProduct(Product product);

    /**
     * 删除产品信息
     * 
     * @param id 产品信息ID
     * @return 结果
     */
    public int deleteProductById(Long id);

    /**
     * 批量删除产品信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteProductByIds(String[] ids);
    
	public Product selectProductByName(String pdname);
}
