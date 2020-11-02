package com.zhiliao.member.dao;

import com.zhiliao.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author songnan
 * @email nanjiye123@163.com
 * @date 2020-11-02 01:14:51
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
