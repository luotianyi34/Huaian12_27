package demo;

public class MyException3 extends RuntimeException{
//    public NullPointerException(){
//        super();//调用父类的方法
//
//    }
//    public NullPointerException(String s){
//        super(s);//有异常信息的父类方法
//    }

    //java中的异常描述类中有提供对异常的初始化方法
    //初始化当前的异常类
    public MyException3(){
        super();
    }

    //如果有异常提示信息，就可以通过参数传递给父类
    public MyException3(String message){
        super(message);
    }

}
