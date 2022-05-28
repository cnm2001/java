public class Main {
    // public int balance=100;

    public static void main(String[] args) {
        // Account a1=new account();

        int[] i1 = new int[10];


        for (int element : i1)
            System.out.print(element);

        Class cls=Integer.class.getSuperclass();
        Class [] is=cls.getInterfaces();
        for(Class i:is){
            System.out.println(i);
        }

        Integer i =250;
       

        System.out.println(i.TYPE);
    }

}