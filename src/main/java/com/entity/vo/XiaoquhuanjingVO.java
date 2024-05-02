package com.entity.vo;

import com.entity.XiaoquhuanjingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 小区环境
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-09 10:58:53
 */
public class XiaoquhuanjingVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 环卫工人
	 */
	
	private String huanweigongren;
		
	/**
	 * 指派时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date zhipaishijian;
		
	/**
	 * 打扫区域
	 */
	
	private String dasaoquyu;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：环卫工人
	 */
	 
	public void setHuanweigongren(String huanweigongren) {
		this.huanweigongren = huanweigongren;
	}
	
	/**
	 * 获取：环卫工人
	 */
	public String getHuanweigongren() {
		return huanweigongren;
	}
				
	
	/**
	 * 设置：指派时间
	 */
	 
	public void setZhipaishijian(Date zhipaishijian) {
		this.zhipaishijian = zhipaishijian;
	}
	
	/**
	 * 获取：指派时间
	 */
	public Date getZhipaishijian() {
		return zhipaishijian;
	}
				
	
	/**
	 * 设置：打扫区域
	 */
	 
	public void setDasaoquyu(String dasaoquyu) {
		this.dasaoquyu = dasaoquyu;
	}
	
	/**
	 * 获取：打扫区域
	 */
	public String getDasaoquyu() {
		return dasaoquyu;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
