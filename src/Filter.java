import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
       int [] myArray ={1,2,3,4,25,69};
        Filter filter = new Filter();
       // filter.filter1(pr,myArray);
    }


    List<Integer> filter1(Predicate<Integer> filter, int...nabor){
        List<Integer> result = new ArrayList<>();
        for(int temp:nabor){
            if(filter.test(temp)){
                result.add(temp);
            }
        }
       return result;
    }
    Predicate<Integer> pr = new Predicate<Integer>() {
        @Override
        public boolean test(Integer integer) {
            return integer>10;
        }
    };
}
