package model;
//将传参参数封装成类Request
public class Request {

    private String key = "";

    private String appid = "";

    private String msg = "";

    //重写构造函数
    public Request(){}

    public Request(String msg)
    {
        this.msg = msg;
    }
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
