package powx_n;

public class method_curs {

    public double quickMul(double x, long n) {
        if (n == 0) {
            return 1.0;
        }
        double y = quickMul(x,n/2);
        return n % 2 == 1 ? y * y * x : y * y;
    }

    public double myPow(double x, int n) {
        long N = n;
        return N > 0 ? quickMul(x,N) : 1.0 / quickMul(x,Math.abs(N));
    }
}
