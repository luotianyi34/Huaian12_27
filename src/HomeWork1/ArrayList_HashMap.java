package HomeWork1;

import java.util.*;

public class ArrayList_HashMap {

    public static void main(String[] args) {
        //创建ArrayList集合
        ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();
        //创建HashMap集合，并添加键值对元素
        HashMap<String,String> first = new HashMap<>();
        first.put("jf001","郑智");
        first.put("jf002","李毅");
        first.put("jf003","郜林");
        first.put("jf004","黄博文");
        HashMap<String,String> second = new HashMap<>();
        second.put("jf001","梅西");
        second.put("jf002","C罗");
        second.put("jf003","内马尔");
        second.put("jf004","帕托");
        //把HashMap作为元素添加到ArrayList集合中
        arrayList.add(first);
        arrayList.add(second);
        Choice(arrayList);

    }
    public static void Choice(ArrayList<HashMap<String,String>> arrayList){
        int loop = 0;
        int i ;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("请输入数字:\n1.使用迭代器遍历  " +
                    "2.使用列表迭代器遍历  " +
                    "3.使用size()和get()方法遍历  " +
                    "4.使用增强for遍历  5.退出程序");
            i = scanner.nextInt();
            switch (i){
                case 1 :
                    //使用迭代器遍历
                    Iterator_ergodic(arrayList);
                    break;
                case 2 :
                    //使用列表迭代器遍历
                    ListIterator_ergodic(arrayList);
                    break;
                case 3 :
                    //使用size()和get()方法遍历
                    Size_get_ergodic(arrayList);
                    break;
                case 4 :
                    //增强for循环遍历ArrayList集合
                    For_ergodic(arrayList);
                    break;
                case 5 :
                    loop=-1;
                    break;
                default:
                    System.out.println("您输入错误,请重新输入!");
            }
        }while (loop==0);
    }
    public static void Iterator_ergodic(ArrayList<HashMap<String,String>> arrayList){
        System.out.println("这是迭代器遍历！");
        Iterator<HashMap<String, String>> iterator = arrayList.iterator();
        while(iterator.hasNext()){//如果有下一个元素，那么就读取值
            System.out.println(iterator.next());
        }

    }
    public static void ListIterator_ergodic(ArrayList<HashMap<String,String>> arrayList){
        System.out.println("这是列表迭代器遍历！");
        ListIterator<HashMap<String, String>> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }
    public static void Size_get_ergodic(ArrayList<HashMap<String,String>> arrayList){
        System.out.println("这是使用size()和get()方法遍历！");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
    public static void For_ergodic(ArrayList<HashMap<String,String>> arrayList){
        System.out.println("这是使用增强for遍历!");
        for (HashMap<String, String> hashMap : arrayList) {
            System.out.println(hashMap);
            //HashMap集合的遍历
            Set<String> set = hashMap.keySet();
            for (String s : set) {
                String value = hashMap.get(s);
                System.out.println(s+" "+value);
            }
        }
    }
}
