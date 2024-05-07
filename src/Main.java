import lists.MyArrayList;
import lists.MyList;

import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(3);
        System.out.println(list.size());
        list.delete(0);
        System.out.println(list.size());


    }
}