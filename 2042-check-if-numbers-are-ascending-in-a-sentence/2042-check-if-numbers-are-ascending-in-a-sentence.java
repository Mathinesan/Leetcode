import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Solution {
    public boolean areNumbersAscending(String s) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(s);

        int prev = 0;

        while(matcher.find()){
            int current  = Integer.parseInt(matcher.group());
            if(curent<=prev){
                return false;
            }
            prev = current;
        }
        return true;
    }
}