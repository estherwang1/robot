package service;

//业务实现类 -IMPL 轻课云

import com.google.gson.Gson;
import util.HttpUtils;
import model.ResponceClazz;
import javax.xml.ws.Response;
import java.io.IOException;

public class QkyServiceImpl implements RobotService{

    //拼装路径 %s是一种格式化，可以自动替换
    private static final String apiTpl = "http://api.qingkeyun.com/api.php?key=free&appid=0&msg=%s";

    private static final Gson gson = new Gson();
    @Override
    public Response qa(String msg) throws IOException {

        //format会自动将%s替换过去
        String api = String.format(apiTpl,msg);

        String result = HttpUtils.requestUtil(api);
        //可以做逻辑判断，比如null或者出错的时候 todo
        Response response = gson.fromJson(result,Response.class);

        return response;
    }




}
