package demo;

import java.util.ArrayList;

public class MyException {
    /*
    Exception 异常 顶层的接口类  接口类  java.lang.Exception包
    程序运行中出现的错误 导致异常终止

    Throwable java中所有错误(Errors)和异常(exceptions)的父类
    错误:在运行期间发生了某种错误(xxxError)
        通常情况下没有具体的处理方式，程序会自动结束运行
        Error 一般情况下属于系统级别的问题
        都是JVM所在的系统发生了，并且反馈给JVM,不好处理只能修改代码

    处理异常:
        1.通过编写逻辑判断来避免异常
        2.通过特定的方法捕获异常(抛出异常)

    * */
    public static void main(String[] args) {

        //运算异常
//        int a = 10;
//        int b = 0;
////        System.out.println(a/b);
//        if(b!=0){
//            System.out.println(a/b);
//        }else {
//            System.out.println("除数不能为0!");
//        }
//        //空指针异常
////        String s = null;
////        System.out.println(s.length());
//
//        //数组下标越界
//        int[] arr = {1,2,3};
//        System.out.println(arr[3]);

        //OutOfMemoryError内存溢出异常 超过了JVM的分配数组的最大空间
//        int [] arr2 = new int[1024*1024*1024];
//        System.out.println(arr2.length);

    }

    //StackOverflowError 递归异常 堆栈溢出 内存空间溢出
    static ArrayList<String> ss = new ArrayList<>();
    public static void add(){
        ss.add(new String("a"));
        add();
    }
}
