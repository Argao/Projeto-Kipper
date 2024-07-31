package com.eventostec.api.domain.event;

import com.eventostec.api.domain.coupon.Coupon;
import com.eventostec.api.domain.coupon.CouponRequestDTO;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public record EventDetailsDTO(

        UUID id,
        String title,
        String description,
        Date date,
        String city,
        String uf,
        Boolean remote,
        String eventUrl,
        String imgUrl,
        List<CouponDTO> coupons) {

    public record CouponDTO(String code, Integer discount, Date valid) {


    }
}
