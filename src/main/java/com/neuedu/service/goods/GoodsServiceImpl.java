package com.neuedu.service.goods;

import com.neuedu.dao.GoodsDao;
import com.neuedu.pojo.Goods;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class GoodsServiceImpl implements GoodsService{
    @Resource
    GoodsDao goodsDao;
    @Override
    public List<Goods> list() {
        return goodsDao.list();
    }
}
