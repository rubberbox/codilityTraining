import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by rubberbox on 2018/9/8.
 */
public class OddOccurrencesInArray {
    public static void main(String[] args) {
        int []A ={1,2,3,4,4,5,3,2,1};
        int result= solution(A);
        System.out.printf("you get %d",result);
    }
    public static int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length == 0)
            return 0;
        HashSet<Integer> setList =new HashSet<>();
        for (int i = 0; i <A.length ; i++) {
            if(setList.contains(A[i])){
                setList.remove(A[i]);
            }else {
                setList.add(A[i]);
            }
        }
        if(setList.size()>1){
            return 0;
        }
        Iterator<Integer> iter = setList.iterator();
        while (iter.hasNext()){
            return iter.next();
        }
        return  0;
    }
}
