package com.java.fundamentals.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        System.out.println(list.isEmpty());

        list.add("Miller");
        list.add("Scott");
        list.add("Alex");
        list.add("King");
        list.add("Anthony");
        list.add("Johnson");

        Collections.sort(list);
        System.out.println(list);

        ArrayList<String> ls = new ArrayList<>();
        ls.add("XYZ");
        ls.add("ASAHSJ");
        ls.add("dskdjslkd");
        ls.add("d2837923982");

        ls.addAll(list);

        System.out.println(ls);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

        System.out.println();
        System.out.println("Traversing List with forEach loop");

        for(String s : list){
            System.out.print(s+"====");
        }

        System.out.println();

        Iterator<String> it = list.iterator();
        System.out.println("Displaying List with Iterator");
        while (it.hasNext()){
            System.out.println(it.next());
        }

        for(String ss : list){

            if(ss.equals("Johnson")){
                System.out.println("Business logic if condition true");
            }
        }

        System.out.println(list);

        list.add(1,"John");

        System.out.println(list);

        list.set(3, "Michele");
        System.out.println(list.size());

        System.out.println(list);

        System.out.println(list.isEmpty());

        System.out.println(list.get(5));

        System.out.println(list.contains("Johnson"));

        System.out.println(list.getFirst());

        System.out.println(list.getLast());
        System.out.println(list.size());
        System.out.println(list.remove("Johnson"));
        System.out.println(list.size());

        list.clear();
        System.out.println(list.size());
    }
}
