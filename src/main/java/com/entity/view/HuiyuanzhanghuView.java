package com.entity.view;

import com.entity.HuiyuanzhanghuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 会员账户
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-23 15:26:00
 */
@TableName("huiyuanzhanghu")
public class HuiyuanzhanghuView  extends HuiyuanzhanghuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuiyuanzhanghuView(){
	}
 
 	public HuiyuanzhanghuView(HuiyuanzhanghuEntity huiyuanzhanghuEntity){
 	try {
			BeanUtils.copyProperties(this, huiyuanzhanghuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
