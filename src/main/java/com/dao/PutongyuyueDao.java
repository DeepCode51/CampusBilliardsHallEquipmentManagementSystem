package com.dao;

import com.entity.PutongyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PutongyuyueVO;
import com.entity.view.PutongyuyueView;


/**
 * 普通预约
 * 
 * @author 
 * @email 
 * @date 2022-03-23 15:26:01
 */
public interface PutongyuyueDao extends BaseMapper<PutongyuyueEntity> {
	
	List<PutongyuyueVO> selectListVO(@Param("ew") Wrapper<PutongyuyueEntity> wrapper);
	
	PutongyuyueVO selectVO(@Param("ew") Wrapper<PutongyuyueEntity> wrapper);
	
	List<PutongyuyueView> selectListView(@Param("ew") Wrapper<PutongyuyueEntity> wrapper);

	List<PutongyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<PutongyuyueEntity> wrapper);
	
	PutongyuyueView selectView(@Param("ew") Wrapper<PutongyuyueEntity> wrapper);
	

}
