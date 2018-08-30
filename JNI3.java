import java.util.Scanner;

public class JNI3 {

  // Load the native library JNI3.dll at runtime
  static {
    System.loadLibrary("JNI3");
  }

  /*
    Native method of type character getNum 
    receiving parameter of integer num1 and num2
  */
  private native char[] getNum(int num1, int num2);

  public static void main(String[] args){

    // Input for rows using scannerRow instance
    Scanner scannerRow = new Scanner(System.in);
    System.out.printf("Enter number of rows: ");
    int numRow = scannerRow.nextInt();

    // Input for columns using scannerCol instance
    Scanner scannerCol = new Scanner(System.in);
    System.out.printf("Enter number of columns");
    int numCol = scannerCol.nextInt();

    JNI3 display = new JNI3();
    display.getNum(numRow, numCol);
  }
}

