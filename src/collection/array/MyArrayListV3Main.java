package collection.array;

public class MyArrayListV3Main {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        // 원하는 위치에 추가
        System.out.println("addLast");
        list.add(3, "addLast");
        System.out.println(list);

        System.out.println("addFirst");
        list.add(0, "addFirst");
        System.out.println(list);

        // 삭제
        Object remove1 = list.remove(4);
        System.out.println("remove4 " + remove1);

        Object remove2 = list.remove(0);
        System.out.println("remove0 = " + remove2);
        System.out.println(list);
    }
}
