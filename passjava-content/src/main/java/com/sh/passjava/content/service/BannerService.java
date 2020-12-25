package com.sh.passjava.content.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sh.common.utils.PageUtils;
import com.sh.passjava.content.entity.BannerEntity;

import java.util.Map;

/**
 * 内容-横幅广告表
 *
 * @author sunhu
 * @email 
 * @date 2020-12-25 11:20:32
 */
public interface BannerService extends IService<BannerEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

