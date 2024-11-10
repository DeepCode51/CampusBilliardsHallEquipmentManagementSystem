package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiuzhuoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiuzhuoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiuzhuoxinxiView;


/**
 * 球桌信息
 *
 * @author 
 * @email 
 * @date 2022-03-23 15:26:00
 */
public interface QiuzhuoxinxiService extends IService<QiuzhuoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiuzhuoxinxiVO> selectListVO(Wrapper<QiuzhuoxinxiEntity> wrapper);
   	
   	QiuzhuoxinxiVO selectVO(@Param("ew") Wrapper<QiuzhuoxinxiEntity> wrapper);
   	
   	List<QiuzhuoxinxiView> selectListView(Wrapper<QiuzhuoxinxiEntity> wrapper);
   	
   	QiuzhuoxinxiView selectView(@Param("ew") Wrapper<QiuzhuoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiuzhuoxinxiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<QiuzhuoxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<QiuzhuoxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<QiuzhuoxinxiEntity> wrapper);
}

