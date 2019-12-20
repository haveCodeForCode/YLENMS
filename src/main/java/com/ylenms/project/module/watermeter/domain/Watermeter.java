package com.ylenms.project.module.watermeter.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ylenms.framework.aspectj.lang.annotation.Excel;
import com.ylenms.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 水信息对象 tbl_watermeter
 * 
 * @author ylenms
 * @date 2019-12-14
 */
public class Watermeter extends BaseEntity
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

    /** 设备位置  */
    @Excel(name = "设备位置 ")
    private String position;

    /** 品牌 */
    @Excel(name = "品牌")
    private String brand;

    /** 设备型号 */
    @Excel(name = "设备型号")
    private String version;

    /** 采集时间 */
    @Excel(name = "采集时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date gentime;

    /** 用水量 */
    @Excel(name = "用水量")
    private Long watervolume;

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
    public void setGentime(Date gentime) 
    {
        this.gentime = gentime;
    }

    public Date getGentime() 
    {
        return gentime;
    }
    public void setWatervolume(Long watervolume) 
    {
        this.watervolume = watervolume;
    }

    public Long getWatervolume() 
    {
        return watervolume;
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
            .append("position", getPosition())
            .append("brand", getBrand())
            .append("version", getVersion())
            .append("gentime", getGentime())
            .append("watervolume", getWatervolume())
            .append("spare1", getSpare1())
            .append("spare2", getSpare2())
            .append("remark", getRemark())
            .toString();
    }
}
