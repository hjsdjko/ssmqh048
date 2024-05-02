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


import com.dao.XiaoqutongzhiDao;
import com.entity.XiaoqutongzhiEntity;
import com.service.XiaoqutongzhiService;
import com.entity.vo.XiaoqutongzhiVO;
import com.entity.view.XiaoqutongzhiView;

@Service("xiaoqutongzhiService")
public class XiaoqutongzhiServiceImpl extends ServiceImpl<XiaoqutongzhiDao, XiaoqutongzhiEntity> implements XiaoqutongzhiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoqutongzhiEntity> page = this.selectPage(
                new Query<XiaoqutongzhiEntity>(params).getPage(),
                new EntityWrapper<XiaoqutongzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoqutongzhiEntity> wrapper) {
		  Page<XiaoqutongzhiView> page =new Query<XiaoqutongzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoqutongzhiVO> selectListVO(Wrapper<XiaoqutongzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoqutongzhiVO selectVO(Wrapper<XiaoqutongzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoqutongzhiView> selectListView(Wrapper<XiaoqutongzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoqutongzhiView selectView(Wrapper<XiaoqutongzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
