package com.jeesoul.rendademo.service;

import com.jeesoul.rendademo.domain.HomeWork;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 *
 *@author：dxy
 *@date : 2020-02-24
 */
public interface HomeWorkService extends IService<HomeWork>{


        List<HomeWork> findHomeListByName(String name);
    }
