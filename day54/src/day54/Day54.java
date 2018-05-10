package day54;
import java.util.*;
import java.util.function.*;
public class Day54 {
    public static<T> void solve(List<T> data,Predicate<T> filter, Consumer<T> cons){
    for(T elem: data)
        if(filter.test(elem)) cons.accept(elem);
    }
    public static void main(String[] args) {
       
        Random rnd=new Random();
        List<Integer> data=new ArrayList<>();
        for(int i=0;i<15;++i)
            data.add(rnd.nextInt(10));
   
        long n=data.stream().filter((x)->x%2==0).count();
 //       solve(data,(x)->(x%2==0) && (x!=0),(x)->System.out.print(x+" "));
        System.out.println();
        System.out.println(data);
    }
    
}
