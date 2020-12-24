package com.sh.passjava.question.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sh.common.utils.PageUtils;
import com.sh.passjava.question.entity.QuestionEntity;

import java.util.Map;

/**
 * 
 *
 * @author sunhu
 * @email 
 * @date 2020-12-24 10:52:12
 */
public interface QuestionService extends IService<QuestionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

