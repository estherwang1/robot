package service;

//import model.ResponceClazz;

import javax.xml.ws.Response;
import java.io.IOException;

public interface RobotService {

    Response qa(String msg) throws IOException;//qa:question and answer

}
