package HomeWork4;

public class Exception_bank extends RuntimeException{
    //初始化当前的异常类
    public Exception_bank(){
        super();
    }

    //如果有异常提示信息，就可以通过参数传递给父类
    public Exception_bank(String message){
        super(message);
    }
}
