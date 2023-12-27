package HomeWork3;

public class Student implements Comparable<Student>{
     int code;
     int score;

    public Student(int code, int score) {
        this.code = code;
        this.score = score;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "学号=" + code +
                ", 总分=" + score +
                '}';
    }


    @Override
    public int compareTo(Student o) {//自然排序就根据学号大小来进行排序
        if (o.code==this.code){
            return 0;
        }
        return 1;
    }
}
