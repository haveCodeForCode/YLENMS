package com.ylenms.project.sale.customer.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ylenms.framework.aspectj.lang.annotation.Excel;
import com.ylenms.framework.web.domain.BaseEntity;

/**
 * 客户信息对象 tbl_customer
 * 
 * @author ylenms
 * @date 2019-11-03
 */
public class Customer extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 客户名称 */
    @Excel(name = "客户名称")
    private String fullname;

    /** 客户简称 */
    @Excel(name = "客户简称")
    private String shortname;

    /** 企业简介 */
    @Excel(name = "企业简介")
    private String describe;

    /** 企业资质 */
    @Excel(name = "企业资质")
    private String quality;

    /** 客户法人 */
    @Excel(name = "客户法人")
    private String legalperson;

    /** 主营业务 */
    @Excel(name = "主营业务")
    private String business;

    /** 主营产品 */
    @Excel(name = "主营产品")
    private String product;

    /** 所属国家 */
    @Excel(name = "所属国家")
    private String nation;

    /** 企业类型 */
    @Excel(name = "企业类型")
    private String type;

    /** 注册资金 */
    @Excel(name = "注册资金")
    private String capital;

    /** 客户地址 */
    @Excel(name = "客户地址")
    private String address;

    /** 客户电话 */
    @Excel(name = "客户电话")
    private String telephone;

    /** 客户传真 */
    @Excel(name = "客户传真")
    private String fax;

    /** 客户邮箱 */
    @Excel(name = "客户邮箱")
    private String mail;

    /** 负责人 */
    @Excel(name = "负责人")
    private String manager;

    /** 负责人部门 */
    @Excel(name = "负责人部门")
    private String managerdept;

    /** 负责人职务 */
    @Excel(name = "负责人职务")
    private String managerduty;

    /** 负责人电话 */
    @Excel(name = "负责人电话")
    private String managertel;

    /** 负责人传真 */
    @Excel(name = "负责人传真")
    private String managerfax;

    /** 负责人邮箱 */
    @Excel(name = "负责人邮箱")
    private String managermail;

    /** 税号 */
    @Excel(name = "税号")
    private String tax;

    /** $column.columnComment */
    @Excel(name = "税号")
    private String zipcode;

    /** 银行账号 */
    @Excel(name = "银行账号")
    private String accountid;

    /** 开户行名称 */
    @Excel(name = "开户行名称")
    private String bank;

    /** 开户行代码 */
    @Excel(name = "开户行代码")
    private String bankid;

    /** 客户等级 */
    @Excel(name = "客户等级")
    private String grade;

    /** 传输标志 */
    @Excel(name = "传输标志")
    private Integer transflag;

    /** 客户编码 */
    @Excel(name = "客户编码")
    private String cuscode;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setFullname(String fullname) 
    {
        this.fullname = fullname;
    }

    public String getFullname() 
    {
        return fullname;
    }
    public void setShortname(String shortname) 
    {
        this.shortname = shortname;
    }

    public String getShortname() 
    {
        return shortname;
    }
    public void setDescribe(String describe) 
    {
        this.describe = describe;
    }

    public String getDescribe() 
    {
        return describe;
    }
    public void setQuality(String quality) 
    {
        this.quality = quality;
    }

    public String getQuality() 
    {
        return quality;
    }
    public void setLegalperson(String legalperson) 
    {
        this.legalperson = legalperson;
    }

    public String getLegalperson() 
    {
        return legalperson;
    }
    public void setBusiness(String business) 
    {
        this.business = business;
    }

    public String getBusiness() 
    {
        return business;
    }
    public void setProduct(String product) 
    {
        this.product = product;
    }

    public String getProduct() 
    {
        return product;
    }
    public void setNation(String nation) 
    {
        this.nation = nation;
    }

    public String getNation() 
    {
        return nation;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setCapital(String capital) 
    {
        this.capital = capital;
    }

    public String getCapital() 
    {
        return capital;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setTelephone(String telephone) 
    {
        this.telephone = telephone;
    }

    public String getTelephone() 
    {
        return telephone;
    }
    public void setFax(String fax) 
    {
        this.fax = fax;
    }

    public String getFax() 
    {
        return fax;
    }
    public void setMail(String mail) 
    {
        this.mail = mail;
    }

    public String getMail() 
    {
        return mail;
    }
    public void setManager(String manager) 
    {
        this.manager = manager;
    }

    public String getManager() 
    {
        return manager;
    }
    public void setManagerdept(String managerdept) 
    {
        this.managerdept = managerdept;
    }

    public String getManagerdept() 
    {
        return managerdept;
    }
    public void setManagerduty(String managerduty) 
    {
        this.managerduty = managerduty;
    }

    public String getManagerduty() 
    {
        return managerduty;
    }
    public void setManagertel(String managertel) 
    {
        this.managertel = managertel;
    }

    public String getManagertel() 
    {
        return managertel;
    }
    public void setManagerfax(String managerfax) 
    {
        this.managerfax = managerfax;
    }

    public String getManagerfax() 
    {
        return managerfax;
    }
    public void setManagermail(String managermail) 
    {
        this.managermail = managermail;
    }

    public String getManagermail() 
    {
        return managermail;
    }
    public void setTax(String tax) 
    {
        this.tax = tax;
    }

    public String getTax() 
    {
        return tax;
    }
    public void setZipcode(String zipcode) 
    {
        this.zipcode = zipcode;
    }

    public String getZipcode() 
    {
        return zipcode;
    }
    public void setAccountid(String accountid) 
    {
        this.accountid = accountid;
    }

    public String getAccountid() 
    {
        return accountid;
    }
    public void setBank(String bank) 
    {
        this.bank = bank;
    }

    public String getBank() 
    {
        return bank;
    }
    public void setBankid(String bankid) 
    {
        this.bankid = bankid;
    }

    public String getBankid() 
    {
        return bankid;
    }
    public void setGrade(String grade) 
    {
        this.grade = grade;
    }

    public String getGrade() 
    {
        return grade;
    }
    public void setTransflag(Integer transflag) 
    {
        this.transflag = transflag;
    }

    public Integer getTransflag() 
    {
        return transflag;
    }
    public void setCuscode(String cuscode) 
    {
        this.cuscode = cuscode;
    }

    public String getCuscode() 
    {
        return cuscode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("fullname", getFullname())
            .append("shortname", getShortname())
            .append("describe", getDescribe())
            .append("quality", getQuality())
            .append("legalperson", getLegalperson())
            .append("business", getBusiness())
            .append("product", getProduct())
            .append("nation", getNation())
            .append("type", getType())
            .append("capital", getCapital())
            .append("address", getAddress())
            .append("telephone", getTelephone())
            .append("fax", getFax())
            .append("mail", getMail())
            .append("manager", getManager())
            .append("managerdept", getManagerdept())
            .append("managerduty", getManagerduty())
            .append("managertel", getManagertel())
            .append("managerfax", getManagerfax())
            .append("managermail", getManagermail())
            .append("tax", getTax())
            .append("zipcode", getZipcode())
            .append("accountid", getAccountid())
            .append("bank", getBank())
            .append("bankid", getBankid())
            .append("grade", getGrade())
            .append("remark", getRemark())
            .append("transflag", getTransflag())
            .append("cuscode", getCuscode())
            .toString();
    }
}
