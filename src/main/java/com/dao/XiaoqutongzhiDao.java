package com.dao;

import com.entity.XiaoqutongzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoqutongzhiVO;
import com.entity.view.XiaoqutongzhiView;


/**
 * 小区通知
 * 
 * @author 
 * @email 
 * @date 2021-05-09 10:58:53
 */
public interface XiaoqutongzhiDao extends BaseMapper<XiaoqutongzhiEntity> {
	
	List<XiaoqutongzhiVO> selectListVO(@Param("ew") Wrapper<XiaoqutongzhiEntity> wrapper);
	
	XiaoqutongzhiVO selectVO(@Param("ew") Wrapper<XiaoqutongzhiEntity> wrapper);
	
	List<XiaoqutongzhiView> selectListView(@Param("ew") Wrapper<XiaoqutongzhiEntity> wrapper);

	List<XiaoqutongzhiView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoqutongzhiEntity> wrapper);
	
	XiaoqutongzhiView selectView(@Param("ew") Wrapper<XiaoqutongzhiEntity> wrapper);
	
}
