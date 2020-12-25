package com.sh.passjava.channel.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sh.common.utils.PageUtils;
import com.sh.passjava.channel.entity.ChannelEntity;

import java.util.Map;

/**
 * 渠道-渠道表
 *
 * @author sunhu
 * @email 
 * @date 2020-12-25 10:56:44
 */
public interface ChannelService extends IService<ChannelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

