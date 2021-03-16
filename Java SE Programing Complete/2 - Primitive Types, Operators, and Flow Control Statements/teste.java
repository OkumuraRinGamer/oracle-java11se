import java.lang.Math;

public class teste{
    public static void main(String[] args){
        int a = 11;
        int b = 3;
        
        long c = Math.round(a/b);
        double d = Math.round(a/b);
        double e = Math.round((double)a/b*100)/100.0;
        int f = a << 2;
        int g = a >>> 2;
        
        System.out.println(g);
        System.out.println(f);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
