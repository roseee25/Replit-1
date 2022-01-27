package _00Replit;

import java.util.Scanner;

public class _00AtmIslemi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("*** ATM'ye hos geldiniz***");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner (System.in);
		
		String islem="1.islem : Bakiye Sorma\n"
				+ "2.islem : Para Cekme\n3.islem : Para Yatirma\n"
				+ "4.islem :Cıkıs";
		System.out.println(islem);		
		
		System.out.println("Yapmak istediginiz islemi seciniz");
		
		int bakiye=5000;
		
		String secilenIslem=scan.nextLine();
		
		switch (secilenIslem) {
		case "1": 
			System.out.println("Bakiyeniz : "+bakiye);
			break;
		case "2": 
			System.out.println("Cekeceginiz miktari giriniz");
			int cekilecekMiktar=scan.nextInt();
			if (cekilecekMiktar<=bakiye) {
				bakiye-=cekilecekMiktar;
				System.out.println("yeni hesap bakiyeniz"+bakiye);
			}else {
				System.out.println("yetersiz bakiye");
			}
			
			break;
		case "3": 
			System.out.println("Yatirilacak miktari giriniz");
			int yatirilacakMiktar=scan.nextInt();
				bakiye+=yatirilacakMiktar;
				System.out.println("yeni hesap bakiyeniz");
			
			
		default:
			System.out.println("Hatali secim yaptiniz");
			break;
		}
		
		
		
	}

}
