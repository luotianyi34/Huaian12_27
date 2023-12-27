package HomeWork4;

import java.math.BigDecimal;
import java.util.Scanner;

public class Bank_system {
    public static void main(String[] args) {
        BigDecimal money = new BigDecimal("1000.0");
        money = Choice(money);
        System.out.println("您的账户余额为"+money+"欢迎下次使用本程序!");

    }
    public static BigDecimal Choice(BigDecimal money) {
        int flag =0;
        int i ;
        Scanner scanner = new Scanner(System.in);
        do { System.out.println("欢迎进入程序!请输入数字\n" +
                "1.取钱  2.存钱  3.退出程序");
            i = scanner.nextInt();
            switch (i){
                case 1:
                    money=Withdraw(money);
                    break;
                case 2:
                    money = Save(money);
                    break;
                case 3:
                    flag=-1;
                    break;
                default:
                    System.out.println("您输入的数字错误！");
                    break;
            }
        }while (flag==0);
        return money;
    }
    public static BigDecimal Withdraw(BigDecimal money){
        String i ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("您当前余额为:"+money);
        System.out.println("请输入取走的钱:");
        i = scanner.nextLine();
        BigDecimal money2 = new BigDecimal(i);
        if (money.compareTo(money2)<0){
            throw new Exception_bank("取出金额大于余额!请重新尝试!");
        }else{
            money = money.subtract(money2);
            System.out.println("取钱成功！余额为"+money);
            return money;
        }
    }
    public static BigDecimal Save(BigDecimal money){
        String i ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("您当前余额为:"+money);
        System.out.println("请输入存入的钱:");
        i = scanner.nextLine();
        BigDecimal money2 = new BigDecimal(i);
        money= money.add(money2);
        System.out.println("取钱成功！余额为"+money);
        return money;
    }
}
