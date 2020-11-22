public class Demo{
  public static void main(String args[]){
    for(int i=1;i<=5;i++){
      for(int j=1;j<=6-i;j++){
        System.out.print(i);
      }
      System.out.println();
    }
  }

  public static String arrToString(int[] arr) {
      String convert = "";
      for (int i=0; i<arr.length;i++) {
        String a = "";
        a = + arr[i] + "";
        if (i != arr.length-1) {
          convert += a;
          convert += ", ";
        }
        else {
          convert += a;
        }
      }
      convert = "{" + convert + "}";
      return (convert);
    }

}
