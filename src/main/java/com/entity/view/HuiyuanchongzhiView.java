package com.entity.view;

import com.entity.HuiyuanchongzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 会员充值
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-23 15:26:00
 */
@TableName("huiyuanchongzhi")
public class HuiyuanchongzhiView  extends HuiyuanchongzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuiyuanchongzhiView(){
	}
 
 	public HuiyuanchongzhiView(HuiyuanchongzhiEntity huiyuanchongzhiEntity){
 	try {
			BeanUtils.copyProperties(this, huiyuanchongzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
