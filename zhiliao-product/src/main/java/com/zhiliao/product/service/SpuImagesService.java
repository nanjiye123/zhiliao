package com.zhiliao.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhiliao.common.utils.PageUtils;
import com.zhiliao.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author songnan
 * @email nanjiye123@163.com
 * @date 2020-11-01 19:58:22
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

