public class LetterInWords {
    public static void main(String[] args) {
        LetterInWords letterInWords = new LetterInWords();
        letterInWords.calCountLetter("apple",'a');
    }
    int calCountLetter(String str, char letter){
        int i=0;
        int result=0;

        while(i<str.length()){

            if(letter==str.charAt(i)){
                result--;
                i++;
            }
        }
        System.out.println(Math.abs(result));
        return Math.abs(result);
    }
}
