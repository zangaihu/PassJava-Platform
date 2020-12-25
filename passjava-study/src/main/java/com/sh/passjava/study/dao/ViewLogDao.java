package com.sh.passjava.study.dao;

import com.sh.passjava.study.entity.ViewLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 学习-用户学习浏览记录表
 * 
 * @author sunhu
 * @email 
 * @date 2020-12-25 11:30:37
 */
@Mapper
public interface ViewLogDao extends BaseMapper<ViewLogEntity> {
	
}
