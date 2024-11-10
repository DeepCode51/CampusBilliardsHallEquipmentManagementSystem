package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussqiuzhuoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussqiuzhuoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussqiuzhuoxinxiView;


/**
 * 球桌信息评论表
 *
 * @author 
 * @email 
 * @date 2022-03-23 15:26:01
 */
public interface DiscussqiuzhuoxinxiService extends IService<DiscussqiuzhuoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussqiuzhuoxinxiVO> selectListVO(Wrapper<DiscussqiuzhuoxinxiEntity> wrapper);
   	
   	DiscussqiuzhuoxinxiVO selectVO(@Param("ew") Wrapper<DiscussqiuzhuoxinxiEntity> wrapper);
   	
   	List<DiscussqiuzhuoxinxiView> selectListView(Wrapper<DiscussqiuzhuoxinxiEntity> wrapper);
   	
   	DiscussqiuzhuoxinxiView selectView(@Param("ew") Wrapper<DiscussqiuzhuoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussqiuzhuoxinxiEntity> wrapper);
   	

}

