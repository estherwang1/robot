package app;

//import service.AliyunServiseImpl;
import service.QkyServiceImpl;
import service.RobotService;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        RobotService robotService = new QkyServiceImpl();

        robotService.qa("");

        //如果要调换阿里云，直接将QkyServiceImpl改成AliyunServiseImpl就可以，实现了“解耦”







    }
}
