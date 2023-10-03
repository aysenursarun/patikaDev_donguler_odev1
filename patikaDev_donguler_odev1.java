package patikaDev_donguler_odev1;

import java.util.Scanner;

public class patikaDev_donguler_odev1 {

	public static void main(String[] args) {

		// Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul
		// eden
		// ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana
		// basan programı yazıyoruz.

		Scanner scan = new Scanner(System.in);
		int toplam = 0, sayi;

		do {
			System.out.print("Sayı girin: ");
			sayi = scan.nextInt();

			if (sayi % 4 == 0) {
				toplam += sayi;
			}

		} while (sayi % 2 == 0);

		System.out.println(toplam);
	}

}
