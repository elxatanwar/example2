package week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TreeTest {
    public static void main(String[] args) {
        //创建List对象。存入tree对象
        List<Tree> list = new ArrayList<>();
        list.add(new Tree(1,"钢铁侠",22));
        list.add(new Tree(2,"美队",11));
        list.add(new Tree(3,"蜘蛛侠",33));
        list.add(new Tree(4,"黑寡妇",44));
        //调用Collection的sore方法，会自动调用之前写的compareTo方法进行排序
        Collections.sort(list);
        //用foreach循环遍历list
        for (Tree tree:list) {
            System.out.println(tree.getId()  + " " +  tree.getName()  + " "  +  tree.getPrice());

        }
    }
}
