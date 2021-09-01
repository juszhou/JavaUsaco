public class Recursion {
    public static void main (String argvp[]){

        System.out.print(getDecimalVal("10011"));

    }
    static int Factorial(int n){
        if(n == 1){
            return 1 ;

        }else{
            return n * Factorial(n-1);

        }


    }
    static int kthGrammar(int N, int K) {
        if(N==0){
            return  0;
        }
        if(K%2!=0){
            return  kthGrammar(N-1, (K+1)/2);

        }else {
            return 1-   kthGrammar(N-1, (K+1)/2);
        }

    }

    static int getDecimalVal( String  binaryStr){
        if(binaryStr.length() == 1){
            return Integer.parseInt(binaryStr);
        }
        String subStr = binaryStr.substring(0, binaryStr.length() -1 );
        int lastDigit = binaryStr.charAt(binaryStr.length()-1) - '0';
        return  getDecimalVal(subStr )* 2 + lastDigit;

    }
}


