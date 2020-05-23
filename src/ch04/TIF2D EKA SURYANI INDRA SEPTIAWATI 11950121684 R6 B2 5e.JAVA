package ch04;

public class e {
  public static void main(String[] args){
      //perhatikan Array berikut : {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3}

      int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3 };

      //Tampilkan Angka yang memiliki angka 2

      for (int i = 0; i < arrayAngka.length; i++) {
          if (String.valueOf(arrayAngka[i]).contains("2")){
              System.out.print( arrayAngka[i] + ",");
          }
      }
  }
}
