/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hung.util;

/**
 *
 * @author Admin
 */
//day la class chua cac ham tinh toan, toan hoc, dung chung, lam tien ich
//cho cac noi khac su dung. Pham cai gi ma mang tinh chat xau chung . ta dung ki thuat STATIC
public class MathUtil {

    //ham tinh n!=1.2.3...n
    //vi gia tri giai thua tang cuc manh, nen se tran vung int rat som
    //do int chi toi da 2 ty 1, nen ta xai long thi moi chua dc n lon, nhung cung chi co 15!.
    public static long computeFactorial(int n) {
        if (n < 0 || n > 15) {
            throw new IllegalArgumentException("Invalid argument. n must be >=0 and <=15");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * computeFactorial(n - 1);
    }
}
