package app;

//import service.AliyunServiseImpl;
import model.Response;
import service.QkyServiceImpl;
import service.RobotService;
import java.util.Scanner;

public class Main {

    //main函数是用户输入的主入口，要检查各种输入。注意空输入、攻击语句；
    public static void main(String[] args){

        final RobotService robotService;
        robotService = new QkyServiceImpl();
        //RobotService robotService = new QkyServiceImpl();
        //robotService.qa("");
        //如果要调换阿里云，直接将QkyServiceImpl改成AliyunServiseImpl就可以，实现了“解耦”
        Scanner scanner = new Scanner(System.in);
        System.out.println("请为我取名~");

        String name = scanner.nextLine();
        System.out.println("hi，我是您的小助手"+ name +",请对我下达指令。");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("886")) {
                System.out.println("欢迎下次使⽤,拜拜");
                break;
            } else {
                Response response = robotService.qa(input);
                if (response.getCode() == 0) {
                    System.out.println(name + " : " +
                            response.getContent());
                } else {
                    System.out.println(name + " 暂时没明⽩您的意思，重新告诉我下！");
                }
            }
        }
        scanner.close();



    }
}
