package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoqutongzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoqutongzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoqutongzhiView;


/**
 * 小区通知
 *
 * @author 
 * @email 
 * @date 2021-05-09 10:58:53
 */
public interface XiaoqutongzhiService extends IService<XiaoqutongzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoqutongzhiVO> selectListVO(Wrapper<XiaoqutongzhiEntity> wrapper);
   	
   	XiaoqutongzhiVO selectVO(@Param("ew") Wrapper<XiaoqutongzhiEntity> wrapper);
   	
   	List<XiaoqutongzhiView> selectListView(Wrapper<XiaoqutongzhiEntity> wrapper);
   	
   	XiaoqutongzhiView selectView(@Param("ew") Wrapper<XiaoqutongzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoqutongzhiEntity> wrapper);
   	
}

