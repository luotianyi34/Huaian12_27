package HomeWork3;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSet_ergodic {
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<>();
        set.add(new Student(1,80));
        set.add(new Student(1,70));//此处为错误数据 由于TreeSet去重原理直接去重了
        set.add(new Student(2,70));
        set.add(new Student(3,90));
        Choice(set);
    }
    public static void Choice(TreeSet<Student> set){
        int flag =0;
        int i ;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("请输入数字\n" +
                    "1.自然排序方式  2.比较器排序方式  3.退出程序");
            i = scanner.nextInt();
            switch (i){
                case 1:
                    Natural(set);
                    break;
                case 2:
                    compara(set);
                    break;
                case 3:
                    flag=-1;
                    break;
                default:
                    System.out.println("您输入的数字错误！");
                    break;
            }
        }while (flag==0);
    }
    public static void Natural(TreeSet<Student> set){
        TreeSet<Student> NewSet = new TreeSet<>(set);
        for (Student student : NewSet) {
            System.out.println(student);
        }
    }
    public static void compara(TreeSet<Student> set){
        TreeSet<Student> NewSet = new TreeSet<>(new My_Comparator());
        for (Student student : set) {
            NewSet.add(student);
        }
        for (Student student : NewSet) {
            System.out.println(student);
        }
    }
}
