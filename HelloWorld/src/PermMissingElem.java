import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by rubberbox on 2018/9/19.
 */
public class PermMissingElem {
    public static void main(String[] args) {
        System.out.println("you get it");
        System.out.println(solution(new int[]{-1, 2,3, 4, 5,22}));
    }
    public static int solution(int[] A){
        if(A.length==0 || A==null )
            return 1;
        if (A.length ==1)
            return A[0];
        Set<Integer> previourList = new HashSet<>();
        int minValue = A[0];
        int maxValue = A[0];
        for (int i =0 ; i< A.length;i++){
            if(A[i]>maxValue){
                maxValue=A[i];
            }
            if(A[i]<minValue){
                minValue=A[i];
            }
            previourList.add(A[i]);
        }
        for (int m=  minValue;m<maxValue;m++){
            if(!previourList.contains(m))
                return m;
        }

        return 1;
    }
}
