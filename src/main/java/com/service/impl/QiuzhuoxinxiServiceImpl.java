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


import com.dao.QiuzhuoxinxiDao;
import com.entity.QiuzhuoxinxiEntity;
import com.service.QiuzhuoxinxiService;
import com.entity.vo.QiuzhuoxinxiVO;
import com.entity.view.QiuzhuoxinxiView;

@Service("qiuzhuoxinxiService")
public class QiuzhuoxinxiServiceImpl extends ServiceImpl<QiuzhuoxinxiDao, QiuzhuoxinxiEntity> implements QiuzhuoxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiuzhuoxinxiEntity> page = this.selectPage(
                new Query<QiuzhuoxinxiEntity>(params).getPage(),
                new EntityWrapper<QiuzhuoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiuzhuoxinxiEntity> wrapper) {
		  Page<QiuzhuoxinxiView> page =new Query<QiuzhuoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiuzhuoxinxiVO> selectListVO(Wrapper<QiuzhuoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiuzhuoxinxiVO selectVO(Wrapper<QiuzhuoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiuzhuoxinxiView> selectListView(Wrapper<QiuzhuoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiuzhuoxinxiView selectView(Wrapper<QiuzhuoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<QiuzhuoxinxiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<QiuzhuoxinxiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<QiuzhuoxinxiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
