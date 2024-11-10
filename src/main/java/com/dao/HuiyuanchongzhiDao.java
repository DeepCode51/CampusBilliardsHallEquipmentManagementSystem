package com.dao;

import com.entity.HuiyuanchongzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuanchongzhiVO;
import com.entity.view.HuiyuanchongzhiView;


/**
 * 会员充值
 * 
 * @author 
 * @email 
 * @date 2022-03-23 15:26:00
 */
public interface HuiyuanchongzhiDao extends BaseMapper<HuiyuanchongzhiEntity> {
	
	List<HuiyuanchongzhiVO> selectListVO(@Param("ew") Wrapper<HuiyuanchongzhiEntity> wrapper);
	
	HuiyuanchongzhiVO selectVO(@Param("ew") Wrapper<HuiyuanchongzhiEntity> wrapper);
	
	List<HuiyuanchongzhiView> selectListView(@Param("ew") Wrapper<HuiyuanchongzhiEntity> wrapper);

	List<HuiyuanchongzhiView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuanchongzhiEntity> wrapper);
	
	HuiyuanchongzhiView selectView(@Param("ew") Wrapper<HuiyuanchongzhiEntity> wrapper);
	

}
