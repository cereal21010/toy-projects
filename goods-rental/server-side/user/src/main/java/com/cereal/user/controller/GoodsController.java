package com.cereal.user.controller;

import com.cereal.common.service.goods.GoodsService;
import com.cereal.common.vo.GoodsVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class GoodsController {

    private final GoodsService goodsService;

    @RequestMapping(value = "/goods/list", method = RequestMethod.GET)
    public ResponseEntity getGoodsList(GoodsVO goodsVO) {

        List<GoodsVO> goodsVOS = goodsService.getGoodsAll(goodsVO);
        return new ResponseEntity(goodsVOS, HttpStatus.OK);
    }



}
