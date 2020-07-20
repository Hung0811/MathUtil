/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathUtil;

import static hung.util.MathUtil.computeFactorial;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {

        //5! hy vong may se in ra 120
        System.out.println("5! = " + computeFactorial(5));

        //6! hy vong may se in ra 720
        //thuc te ra ket qua bao nhieu thi phai run moi biet
        // thuc te ket qua ve luc chay app goi la ACTUAL
        System.out.println("6! = " + computeFactorial(6));
        //actual: 720, expected: 720 -> true
        //actual: 100, expected: 720 -> false

        //expected: 1 if cF(0), chay ham cF(0) hy vong nhan ve 1
        //neu ko ve 1, tuc la actual khac expected, ham viet code sai
        System.out.println("0! = " + computeFactorial(0));
        
        System.out.println("1! = " + computeFactorial(1));
        
        //chay F6, nhin ket qua, luan dung sai bang mat tren tung ham sout()
        System.out.println("-5! = " + computeFactorial(-5));
        
        //t ki vong ham cF() phai nem ve ngoai le
        //do ! chi tinh voi 1 2 3 ... -> -5! ko tinh duoc
        //do ta dung sout() nen sai dung cu in ra ket qua, ta phari luan dung sai bang mat
        //-5! = 1, phai nhin ket qua in khi chay -> luan dung sai
        //HOP lI NHUNG NHIN BANG MAT, SO SANH TRONG DAU, DE BI SAI SOT
        
        //co 1 bo thu vien, giup ta test cac ham dung mau sac
        //xanh -> code chay dung ki vong
        //do -> code chay sai ki vong
        //viet them doan code tu so sanh gium giua expected va actual de nen ra mau, minh chi can nhin mau, ko can tu so sanh va ket luan
        //ki thuat nay goi la TDD ket hop voi UnitTesting xai cac thu vien
        // phu tro JUnit, NUnit, TestNG, PHPUnit, CPPUnit, xUnit, MSTest,... 
   }
}
