package com.neuedu.controller;

import com.neuedu.pojo.Goods;
import com.neuedu.service.goods.GoodsService;
import org.apache.http.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/goods")
public class GoodsController {
    @Resource
    GoodsService goodsService;
    @GetMapping("/list")
    public String list(ModelMap modelMap){
        List<Goods> list = goodsService.list();
        modelMap.addAttribute("list",goodsService.list() );
        return "goods/list";
    }
    @GetMapping("/ajax")
    public void ajax(Integer id, HttpServletResponse response){
        try {
            response.getWriter().print("abcdefg");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
