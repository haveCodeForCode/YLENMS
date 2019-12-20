package com.ylenms.project.module.order.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ylenms.framework.aspectj.lang.annotation.Excel;
import com.ylenms.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 订单信息对象 tbl_order
 * 
 * @author ylenms
 * @date 2019-11-14
 */
public class Order extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 订单号 */
    @Excel(name = "订单号")
    private String pdod;

    /** 合同号 */
    @Excel(name = "合同号")
    private String contractid;

    /** 合同日期 */
    @Excel(name = "合同日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date optime;

    /** 销售订单号 */
    @Excel(name = "销售订单号")
    private String saleod;

    /** 订单类型(销售生产) */
    @Excel(name = "订单类型(销售生产)")
    private Integer orderClass;

    /** 国内订单、出口订单 */
    @Excel(name = "国内订单、出口订单")
    private Integer type;

    /** 客户名称 */
    @Excel(name = "客户名称")
    private String fullname;

    /** 产品编码 */
    @Excel(name = "产品编码")
    private String materialcode;

    /** 产品品名 */
    @Excel(name = "产品品名")
    private String name;

    /** 质量ID */
    @Excel(name = "质量ID")
    private String qualityid;

    /** 标签ID */
    @Excel(name = "标签ID")
    private String tagid;

    /** 质量要求 */
    @Excel(name = "质量要求")
    private String quality;

    /** 生产线 */
    @Excel(name = "生产线")
    private Long line;

    /** 单价(元) */
    @Excel(name = "单价(元)")
    private Double price;

    /** 包数(包) */
    @Excel(name = "包数(包)")
    private Long totalcnt;

    /** 订单重量KG */
    @Excel(name = "订单重量KG")
    private Double weight;

    /** 人民币总价(元) */
    @Excel(name = "人民币总价(元)")
    private Double rmbamount;

    /** 交货日期 */
    @Excel(name = "交货日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date sendtime;

    /** 订单状态 */
    @Excel(name = "订单状态")
    private String status;

    /** 客户特殊要求 */
    @Excel(name = "客户特殊要求")
    private String cusremark;

    /** 生产特殊要求 */
    @Excel(name = "生产特殊要求")
    private String produceremark;

    /** 启用状态 */
    @Excel(name = "启用状态")
    private String delFlag;

    /** 传输标志 */
    @Excel(name = "传输标志")
    private Integer transflag;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setPdod(String pdod) 
    {
        this.pdod = pdod;
    }

    public String getPdod() 
    {
        return pdod;
    }
    public void setContractid(String contractid) 
    {
        this.contractid = contractid;
    }

    public String getContractid() 
    {
        return contractid;
    }
    public void setOptime(Date optime) 
    {
        this.optime = optime;
    }

    public Date getOptime() 
    {
        return optime;
    }
    public void setSaleod(String saleod) 
    {
        this.saleod = saleod;
    }

    public String getSaleod() 
    {
        return saleod;
    }
    public void setOrderClass(Integer orderClass) 
    {
        this.orderClass = orderClass;
    }

    public Integer getOrderClass() 
    {
        return orderClass;
    }
    public void setType(Integer type) 
    {
        this.type = type;
    }

    public Integer getType() 
    {
        return type;
    }
    public void setFullname(String fullname) 
    {
        this.fullname = fullname;
    }

    public String getFullname() 
    {
        return fullname;
    }
    public void setMaterialcode(String materialcode) 
    {
        this.materialcode = materialcode;
    }

    public String getMaterialcode() 
    {
        return materialcode;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setQualityid(String qualityid) 
    {
        this.qualityid = qualityid;
    }

    public String getQualityid() 
    {
        return qualityid;
    }
    public void setTagid(String tagid) 
    {
        this.tagid = tagid;
    }

    public String getTagid() 
    {
        return tagid;
    }
    public void setQuality(String quality) 
    {
        this.quality = quality;
    }

    public String getQuality() 
    {
        return quality;
    }
    public void setLine(Long line) 
    {
        this.line = line;
    }

    public Long getLine() 
    {
        return line;
    }
    public void setPrice(Double price) 
    {
        this.price = price;
    }

    public Double getPrice() 
    {
        return price;
    }
    public void setTotalcnt(Long totalcnt) 
    {
        this.totalcnt = totalcnt;
    }

    public Long getTotalcnt() 
    {
        return totalcnt;
    }
    public void setWeight(Double weight) 
    {
        this.weight = weight;
    }

    public Double getWeight() 
    {
        return weight;
    }
    public void setRmbamount(Double rmbamount) 
    {
        this.rmbamount = rmbamount;
    }

    public Double getRmbamount() 
    {
        return rmbamount;
    }
    public void setSendtime(Date sendtime) 
    {
        this.sendtime = sendtime;
    }

    public Date getSendtime() 
    {
        return sendtime;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setCusremark(String cusremark) 
    {
        this.cusremark = cusremark;
    }

    public String getCusremark() 
    {
        return cusremark;
    }
    public void setProduceremark(String produceremark) 
    {
        this.produceremark = produceremark;
    }

    public String getProduceremark() 
    {
        return produceremark;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }
    public void setTransflag(Integer transflag) 
    {
        this.transflag = transflag;
    }

    public Integer getTransflag() 
    {
        return transflag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("pdod", getPdod())
            .append("contractid", getContractid())
            .append("optime", getOptime())
            .append("saleod", getSaleod())
            .append("orderClass", getOrderClass())
            .append("type", getType())
            .append("fullname", getFullname())
            .append("materialcode", getMaterialcode())
            .append("name", getName())
            .append("qualityid", getQualityid())
            .append("tagid", getTagid())
            .append("quality", getQuality())
            .append("line", getLine())
            .append("price", getPrice())
            .append("totalcnt", getTotalcnt())
            .append("weight", getWeight())
            .append("rmbamount", getRmbamount())
            .append("sendtime", getSendtime())
            .append("status", getStatus())
            .append("cusremark", getCusremark())
            .append("produceremark", getProduceremark())
            .append("delFlag", getDelFlag())
            .append("remark", getRemark())
            .append("transflag", getTransflag())
            .toString();
    }
}
