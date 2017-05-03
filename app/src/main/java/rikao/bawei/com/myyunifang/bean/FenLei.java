package rikao.bawei.com.myyunifang.bean;

import java.util.List;

/**
 * 类的用途：
 *
 * @author 林慧强
 * @time 2017/4/17 21:14
 */

public class FenLei {

    private int code;
    private DataBean data;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static class DataBean {
        private List<CategoryBean> category;
        private List<GoodsBriefBean> goodsBrief;

        public List<CategoryBean> getCategory() {
            return category;
        }

        public void setCategory(List<CategoryBean> category) {
            this.category = category;
        }

        public List<GoodsBriefBean> getGoodsBrief() {
            return goodsBrief;
        }

        public void setGoodsBrief(List<GoodsBriefBean> goodsBrief) {
            this.goodsBrief = goodsBrief;
        }

        public static class CategoryBean {
            /**
             * cat_name : 按功效
             * children : [{"cat_name":"补水保湿","id":"17","is_leaf":"1"},{"cat_name":"舒缓修护","id":"31","is_leaf":"1"},{"cat_name":"控油去痘","id":"19","is_leaf":"1"},{"cat_name":"美白提亮","id":"18","is_leaf":"1"},{"cat_name":"紧致抗皱","id":"20","is_leaf":"1"}]
             * id : 16
             * is_leaf : 0
             */

            private String cat_name;
            private String id;
            private String is_leaf;
            private List<ChildrenBean> children;

            public String getCat_name() {
                return cat_name;
            }

            public void setCat_name(String cat_name) {
                this.cat_name = cat_name;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getIs_leaf() {
                return is_leaf;
            }

            public void setIs_leaf(String is_leaf) {
                this.is_leaf = is_leaf;
            }

            public List<ChildrenBean> getChildren() {
                return children;
            }

            public void setChildren(List<ChildrenBean> children) {
                this.children = children;
            }

            public static class ChildrenBean {
                /**
                 * cat_name : 补水保湿
                 * id : 17
                 * is_leaf : 1
                 */

                private String cat_name;
                private String id;
                private String is_leaf;

                public String getCat_name() {
                    return cat_name;
                }

                public void setCat_name(String cat_name) {
                    this.cat_name = cat_name;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getIs_leaf() {
                    return is_leaf;
                }

                public void setIs_leaf(String is_leaf) {
                    this.is_leaf = is_leaf;
                }
            }
        }

        public static class GoodsBriefBean {
            /**
             * efficacy : 镇店之宝 美白爆款
             * goods_img : https://image.yunifang.com/yunifang/images/goods/121/goods_img/170301091610311632161123479.jpg
             * goods_name : 镇店之宝丨美白嫩肤面膜7片
             * id : 121
             * market_price : 99.0
             * reservable : false
             * restrict_purchase_num : 0
             * shop_price : 49.9
             * stock_number : 0
             */

            private String efficacy;
            private String goods_img;
            private String goods_name;
            private String id;
            private double market_price;
            private boolean reservable;
            private int restrict_purchase_num;
            private double shop_price;
            private int stock_number;

            public String getEfficacy() {
                return efficacy;
            }

            public void setEfficacy(String efficacy) {
                this.efficacy = efficacy;
            }

            public String getGoods_img() {
                return goods_img;
            }

            public void setGoods_img(String goods_img) {
                this.goods_img = goods_img;
            }

            public String getGoods_name() {
                return goods_name;
            }

            public void setGoods_name(String goods_name) {
                this.goods_name = goods_name;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public double getMarket_price() {
                return market_price;
            }

            public void setMarket_price(double market_price) {
                this.market_price = market_price;
            }

            public boolean isReservable() {
                return reservable;
            }

            public void setReservable(boolean reservable) {
                this.reservable = reservable;
            }

            public int getRestrict_purchase_num() {
                return restrict_purchase_num;
            }

            public void setRestrict_purchase_num(int restrict_purchase_num) {
                this.restrict_purchase_num = restrict_purchase_num;
            }

            public double getShop_price() {
                return shop_price;
            }

            public void setShop_price(double shop_price) {
                this.shop_price = shop_price;
            }

            public int getStock_number() {
                return stock_number;
            }

            public void setStock_number(int stock_number) {
                this.stock_number = stock_number;
            }
        }
    }
}
