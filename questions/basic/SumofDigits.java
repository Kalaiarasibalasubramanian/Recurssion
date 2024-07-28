package questions.basic;

// sum of individual digits

public class SumofDigits {
    public static void main(String[] args) {
        int ans = sumofdigit(1234);
        System.out.println(ans);


    }
    static int sumofdigit(int n ){
        if (n==0){
            return 0;
        }
        return (n%10) + sumofdigit(n/10);
    }
}
