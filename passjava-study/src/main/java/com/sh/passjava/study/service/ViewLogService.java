package com.sh.passjava.study.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sh.common.utils.PageUtils;
import com.sh.passjava.study.entity.ViewLogEntity;

import java.util.Map;

/**
 * 学习-用户学习浏览记录表
 *
 * @author sunhu
 * @email 
 * @date 2020-12-25 11:30:37
 */
public interface ViewLogService extends IService<ViewLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

