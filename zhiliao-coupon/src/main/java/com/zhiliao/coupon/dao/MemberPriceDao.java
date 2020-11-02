package com.zhiliao.coupon.dao;

import com.zhiliao.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author songnan
 * @email nanjiye123@163.com
 * @date 2020-11-02 01:03:00
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
