package com.sh.passjava.content.dao;

import com.sh.passjava.content.entity.NewsEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 内容-资讯表
 * 
 * @author sunhu
 * @email 
 * @date 2020-12-25 11:20:32
 */
@Mapper
public interface NewsDao extends BaseMapper<NewsEntity> {
	
}
