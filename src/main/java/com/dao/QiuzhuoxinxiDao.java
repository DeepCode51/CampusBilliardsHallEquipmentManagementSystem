package com.dao;

import com.entity.QiuzhuoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiuzhuoxinxiVO;
import com.entity.view.QiuzhuoxinxiView;


/**
 * 球桌信息
 * 
 * @author 
 * @email 
 * @date 2022-03-23 15:26:00
 */
public interface QiuzhuoxinxiDao extends BaseMapper<QiuzhuoxinxiEntity> {
	
	List<QiuzhuoxinxiVO> selectListVO(@Param("ew") Wrapper<QiuzhuoxinxiEntity> wrapper);
	
	QiuzhuoxinxiVO selectVO(@Param("ew") Wrapper<QiuzhuoxinxiEntity> wrapper);
	
	List<QiuzhuoxinxiView> selectListView(@Param("ew") Wrapper<QiuzhuoxinxiEntity> wrapper);

	List<QiuzhuoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<QiuzhuoxinxiEntity> wrapper);
	
	QiuzhuoxinxiView selectView(@Param("ew") Wrapper<QiuzhuoxinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<QiuzhuoxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<QiuzhuoxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<QiuzhuoxinxiEntity> wrapper);
}
