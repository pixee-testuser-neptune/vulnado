import io.pixee.security.SystemCommand;

public class TestFile {
  
  public void foo(BufferedReader reader) {
    String a = reader.readLine();
    String b = reader.readLine() + new java.security.SecureRandom().nextInt();
	  String c = a  + b;
    SystemCommand.runCommand(Runtime.getRuntime(), c);
  }
}
