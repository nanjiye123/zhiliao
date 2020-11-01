package com.zhiliao.product.dao;

import com.zhiliao.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author songnan
 * @email nanjiye123@163.com
 * @date 2020-11-01 19:58:23
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
