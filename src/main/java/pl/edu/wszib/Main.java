package pl.edu.wszib;

import java.math.BigInteger;
import jdk.swing.interop.DragSourceContextWrapper;

public class Main {
  public static void main(String[] args) {

      byte b = 1;
      short s = 1;
      int i = 1;
      long l = 1L;
      float f = 1f;

      int i_too_long = 2147483646;

      BigInteger first = BigInteger.valueOf(129310231023L);
      BigInteger second = BigInteger.TEN;

      BigInteger sum = first.add(second);

      System.out.println(sum);

      Punkt punkt =  new Punkt(10,100);

      System.out.println("Punkt x: " + punkt.x + "\n" + "Punkt y: " + punkt.y);

      System.out.println("Changing directions of each value by 10 \n");
      punkt.zmienPolozenieX(10);

      punkt.zmienPolozenieY(10);
      punkt.zmienPolozenieZ(10);

      System.out.println("Punkt x: " + punkt.x + "\n" + "Punkt y: " + punkt.y
      + "\n" +  "Nowy punkt z: " + punkt.z);



  }
}
