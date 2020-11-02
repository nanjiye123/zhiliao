package com.zhiliao.coupon.dao;

import com.zhiliao.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author songnan
 * @email nanjiye123@163.com
 * @date 2020-11-02 01:02:59
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
