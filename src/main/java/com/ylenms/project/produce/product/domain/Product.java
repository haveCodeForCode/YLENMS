package com.ylenms.project.produce.product.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ylenms.framework.aspectj.lang.annotation.Excel;
import com.ylenms.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 产品信息对象 tbl_product
 * 
 * @author ylenms
 * @date 2019-11-10
 */
public class Product extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 产品类型 */
    @Excel(name = "产品类型")
    private String type;

    /** 产品品名 */
    @Excel(name = "产品品名")
    private String pdname;

    /** 产品编码 */
    @Excel(name = "产品编码")
    private String pdcode;

    /** 工艺 */
    @Excel(name = "工艺")
    private String technology;

    /** 原料名 */
    @Excel(name = "原料名")
    private String macode;

    /** 原料比例% */
    @Excel(name = "原料比例%")
    private String maratio;

    /** 配比 */
    @Excel(name = "配比")
    private String recipe;
    
    /** 消耗系数 */
    @Excel(name = "消耗系数")
    private String consumption;

    /**
	 * @return the consumption
	 */
	public String getConsumption() {
		return consumption;
	}

	/**
	 * @param consumption the consumption to set
	 */
	public void setConsumption(String consumption) {
		this.consumption = consumption;
	}

	/** 名义线密度 */
    @Excel(name = "名义线密度")
    private Double item1;

    /** 切断长度 */
    @Excel(name = "切断长度")
    private Double item2;

    /** 干断裂强度/ (CN/ DTEX) */
    @Excel(name = "干断裂强度/ (CN/ DTEX)")
    private Double item3;

    /** 湿断 裂强度/ (CN/ DTEX) */
    @Excel(name = "湿断 裂强度/ (CN/ DTEX)")
    private Double item4;

    /** 湿模量/[(CN/DTEX) /5%] */
    @Excel(name = "湿模量/[(CN/DTEX) /5%]")
    private Double item5;

    /** 干断裂伸长率／％ */
    @Excel(name = "干断裂伸长率／％")
    private Double item6;

    /** 干断裂强力变异系数／％ */
    @Excel(name = "干断裂强力变异系数／％")
    private Double item7;

    /** 线密度偏差率／％ */
    @Excel(name = "线密度偏差率／％")
    private Double item8;

    /** 长度偏差率／％ */
    @Excel(name = "长度偏差率／％")
    private Double item9;

    /** 超长纤维率／％ */
    @Excel(name = "超长纤维率／％")
    private Double item10;

    /** 倍长纤维含掀 / ( MG/ 100 G) */
    @Excel(name = "倍长纤维含掀 / ( MG/ 100 G)")
    private Double item11;

    /** 疵点含量/ ( MG/ 100 G) */
    @Excel(name = "疵点含量/ ( MG/ 100 G)")
    private Double item12;

    /** 油污黄纤维含量/ ( MG/100 G) */
    @Excel(name = "油污黄纤维含量/ ( MG/100 G)")
    private Double item13;

    /** 白度 */
    @Excel(name = "白度")
    private Double item14;

    /** 含油率 */
    @Excel(name = "含油率")
    private Double item15;

    /** 回潮率 */
    @Excel(name = "回潮率")
    private Double item16;

    /** 0:新建1:申请2:审核 */
    @Excel(name = "0:新建1:申请2:审核")
    private String status;

    /** 0:启用1:停用 */
    @Excel(name = "0:启用1:停用")
    private String delFlag;

    /** 审核理由 */
    @Excel(name = "审核理由")
    private String ression;

    /** 传输标志 */
    @Excel(name = "传输标志")
    private Integer transflag;

    /** 审核人 */
    @Excel(name = "审核人")
    private String auditname;

    /** 审核时间 */
    @Excel(name = "审核时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date audittime;

    /** 录入人 */
    @Excel(name = "录入人")
    private String inputname;

    /** 录入时间 */
    @Excel(name = "录入时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date inputtime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setPdname(String pdname) 
    {
        this.pdname = pdname;
    }

    public String getPdname() 
    {
        return pdname;
    }
    public void setPdcode(String pdcode) 
    {
        this.pdcode = pdcode;
    }

    public String getPdcode() 
    {
        return pdcode;
    }
    public void setTechnology(String technology) 
    {
        this.technology = technology;
    }

    public String getTechnology() 
    {
        return technology;
    }
    public void setMacode(String macode) 
    {
        this.macode = macode;
    }

    public String getMacode() 
    {
        return macode;
    }
    public void setMaratio(String maratio) 
    {
        this.maratio = maratio;
    }

    public String getMaratio() 
    {
        return maratio;
    }
    public void setRecipe(String recipe) 
    {
        this.recipe = recipe;
    }

    public String getRecipe() 
    {
        return recipe;
    }
    public void setItem1(Double item1) 
    {
        this.item1 = item1;
    }

    public Double getItem1() 
    {
        return item1;
    }
    public void setItem2(Double item2) 
    {
        this.item2 = item2;
    }

    public Double getItem2() 
    {
        return item2;
    }
    public void setItem3(Double item3) 
    {
        this.item3 = item3;
    }

    public Double getItem3() 
    {
        return item3;
    }
    public void setItem4(Double item4) 
    {
        this.item4 = item4;
    }

    public Double getItem4() 
    {
        return item4;
    }
    public void setItem5(Double item5) 
    {
        this.item5 = item5;
    }

    public Double getItem5() 
    {
        return item5;
    }
    public void setItem6(Double item6) 
    {
        this.item6 = item6;
    }

    public Double getItem6() 
    {
        return item6;
    }
    public void setItem7(Double item7) 
    {
        this.item7 = item7;
    }

    public Double getItem7() 
    {
        return item7;
    }
    public void setItem8(Double item8) 
    {
        this.item8 = item8;
    }

    public Double getItem8() 
    {
        return item8;
    }
    public void setItem9(Double item9) 
    {
        this.item9 = item9;
    }

    public Double getItem9() 
    {
        return item9;
    }
    public void setItem10(Double item10) 
    {
        this.item10 = item10;
    }

    public Double getItem10() 
    {
        return item10;
    }
    public void setItem11(Double item11) 
    {
        this.item11 = item11;
    }

    public Double getItem11() 
    {
        return item11;
    }
    public void setItem12(Double item12) 
    {
        this.item12 = item12;
    }

    public Double getItem12() 
    {
        return item12;
    }
    public void setItem13(Double item13) 
    {
        this.item13 = item13;
    }

    public Double getItem13() 
    {
        return item13;
    }
    public void setItem14(Double item14) 
    {
        this.item14 = item14;
    }

    public Double getItem14() 
    {
        return item14;
    }
    public void setItem15(Double item15) 
    {
        this.item15 = item15;
    }

    public Double getItem15() 
    {
        return item15;
    }
    public void setItem16(Double item16) 
    {
        this.item16 = item16;
    }

    public Double getItem16() 
    {
        return item16;
    }

    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }
    public void setRession(String ression) 
    {
        this.ression = ression;
    }

    public String getRession() 
    {
        return ression;
    }
    public void setTransflag(Integer transflag) 
    {
        this.transflag = transflag;
    }

    public Integer getTransflag() 
    {
        return transflag;
    }
    public void setAuditname(String auditname) 
    {
        this.auditname = auditname;
    }

    public String getAuditname() 
    {
        return auditname;
    }
    public void setAudittime(Date audittime) 
    {
        this.audittime = audittime;
    }

    public Date getAudittime() 
    {
        return audittime;
    }
    public void setInputname(String inputname) 
    {
        this.inputname = inputname;
    }

    public String getInputname() 
    {
        return inputname;
    }
    public void setInputtime(Date inputtime) 
    {
        this.inputtime = inputtime;
    }

    public Date getInputtime() 
    {
        return inputtime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("type", getType())
            .append("pdname", getPdname())
            .append("pdcode", getPdcode())
            .append("technology", getTechnology())
            .append("macode", getMacode())
            .append("maratio", getMaratio())
            .append("recipe", getRecipe())
            .append("item1", getItem1())
            .append("item2", getItem2())
            .append("item3", getItem3())
            .append("item4", getItem4())
            .append("item5", getItem5())
            .append("item6", getItem6())
            .append("item7", getItem7())
            .append("item8", getItem8())
            .append("item9", getItem9())
            .append("item10", getItem10())
            .append("item11", getItem11())
            .append("item12", getItem12())
            .append("item13", getItem13())
            .append("item14", getItem14())
            .append("item15", getItem15())
            .append("item16", getItem16())
            .append("status", getStatus())
            .append("delFlag", getDelFlag())
            .append("ression", getRession())
            .append("remark", getRemark())
            .append("transflag", getTransflag())
            .append("auditname", getAuditname())
            .append("audittime", getAudittime())
            .append("inputname", getInputname())
            .append("inputtime", getInputtime())
            .toString();
    }

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
}
