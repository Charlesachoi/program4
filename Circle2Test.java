
/***
* Example JUnit testing class for Circle2 (and Circle)
*
* - must have your classpath set to include the JUnit jarfiles
* - to run the test do:
*     java org.junit.runner.JUnitCore Circle2Test
* - note that the commented out main is another way to run tests
* - note that normally you would not have print statements in
*   a JUnit testing class; they are here just so you see what is
*   happening. You should not have them in your test cases.
***/

import org.junit.*;

public class Circle2Test
{
   // Data you need for each test case
   private Circle2 circle1, circle2, circle3;

// 
// Stuff you want to do before each test case
//
@Before
public void setup()
{
   System.out.println("\nTest starting...");
   circle1 = new Circle2(1,2,3);
}

//
// Stuff you want to do after each test case
//
@After
public void teardown()
{
   System.out.println("\nTest finished.");
}

//
// Test a simple positive move
//
@Test
public void simpleMove()
{
   Point p;
   System.out.println("\nRunning test simpleMove.");
   p = circle1.moveBy(1,1);
   Assert.assertTrue(p.x == 3 && p.y == 2);
}

// 
// Test a simple negative move
//
@Test
public void simpleMoveNeg()
{
   Point p;
   System.out.println("\nRunning test simpleMoveNeg.");
   p = circle1.moveBy(-1,-1);
   Assert.assertTrue(p.x == 1 && p.y == 0);
}

// 
// Test a size change
//
@Test
public void changeSize()
{
   double rad;
   System.out.println("\nRunning test changeSize.");
   rad = circle1.scale(2.0);
   Assert.assertTrue(rad == 6.0);
}

// 
// Test a intersection
//
@Test
public void intersection()
{
   boolean intest;
   circle2 = new Circle2(1,2,3);
   System.out.println("\nRunning test intersection.");
   intest = circle1.intersects(circle2);
   Assert.assertTrue(intest == true);
}

// 
// Test a intersection
//
@Test
public void intersection2()
{
   boolean intest;
   circle2 = new Circle2(2,0,1);
   circle3 = new Circle2(6,0,2);
   System.out.println("\nRunning test intersection.");
   intest = circle2.intersects(circle3);
   Assert.assertTrue(intest == false);
}

/**
public static void main(String args[])
{
   try {
      org.junit.runner.JUnitCore.runClasses(
               java.lang.Class.forName("Circle1Test"));
   } catch (Exception e) {
      System.out.println("Exception: " + e);
   }
}
**/
}

