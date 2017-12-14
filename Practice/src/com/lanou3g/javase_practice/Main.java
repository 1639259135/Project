package com.lanou3g.javase_practice;
import com.lanou3g.javase_practice.Exception.RegisterUserNameErrorException;
import org.dom4j.DocumentException;

import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException, DocumentException, RegisterUserNameErrorException {
        Scanner input = new Scanner(System.in);
        Register register = new Register();
        GetWeather gw = new GetWeather();
        GetLocation gl = new GetLocation();

//        Login login = new Login();
//        register(input, register);
//        Login(input, login);

//        System.out.println("请选择游戏难度:1, 简单 \t 2, 适中 \t 3, 困难");




//        System.out.println("1, 查询天气 \t 2, 查询手机号码归属地 \t 3, 手速游戏");
//        int choice = input.nextInt();
//        switch (choice){
//            case 1:
//                System.out.println("请输入需要查询的城市英文名:");
//                String city = input.nextLine();
//                gw.getWeather(city);
//            case 2:
//                System.out.println("请输入需要查询的城市英文名:");
//                String num = input.nextLine();
//                gl.getLocation(num);
//            case 3:
//
//        }






    }

    private static void Login(Scanner input, Login login) throws DocumentException {
        System.out.println("请输入账号:");
        String id = input.nextLine();
        System.out.println("请输入密码:");
        String password = input.nextLine();
        login.login(id,password);
    }

    private static void register(Scanner input, Register register) throws IOException, DocumentException, RegisterUserNameErrorException {
        System.out.println("请输入用户名:");
        String userName = input.nextLine();
        System.out.println("请输入账号:");
        String id = input.nextLine();
        System.out.println("请输入密码:");
        String password = input.nextLine();

        register.register(id,userName,password);

//        System.out.println("注册成功:\n" + "用户:" + userName + "\t 账号:" + id);

    }
}
