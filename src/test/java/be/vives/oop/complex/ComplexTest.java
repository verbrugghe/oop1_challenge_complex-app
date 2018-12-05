package be.vives.oop.complex;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for class Complex
 */
public class ComplexTest {
  // Delta to compare floating point values
  private final double delta = 0.001;

  @Test
  public void testDefaultConstructor() {
    Complex number = new Complex();

    assertEquals(0, number.getReal(), delta);
    assertEquals(0, number.getImaginary(), delta);
  }

  @Test
  public void testRealSetter() {
    double value = 15.33;
    
    Complex number = new Complex();
    number.setReal(value);

    assertEquals(value, number.getReal(), delta);
  }

  @Test
  public void testImaginarySetter() {
    double value = 15.33;
    
    Complex number = new Complex();
    number.setImaginary(value);

    assertEquals(value, number.getImaginary(), delta);
  }
}
