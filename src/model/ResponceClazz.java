package model;
//将网络响应参数封装成类ResponceClazz
public class ResponceClazz {

    private int code;

    private String content;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
