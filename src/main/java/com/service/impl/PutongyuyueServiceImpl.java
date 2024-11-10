package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.PutongyuyueDao;
import com.entity.PutongyuyueEntity;
import com.service.PutongyuyueService;
import com.entity.vo.PutongyuyueVO;
import com.entity.view.PutongyuyueView;

@Service("putongyuyueService")
public class PutongyuyueServiceImpl extends ServiceImpl<PutongyuyueDao, PutongyuyueEntity> implements PutongyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PutongyuyueEntity> page = this.selectPage(
                new Query<PutongyuyueEntity>(params).getPage(),
                new EntityWrapper<PutongyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PutongyuyueEntity> wrapper) {
		  Page<PutongyuyueView> page =new Query<PutongyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PutongyuyueVO> selectListVO(Wrapper<PutongyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PutongyuyueVO selectVO(Wrapper<PutongyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PutongyuyueView> selectListView(Wrapper<PutongyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PutongyuyueView selectView(Wrapper<PutongyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
