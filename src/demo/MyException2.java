package demo;

public class MyException2 {
    /*
    异常的声明,抛出,处理:
        对自己编写的代码进行合理的判断
        参数传递时:对参数的预判
    1.抛出异常:java中提供了一个关键字 throw 用来抛出一个指定的异常对象
        抛出异常的时候程序就不在继续运行
        使用:1.创建一个异常对象 里面封装好异常提示信息(系统默认的/自己编写的)
            2.需要将异常对象告知调用者
                A->B    B处理异常(抛出) 关键字throw
            3.使用格式:throw new 异常类名(参数)
    2.声明异常:throws
        将问题标识出来，报告给调用者，如果方法中通过throws抛出了编译异常，而没有捕获处理、
        必须通过throws声明让调用者去处理异常
        A->B B出现异常 B不处理 把问题->A 让A处理异常
    3.异常的捕获: 编写对异常有针对性的语句,将异常捕获,对异常进行指定方式的处理(发现异常了之后要干什么)
                try catch
                try:该代码块中可能出现异常
                catch:如果真的出现异常了,我接下来需要执行的操作
                finally:不管有没有异常/不管出现异常都会执行
                try{}catch(异常类 变量名称){}finally{}
     4.获取异常信息:
                1.getMessage()异常的详细信息
                2.toString()返回异常的简述
                3.printStackTrace()在控制台输出该异常的名字 详细信息字符串 异常出现的代码位置

    RuntimeException 运行异常 下面都是它的子类
    特点:方法中抛出异常 方法定义无需throws声明，调用者无需处理此异常
         运行时候异常一旦发生，需要修改源代码
    常用的异常类:
        1.NullPointerException 空指针异常
        2.ArrayIndexOutOfBoundsException 数组下标越界异常
        3.ArithmeticException 运算异常
        4.Exception 未知异常(不知道会出现什么，都用Exception)
        5......

    自定义异常类 extends RunTimeException 和 extends Exception
    区别:extends Exception     A->B的时候 B会告知A可能会有异常 这时候需要A做捕获异常处理的操作
        必须要用throw声明 一旦声明异常 就告知调用者需要进行捕获，一旦问题处理了调用者的程序会继续执行
        extends RunTimeException A->B的时候 不知道有没有异常 如果出现异常直接终止程序
        不需要throw声明，也不需要写捕获代码,因为调用者根本不知道可能会有异常，一旦发生异常 程序直接终止

    * */
    public static void main(String[] args) throws Exception {
        int[] arr= {35,32,10};
//        int num = getElement(null,2);
//        int num2 = getElement(arr,10);
//        show(8);
        try {
//            System.out.println(arr[3]);
//            int a =10/0;
            String a = null;
            System.out.println(a.length());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组总长度为"+arr.length+",你取值时超出了数组长度!");
        }catch (NullPointerException e){
            System.out.println("数组不存在！");
        }catch (ArithmeticException e){
            System.out.println("除数不能为0");
        }catch (Exception e){
            System.out.println("运行出现问题！");
        }finally {
            //不管如何 这边的代码块都会执行
            System.out.println("程序运行结束！");
        }

    }


    public static int getElement(int[] arr,int index){
        if (arr==null){
            throw new NullPointerException("传递的数组不存在！");
        }
        if(index<0||index >=arr.length){
            throw new ArrayIndexOutOfBoundsException("下标"+index+"在数组中不存在");
        }
        int e1 = arr[index];
        return e1;
    }
    public static void show(int a)throws Exception{
        if (a>0){
            throw new Exception("运行出现异常");
        }else {
            System.out.println("run......");
        }
    }
}
