package com.zhiliao.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhiliao.common.utils.PageUtils;
import com.zhiliao.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author songnan
 * @email nanjiye123@163.com
 * @date 2020-11-01 19:58:23
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

