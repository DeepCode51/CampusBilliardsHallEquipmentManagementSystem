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


import com.dao.DiscussqiuzhuoxinxiDao;
import com.entity.DiscussqiuzhuoxinxiEntity;
import com.service.DiscussqiuzhuoxinxiService;
import com.entity.vo.DiscussqiuzhuoxinxiVO;
import com.entity.view.DiscussqiuzhuoxinxiView;

@Service("discussqiuzhuoxinxiService")
public class DiscussqiuzhuoxinxiServiceImpl extends ServiceImpl<DiscussqiuzhuoxinxiDao, DiscussqiuzhuoxinxiEntity> implements DiscussqiuzhuoxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussqiuzhuoxinxiEntity> page = this.selectPage(
                new Query<DiscussqiuzhuoxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussqiuzhuoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussqiuzhuoxinxiEntity> wrapper) {
		  Page<DiscussqiuzhuoxinxiView> page =new Query<DiscussqiuzhuoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussqiuzhuoxinxiVO> selectListVO(Wrapper<DiscussqiuzhuoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussqiuzhuoxinxiVO selectVO(Wrapper<DiscussqiuzhuoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussqiuzhuoxinxiView> selectListView(Wrapper<DiscussqiuzhuoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussqiuzhuoxinxiView selectView(Wrapper<DiscussqiuzhuoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
