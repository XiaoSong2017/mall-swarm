package com.macro.mall.search.domain;

import lombok.Data;

import java.util.List;

/**
 * 搜索商品的品牌名称，分类名称及属性
 * Created by macro on 2018/6/27.
 */
@Data
public class EsProductRelatedInfo {
    private List<String> brandNames;
    private List<String> productCategoryNames;
    private List<ProductAttr> productAttrs;

    @Data
    public static class ProductAttr {
        private Long attrId;
        private String attrName;
        private List<String> attrValues;
    }
}
