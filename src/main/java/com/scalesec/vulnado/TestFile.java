package com.scalesec.vulnado;

import java.util.Random;

public class TestFile {
  
  public void foo() {
    String a = "" + new Random().nextInt();
    Runtime.exec(a);
  }
}
