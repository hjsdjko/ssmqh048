package com.entity.vo;

import com.entity.FangyuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 房源信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-09 10:58:53
 */
public class FangyuanxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 房屋户型
	 */
	
	private String fangwuhuxing;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 是否出售
	 */
	
	private String shifouchushou;
		
	/**
	 * 出售价格
	 */
	
	private Float chushoujiage;
		
	/**
	 * 面积
	 */
	
	private String mianji;
		
	/**
	 * 房屋设备
	 */
	
	private String fangwushebei;
		
	/**
	 * 房源详情
	 */
	
	private String fangyuanxiangqing;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：房屋户型
	 */
	 
	public void setFangwuhuxing(String fangwuhuxing) {
		this.fangwuhuxing = fangwuhuxing;
	}
	
	/**
	 * 获取：房屋户型
	 */
	public String getFangwuhuxing() {
		return fangwuhuxing;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：是否出售
	 */
	 
	public void setShifouchushou(String shifouchushou) {
		this.shifouchushou = shifouchushou;
	}
	
	/**
	 * 获取：是否出售
	 */
	public String getShifouchushou() {
		return shifouchushou;
	}
				
	
	/**
	 * 设置：出售价格
	 */
	 
	public void setChushoujiage(Float chushoujiage) {
		this.chushoujiage = chushoujiage;
	}
	
	/**
	 * 获取：出售价格
	 */
	public Float getChushoujiage() {
		return chushoujiage;
	}
				
	
	/**
	 * 设置：面积
	 */
	 
	public void setMianji(String mianji) {
		this.mianji = mianji;
	}
	
	/**
	 * 获取：面积
	 */
	public String getMianji() {
		return mianji;
	}
				
	
	/**
	 * 设置：房屋设备
	 */
	 
	public void setFangwushebei(String fangwushebei) {
		this.fangwushebei = fangwushebei;
	}
	
	/**
	 * 获取：房屋设备
	 */
	public String getFangwushebei() {
		return fangwushebei;
	}
				
	
	/**
	 * 设置：房源详情
	 */
	 
	public void setFangyuanxiangqing(String fangyuanxiangqing) {
		this.fangyuanxiangqing = fangyuanxiangqing;
	}
	
	/**
	 * 获取：房源详情
	 */
	public String getFangyuanxiangqing() {
		return fangyuanxiangqing;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
