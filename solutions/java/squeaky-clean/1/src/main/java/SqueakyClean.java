import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class SqueakyClean {
    private static final List<Object> cleanArray = new ArrayList<>(Arrays.asList(4,'a',3,'e',0,'o',1,'l',7,'t'));
    static String clean(String identifier) {
        char[] array = identifier.toCharArray();
        StringBuilder stBuilder = new StringBuilder();
        Boolean dashFound = false;
        String res;
        for (char ch: array) {
            if (ch == ' ') {ch = '_';}
            if (!Character.isLetter(ch) && !Character.isDigit(ch) && !Character.isWhitespace(ch) && ch != '-' && ch != '_')
            {
                continue;
            }
            if (ch == '-') {
                    dashFound = true;
                    continue;}
            if (Character.isDigit(ch)) {
    int digit = Character.getNumericValue(ch);   
    if (cleanArray.contains(digit)) {             
        int index = cleanArray.indexOf(digit);
        ch = (Character) cleanArray.get(index + 1); 
    }
}
            if(dashFound) {
                stBuilder.append(Character.toUpperCase(ch));
                dashFound=false;
            }
            else {
                stBuilder.append(ch);
            }
        }
    res = stBuilder.toString();
        return res;
    }
}
