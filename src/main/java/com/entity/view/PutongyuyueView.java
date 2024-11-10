package com.entity.view;

import com.entity.PutongyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 普通预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-23 15:26:01
 */
@TableName("putongyuyue")
public class PutongyuyueView  extends PutongyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PutongyuyueView(){
	}
 
 	public PutongyuyueView(PutongyuyueEntity putongyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, putongyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
