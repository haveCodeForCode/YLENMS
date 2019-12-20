package com.ylenms.project.module.ammeterevent.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ylenms.framework.aspectj.lang.annotation.Excel;
import com.ylenms.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 电事件对象 tbl_ammeterevent
 * 
 * @author ylenms
 * @date 2019-12-14
 */
public class Ammeterevent extends BaseEntity
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

    /** 事件类型(报警 相序错 计量数据错 校表数据错 C相无功反向 B相无功反向 B相无功反向 总无功反向  C相失压 B相失压 A相失压 C相有功反向 B相有功反向 A相有功反向 总有功反向) */
    @Excel(name = "事件类型(报警 相序错 计量数据错 校表数据错 C相无功反向 B相无功反向 B相无功反向 总无功反向  C相失压 B相失压 A相失压 C相有功反向 B相有功反向 A相有功反向 总有功反向)")
    private Integer eventype;

    /** 事件说明(报警 相序错 计量数据错 校表数据错 C相无功反向 B相无功反向 B相无功反向 总无功反向  C相失压 B相失压 A相失压 C相有功反向 B相有功反向 A相有功反向 总有功反向) */
    @Excel(name = "事件说明(报警 相序错 计量数据错 校表数据错 C相无功反向 B相无功反向 B相无功反向 总无功反向  C相失压 B相失压 A相失压 C相有功反向 B相有功反向 A相有功反向 总有功反向)")
    private String event;

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
    public void setEventype(Integer eventype) 
    {
        this.eventype = eventype;
    }

    public Integer getEventype() 
    {
        return eventype;
    }
    public void setEvent(String event) 
    {
        this.event = event;
    }

    public String getEvent() 
    {
        return event;
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
            .append("eventype", getEventype())
            .append("event", getEvent())
            .append("spare1", getSpare1())
            .append("spare2", getSpare2())
            .append("remark", getRemark())
            .toString();
    }
}
