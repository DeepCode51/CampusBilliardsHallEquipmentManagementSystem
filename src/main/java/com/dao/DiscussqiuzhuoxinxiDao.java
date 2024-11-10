package com.dao;

import com.entity.DiscussqiuzhuoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussqiuzhuoxinxiVO;
import com.entity.view.DiscussqiuzhuoxinxiView;


/**
 * 球桌信息评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-23 15:26:01
 */
public interface DiscussqiuzhuoxinxiDao extends BaseMapper<DiscussqiuzhuoxinxiEntity> {
	
	List<DiscussqiuzhuoxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussqiuzhuoxinxiEntity> wrapper);
	
	DiscussqiuzhuoxinxiVO selectVO(@Param("ew") Wrapper<DiscussqiuzhuoxinxiEntity> wrapper);
	
	List<DiscussqiuzhuoxinxiView> selectListView(@Param("ew") Wrapper<DiscussqiuzhuoxinxiEntity> wrapper);

	List<DiscussqiuzhuoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussqiuzhuoxinxiEntity> wrapper);
	
	DiscussqiuzhuoxinxiView selectView(@Param("ew") Wrapper<DiscussqiuzhuoxinxiEntity> wrapper);
	

}
