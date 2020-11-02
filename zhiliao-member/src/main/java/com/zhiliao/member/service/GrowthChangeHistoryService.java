package com.zhiliao.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhiliao.common.utils.PageUtils;
import com.zhiliao.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author songnan
 * @email nanjiye123@163.com
 * @date 2020-11-02 01:14:52
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

