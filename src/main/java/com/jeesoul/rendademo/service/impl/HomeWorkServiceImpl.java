package com.jeesoul.rendademo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jeesoul.rendademo.domain.HomeWork;
import com.jeesoul.rendademo.mapper.HomeWorkMapper;
import com.jeesoul.rendademo.service.HomeWorkService;

/**
 * @author：dxy
 * @date : 2020-02-24
 */
@Service
public class HomeWorkServiceImpl extends ServiceImpl<HomeWorkMapper, HomeWork> implements HomeWorkService {

    @Override
    public List<HomeWork> findHomeListByName(String name) {

        return this.baseMapper.selectList(new QueryWrapper<HomeWork>().lambda().in(HomeWork::getHomeName, name));
    }
}

