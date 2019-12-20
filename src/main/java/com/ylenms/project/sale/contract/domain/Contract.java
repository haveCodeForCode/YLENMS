package com.ylenms.project.sale.contract.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ylenms.framework.aspectj.lang.annotation.Excel;
import com.ylenms.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 合同对象 tbl_contract
 * 
 * @author ylenms
 * @date 2019-11-01
 */
public class Contract extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** 合同名称 */
    @Excel(name = "合同名称")
    private String name;

    /** 合同编号 */
    @Excel(name = "合同编号")
    private String codeid;

    /** 甲方 */
    @Excel(name = "甲方")
    private String firstparty;

    /** 乙方 */
    @Excel(name = "乙方")
    private String secondparty;

    /** 送达方接收人 */
    @Excel(name = "送达方接收人")
    private String receiver;

    /** 送达方电话 */
    @Excel(name = "送达方电话")
    private String recphone;

    /** 送达方地址 */
    @Excel(name = "送达方地址")
    private String recaddress;

    /** 送达方名称 */
    @Excel(name = "送达方名称")
    private String recname;

    /** 签订时间 */
    @Excel(name = "签订时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date optime;

    /** 签订地点 */
    @Excel(name = "签订地点")
    private String position;

    /** 合同类型:1国内2:国外 */
    @Excel(name = "合同类型:1国内2:国外")
    private Integer type;

    /** 合同类别:1销售2:采购 */
    @Excel(name = "合同类别:1销售2:采购")
    private Integer category;

    /** 状态1:新建2:已签3:未签 */
    @Excel(name = "状态1:新建2:已签3:未签")
    private Integer status;

    /** 甲方法人代表 */
    @Excel(name = "甲方法人代表")
    private String firstaddress;

    /** 乙方法人代表 */
    @Excel(name = "乙方法人代表")
    private String secondaddress;

    /** 产品编码 */
    @Excel(name = "产品编码")
    private String productid;

    /** 规格 */
    @Excel(name = "规格")
    private String standard;

    /** 数量 */
    @Excel(name = "数量")
    private Long cnt;

    /** 单位1:G2:KG3:T::L */
    @Excel(name = "单位1:G2:KG3:T::L")
    private Integer unit;

    /** 单价 */
    @Excel(name = "单价")
    private Double price;

    /** 总价 */
    @Excel(name = "总价")
    private Double amount;

    /** 质量标准 */
    @Excel(name = "质量标准")
    private String quality;

    /** 履行地点及方式 */
    @Excel(name = "履行地点及方式")
    private String perform;

    /** 验收标准及异议期限 */
    @Excel(name = "验收标准及异议期限")
    private String confirm;

    /** 汇款条件 */
    @Excel(name = "汇款条件")
    private String payterm;

    /** 甲方法人 */
    @Excel(name = "甲方法人")
    private String legal1;

    /** 甲方委托人 */
    @Excel(name = "甲方委托人")
    private String client;

    /** 甲方开户行 */
    @Excel(name = "甲方开户行")
    private String bankname1;

    /** 甲方电话 */
    @Excel(name = "甲方电话")
    private String phone1;

    /** 甲方传真 */
    @Excel(name = "甲方传真")
    private String fax1;

    /** 甲方银行账号 */
    @Excel(name = "甲方银行账号")
    private String account1;

    /** 甲方税号 */
    @Excel(name = "甲方税号")
    private String taxcode1;

    /** 甲方邮编 */
    @Excel(name = "甲方邮编")
    private String zipcode1;

    /** 乙方法人 */
    @Excel(name = "乙方法人")
    private String legal2;

    /** 乙方甲方委托人 */
    @Excel(name = "乙方甲方委托人")
    private String column32;

    /** 乙方开户行 */
    @Excel(name = "乙方开户行")
    private String bankname2;

    /** 乙方电话 */
    @Excel(name = "乙方电话")
    private String phone2;

    /** 乙方传真 */
    @Excel(name = "乙方传真")
    private String fax2;

    /** 乙方银行账号 */
    @Excel(name = "乙方银行账号")
    private String account2;

    /** 乙方税号 */
    @Excel(name = "乙方税号")
    private String taxcode2;

    /** 乙方邮编 */
    @Excel(name = "乙方邮编")
    private String zipcode2;

    /** 其他 */
    @Excel(name = "其他")
    private String other;

    /** 合同文件 */
    @Excel(name = "合同文件")
    private String filename;

    /** 送达方客户编码 */
    @Excel(name = "送达方客户编码")
    private String recode;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setCodeid(String codeid) 
    {
        this.codeid = codeid;
    }

    public String getCodeid() 
    {
        return codeid;
    }
    public void setFirstparty(String firstparty) 
    {
        this.firstparty = firstparty;
    }

    public String getFirstparty() 
    {
        return firstparty;
    }
    public void setSecondparty(String secondparty) 
    {
        this.secondparty = secondparty;
    }

    public String getSecondparty() 
    {
        return secondparty;
    }
    public void setReceiver(String receiver) 
    {
        this.receiver = receiver;
    }

    public String getReceiver() 
    {
        return receiver;
    }
    public void setRecphone(String recphone) 
    {
        this.recphone = recphone;
    }

    public String getRecphone() 
    {
        return recphone;
    }
    public void setRecaddress(String recaddress) 
    {
        this.recaddress = recaddress;
    }

    public String getRecaddress() 
    {
        return recaddress;
    }
    public void setRecname(String recname) 
    {
        this.recname = recname;
    }

    public String getRecname() 
    {
        return recname;
    }
    public void setOptime(Date optime) 
    {
        this.optime = optime;
    }

    public Date getOptime() 
    {
        return optime;
    }
    public void setPosition(String position) 
    {
        this.position = position;
    }

    public String getPosition() 
    {
        return position;
    }
    public void setType(Integer type) 
    {
        this.type = type;
    }

    public Integer getType() 
    {
        return type;
    }
    public void setCategory(Integer category) 
    {
        this.category = category;
    }

    public Integer getCategory() 
    {
        return category;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setFirstaddress(String firstaddress) 
    {
        this.firstaddress = firstaddress;
    }

    public String getFirstaddress() 
    {
        return firstaddress;
    }
    public void setSecondaddress(String secondaddress) 
    {
        this.secondaddress = secondaddress;
    }

    public String getSecondaddress() 
    {
        return secondaddress;
    }
    public void setProductid(String productid) 
    {
        this.productid = productid;
    }

    public String getProductid() 
    {
        return productid;
    }
    public void setStandard(String standard) 
    {
        this.standard = standard;
    }

    public String getStandard() 
    {
        return standard;
    }
    public void setCnt(Long cnt) 
    {
        this.cnt = cnt;
    }

    public Long getCnt() 
    {
        return cnt;
    }
    public void setUnit(Integer unit) 
    {
        this.unit = unit;
    }

    public Integer getUnit() 
    {
        return unit;
    }
    public void setPrice(Double price) 
    {
        this.price = price;
    }

    public Double getPrice() 
    {
        return price;
    }
    public void setAmount(Double amount) 
    {
        this.amount = amount;
    }

    public Double getAmount() 
    {
        return amount;
    }
    public void setQuality(String quality) 
    {
        this.quality = quality;
    }

    public String getQuality() 
    {
        return quality;
    }
    public void setPerform(String perform) 
    {
        this.perform = perform;
    }

    public String getPerform() 
    {
        return perform;
    }
    public void setConfirm(String confirm) 
    {
        this.confirm = confirm;
    }

    public String getConfirm() 
    {
        return confirm;
    }
    public void setPayterm(String payterm) 
    {
        this.payterm = payterm;
    }

    public String getPayterm() 
    {
        return payterm;
    }
    public void setLegal1(String legal1) 
    {
        this.legal1 = legal1;
    }

    public String getLegal1() 
    {
        return legal1;
    }
    public void setClient(String client) 
    {
        this.client = client;
    }

    public String getClient() 
    {
        return client;
    }
    public void setBankname1(String bankname1) 
    {
        this.bankname1 = bankname1;
    }

    public String getBankname1() 
    {
        return bankname1;
    }
    public void setPhone1(String phone1) 
    {
        this.phone1 = phone1;
    }

    public String getPhone1() 
    {
        return phone1;
    }
    public void setFax1(String fax1) 
    {
        this.fax1 = fax1;
    }

    public String getFax1() 
    {
        return fax1;
    }
    public void setAccount1(String account1) 
    {
        this.account1 = account1;
    }

    public String getAccount1() 
    {
        return account1;
    }
    public void setTaxcode1(String taxcode1) 
    {
        this.taxcode1 = taxcode1;
    }

    public String getTaxcode1() 
    {
        return taxcode1;
    }
    public void setZipcode1(String zipcode1) 
    {
        this.zipcode1 = zipcode1;
    }

    public String getZipcode1() 
    {
        return zipcode1;
    }
    public void setLegal2(String legal2) 
    {
        this.legal2 = legal2;
    }

    public String getLegal2() 
    {
        return legal2;
    }
    public void setColumn32(String column32) 
    {
        this.column32 = column32;
    }

    public String getColumn32() 
    {
        return column32;
    }
    public void setBankname2(String bankname2) 
    {
        this.bankname2 = bankname2;
    }

    public String getBankname2() 
    {
        return bankname2;
    }
    public void setPhone2(String phone2) 
    {
        this.phone2 = phone2;
    }

    public String getPhone2() 
    {
        return phone2;
    }
    public void setFax2(String fax2) 
    {
        this.fax2 = fax2;
    }

    public String getFax2() 
    {
        return fax2;
    }
    public void setAccount2(String account2) 
    {
        this.account2 = account2;
    }

    public String getAccount2() 
    {
        return account2;
    }
    public void setTaxcode2(String taxcode2) 
    {
        this.taxcode2 = taxcode2;
    }

    public String getTaxcode2() 
    {
        return taxcode2;
    }
    public void setZipcode2(String zipcode2) 
    {
        this.zipcode2 = zipcode2;
    }

    public String getZipcode2() 
    {
        return zipcode2;
    }
    public void setOther(String other) 
    {
        this.other = other;
    }

    public String getOther() 
    {
        return other;
    }
    public void setFilename(String filename) 
    {
        this.filename = filename;
    }

    public String getFilename() 
    {
        return filename;
    }
    public void setRecode(String recode) 
    {
        this.recode = recode;
    }

    public String getRecode() 
    {
        return recode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("codeid", getCodeid())
            .append("firstparty", getFirstparty())
            .append("secondparty", getSecondparty())
            .append("receiver", getReceiver())
            .append("recphone", getRecphone())
            .append("recaddress", getRecaddress())
            .append("recname", getRecname())
            .append("optime", getOptime())
            .append("position", getPosition())
            .append("type", getType())
            .append("category", getCategory())
            .append("status", getStatus())
            .append("firstaddress", getFirstaddress())
            .append("secondaddress", getSecondaddress())
            .append("productid", getProductid())
            .append("standard", getStandard())
            .append("cnt", getCnt())
            .append("unit", getUnit())
            .append("price", getPrice())
            .append("amount", getAmount())
            .append("quality", getQuality())
            .append("perform", getPerform())
            .append("confirm", getConfirm())
            .append("payterm", getPayterm())
            .append("legal1", getLegal1())
            .append("client", getClient())
            .append("bankname1", getBankname1())
            .append("phone1", getPhone1())
            .append("fax1", getFax1())
            .append("account1", getAccount1())
            .append("taxcode1", getTaxcode1())
            .append("zipcode1", getZipcode1())
            .append("legal2", getLegal2())
            .append("column32", getColumn32())
            .append("bankname2", getBankname2())
            .append("phone2", getPhone2())
            .append("fax2", getFax2())
            .append("account2", getAccount2())
            .append("taxcode2", getTaxcode2())
            .append("zipcode2", getZipcode2())
            .append("other", getOther())
            .append("filename", getFilename())
            .append("remark", getRemark())
            .append("recode", getRecode())
            .toString();
    }
}
