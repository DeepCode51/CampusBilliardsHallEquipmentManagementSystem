package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuanzhanghuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuanzhanghuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuanzhanghuView;


/**
 * 会员账户
 *
 * @author 
 * @email 
 * @date 2022-03-23 15:26:00
 */
public interface HuiyuanzhanghuService extends IService<HuiyuanzhanghuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuanzhanghuVO> selectListVO(Wrapper<HuiyuanzhanghuEntity> wrapper);
   	
   	HuiyuanzhanghuVO selectVO(@Param("ew") Wrapper<HuiyuanzhanghuEntity> wrapper);
   	
   	List<HuiyuanzhanghuView> selectListView(Wrapper<HuiyuanzhanghuEntity> wrapper);
   	
   	HuiyuanzhanghuView selectView(@Param("ew") Wrapper<HuiyuanzhanghuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuanzhanghuEntity> wrapper);
   	

}

