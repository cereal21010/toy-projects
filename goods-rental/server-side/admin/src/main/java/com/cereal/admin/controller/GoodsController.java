package com.cereal.admin.controller;

import com.cereal.common.service.goods.GoodsService;
import com.cereal.common.vo.GoodsVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
public class GoodsController {

    private final GoodsService goodsService;

    @RequestMapping(value = "/admin/goods/list")
    public ResponseEntity getGoodsList(GoodsVO goodsVO) {
        List<GoodsVO> goodsVOs = goodsService.getGoodsAll(goodsVO);
        return new ResponseEntity(goodsVOs, HttpStatus.OK);
    }
}
