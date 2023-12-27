package HomeWork2;

import java.util.HashSet;

public class HashSet_ergodic {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();
        set.add(new Student("周杰伦",33));
        set.add(new Student("刘德华",22));
        set.add(new Student("张学友",24));
        set.add(new Student("薛之谦",15));
        set.add(new Student("薛之谦",15));
        set.add(new Student("薛之谦",25));
        for (Student student : set) {
            System.out.println(student);
        }
    }
}
