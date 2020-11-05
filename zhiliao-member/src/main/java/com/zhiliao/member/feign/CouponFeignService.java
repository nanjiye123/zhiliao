package com.zhiliao.member.feign;

import com.zhiliao.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("zhiliao-coupon")
public interface CouponFeignService {

    //此为coupon中的方法
    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();

}
