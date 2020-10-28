package parallelogram.test;

import junit.framework.TestCase;
import static parallelogram.Parallelogram.Type.*;

public class TestSuite extends TestCase {

   public void test01() {
        assertEquals (parallelogram.Parallelogram.classify(0,1,1.0), INVALID);
   }
   public void test02() {
        assertEquals (parallelogram.Parallelogram.classify(1,1,3.0), INVALID);
   }
   public void test03() {
        assertEquals (parallelogram.Parallelogram.classify(1,0,-6.0), INVALID);
   }
   public void test04() {
        assertEquals (parallelogram.Parallelogram.classify(1,1,0.0), INVALID);
   }
   public void test05() {
        assertEquals (parallelogram.Parallelogram.classify(8,8,8.0), RHOMBUS);
   }
   public void test06() {
        assertEquals (parallelogram.Parallelogram.classify(1,1088,15.0), INVALID);
   }
   public void test07() {
        assertEquals (parallelogram.Parallelogram.classify(1,2,450.0), INVALID);
   }
   public void test08() {
        assertEquals (parallelogram.Parallelogram.classify(4,3,5.0), RECTANGLE);
   }
   public void test09() {
        assertEquals (parallelogram.Parallelogram.classify(1187,1146,1.0), INVALID);
   }
   public void test10() {
     assertEquals (parallelogram.Parallelogram.classify(0,0,0.0), INVALID);
   }
   public void test11() {
        assertEquals (parallelogram.Parallelogram.classify(784,784,1956.0), INVALID);
   }
   public void test12() {
        assertEquals (parallelogram.Parallelogram.classify(1,450,1.0), INVALID);
   }
   public void test13() {
        assertEquals (parallelogram.Parallelogram.classify(4,6,5.0), PARALLELOGRAM);
   }
   public void test14() {
        assertEquals (parallelogram.Parallelogram.classify(100,100,5.0), RHOMBUS);
   }
   public void test15() {
        assertEquals (parallelogram.Parallelogram.classify(-1,1,1.0), INVALID);
   }
   public void test16() {
        assertEquals (parallelogram.Parallelogram.classify(1,-1,1.0), INVALID);
   }
   public void test17() {
        assertEquals (parallelogram.Parallelogram.classify(1,2,3.0), INVALID);
   }
   public void test18() {
        assertEquals (parallelogram.Parallelogram.classify(2,3,1.0), INVALID);
   }
   public void test19() {
        assertEquals (parallelogram.Parallelogram.classify(3,1,2.0), INVALID);
   }
   public void test20() {
        assertEquals (parallelogram.Parallelogram.classify(1,1,2.0), INVALID);
   }
   public void test21() {
        assertEquals (parallelogram.Parallelogram.classify(2,1,1.0), INVALID);
   }
   public void test22() {
        assertEquals (parallelogram.Parallelogram.classify(1,1,1.0), RHOMBUS);
   }
   public void test24() {
        assertEquals (parallelogram.Parallelogram.classify(1,1,1.5), RHOMBUS);
   }
   public void test25() {
        assertEquals (parallelogram.Parallelogram.classify(1,0,1.0), INVALID);
   }
   public void test26() {
        assertEquals (parallelogram.Parallelogram.classify(8,6,10.0), RECTANGLE);
   }
   public void test27() {
        assertEquals (parallelogram.Parallelogram.classify(8,6,9.0), PARALLELOGRAM);
   }
}
