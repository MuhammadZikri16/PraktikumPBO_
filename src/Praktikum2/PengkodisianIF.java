package Praktikum2;
import java.util.Scanner;

public class PengkodisianIF {
		public static void main(String args[]){
			
//			inisialisasi
			int angka;
			Scanner input = new Scanner(System.in);
//			input user
			System.out.print("Masukan Angka : ");
			angka = input.nextInt();
//			kondisi if
			if(angka > 5) {
				System.out.println("Angka Yang Dimasukan Lebih Dari 5");
			} else {
				System.out.println("Angka Yang Dimasukan Kurang Dari 5");
			}
		}
	}
