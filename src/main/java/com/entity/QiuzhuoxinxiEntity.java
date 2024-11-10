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
 * 球桌信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-23 15:26:00
 */
@TableName("qiuzhuoxinxi")
public class QiuzhuoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QiuzhuoxinxiEntity() {
		
	}
	
	public QiuzhuoxinxiEntity(T t) {
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
	 * 桌号
	 */
					
	private String zhuohao;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 会员时价
	 */
					
	private Integer huiyuanshijia;
	
	/**
	 * 普通时价
	 */
					
	private Integer putongshijia;
	
	/**
	 * 球桌状态
	 */
					
	private String qiuzhuozhuangtai;
	
	/**
	 * 球桌详情
	 */
					
	private String qiuzhuoxiangqing;
	
	
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
	 * 设置：桌号
	 */
	public void setZhuohao(String zhuohao) {
		this.zhuohao = zhuohao;
	}
	/**
	 * 获取：桌号
	 */
	public String getZhuohao() {
		return zhuohao;
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
	 * 设置：会员时价
	 */
	public void setHuiyuanshijia(Integer huiyuanshijia) {
		this.huiyuanshijia = huiyuanshijia;
	}
	/**
	 * 获取：会员时价
	 */
	public Integer getHuiyuanshijia() {
		return huiyuanshijia;
	}
	/**
	 * 设置：普通时价
	 */
	public void setPutongshijia(Integer putongshijia) {
		this.putongshijia = putongshijia;
	}
	/**
	 * 获取：普通时价
	 */
	public Integer getPutongshijia() {
		return putongshijia;
	}
	/**
	 * 设置：球桌状态
	 */
	public void setQiuzhuozhuangtai(String qiuzhuozhuangtai) {
		this.qiuzhuozhuangtai = qiuzhuozhuangtai;
	}
	/**
	 * 获取：球桌状态
	 */
	public String getQiuzhuozhuangtai() {
		return qiuzhuozhuangtai;
	}
	/**
	 * 设置：球桌详情
	 */
	public void setQiuzhuoxiangqing(String qiuzhuoxiangqing) {
		this.qiuzhuoxiangqing = qiuzhuoxiangqing;
	}
	/**
	 * 获取：球桌详情
	 */
	public String getQiuzhuoxiangqing() {
		return qiuzhuoxiangqing;
	}

}
