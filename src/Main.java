public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    exampleMethod(1, "Example String", 3.14, true, 'c', 123456789012345L, 2.718f, (byte) 127);
  }

  public static void exampleMethod(int param1, String param2, double param3, boolean param4,
                                   char param5, long param6, float param7, byte param8) {
        // This is the method body. You can add your logic here.
        System.out.println("Integer parameter: " + param1);
        System.out.println("String parameter: " + param2);
        System.out.println("Double parameter: " + param3);
        System.out.println("Boolean parameter: " + param4);
        System.out.println("Character parameter: " + param5);
        System.out.println("Long parameter: " + param6);
        System.out.println("Float parameter: " + param7);
        System.out.println("Byte parameter: " + param8);
    }
}