package Praktikum5;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String nama, warna;
		int berat;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Masukan Nama Kucing Kamu : ");
		nama = input.next();
		
		System.out.println("Masukan Warna Kucing Kamu : ");
		warna = input.next();
		
		System.out.println("Masukan Berat Kucing Kamu : ");
		berat = input.nextInt();
		
		Cat kucingsaya = new Cat();
		kucingsaya.identitas(nama, warna, berat);
		System.out.println(kucingsaya.ambilNama()+" Si Kucing," 
		+ " Warnanya " +kucingsaya.ambilwarna() 
		+ " Beratnya " +kucingsaya.ambilBerat() + " Kg");
		
		kucingsaya.eat();
		
	}
}
