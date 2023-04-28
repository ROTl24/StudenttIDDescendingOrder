package S2023428;

import java.util.TreeSet;

// 定义学生类，实现Comparable接口，指定比较方式
class Studentt implements Comparable<Studentt> {
    private String id;
    private String name;

    public Studentt(String id,String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + "," + name;
    }

    // 实现compareTo方法，按照id倒序排序
    public int compareTo(Studentt o) {
        return -1;//倒序
        //return 0 只有一个元素
        //return 1 正序
    }
}

public class Case2 {
    public static void main(String[] args) {
        // 创建TreeSet实例，指定泛型参数为Studentt类型
        TreeSet<Studentt> ts = new TreeSet<>();
        // 往集合中添加元素
        ts.add(new Studentt("1","张三"));
        ts.add(new Studentt("2","李四"));
        ts.add(new Studentt("2","王五")); // id为2的元素重复，只会添加一个
        // 打印集合中的元素
        System.out.println(ts);
    }
}
