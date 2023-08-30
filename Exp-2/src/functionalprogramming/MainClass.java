package functionalprogramming;

public class MainClass {
    public static void main(String[] args) {
        calculate c = (i,j,k) -> {
            if(k=='+'){
                return i+j;
            } else if(k=='-'){
                return i-j;
            } else if(k=='/'){
                return i/j;
            } else if(k=='*'){
                return i*j;
            }
            return 0;
        };
        double result = c.calcu(5, 2, '+');
        System.out.println(result);
    }
}
