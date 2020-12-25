package com.sh.passjava.channel.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sh.common.utils.PageUtils;
import com.sh.passjava.channel.entity.AccessTokenEntity;

import java.util.Map;

/**
 * 渠道-认证表
 *
 * @author sunhu
 * @email 
 * @date 2020-12-25 10:56:45
 */
public interface AccessTokenService extends IService<AccessTokenEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

