/**
 * @author მარიამი ზედგინიძ
 */

package homework9;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        String statement ="java git java oop java git python";

        String [] words = statement.split(" ");

        HashMap<String,Integer>wordsMap=new HashMap<>();

        for(String w : words){
            if(wordsMap.containsKey(w))wordsMap.put(w,wordsMap.get(w)+1);
            else wordsMap.put(w,1);
        }

        System.out.println(wordsMap);
    }


}
