package com.scalesec.vulnado;

import java.util.Random;
import java.io.BufferedReader;

public class TestFile {
  
  public void foo(BufferedReader reader) {
    String a = reader.readLine();
    String b = reader.readLine() + new Random().nextInt();
	String c = a  + b;
    Runtime.getRuntime().exec(c);
  }
}
