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
 * 维修指派
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-09 10:58:53
 */
@TableName("weixiuzhipai")
public class WeixiuzhipaiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WeixiuzhipaiEntity() {
		
	}
	
	public WeixiuzhipaiEntity(T t) {
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
	 * 报修编号
	 */
					
	private String baoxiubianhao;
	
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
	 * 设置：报修编号
	 */
	public void setBaoxiubianhao(String baoxiubianhao) {
		this.baoxiubianhao = baoxiubianhao;
	}
	/**
	 * 获取：报修编号
	 */
	public String getBaoxiubianhao() {
		return baoxiubianhao;
	}
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
