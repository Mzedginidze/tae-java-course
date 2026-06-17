/**
 * @author მარიამი ზედგინიძ
 */

package homework9;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};

        Set<Integer> arrSet = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            arrSet.add(arr[i]);
        }

        System.out.println("unique elements:");

        for(Integer x:arrSet){
            System.out.println(x);
        }

        System.out.println("number of unique elements: "+arrSet.size());

        System.out.println("does collection contains 3? : " + (arrSet.contains(3) ? "yes" : "no"));
        System.out.println("does collection contains 10? : " + (arrSet.contains(10) ? "yes" : "no"));
    }
    }
