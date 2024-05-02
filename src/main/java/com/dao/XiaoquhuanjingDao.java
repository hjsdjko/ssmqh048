package com.dao;

import com.entity.XiaoquhuanjingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoquhuanjingVO;
import com.entity.view.XiaoquhuanjingView;


/**
 * 小区环境
 * 
 * @author 
 * @email 
 * @date 2021-05-09 10:58:53
 */
public interface XiaoquhuanjingDao extends BaseMapper<XiaoquhuanjingEntity> {
	
	List<XiaoquhuanjingVO> selectListVO(@Param("ew") Wrapper<XiaoquhuanjingEntity> wrapper);
	
	XiaoquhuanjingVO selectVO(@Param("ew") Wrapper<XiaoquhuanjingEntity> wrapper);
	
	List<XiaoquhuanjingView> selectListView(@Param("ew") Wrapper<XiaoquhuanjingEntity> wrapper);

	List<XiaoquhuanjingView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoquhuanjingEntity> wrapper);
	
	XiaoquhuanjingView selectView(@Param("ew") Wrapper<XiaoquhuanjingEntity> wrapper);
	
}
