package Praktikum2;
import java.util.Scanner;

public class PengkondisianSwitch {
	public static void main(String args[]) {
//		inisialisasi
		int angka1,angka2,hasil;
		String perhitungan;
		Scanner input = new Scanner(System.in);
//		input user
		System.out.print("Masukan Angka1 : ");
		angka1 = input.nextInt();
		System.out.print("Masukan Angka2 : ");
		angka2 = input.nextInt();
		System.out.print("List Perhitungan: "
				+ "\n + : pertambahan"
				+ "\n - : pengurangan"
				+ "\n * : perkalian"
				+ "\n / : pembagian"
				+ "\n Masukan Angka perhitungan : ");
		perhitungan = input.next();
//		kondisi SWITCH
		switch(perhitungan) {
		case"+":
			hasil = angka1 + angka2;
			System.out.println("Hasilnya adalah : "+hasil);
			break;
		case"-":
			hasil = angka1 - angka2;
			System.out.println("Hasilnya adalah : "+hasil);
			break;
		case"*":
			hasil = angka1 * angka2;
			System.out.println("Hasilnya adalah : "+hasil);
			break;
		case"/":
			hasil = angka1 / angka2;
			System.out.println("Hasilnya adalah : "+hasil);
			break;
		default:
			System.out.println("Simbol yang dimasukan salah");
		} 
	}

}
