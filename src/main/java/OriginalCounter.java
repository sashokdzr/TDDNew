import java.util.Locale;

public class OriginalCounter {
    int countLetters(String str, char letter){
        int count = 0;
        str = str.toLowerCase(Locale.ROOT);
        for(int i=0; i<str.length(); i++){
            if (str.charAt(i) == letter){
                count+=1;
            }
        }
        return count;
    }
}
