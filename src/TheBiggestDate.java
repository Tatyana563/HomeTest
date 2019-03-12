import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TheBiggestDate {
    public static void main(String[] args) {
        LocalDate local1 = LocalDate.of(2019,3,1);
        LocalDate local2 = LocalDate.of(2019,9,3);
        LocalDate local3 = LocalDate.of(2019,3,15);
        LocalDate local4 = LocalDate.of(2019,3,8);
        List<LocalDate> setOfDates = new ArrayList<>();
        Collections.addAll(setOfDates,local1,local2,local3,local4);
        TheBiggestDate theBiggestDate = new TheBiggestDate();
        theBiggestDate.maxDate(setOfDates);

    }
    LocalDate maxDate(List<LocalDate> nabor){
        LocalDate result = nabor.get(0);
        for(LocalDate temp:nabor){
            if(temp.isAfter(result)){
                result=temp;
            }
        }
        System.out.println(result);
        return result;
    }

}
