package questions.basic;

public class Sumof {
    public static void main(String[] args) {
        int ans = sumof(10);
        System.out.println(ans);

    }
    static int sumof(int n){
        if (n==1){
            return 1;
        }
        return n + sumof(n-1);
    }
}