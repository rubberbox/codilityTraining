public class BinaryGap {

    public static void main(String[] args) {
        int binaryGap=solution(1041);
        System.out.print(binaryGap);
    }
    public static int solution(int N){
        StringBuffer buffer= getBinary(N);
        System.out.println(buffer);
        boolean findStart= false;
        int maxLength=0;
        int currentLength=0;
        for (int i = 0; i < buffer.length(); i++) {
            if(buffer.charAt(i)=='1'){
                if(findStart){
                    if(maxLength<currentLength){
                        maxLength=currentLength;
                    }
                    currentLength=0;
                }else {
                    findStart = true;
                    maxLength = 0;
                    currentLength=0;
                }
            }else if (buffer.charAt(i)=='0'){
                if(findStart){
                    currentLength++;
                }else {
                    currentLength=0;
                }

            }
        }
        return maxLength;
    }
    public static StringBuffer getBinary(int N){
        StringBuffer buffer=new StringBuffer();
        while (N>0){
            buffer.append(N%2);
            N=N>>1;
        }
        return buffer;

    }
}
