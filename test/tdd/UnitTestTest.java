/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import static hung.util.MathUtil.computeFactorial;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hung Nguyen
 */
public class UnitTestTest {

    @Test(expected = IllegalArgumentException.class)
    public void testFailedCases() {
        //ham nay dung de test cac tinh huong sai cua nguoi dung
        //vi du nguoi dung muon nhap -5! thi ko tinh duoc
        //khi do trong thiet ke ham cF() ta phai du lieu tinh huong nay
        //tuc la nguoi dung dua du lieu sai -> phai nem ra exception
        //va ngoai le la 1 thu bat thuong, ko nhu du tinh, ko phai 1 loai value co the so sanh, tuc la ko the assertEquals(mot-cai-ngoai-le)
        //vi assert() trong tieng anh nghi la so sanh 2 thu gi do
        //tuc la phai co value de so sanh, ma ngoai le (Exception) thif ko phai la value
        //ta phai dung

        computeFactorial(-5);
    }
    //du code ban viet co do hay xanh ko bi loi cu phap khi go, loi import
    //thi CLEAN & BUILD LUON RA FILE .JAR .WAR
    //li do la Clean & Build chi kiem tra code ko sai cu phap
    //no ko care code co sai logic xu li hay ko
    
    //MINH CHOI LON:
    //NEU CODE DANG MAU DO, KO PHAI MAU XANH, CAM CLEAN & BUILD DE DAM BAO RANG
    //CODE PHAI CHAY DUNG (MAU XANH) CHO CAC TINH HUONG XAI THU QUA ASSERT()
    //TUC LA DUNG XU LY THI MOI CHO RA FILE .JAR .WAR
    //TUC LA DEN XANH THI THONG DUONG
    //DO, KO CHO RA .JAR .WAR
    //PLEASE, NHO 2 CON SO
    //NETBEAN 8X, 1005
    //NETBEANS 10X TRO LEN, 1204s
    
    

    @Test
    public void testSuccessfulCases() {
        assertEquals(120, computeFactorial(5));

        assertEquals(720, computeFactorial(6));
    }

}
