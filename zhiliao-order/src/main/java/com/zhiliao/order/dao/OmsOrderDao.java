package com.zhiliao.order.dao;

import com.zhiliao.order.entity.OmsOrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author songnan
 * @email nanjiye123@163.com
 * @date 2020-11-02 01:27:24
 */
@Mapper
public interface OmsOrderDao extends BaseMapper<OmsOrderEntity> {
	
}
