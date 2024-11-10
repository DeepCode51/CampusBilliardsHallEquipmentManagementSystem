package com.entity.view;

import com.entity.QiuzhuoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 球桌信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-23 15:26:00
 */
@TableName("qiuzhuoxinxi")
public class QiuzhuoxinxiView  extends QiuzhuoxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QiuzhuoxinxiView(){
	}
 
 	public QiuzhuoxinxiView(QiuzhuoxinxiEntity qiuzhuoxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, qiuzhuoxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
