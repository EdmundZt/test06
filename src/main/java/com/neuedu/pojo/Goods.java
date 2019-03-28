package com.neuedu.pojo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Goods {
    private Integer id;
    private String name;
    private String type;
    private String brand;
    private BigDecimal price;
    private Integer isDel;
}
