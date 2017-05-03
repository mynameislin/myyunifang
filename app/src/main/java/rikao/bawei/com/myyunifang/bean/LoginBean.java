package rikao.bawei.com.myyunifang.bean;

/**
 * 类的用途：
 *
 * @author 林慧强
 * @time 2017/4/24 20:05
 */

public class LoginBean {
    private String dataStr;
    private int id;

    public LoginBean(String dataStr, int id) {
        this.dataStr = dataStr;
        this.id = id;
    }

    public String getDataStr() {
        return dataStr;
    }

    public void setDataStr(String dataStr) {
        this.dataStr = dataStr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
