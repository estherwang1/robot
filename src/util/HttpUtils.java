package util;
//工具类多用static类
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;

public class HttpUtils {

    public static String requestUtil(String api) throws IOException {
        HttpURLConnection connection = null;
        int responseCode = 0;

        try {
            //获取对应的连接对象
            URL url = new URL(api);
            connection = (HttpURLConnection) url.openConnection();
            responseCode = connection.getResponseCode();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //正常http返回码
        if (responseCode >= 200 && responseCode <= 299){
            try (
                InputStream inputStream = connection.getInputStream();
                BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
            ){}
            catch  (Exception e){
            e.printStackTrace();}
        }

        return "hello world";
    }



}
