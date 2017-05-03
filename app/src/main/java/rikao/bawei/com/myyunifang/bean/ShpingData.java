package rikao.bawei.com.myyunifang.bean;

/**
 * 类的用途：
 *
 * @author 林慧强
 * @time 2017/4/21 15:44
 */

public class ShpingData {
    private String pic;
    private String name;
    private double price;
    private  int count;
    private int id;
    private boolean ischek;

    public ShpingData(String pic, String name, double price, int count, int id, boolean ischek) {
        this.pic = pic;
        this.name = name;
        this.price = price;
        this.count = count;
        this.id = id;
        this.ischek = ischek;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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

    public boolean ischek() {
        return ischek;
    }

    public void setIschek(boolean ischek) {
        this.ischek = ischek;
    }
}
