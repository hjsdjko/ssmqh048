package com.entity.vo;

import com.entity.WeixiuzhipaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 维修指派
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-09 10:58:53
 */
public class WeixiuzhipaiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 设施名称
	 */
	
	private String sheshimingcheng;
		
	/**
	 * 技术人员
	 */
	
	private String jishurenyuan;
		
	/**
	 * 指派时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date zhipaishijian;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 楼房号
	 */
	
	private String loufanghao;
				
	
	/**
	 * 设置：设施名称
	 */
	 
	public void setSheshimingcheng(String sheshimingcheng) {
		this.sheshimingcheng = sheshimingcheng;
	}
	
	/**
	 * 获取：设施名称
	 */
	public String getSheshimingcheng() {
		return sheshimingcheng;
	}
				
	
	/**
	 * 设置：技术人员
	 */
	 
	public void setJishurenyuan(String jishurenyuan) {
		this.jishurenyuan = jishurenyuan;
	}
	
	/**
	 * 获取：技术人员
	 */
	public String getJishurenyuan() {
		return jishurenyuan;
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
	 * 设置：楼房号
	 */
	 
	public void setLoufanghao(String loufanghao) {
		this.loufanghao = loufanghao;
	}
	
	/**
	 * 获取：楼房号
	 */
	public String getLoufanghao() {
		return loufanghao;
	}
			
}
