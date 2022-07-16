package com.cereal.common.mapper.goods;

import com.cereal.common.vo.GoodsVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface GoodsMapper {
    List<GoodsVO> getGoodsList(GoodsVO goodsVO);

    void insertGoods(GoodsVO goodsVO);

    void updateGoods(GoodsVO goodsVO);

    void deleteGoodsList(List<GoodsVO> goodsList);
}
