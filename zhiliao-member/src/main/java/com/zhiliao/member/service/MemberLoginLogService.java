package com.zhiliao.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhiliao.common.utils.PageUtils;
import com.zhiliao.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author songnan
 * @email nanjiye123@163.com
 * @date 2020-11-02 01:14:52
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

