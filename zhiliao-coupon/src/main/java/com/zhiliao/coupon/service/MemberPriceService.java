package com.zhiliao.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhiliao.common.utils.PageUtils;
import com.zhiliao.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author songnan
 * @email nanjiye123@163.com
 * @date 2020-11-02 01:03:00
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

