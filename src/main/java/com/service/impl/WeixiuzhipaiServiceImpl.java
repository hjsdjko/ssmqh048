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


import com.dao.WeixiuzhipaiDao;
import com.entity.WeixiuzhipaiEntity;
import com.service.WeixiuzhipaiService;
import com.entity.vo.WeixiuzhipaiVO;
import com.entity.view.WeixiuzhipaiView;

@Service("weixiuzhipaiService")
public class WeixiuzhipaiServiceImpl extends ServiceImpl<WeixiuzhipaiDao, WeixiuzhipaiEntity> implements WeixiuzhipaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WeixiuzhipaiEntity> page = this.selectPage(
                new Query<WeixiuzhipaiEntity>(params).getPage(),
                new EntityWrapper<WeixiuzhipaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WeixiuzhipaiEntity> wrapper) {
		  Page<WeixiuzhipaiView> page =new Query<WeixiuzhipaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WeixiuzhipaiVO> selectListVO(Wrapper<WeixiuzhipaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WeixiuzhipaiVO selectVO(Wrapper<WeixiuzhipaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WeixiuzhipaiView> selectListView(Wrapper<WeixiuzhipaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WeixiuzhipaiView selectView(Wrapper<WeixiuzhipaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
