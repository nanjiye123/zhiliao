package com.zhiliao.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhiliao.common.utils.PageUtils;
import com.zhiliao.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author songnan
 * @email nanjiye123@163.com
 * @date 2020-11-01 19:58:22
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

