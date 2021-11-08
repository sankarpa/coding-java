package com.hope;

import java.util.*;

class Color {
    private String name;
    private String hex;
    public Color(String name, String hex){
        this.name = name;
        this.hex = hex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Color color = (Color) o;
        return Objects.equals(name, color.name) && Objects.equals(hex, color.hex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hex);
    }

    @Override
    public String toString() {
        return "Color{" +
                "name='" + name + '\'' +
                "hex='"+ hex + '\'' +
                '}';
    }
}
public class CollectionExample {



    public static void main(String[] args) {

        List<Color> colors = new ArrayList<>();
        colors.add(new Color("blue", "0XX"));
        colors.add(new Color("yellow","0XY"));
        colors.add(new Color("green", "0XZ"));
        colors.add(new Color("yellow", "0XA"));

        HashSet<Color> colorHashSet = new HashSet<>();
        colorHashSet.add(new Color("blue", "0XX"));
        colorHashSet.add(new Color("yellow","0XY"));
        colorHashSet.add(new Color("green", "0XZ"));
        colorHashSet.add(new Color("yellow", "0XA"));

        System.out.println(colors);
        System.out.println(colorHashSet);






//        Set<String> set1 = new HashSet<>();
//
//        set1.add("GoodDay");
//        set1.add("Nandhi");
//        Set<String> hashSet = new HashSet<>();
//        Set<String> treeSet = new TreeSet<>();
//
//
//        hashSet.add("Amul");
//        hashSet.add("Aavin");
//        hashSet.add("Dairy");
//        hashSet.addAll(set1);
//
//        treeSet.add("Amul");
//        treeSet.add("Aavin");
//        treeSet.add("Dairy");
//        treeSet.addAll(set1);
//
//        List<String> string = new ArrayList<>();
//        string.addAll(hashSet);
////        string.removeAll(treeSet);
//
//
//        System.out.println(hashSet);
//        System.out.println(treeSet);
//
//        System.out.println(string);
//
//        Iterator<String> stringIterator = string.iterator();
//
//        while (stringIterator.hasNext()){
//            System.out.println(stringIterator.next());
//        }
//
//
//
//
////        List<String> listString = new LinkedList<>();
////
////        listString.add("string");
////        listString.add("string2");
////        listString.add("string");
////
////        System.out.println(listString.indexOf("string"));
////
////        System.out.println(listString);
////
////        listString.remove("string");
////        System.out.println(listString.indexOf("string"));
////
////
////        System.out.println(listString);
    }



}
