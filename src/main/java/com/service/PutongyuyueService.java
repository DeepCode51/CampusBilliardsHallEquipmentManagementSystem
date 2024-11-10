package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PutongyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PutongyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PutongyuyueView;


/**
 * 普通预约
 *
 * @author 
 * @email 
 * @date 2022-03-23 15:26:01
 */
public interface PutongyuyueService extends IService<PutongyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PutongyuyueVO> selectListVO(Wrapper<PutongyuyueEntity> wrapper);
   	
   	PutongyuyueVO selectVO(@Param("ew") Wrapper<PutongyuyueEntity> wrapper);
   	
   	List<PutongyuyueView> selectListView(Wrapper<PutongyuyueEntity> wrapper);
   	
   	PutongyuyueView selectView(@Param("ew") Wrapper<PutongyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PutongyuyueEntity> wrapper);
   	

}

