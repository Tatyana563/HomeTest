public class LetterinWords2 {
    public static void main(String[] args) {
        LetterInWords letterInWords = new LetterInWords();
        String myString = "orangeooo";
        letterInWords.calCountLetter(myString,'o');
    }
    int calcCountLetter1(String str, char letter){
        int result=0;
        char[] mass= str.toCharArray();
        for(char temp:mass){
            if(temp==letter){
                result++;
            }
            System.out.println(result);
        }
        return Math.abs(result);
    }
}
