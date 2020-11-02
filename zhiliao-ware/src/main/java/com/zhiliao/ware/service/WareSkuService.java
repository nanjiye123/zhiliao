package com.zhiliao.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhiliao.common.utils.PageUtils;
import com.zhiliao.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author songnan
 * @email nanjiye123@163.com
 * @date 2020-11-02 01:37:09
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

