package com.stramor.ex2;

import java.math.BigInteger;
import java.util.ArrayList;

class Apple {
  private static long counter;
  private final long id = counter++;

  public long id() {
    return id;
  }
}

class Orange {
}

class GrannySmith extends Apple {
}

public class Example1 {
  protected static ArrayList table = new ArrayList();

  static {
    table.add(BigInteger.valueOf(1));
  }

  @SuppressWarnings("unchecked")

  public static void main(String[] args) {
    for (int i = 0; i <= 50; i++)
      System.out.println(i + "! = " + factorial1(i));

  }

  public static synchronized BigInteger factorial1(int x) {
    if (x < 0) throw new IllegalArgumentException("x must be >=0");
    for (int size = table.size(); size <= x; size++) {
      BigInteger lastfact = (BigInteger) table.get(size - 1);
      BigInteger nextfact = lastfact.multiply(BigInteger.valueOf(size));
      table.add(nextfact);
    }
    return (BigInteger) table.get(x);
  }
}


