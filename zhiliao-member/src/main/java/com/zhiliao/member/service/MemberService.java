package com.zhiliao.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhiliao.common.utils.PageUtils;
import com.zhiliao.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author songnan
 * @email nanjiye123@163.com
 * @date 2020-11-02 01:14:51
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

