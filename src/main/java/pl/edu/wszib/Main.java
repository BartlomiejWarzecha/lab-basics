package pl.edu.wszib;

import java.math.BigInteger;

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
  }
}
