package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeixiuzhipaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeixiuzhipaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeixiuzhipaiView;


/**
 * 维修指派
 *
 * @author 
 * @email 
 * @date 2021-05-09 10:58:53
 */
public interface WeixiuzhipaiService extends IService<WeixiuzhipaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeixiuzhipaiVO> selectListVO(Wrapper<WeixiuzhipaiEntity> wrapper);
   	
   	WeixiuzhipaiVO selectVO(@Param("ew") Wrapper<WeixiuzhipaiEntity> wrapper);
   	
   	List<WeixiuzhipaiView> selectListView(Wrapper<WeixiuzhipaiEntity> wrapper);
   	
   	WeixiuzhipaiView selectView(@Param("ew") Wrapper<WeixiuzhipaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeixiuzhipaiEntity> wrapper);
   	
}

