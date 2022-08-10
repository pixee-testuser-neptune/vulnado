package com.scalesec.vulnado;
import io.pixee.security.BoundedLineReader;
import io.pixee.security.SystemCommand;

import java.util.Random;
import java.io.BufferedReader;

public class TestFile {
  
  public void foo(BufferedReader reader) {
    String a = BoundedLineReader.readLine(reader, 1000000);
    String b = "" + new java.security.SecureRandom().nextInt();
	String c = a  + b;
    SystemCommand.runCommand(Runtime.getRuntime(), c);
  }
}
