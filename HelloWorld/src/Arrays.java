/**
 * Created by rubberbox on 2018/9/6.
 */
public class Arrays {
    public static void main(String[] args) {
        int []A= {3, 8, 9, 7, 6};
        int[] B =solution(A,3);
        System.out.println("You get it ");
    }
    public static int[] solution(int[] A, int K) {
        if(A.length == 0){
            return A;
        }
        // write your code in Java SE 8
        int indexToMove = K%A.length;
        int [] B = new int[A.length];
        for (int i = 0; i <A.length ; i++) {
            B[i]=A[(A.length-indexToMove+i)%A.length];
        }
        return B;
    }
}
