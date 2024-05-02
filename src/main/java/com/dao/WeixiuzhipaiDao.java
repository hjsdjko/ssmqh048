package com.dao;

import com.entity.WeixiuzhipaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeixiuzhipaiVO;
import com.entity.view.WeixiuzhipaiView;


/**
 * 维修指派
 * 
 * @author 
 * @email 
 * @date 2021-05-09 10:58:53
 */
public interface WeixiuzhipaiDao extends BaseMapper<WeixiuzhipaiEntity> {
	
	List<WeixiuzhipaiVO> selectListVO(@Param("ew") Wrapper<WeixiuzhipaiEntity> wrapper);
	
	WeixiuzhipaiVO selectVO(@Param("ew") Wrapper<WeixiuzhipaiEntity> wrapper);
	
	List<WeixiuzhipaiView> selectListView(@Param("ew") Wrapper<WeixiuzhipaiEntity> wrapper);

	List<WeixiuzhipaiView> selectListView(Pagination page,@Param("ew") Wrapper<WeixiuzhipaiEntity> wrapper);
	
	WeixiuzhipaiView selectView(@Param("ew") Wrapper<WeixiuzhipaiEntity> wrapper);
	
}
