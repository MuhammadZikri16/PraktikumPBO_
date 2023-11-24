package Praktikum1;
import java.util.Scanner;
public class Latihan {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		String namaDepan, namaBelakang, fullName, npm;
		
		System.out.println("Nama Depan : ");
		namaDepan = input.next();
		System.out.println("Nama Belakang : ");
		namaBelakang = input.next();
		
		fullName = namaDepan + "" +namaBelakang;
		
		System.out.println("NPM : ");
		npm = input.next();
		
		System.out.println("Nama : " +fullName);
		System.out.println("NPM : "+npm +"\n");
		
		
//		insialisasi variable
		int angka1,angka2,hasil;
		
		
//		inisialisasi scanner input
		System.out.println("Masukan Angka 1 : ");
		angka1 = input.nextInt();
		
//		user input
		System.out.println("Masukan Angka 2 : ");
		angka2 = input.nextInt();
		
//		perhitungan hasil
		hasil = angka1 + angka2;
		
//		output
		System.out.println("Hasilnya : "+hasil);
	}

}