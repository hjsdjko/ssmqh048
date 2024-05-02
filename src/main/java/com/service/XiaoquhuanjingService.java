package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoquhuanjingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoquhuanjingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoquhuanjingView;


/**
 * 小区环境
 *
 * @author 
 * @email 
 * @date 2021-05-09 10:58:53
 */
public interface XiaoquhuanjingService extends IService<XiaoquhuanjingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoquhuanjingVO> selectListVO(Wrapper<XiaoquhuanjingEntity> wrapper);
   	
   	XiaoquhuanjingVO selectVO(@Param("ew") Wrapper<XiaoquhuanjingEntity> wrapper);
   	
   	List<XiaoquhuanjingView> selectListView(Wrapper<XiaoquhuanjingEntity> wrapper);
   	
   	XiaoquhuanjingView selectView(@Param("ew") Wrapper<XiaoquhuanjingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoquhuanjingEntity> wrapper);
   	
}

