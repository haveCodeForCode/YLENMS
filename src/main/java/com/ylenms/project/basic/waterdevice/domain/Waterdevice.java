package com.ylenms.project.basic.waterdevice.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ylenms.framework.aspectj.lang.annotation.Excel;
import com.ylenms.framework.web.domain.BaseEntity;

/**
 * 设备字典对象 tbl_watermeter
 * 
 * @author ylenms
 * @date 2019-12-14
 */
public class Waterdevice extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** 设备编号 */
    @Excel(name = "设备编号")
    private Long devid;

    /** 设备名称 */
    @Excel(name = "设备名称")
    private String devname;

    /** 设备类型 */
    @Excel(name = "设备类型")
    private Integer devtype;

    /** 设备位置  */
    @Excel(name = "设备位置 ")
    private String position;

    /** 品牌 */
    @Excel(name = "品牌")
    private String brand;

    /** 设备型号 */
    @Excel(name = "设备型号")
    private String version;

    /** 设备描述 */
    @Excel(name = "设备描述")
    private String description;

    /** 设备状态(1:在线2：离线) */
    @Excel(name = "设备状态(1:在线2：离线)")
    private String status;

    /** 启动状态 */
    @Excel(name = "启动状态")
    private String useflag;

    /** 备用1 */
    @Excel(name = "备用1")
    private Long spare1;

    /** 备用2 */
    @Excel(name = "备用2")
    private String spare2;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setDevid(Long devid) 
    {
        this.devid = devid;
    }

    public Long getDevid() 
    {
        return devid;
    }
    public void setDevname(String devname) 
    {
        this.devname = devname;
    }

    public String getDevname() 
    {
        return devname;
    }
    public void setDevtype(Integer devtype) 
    {
        this.devtype = devtype;
    }

    public Integer getDevtype() 
    {
        return devtype;
    }
    public void setPosition(String position) 
    {
        this.position = position;
    }

    public String getPosition() 
    {
        return position;
    }
    public void setBrand(String brand) 
    {
        this.brand = brand;
    }

    public String getBrand() 
    {
        return brand;
    }
    public void setVersion(String version) 
    {
        this.version = version;
    }

    public String getVersion() 
    {
        return version;
    }
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setUseflag(String useflag) 
    {
        this.useflag = useflag;
    }

    public String getUseflag() 
    {
        return useflag;
    }
    public void setSpare1(Long spare1) 
    {
        this.spare1 = spare1;
    }

    public Long getSpare1() 
    {
        return spare1;
    }
    public void setSpare2(String spare2) 
    {
        this.spare2 = spare2;
    }

    public String getSpare2() 
    {
        return spare2;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("devid", getDevid())
            .append("devname", getDevname())
            .append("devtype", getDevtype())
            .append("position", getPosition())
            .append("brand", getBrand())
            .append("version", getVersion())
            .append("description", getDescription())
            .append("status", getStatus())
            .append("useflag", getUseflag())
            .append("spare1", getSpare1())
            .append("spare2", getSpare2())
            .append("remark", getRemark())
            .toString();
    }
}
