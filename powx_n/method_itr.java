package powx_n;

// 2^77 = 2^64 * 2^8 * 2^4 * 2^1(77 = 1001101)
public class method_itr {

    public double quickMul(double x, long N) {
        double res = 1.0;
        double x_multi = x;
        while (N > 0) {
            if (N % 2 == 1) {
                res *= x_multi;
            }
            x_multi *= x_multi;
            N /= 2;
        }
        return res;
    }

    public double myPow(double x, int n) {
        long N = n;
        return n > 0 ? quickMul(x, N) : 1.0 / quickMul(x, -N);
    }
}
