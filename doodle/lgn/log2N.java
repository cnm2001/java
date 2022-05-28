package java.doodle.lgn;
public class log2N {
    public static void main(String[] args) {
        String s="";
        long N=1000;
        for (long n = N; n > 0; n /= 2)
            s = (n % 2) + s;
        System.out.println(s.length());
    }
}