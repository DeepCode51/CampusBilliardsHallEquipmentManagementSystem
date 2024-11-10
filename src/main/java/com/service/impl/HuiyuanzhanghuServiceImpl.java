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


import com.dao.HuiyuanzhanghuDao;
import com.entity.HuiyuanzhanghuEntity;
import com.service.HuiyuanzhanghuService;
import com.entity.vo.HuiyuanzhanghuVO;
import com.entity.view.HuiyuanzhanghuView;

@Service("huiyuanzhanghuService")
public class HuiyuanzhanghuServiceImpl extends ServiceImpl<HuiyuanzhanghuDao, HuiyuanzhanghuEntity> implements HuiyuanzhanghuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyuanzhanghuEntity> page = this.selectPage(
                new Query<HuiyuanzhanghuEntity>(params).getPage(),
                new EntityWrapper<HuiyuanzhanghuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyuanzhanghuEntity> wrapper) {
		  Page<HuiyuanzhanghuView> page =new Query<HuiyuanzhanghuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyuanzhanghuVO> selectListVO(Wrapper<HuiyuanzhanghuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyuanzhanghuVO selectVO(Wrapper<HuiyuanzhanghuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyuanzhanghuView> selectListView(Wrapper<HuiyuanzhanghuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyuanzhanghuView selectView(Wrapper<HuiyuanzhanghuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
