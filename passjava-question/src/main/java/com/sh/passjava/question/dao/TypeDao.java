package com.sh.passjava.question.dao;

import com.sh.passjava.question.entity.TypeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 题目-题目类型表
 * 
 * @author sunhu
 * @email 
 * @date 2020-12-24 10:52:12
 */
@Mapper
public interface TypeDao extends BaseMapper<TypeEntity> {
	
}
