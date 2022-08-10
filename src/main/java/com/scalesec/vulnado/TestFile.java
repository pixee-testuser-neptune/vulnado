public class TestFile {
  
  public void foo(BufferedReader reader) {
    String a = reader.readLine();
    String b = "" + new Random().nextInt();
	String c = a  + b;
    Runtime.getRuntime().exec(c);
  }
}
