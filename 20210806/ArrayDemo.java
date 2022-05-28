import java.util.*;
public class ArrayDemo{
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("hello");
        // c.add(new Name("f1","l1"));
        c.add(new Integer(100));
        System.out.println(c.size());
        System.out.println(c);

        int[] i1=new int[10];

        for(int element:i1)
            System.out.println(element);

    }
     
}