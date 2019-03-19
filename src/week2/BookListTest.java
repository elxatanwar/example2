package week2;

import java.util.ArrayList;
import java.util.List;

public class BookListTest {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        list.add(new Book(510,"别输在不会表达上",22.5));
        list.add(new Book(1,"藏獒",114.0));
        list.add(new Book(202,"活着",55.6));
        list.add(new Book(8520,"教父",63.0));
        System.out.println(list);

        list.add(2,new Book(853,"教父2",99.3));
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.set(2,new Book(999,"教父3",10.5));
        System.out.println(list);
        System.out.println(list.get(1));

        list.add(new Book(1,"藏獒",114.0));
        System.out.println(list);
        System.out.println(list.indexOf(new Book(1,"藏獒",114.0)));
        System.out.println(list.lastIndexOf(new Book(1,"藏獒",114.0)));
    }
}