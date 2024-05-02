package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 小区环境
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-09 10:58:53
 */
@TableName("xiaoquhuanjing")
public class XiaoquhuanjingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiaoquhuanjingEntity() {
		
	}
	
	public XiaoquhuanjingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 标题
	 */
					
	private String biaoti;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：标题
	 */
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
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
