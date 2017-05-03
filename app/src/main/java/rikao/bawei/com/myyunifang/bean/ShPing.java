package rikao.bawei.com.myyunifang.bean;

import java.util.List;

/**
 * 类的用途：
 *
 * @author 林慧强
 * @time 2017/4/24 21:57
 */

public class ShPing {

    /**
     * cartItemList : [{"colorID":0,"count":1,"id":127,"name":"热销套装丨清爽平衡护肤三件套","pic":"http://image.hmeili.com/yunifang/images/goods/189/goods_img/160819091183119066095185335.jpg","price":99.9,"productID":189,"repertory":110,"sizeID":0,"userID":59},{"colorID":0,"count":1,"id":152,"name":"新品眼罩丨悠然舒缓蒸汽眼罩","pic":"https://image.yunifang.com/yunifang/images/goods/1615/goods_img/17021711575612130589207037.jpg","price":49,"productID":1615,"repertory":110,"sizeID":0,"userID":59},{"colorID":0,"count":1,"id":154,"name":"热销|樱桃鲜润补水矿物面膜7片","pic":"http://image.hmeili.com/yunifang/images/goods/1234/goods_img/161122183456315727984418108.jpg","price":39.9,"productID":1234,"repertory":110,"sizeID":0,"userID":59}]
     * response : cart
     */

    private String response;
    private List<CartItemListBean> cartItemList;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public List<CartItemListBean> getCartItemList() {
        return cartItemList;
    }

    public void setCartItemList(List<CartItemListBean> cartItemList) {
        this.cartItemList = cartItemList;
    }

    public static class CartItemListBean {
        /**
         * colorID : 0
         * count : 1
         * id : 127
         * name : 热销套装丨清爽平衡护肤三件套
         * pic : http://image.hmeili.com/yunifang/images/goods/189/goods_img/160819091183119066095185335.jpg
         * price : 99.9
         * productID : 189
         * repertory : 110
         * sizeID : 0
         * userID : 59
         */

        private int colorID;
        private int count;
        private int id;
        private String name;
        private String pic;
        private double price;
        private int productID;
        private int repertory;
        private int sizeID;
        private int userID;

        public int getColorID() {
            return colorID;
        }

        public void setColorID(int colorID) {
            this.colorID = colorID;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPic() {
            return pic;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getProductID() {
            return productID;
        }

        public void setProductID(int productID) {
            this.productID = productID;
        }

        public int getRepertory() {
            return repertory;
        }

        public void setRepertory(int repertory) {
            this.repertory = repertory;
        }

        public int getSizeID() {
            return sizeID;
        }

        public void setSizeID(int sizeID) {
            this.sizeID = sizeID;
        }

        public int getUserID() {
            return userID;
        }

        public void setUserID(int userID) {
            this.userID = userID;
        }
    }
}
