package demo;

public class Person {
    private String name;
    private int age;
    //如果年龄大于200或者为负数，则抛出异常Exception,异常提示年龄非法

    public Person(String name, int age) {
        if(age<0||age>=200){
            throw new MyException3(age+"年龄数值非法！");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
