package com.zhiliao.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhiliao.common.utils.PageUtils;
import com.zhiliao.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author songnan
 * @email nanjiye123@163.com
 * @date 2020-11-01 19:58:22
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

