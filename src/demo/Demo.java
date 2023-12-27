package demo;

public class Demo {
    public static void main(String[] args) {
//        demoTest();
        try {
            Person person = new Person("王天润",200);
            System.out.println(person);
        }catch (MyException3 e){
            System.out.println("年龄异常！");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("运行结束!");
        }

    }
    public static void demoTest(){
        try{
            int c =10/0;
            //这里面没有出现MyException异常所以不会进入catch
        }catch (MyException3 e){
            System.out.println("异常！");
        }
        int b = 0;
        int a = 10;
        if (b<=0){
            throw new MyException3("除数不能为0");
        }
    }
}
