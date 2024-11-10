package com.dao;

import com.entity.HuiyuanzhanghuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuanzhanghuVO;
import com.entity.view.HuiyuanzhanghuView;


/**
 * 会员账户
 * 
 * @author 
 * @email 
 * @date 2022-03-23 15:26:00
 */
public interface HuiyuanzhanghuDao extends BaseMapper<HuiyuanzhanghuEntity> {
	
	List<HuiyuanzhanghuVO> selectListVO(@Param("ew") Wrapper<HuiyuanzhanghuEntity> wrapper);
	
	HuiyuanzhanghuVO selectVO(@Param("ew") Wrapper<HuiyuanzhanghuEntity> wrapper);
	
	List<HuiyuanzhanghuView> selectListView(@Param("ew") Wrapper<HuiyuanzhanghuEntity> wrapper);

	List<HuiyuanzhanghuView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuanzhanghuEntity> wrapper);
	
	HuiyuanzhanghuView selectView(@Param("ew") Wrapper<HuiyuanzhanghuEntity> wrapper);
	

}
