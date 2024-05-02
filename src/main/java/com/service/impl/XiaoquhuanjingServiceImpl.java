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


import com.dao.XiaoquhuanjingDao;
import com.entity.XiaoquhuanjingEntity;
import com.service.XiaoquhuanjingService;
import com.entity.vo.XiaoquhuanjingVO;
import com.entity.view.XiaoquhuanjingView;

@Service("xiaoquhuanjingService")
public class XiaoquhuanjingServiceImpl extends ServiceImpl<XiaoquhuanjingDao, XiaoquhuanjingEntity> implements XiaoquhuanjingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoquhuanjingEntity> page = this.selectPage(
                new Query<XiaoquhuanjingEntity>(params).getPage(),
                new EntityWrapper<XiaoquhuanjingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoquhuanjingEntity> wrapper) {
		  Page<XiaoquhuanjingView> page =new Query<XiaoquhuanjingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoquhuanjingVO> selectListVO(Wrapper<XiaoquhuanjingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoquhuanjingVO selectVO(Wrapper<XiaoquhuanjingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoquhuanjingView> selectListView(Wrapper<XiaoquhuanjingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoquhuanjingView selectView(Wrapper<XiaoquhuanjingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
