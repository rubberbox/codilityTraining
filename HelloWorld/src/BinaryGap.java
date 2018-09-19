public class BinaryGap {

    public static void main(String[] args) {
        int binaryGap=solution(1041);
        System.out.print(binaryGap);
    }
    public static int solution(int N){
        boolean hasFirstDigit = false;
        int maxLength = 0;
        int length = 0;
        while (N>0){
            int digit = N%2;
            if(digit ==1){
                if(hasFirstDigit){
                    maxLength = length>maxLength?length:maxLength;
                    length = 0;
                }else{
                    hasFirstDigit = true;
                }
            }else {
                if(hasFirstDigit){
                    length++;
                }
            }
            N=N>>1;
        }
        return maxLength;
    }

}
