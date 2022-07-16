package com.cereal.common.service.goods;

import com.cereal.common.mapper.goods.GoodsMapper;
import com.cereal.common.vo.GoodsVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class GoodsService {

    private final GoodsMapper goodsMapper;

    public List<GoodsVO> getGoodsAll(GoodsVO goodsVO) {
        return goodsMapper.getGoodsList(goodsVO);
    }

    public void insertGoods(GoodsVO goodsVO) {
        goodsMapper.insertGoods(goodsVO);
    }

}
