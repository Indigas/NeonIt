package sk.durovic;

import java.util.ArrayList;
import java.util.List;

public class Revert {
    private final char SPACE = ' ';
    private final char DOT = '.';
    private StringBuilder revertedText = new StringBuilder();


    /**
     * Return a string with reversed single words.
     * Order of words will not be changed.
     * Now is working with only two non-alphabetical characters as space and dot.
     * Doesnt recognize names, method only put first character of sentence in uppercase.
     *
     * @param text which will be reverted
     * @return  return reverted String
     */
    public String revert(String text){
        char[] chars = text.toLowerCase().toCharArray();
        List<Character> list = new ArrayList<>();

        for (int i = 0; i< chars.length; i++){
            if(chars[i] != SPACE && chars[i] != DOT)
                list.add(chars[i]);
            else
                nextWord(list, chars[i]);
        }

        return revertedText.toString();
    }

    /**
     * Method to revert word.
     *
     * @param list current word to revert
     * @param symbol next special character which cant be reverted in word as space and dot
     */
    private void nextWord(List<Character> list, char symbol){

        for (int i = list.size()-1; i>=0; i--){
            if (isFirstWord())
                revertedText.append(String.valueOf(list.get(i)).toUpperCase());
            else
                revertedText.append(list.get(i));
        }
        revertedText.append(symbol);
        list.clear();
    }

    private boolean isFirstWord(){
        if(revertedText.length()==0){
            return true;
        }

        return false;
    }
}
