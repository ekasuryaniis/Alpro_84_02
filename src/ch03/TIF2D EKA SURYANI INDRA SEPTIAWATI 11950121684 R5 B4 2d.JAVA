import java.util.Scanner;

package ch03;
public class MenentukanBilanganPrima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka yang akan dicek");
        int angka = input.nextInt();
        int temp;
        boolean prima = true;
        //Penggunaan for loop
        for(int pembagi = 2; pembagi <= angka / 2; pembagi++){
            temp = angka % pembagi;
            if(temp == 0){
                prima = false;
                break;
            }
        }
/*
Jika prima adalah true dan angka yang diberikan bukanlah 0 dan 1
 */
if(prima && ((angka > 0)&&(angka != 1)))
    System.out.println(angka + " Bilangan prima");
else
    System.out.println(angka + " Bukan bilangan prima");
    }
}