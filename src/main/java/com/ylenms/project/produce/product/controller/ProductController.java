package com.ylenms.project.produce.product.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ylenms.framework.aspectj.lang.annotation.Log;
import com.ylenms.framework.aspectj.lang.enums.BusinessType;
import com.ylenms.project.produce.product.domain.Product;
import com.ylenms.project.produce.product.service.IProductService;
import com.ylenms.framework.web.controller.BaseController;
import com.ylenms.framework.web.domain.AjaxResult;
import com.ylenms.common.utils.poi.ExcelUtil;
import com.ylenms.framework.web.page.TableDataInfo;

/**
 * 产品信息Controller
 * 
 * @author ylenms
 * @date 2019-11-10
 */
@Controller
@RequestMapping("/produce/product")
public class ProductController extends BaseController
{
    private String prefix = "produce/product";

    @Autowired
    private IProductService productService;

    @RequiresPermissions("produce:product:view")
    @GetMapping()
    public String product()
    {
        return prefix + "/product";
    }
    
	@RequiresPermissions("produce:product:view")
	@GetMapping("/showProduct")
	public String showProduct()
	{
	    return prefix + "/showProduct";
	}

    /**
     * 查询产品信息列表
     */
    @RequiresPermissions("produce:product:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Product product)
    {
        startPage();
        List<Product> list = productService.selectProductList(product);
        return getDataTable(list);
    }

    /**
     * 导出产品信息列表
     */
    @RequiresPermissions("produce:product:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Product product)
    {
        List<Product> list = productService.selectProductList(product);
        ExcelUtil<Product> util = new ExcelUtil<Product>(Product.class);
        return util.exportExcel(list, "product");
    }

    /**
     * 新增产品信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存产品信息
     */
    @RequiresPermissions("produce:product:add")
    @Log(title = "产品信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Product product)
    {
        return toAjax(productService.insertProduct(product));
    }

    @RequiresPermissions("produce:product:detail")
	@GetMapping("/detail/{id}")
	public String detail(@PathVariable("id") Long id, ModelMap mmap)
	{
        Product product= productService.selectProductById(id);
        mmap.put("product", product);
        return prefix + "/detail";
	}
    /**
     * 修改产品信息
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Product product = productService.selectProductById(id);
        mmap.put("product", product);
        return prefix + "/edit";
    }

    /**
     * 修改保存产品信息
     */
    @RequiresPermissions("produce:product:edit")
    @Log(title = "产品信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Product product)
    {
        return toAjax(productService.updateProduct(product));
    }

    /**
     * 删除产品信息
     */
    @RequiresPermissions("produce:product:remove")
    @Log(title = "产品信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(productService.deleteProductByIds(ids));
    }
    
	@GetMapping("/productLink/{pdcode}")
	public String productLink(@PathVariable("pdcode") String pdcode, ModelMap mmap) {
		Product product = new Product();
		product.setPdcode(pdcode);
		List<Product> list = productService.selectProductList(product);
		mmap.put("product", list.get(0));
		return prefix + "/detail";
	}
}
