package collection.set.member;

public class JavaHashCodeMain {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println("obj1.hashCode() = " + obj1.hashCode());
        System.out.println("obj2.hashCode() = " + obj2.hashCode());
        
        //각 클래스마다 hashCode를 이미 오버라이딩 해두었다.
        Integer i = 10;
        String strA = "A";
        String strAB = "AB";

        System.out.println("i.hashCode() = " + i.hashCode());
        System.out.println("strA.hashCode() = " + strA.hashCode());
        System.out.println("strAB.hashCode() = " + strAB.hashCode());
        
        
        //hashCode는 마이너스 값이 들어올수 있다.
        System.out.println("Integer.valueOf(-1).hashCode() = " + Integer.valueOf(-1).hashCode());

        // 둘은 같은까?
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        System.out.println("member1 = " + member1);
        System.out.println("member2 = " + member2);

        System.out.println("(member1 == member2) = " + (member1 == member2));
        System.out.println("member1.equals(member2) = " + member1.equals(member2));
        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());
    }
    
}
