package com.ylenms.project.module.ammeter.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ylenms.framework.aspectj.lang.annotation.Excel;
import com.ylenms.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 电数据对象 tbl_ammeter
 * 
 * @author ylenms
 * @date 2019-12-14
 */
public class Ammeter extends BaseEntity
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

    /** 采集时间 */
    @Excel(name = "采集时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date gentime;

    /** 一次侧A相电压 */
    @Excel(name = "一次侧A相电压")
    private Long avol1;

    /** 一次侧B相电压 */
    @Excel(name = "一次侧B相电压")
    private Long bvol1;

    /** 一次侧C相电压 */
    @Excel(name = "一次侧C相电压")
    private Long cvol1;

    /** 一次侧AB相电压 */
    @Excel(name = "一次侧AB相电压")
    private Long abvol1;

    /** 一次侧BC相电压 */
    @Excel(name = "一次侧BC相电压")
    private Long bcvol1;

    /** 一次侧CA相电压 */
    @Excel(name = "一次侧CA相电压")
    private Long cavol1;

    /** 一次侧A相电流 */
    @Excel(name = "一次侧A相电流")
    private Long aflow1;

    /** 一次侧B相电流 */
    @Excel(name = "一次侧B相电流")
    private Long bflow1;

    /** 一次侧C相电流 */
    @Excel(name = "一次侧C相电流")
    private Long cflow1;

    /** 一次侧A相有功功率 */
    @Excel(name = "一次侧A相有功功率")
    private Long apower1;

    /** 一次侧B相有功功率 */
    @Excel(name = "一次侧B相有功功率")
    private Long bpower1;

    /** 一次侧C相有功功率 */
    @Excel(name = "一次侧C相有功功率")
    private Long cpower1;

    /** 一次侧总有功功率 */
    @Excel(name = "一次侧总有功功率")
    private Long totalpower1;

    /** 一次侧A总有功功率 */
    @Excel(name = "一次侧A总有功功率")
    private Long atotalpower1;

    /** 一次侧B总有功功率 */
    @Excel(name = "一次侧B总有功功率")
    private Long btotalpower1;

    /** 一次侧C总有功功率 */
    @Excel(name = "一次侧C总有功功率")
    private Long ctotalpower1;

    /** 一次侧总无功功率 */
    @Excel(name = "一次侧总无功功率")
    private Long totalwattless1;

    /** 一次侧总视在功率 */
    @Excel(name = "一次侧总视在功率")
    private Long appliedpower1;

    /** 一次侧总功率因数 */
    @Excel(name = "一次侧总功率因数")
    private Long powerfactor1;

    /** 一次侧频率 */
    @Excel(name = "一次侧频率")
    private Long freqency1;

    /** A相电压 */
    @Excel(name = "A相电压")
    private Long avol;

    /** B相电压 */
    @Excel(name = "B相电压")
    private Long bvol;

    /** C相电压 */
    @Excel(name = "C相电压")
    private Long cvol;

    /** AB线电压 */
    @Excel(name = "AB线电压")
    private Long abvol;

    /** BC线电压 */
    @Excel(name = "BC线电压")
    private Long bcvol;

    /** CA线电压 */
    @Excel(name = "CA线电压")
    private Long cavol;

    /** A相电流 */
    @Excel(name = "A相电流")
    private Long aflow;

    /** B相电流 */
    @Excel(name = "B相电流")
    private Long bflow;

    /** C相电流 */
    @Excel(name = "C相电流")
    private Long cflow;

    /** A相有功功率 */
    @Excel(name = "A相有功功率")
    private Long apower;

    /** B相有功功率 */
    @Excel(name = "B相有功功率")
    private Long bpower;

    /** C相有功功率 */
    @Excel(name = "C相有功功率")
    private Long cpower;

    /** 总有功功率 */
    @Excel(name = "总有功功率")
    private Long totalpower;

    /** A相无功功率 */
    @Excel(name = "A相无功功率")
    private Long atotalpower;

    /** B相无功功率 */
    @Excel(name = "B相无功功率")
    private Long btotalpower;

    /** C相无功功率 */
    @Excel(name = "C相无功功率")
    private Long ctotalpower;

    /** 总无功功率 */
    @Excel(name = "总无功功率")
    private Long totalwattless;

    /** A相视在功率 */
    @Excel(name = "A相视在功率")
    private Long appliedpowera1;

    /** A相视在功率 */
    @Excel(name = "A相视在功率")
    private Long appliedpowera2;

    /** A相视在功率 */
    @Excel(name = "A相视在功率")
    private Long appliedpowera3;

    /** 总视在功率 */
    @Excel(name = "总视在功率")
    private Long totalappliedpower;

    /** A相功率因素 */
    @Excel(name = "A相功率因素")
    private Long apowerfactor;

    /** B相功率因素 */
    @Excel(name = "B相功率因素")
    private Long bpowerfactor;

    /** C相功率因素 */
    @Excel(name = "C相功率因素")
    private Long cpowerfactor;

    /** 总功率因素 */
    @Excel(name = "总功率因素")
    private Long powerfactor;

    /** 频率 */
    @Excel(name = "频率")
    private Long freqency;

    /** AB相电压间相位 */
    @Excel(name = "AB相电压间相位")
    private Long abphase;

    /** BC相电压间相位 */
    @Excel(name = "BC相电压间相位")
    private Long bcphase;

    /** CA相电压间相位 */
    @Excel(name = "CA相电压间相位")
    private Long caphase;

    /** 当前总有功电能 */
    @Excel(name = "当前总有功电能")
    private Long currentenergy;

    /** 当前正向总有功电能 */
    @Excel(name = "当前正向总有功电能")
    private Long directenergy;

    /** 当前反向总有功电能 */
    @Excel(name = "当前反向总有功电能")
    private Long reverseenergy;

    /** 当前总无功电能 */
    @Excel(name = "当前总无功电能")
    private Long inactivepoer;

    /** 当前正向总无功电能 */
    @Excel(name = "当前正向总无功电能")
    private Long directinactive;

    /** 当前反向总无功电能 */
    @Excel(name = "当前反向总无功电能")
    private Long reverseinactive;

    /** 上1月总有功电能 */
    @Excel(name = "上1月总有功电能")
    private Long powerpass1;

    /** 上2月总有功电能 */
    @Excel(name = "上2月总有功电能")
    private Long powerpass2;

    /** 上3月总有功电能 */
    @Excel(name = "上3月总有功电能")
    private Long powerpass3;

    /** 上4月总有功电能 */
    @Excel(name = "上4月总有功电能")
    private Long powerpass4;

    /** 上5月总有功电能 */
    @Excel(name = "上5月总有功电能")
    private Long powerpass5;

    /** 上6月总有功电能 */
    @Excel(name = "上6月总有功电能")
    private Long powerpass6;

    /** 上7月总有功电能 */
    @Excel(name = "上7月总有功电能")
    private Long powerpass7;

    /** 上8月总有功电能 */
    @Excel(name = "上8月总有功电能")
    private Long powerpass8;

    /** 上9月总有功电能 */
    @Excel(name = "上9月总有功电能")
    private Long powerpass9;

    /** 上10月总有功电能 */
    @Excel(name = "上10月总有功电能")
    private Long powerpass10;

    /** 上11月总有功电能 */
    @Excel(name = "上11月总有功电能")
    private Long powerpass11;

    /** 上12月总有功电能 */
    @Excel(name = "上12月总有功电能")
    private Long powerpass12;

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
    public void setGentime(Date gentime) 
    {
        this.gentime = gentime;
    }

    public Date getGentime() 
    {
        return gentime;
    }
    public void setAvol1(Long avol1) 
    {
        this.avol1 = avol1;
    }

    public Long getAvol1() 
    {
        return avol1;
    }
    public void setBvol1(Long bvol1) 
    {
        this.bvol1 = bvol1;
    }

    public Long getBvol1() 
    {
        return bvol1;
    }
    public void setCvol1(Long cvol1) 
    {
        this.cvol1 = cvol1;
    }

    public Long getCvol1() 
    {
        return cvol1;
    }
    public void setAbvol1(Long abvol1) 
    {
        this.abvol1 = abvol1;
    }

    public Long getAbvol1() 
    {
        return abvol1;
    }
    public void setBcvol1(Long bcvol1) 
    {
        this.bcvol1 = bcvol1;
    }

    public Long getBcvol1() 
    {
        return bcvol1;
    }
    public void setCavol1(Long cavol1) 
    {
        this.cavol1 = cavol1;
    }

    public Long getCavol1() 
    {
        return cavol1;
    }
    public void setAflow1(Long aflow1) 
    {
        this.aflow1 = aflow1;
    }

    public Long getAflow1() 
    {
        return aflow1;
    }
    public void setBflow1(Long bflow1) 
    {
        this.bflow1 = bflow1;
    }

    public Long getBflow1() 
    {
        return bflow1;
    }
    public void setCflow1(Long cflow1) 
    {
        this.cflow1 = cflow1;
    }

    public Long getCflow1() 
    {
        return cflow1;
    }
    public void setApower1(Long apower1) 
    {
        this.apower1 = apower1;
    }

    public Long getApower1() 
    {
        return apower1;
    }
    public void setBpower1(Long bpower1) 
    {
        this.bpower1 = bpower1;
    }

    public Long getBpower1() 
    {
        return bpower1;
    }
    public void setCpower1(Long cpower1) 
    {
        this.cpower1 = cpower1;
    }

    public Long getCpower1() 
    {
        return cpower1;
    }
    public void setTotalpower1(Long totalpower1) 
    {
        this.totalpower1 = totalpower1;
    }

    public Long getTotalpower1() 
    {
        return totalpower1;
    }
    public void setAtotalpower1(Long atotalpower1) 
    {
        this.atotalpower1 = atotalpower1;
    }

    public Long getAtotalpower1() 
    {
        return atotalpower1;
    }
    public void setBtotalpower1(Long btotalpower1) 
    {
        this.btotalpower1 = btotalpower1;
    }

    public Long getBtotalpower1() 
    {
        return btotalpower1;
    }
    public void setCtotalpower1(Long ctotalpower1) 
    {
        this.ctotalpower1 = ctotalpower1;
    }

    public Long getCtotalpower1() 
    {
        return ctotalpower1;
    }
    public void setTotalwattless1(Long totalwattless1) 
    {
        this.totalwattless1 = totalwattless1;
    }

    public Long getTotalwattless1() 
    {
        return totalwattless1;
    }
    public void setAppliedpower1(Long appliedpower1) 
    {
        this.appliedpower1 = appliedpower1;
    }

    public Long getAppliedpower1() 
    {
        return appliedpower1;
    }
    public void setPowerfactor1(Long powerfactor1) 
    {
        this.powerfactor1 = powerfactor1;
    }

    public Long getPowerfactor1() 
    {
        return powerfactor1;
    }
    public void setFreqency1(Long freqency1) 
    {
        this.freqency1 = freqency1;
    }

    public Long getFreqency1() 
    {
        return freqency1;
    }
    public void setAvol(Long avol) 
    {
        this.avol = avol;
    }

    public Long getAvol() 
    {
        return avol;
    }
    public void setBvol(Long bvol) 
    {
        this.bvol = bvol;
    }

    public Long getBvol() 
    {
        return bvol;
    }
    public void setCvol(Long cvol) 
    {
        this.cvol = cvol;
    }

    public Long getCvol() 
    {
        return cvol;
    }
    public void setAbvol(Long abvol) 
    {
        this.abvol = abvol;
    }

    public Long getAbvol() 
    {
        return abvol;
    }
    public void setBcvol(Long bcvol) 
    {
        this.bcvol = bcvol;
    }

    public Long getBcvol() 
    {
        return bcvol;
    }
    public void setCavol(Long cavol) 
    {
        this.cavol = cavol;
    }

    public Long getCavol() 
    {
        return cavol;
    }
    public void setAflow(Long aflow) 
    {
        this.aflow = aflow;
    }

    public Long getAflow() 
    {
        return aflow;
    }
    public void setBflow(Long bflow) 
    {
        this.bflow = bflow;
    }

    public Long getBflow() 
    {
        return bflow;
    }
    public void setCflow(Long cflow) 
    {
        this.cflow = cflow;
    }

    public Long getCflow() 
    {
        return cflow;
    }
    public void setApower(Long apower) 
    {
        this.apower = apower;
    }

    public Long getApower() 
    {
        return apower;
    }
    public void setBpower(Long bpower) 
    {
        this.bpower = bpower;
    }

    public Long getBpower() 
    {
        return bpower;
    }
    public void setCpower(Long cpower) 
    {
        this.cpower = cpower;
    }

    public Long getCpower() 
    {
        return cpower;
    }
    public void setTotalpower(Long totalpower) 
    {
        this.totalpower = totalpower;
    }

    public Long getTotalpower() 
    {
        return totalpower;
    }
    public void setAtotalpower(Long atotalpower) 
    {
        this.atotalpower = atotalpower;
    }

    public Long getAtotalpower() 
    {
        return atotalpower;
    }
    public void setBtotalpower(Long btotalpower) 
    {
        this.btotalpower = btotalpower;
    }

    public Long getBtotalpower() 
    {
        return btotalpower;
    }
    public void setCtotalpower(Long ctotalpower) 
    {
        this.ctotalpower = ctotalpower;
    }

    public Long getCtotalpower() 
    {
        return ctotalpower;
    }
    public void setTotalwattless(Long totalwattless) 
    {
        this.totalwattless = totalwattless;
    }

    public Long getTotalwattless() 
    {
        return totalwattless;
    }
    public void setAppliedpowera1(Long appliedpowera1) 
    {
        this.appliedpowera1 = appliedpowera1;
    }

    public Long getAppliedpowera1() 
    {
        return appliedpowera1;
    }
    public void setAppliedpowera2(Long appliedpowera2) 
    {
        this.appliedpowera2 = appliedpowera2;
    }

    public Long getAppliedpowera2() 
    {
        return appliedpowera2;
    }
    public void setAppliedpowera3(Long appliedpowera3) 
    {
        this.appliedpowera3 = appliedpowera3;
    }

    public Long getAppliedpowera3() 
    {
        return appliedpowera3;
    }
    public void setTotalappliedpower(Long totalappliedpower) 
    {
        this.totalappliedpower = totalappliedpower;
    }

    public Long getTotalappliedpower() 
    {
        return totalappliedpower;
    }
    public void setApowerfactor(Long apowerfactor) 
    {
        this.apowerfactor = apowerfactor;
    }

    public Long getApowerfactor() 
    {
        return apowerfactor;
    }
    public void setBpowerfactor(Long bpowerfactor) 
    {
        this.bpowerfactor = bpowerfactor;
    }

    public Long getBpowerfactor() 
    {
        return bpowerfactor;
    }
    public void setCpowerfactor(Long cpowerfactor) 
    {
        this.cpowerfactor = cpowerfactor;
    }

    public Long getCpowerfactor() 
    {
        return cpowerfactor;
    }
    public void setPowerfactor(Long powerfactor) 
    {
        this.powerfactor = powerfactor;
    }

    public Long getPowerfactor() 
    {
        return powerfactor;
    }
    public void setFreqency(Long freqency) 
    {
        this.freqency = freqency;
    }

    public Long getFreqency() 
    {
        return freqency;
    }
    public void setAbphase(Long abphase) 
    {
        this.abphase = abphase;
    }

    public Long getAbphase() 
    {
        return abphase;
    }
    public void setBcphase(Long bcphase) 
    {
        this.bcphase = bcphase;
    }

    public Long getBcphase() 
    {
        return bcphase;
    }
    public void setCaphase(Long caphase) 
    {
        this.caphase = caphase;
    }

    public Long getCaphase() 
    {
        return caphase;
    }
    public void setCurrentenergy(Long currentenergy) 
    {
        this.currentenergy = currentenergy;
    }

    public Long getCurrentenergy() 
    {
        return currentenergy;
    }
    public void setDirectenergy(Long directenergy) 
    {
        this.directenergy = directenergy;
    }

    public Long getDirectenergy() 
    {
        return directenergy;
    }
    public void setReverseenergy(Long reverseenergy) 
    {
        this.reverseenergy = reverseenergy;
    }

    public Long getReverseenergy() 
    {
        return reverseenergy;
    }
    public void setInactivepoer(Long inactivepoer) 
    {
        this.inactivepoer = inactivepoer;
    }

    public Long getInactivepoer() 
    {
        return inactivepoer;
    }
    public void setDirectinactive(Long directinactive) 
    {
        this.directinactive = directinactive;
    }

    public Long getDirectinactive() 
    {
        return directinactive;
    }
    public void setReverseinactive(Long reverseinactive) 
    {
        this.reverseinactive = reverseinactive;
    }

    public Long getReverseinactive() 
    {
        return reverseinactive;
    }
    public void setPowerpass1(Long powerpass1) 
    {
        this.powerpass1 = powerpass1;
    }

    public Long getPowerpass1() 
    {
        return powerpass1;
    }
    public void setPowerpass2(Long powerpass2) 
    {
        this.powerpass2 = powerpass2;
    }

    public Long getPowerpass2() 
    {
        return powerpass2;
    }
    public void setPowerpass3(Long powerpass3) 
    {
        this.powerpass3 = powerpass3;
    }

    public Long getPowerpass3() 
    {
        return powerpass3;
    }
    public void setPowerpass4(Long powerpass4) 
    {
        this.powerpass4 = powerpass4;
    }

    public Long getPowerpass4() 
    {
        return powerpass4;
    }
    public void setPowerpass5(Long powerpass5) 
    {
        this.powerpass5 = powerpass5;
    }

    public Long getPowerpass5() 
    {
        return powerpass5;
    }
    public void setPowerpass6(Long powerpass6) 
    {
        this.powerpass6 = powerpass6;
    }

    public Long getPowerpass6() 
    {
        return powerpass6;
    }
    public void setPowerpass7(Long powerpass7) 
    {
        this.powerpass7 = powerpass7;
    }

    public Long getPowerpass7() 
    {
        return powerpass7;
    }
    public void setPowerpass8(Long powerpass8) 
    {
        this.powerpass8 = powerpass8;
    }

    public Long getPowerpass8() 
    {
        return powerpass8;
    }
    public void setPowerpass9(Long powerpass9) 
    {
        this.powerpass9 = powerpass9;
    }

    public Long getPowerpass9() 
    {
        return powerpass9;
    }
    public void setPowerpass10(Long powerpass10) 
    {
        this.powerpass10 = powerpass10;
    }

    public Long getPowerpass10() 
    {
        return powerpass10;
    }
    public void setPowerpass11(Long powerpass11) 
    {
        this.powerpass11 = powerpass11;
    }

    public Long getPowerpass11() 
    {
        return powerpass11;
    }
    public void setPowerpass12(Long powerpass12) 
    {
        this.powerpass12 = powerpass12;
    }

    public Long getPowerpass12() 
    {
        return powerpass12;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("devid", getDevid())
            .append("devname", getDevname())
            .append("gentime", getGentime())
            .append("avol1", getAvol1())
            .append("bvol1", getBvol1())
            .append("cvol1", getCvol1())
            .append("abvol1", getAbvol1())
            .append("bcvol1", getBcvol1())
            .append("cavol1", getCavol1())
            .append("aflow1", getAflow1())
            .append("bflow1", getBflow1())
            .append("cflow1", getCflow1())
            .append("apower1", getApower1())
            .append("bpower1", getBpower1())
            .append("cpower1", getCpower1())
            .append("totalpower1", getTotalpower1())
            .append("atotalpower1", getAtotalpower1())
            .append("btotalpower1", getBtotalpower1())
            .append("ctotalpower1", getCtotalpower1())
            .append("totalwattless1", getTotalwattless1())
            .append("appliedpower1", getAppliedpower1())
            .append("powerfactor1", getPowerfactor1())
            .append("freqency1", getFreqency1())
            .append("avol", getAvol())
            .append("bvol", getBvol())
            .append("cvol", getCvol())
            .append("abvol", getAbvol())
            .append("bcvol", getBcvol())
            .append("cavol", getCavol())
            .append("aflow", getAflow())
            .append("bflow", getBflow())
            .append("cflow", getCflow())
            .append("apower", getApower())
            .append("bpower", getBpower())
            .append("cpower", getCpower())
            .append("totalpower", getTotalpower())
            .append("atotalpower", getAtotalpower())
            .append("btotalpower", getBtotalpower())
            .append("ctotalpower", getCtotalpower())
            .append("totalwattless", getTotalwattless())
            .append("appliedpowera1", getAppliedpowera1())
            .append("appliedpowera2", getAppliedpowera2())
            .append("appliedpowera3", getAppliedpowera3())
            .append("totalappliedpower", getTotalappliedpower())
            .append("apowerfactor", getApowerfactor())
            .append("bpowerfactor", getBpowerfactor())
            .append("cpowerfactor", getCpowerfactor())
            .append("powerfactor", getPowerfactor())
            .append("freqency", getFreqency())
            .append("abphase", getAbphase())
            .append("bcphase", getBcphase())
            .append("caphase", getCaphase())
            .append("currentenergy", getCurrentenergy())
            .append("directenergy", getDirectenergy())
            .append("reverseenergy", getReverseenergy())
            .append("inactivepoer", getInactivepoer())
            .append("directinactive", getDirectinactive())
            .append("reverseinactive", getReverseinactive())
            .append("powerpass1", getPowerpass1())
            .append("powerpass2", getPowerpass2())
            .append("powerpass3", getPowerpass3())
            .append("powerpass4", getPowerpass4())
            .append("powerpass5", getPowerpass5())
            .append("powerpass6", getPowerpass6())
            .append("powerpass7", getPowerpass7())
            .append("powerpass8", getPowerpass8())
            .append("powerpass9", getPowerpass9())
            .append("powerpass10", getPowerpass10())
            .append("powerpass11", getPowerpass11())
            .append("powerpass12", getPowerpass12())
            .append("remark", getRemark())
            .toString();
    }
}
