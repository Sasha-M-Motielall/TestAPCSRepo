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

    public static String arrayDeepToString (int[][] arr) {
     String conv = "";
     if (arr.length == 0) {
       return "{}";
     }
     for (int i=0; i < arr.length-1; i++) {
       conv += arrToString(arr[i]) + ", ";
     }
     conv = "{" + conv + arrToString(arr[arr.length-1]) + "}";
     return conv;
   }

   public static int[][] create2DArray (int rows, int cols, int maxValue) {
     int[][] arr = new int[rows][cols];
     for (int i=0; i<arr.length;i++) {
       for (int j=0; j<arr[i].length;j++) {
         arr[i][j] = (int)(Math.random() * (maxValue+1));
       }
     }
     return arr;
   }
}
