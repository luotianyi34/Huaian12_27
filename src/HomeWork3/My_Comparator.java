package HomeWork3;

import java.util.Comparator;
import java.util.TreeSet;

public class My_Comparator implements Comparator<Student> {

    //选择排序我们根据总分来进行排序
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.code==o2.code){
            return 0;
        }else {
            if (o1.score<= o2.score){
                return 1;
            }else {
                return -1;
            }
        }
    }
}
