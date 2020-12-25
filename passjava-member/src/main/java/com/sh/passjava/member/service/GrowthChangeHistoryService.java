package com.sh.passjava.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sh.common.utils.PageUtils;
import com.sh.passjava.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 会员-积分值变化历史记录表
 *
 * @author sunhu
 * @email 
 * @date 2020-12-25 11:25:50
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

