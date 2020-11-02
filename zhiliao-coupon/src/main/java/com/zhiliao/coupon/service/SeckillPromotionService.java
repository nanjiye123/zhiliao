package com.zhiliao.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhiliao.common.utils.PageUtils;
import com.zhiliao.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author songnan
 * @email nanjiye123@163.com
 * @date 2020-11-02 01:03:00
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

