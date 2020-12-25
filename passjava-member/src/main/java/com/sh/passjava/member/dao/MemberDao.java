package com.sh.passjava.member.dao;

import com.sh.passjava.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员-会员表
 * 
 * @author sunhu
 * @email 
 * @date 2020-12-25 11:25:50
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
