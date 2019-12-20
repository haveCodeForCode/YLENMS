package com.ylenms.project.module.creatdispatch.domain;

import com.ylenms.framework.web.domain.BaseEntity;

import java.util.Date;

/**
 * 生产调度表 TBL_CREATDISPATCH
 * 
 * @author ylenms
 * @date 2018-09-12distype
 */
public class Creatdispatch extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 序号 */
	private Integer id;
	/** 生产调度单号 */
	private String dispatchid;
	/** 生产线号 */
	private Integer pdlineid;
	/** 品名 */
	private String pdname;
	/** 生产重量kg */
	private double actualweight;
	/** 操作标记 */
	private Integer optag;
	/** 状态 */
	private String status;
	/** 关联生产订单号 */
	private String boundpdorderid;
	/** 备注 */
	private String remark;
	/** 传输标志 */
	private Integer transflag;
	/** 排序序号 */
	private Integer sortnum;
	/** 调度单单号 */
	private String sortid;
	/** 订单类别*/
	private String distype;
	/** 计划开始时间*/
	private Date begintime;
	/** 计划结束时间*/
	private Date endtime;
	/** 生产时间*/
	private String pdperiod;
	/** 停车开始时间*/
	private Date stopbegintime;
	/** 停车结束时间	*/
	private Date stopendtime;
	/** 预计停车时间*/
	private String planstoptime;
	/** 调度单审核状态*/
	private String auditflag;
	/** 退审理由 */
	private String ression;
	/** 生产进度状态 */
	private String pdstatus;
	/** 生产进度 */
	private double pdrate;
	/** 状态（查询用）2,3 */
	private String statusw;
	/** 状态（查询用）3,4 */
	private String statusm;

	/** 物料比较结果详情 */
	private String masression;
	/** 物料解决方案 */
	private String programme;

	/** 申请人 */
	private String inputname;
	/** 申请时间 */
	private Date inputtime;
	/** 审核人 */
	private String auditname;
	/** 审核时间 */
	private Date audittime;

	/**
	 * 设置：序号
	 */
	public void setId(Integer id) 
	{
		this.id = id;
	}
	
	/**
	 * 获取：序号
	 */
	public Integer getId() 
	{
		return id;
	}
	
	/**
	 * 设置：生产调度单号
	 */
	public void setDispatchid(String dispatchid) 
	{
		this.dispatchid = dispatchid;
	}
	
	/**
	 * 获取：生产调度单号
	 */
	public String getDispatchid() 
	{
		return dispatchid;
	}
	
	/**
	 * 设置：生产线号
	 */
	public void setPdlineid(Integer pdlineid) 
	{
		this.pdlineid = pdlineid;
	}
	
	/**
	 * 获取：生产线号
	 */
	public Integer getPdlineid() 
	{
		return pdlineid;
	}
	
	/**
	 * 设置：品名
	 */
	public void setPdname(String pdname) 
	{
		this.pdname = pdname;
	}
	
	/**
	 * 获取：品名
	 */
	public String getPdname() 
	{
		return pdname;
	}
	
	/**
	 * 设置：生产重量kg
	 */
	public void setActualweight(Double double1) 
	{
		this.actualweight = double1;
	}
	
	/**
	 * 获取：生产重量kg
	 */
	public double getActualweight() 
	{
		return actualweight;
	}
	
	/**
	 * 设置：操作标记
	 */
	public void setOptag(Integer optag) 
	{
		this.optag = optag;
	}
	
	/**
	 * 获取：操作标记
	 */
	public Integer getOptag() 
	{
		return optag;
	}
	
	/**
	 * 设置：状态
	 */
	public void setStatus(String status) 
	{
		this.status = status;
	}
	
	/**
	 * 获取：状态
	 */
	public String getStatus() 
	{
		return status;
	}
	
	/**
	 * 设置：关联生产订单号
	 */
	public void setBoundpdorderid(String boundpdorderid) 
	{
		this.boundpdorderid = boundpdorderid;
	}
	
	/**
	 * 获取：关联生产订单号
	 */
	public String getBoundpdorderid() 
	{
		return boundpdorderid;
	}
	
	/**
	 * 设置：备注
	 */
	public void setRemark(String remark) 
	{
		this.remark = remark;
	}
	
	/**
	 * 获取：备注
	 */
	public String getRemark() 
	{
		return remark;
	}
	
	/**
	 * 设置：传输标志
	 */
	public void setTransflag(Integer transflag) 
	{
		this.transflag = transflag;
	}
	
	/**
	 * 获取：传输标志
	 */
	public Integer getTransflag() 
	{
		return transflag;
	}

	public Integer getSortnum() {
		return sortnum;
	}

	public void setSortnum(Integer sortnum) {
		this.sortnum = sortnum;
	}

	public String getSortid() {
		return sortid;
	}

	public void setSortid(String sortid) {
		this.sortid = sortid;
	}

	public String getDistype() {
		return distype;
	}

	public Date getBegintime() {
		return begintime;
	}

	public void setBegintime(Date begintime) {
		this.begintime = begintime;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public String getPdperiod() {
		return pdperiod;
	}

	public void setPdperiod(String pdperiod) {
		this.pdperiod = pdperiod;
	}

	public Date getStopbegintime() {
		return stopbegintime;
	}

	public void setStopbegintime(Date stopbegintime) {
		this.stopbegintime = stopbegintime;
	}

	public Date getStopendtime() {
		return stopendtime;
	}

	public void setStopendtime(Date stopendtime) {
		this.stopendtime = stopendtime;
	}

	public String getPlanstoptime() {
		return planstoptime;
	}

	public void setPlanstoptime(String planstoptime) {
		this.planstoptime = planstoptime;
	}

	public void setDistype(String distype) {
		this.distype = distype;
	}

	@Override
	public String toString() {
		return "Creatdispatch{" +
				"id=" + id +
				", dispatchid='" + dispatchid + '\'' +
				", pdlineid=" + pdlineid +
				", pdname='" + pdname + '\'' +
				", actualweight=" + actualweight +
				", optag=" + optag +
				", status='" + status + '\'' +
				", boundpdorderid='" + boundpdorderid + '\'' +
				", remark='" + remark + '\'' +
				", transflag=" + transflag +
				", sortnum=" + sortnum +
				", sortid='" + sortid + '\'' +
				", distype='" + distype + '\'' +
				", begintime=" + begintime +
				", endtime=" + endtime +
				", pdperiod='" + pdperiod + '\'' +
				", stopbegintime=" + stopbegintime +
				", stopendtime=" + stopendtime +
				", planstoptime='" + planstoptime + '\'' +
				'}';
	}

	public String getAuditflag() {
		return auditflag;
	}

	public void setAuditflag(String auditflag) {
		this.auditflag = auditflag;
	}

	public String getRession() {
		return ression;
	}

	public void setRession(String ression) {
		this.ression = ression;
	}

	public String getPdstatus() {
		return pdstatus;
	}

	public void setPdstatus(String pdstatus) {
		this.pdstatus = pdstatus;
	}

	public double getPdrate() {
		return pdrate;
	}

	public void setPdrate(double pdrate) {
		this.pdrate = pdrate;
	}

	public String getStatusw() {
		return statusw;
	}

	public void setStatusw(String statusw) {
		this.statusw = statusw;
	}

	public String getStatusm() {
		return statusm;
	}

	public void setStatusm(String statusm) {
		this.statusm = statusm;
	}

	public String getMasression() {
		return masression;
	}

	public void setMasression(String masression) {
		this.masression = masression;
	}

	public String getProgramme() {
		return programme;
	}

	public void setProgramme(String programme) {
		this.programme = programme;
	}

	public String getInputname() {
		return inputname;
	}

	public void setInputname(String inputname) {
		this.inputname = inputname;
	}

	public Date getInputtime() {
		return inputtime;
	}

	public void setInputtime(Date inputtime) {
		this.inputtime = inputtime;
	}

	public String getAuditname() {
		return auditname;
	}

	public void setAuditname(String auditname) {
		this.auditname = auditname;
	}

	public Date getAudittime() {
		return audittime;
	}

	public void setAudittime(Date audittime) {
		this.audittime = audittime;
	}
}
