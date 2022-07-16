package com.cereal.common.vo;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class GoodsVO {
    private int seq;
    private String idNo;
    private String goodsName;
    private int price;
    private int rentalFee;
    private int rentalPeriod;
    private String goodsMemo;
    private Timestamp createdDate;
    private Timestamp modifiedDate;

    private GoodsVO() {}

    private GoodsVO(int seq, String idNo, String goodsName, int price, int rentalFee, int rentalPeriod, String goodsMemo, Timestamp createdDate, Timestamp modifiedDate) {
        this.seq = seq;
        this.idNo = idNo;
        this.goodsName = goodsName;
        this.price = price;
        this.rentalFee = rentalFee;
        this.rentalPeriod = rentalPeriod;
        this.goodsMemo = goodsMemo;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }
}
