import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountLetters {
    public static void main(String[] args) {
        String myString = "Keep calm and carry on";
        CountLetters countLetters = new CountLetters();
        countLetters.calcCountLetter2(myString);
    }
    void calcCountLetter2(String str){
        int count=0;
        int result=0;
        String[] array = str.split("");
        List<String> list = Arrays.stream(array).distinct().collect(Collectors.toList());
        for(String temp:list){

            for(String temp2:array){
                if(temp.equals(temp2)){
                    count++;
                }

            }
            System.out.println("Letter"+" "+temp+"-"+count);
        }

    }
}
