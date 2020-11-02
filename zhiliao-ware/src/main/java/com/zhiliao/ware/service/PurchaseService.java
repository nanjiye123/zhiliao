package com.zhiliao.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhiliao.common.utils.PageUtils;
import com.zhiliao.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author songnan
 * @email nanjiye123@163.com
 * @date 2020-11-02 01:37:10
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

