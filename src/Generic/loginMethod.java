package Generic;

import java.util.List;
import java.util.Scanner;



public class loginMethod {
	
	Urun urun;
	Scanner scanner = new Scanner(System.in);

	
	public void run () {
		
		this.urun = new Urun();
		
		urun.urunEkle(new CepTelefon(1, "iPhone 14 64 GB", 15000, "Apple", 64, 5.5, 8, 12, "Siyah", 5800));
		urun.urunEkle(new CepTelefon(2, "SAMSUNG GALAXY A51", 3199, "Samsung", 128, 5.5, 8, 12, "Siyah", 5800));
		urun.urunEkle(new CepTelefon(3, "Redmi Note 10 Pro 8GB", 5199, "Xiaomi", 128, 5.5, 8, 12, "Siyah", 5800));
		
		urun.urunEkle(new Notebook(1, "HUAWEI Matebook 14", 7000, "Huawei", 512, 5.0, 4, 20));
		urun.urunEkle(new Notebook(2, "Macbook Pro", 5000, "Apple", 128, 5.5, 16, 25));
		urun.urunEkle(new Notebook(2, "ASUS Tuf Gaming", 8200, "Asus", 256, 5.5, 16, 25));
		
		System.out.println("	Yiğit Store Ürün Yönetim Paneli !");
		System.out.println("		Hoşgeldiniz.");
		System.out.println("----------------------------------------");
		System.out.println(" 1- Notebook İşlemleri");
		System.out.println(" 2- Cep Telefonu İşlemleri");
		System.out.println(" 3- Marka Listele");
		System.out.println(" 4- Çıkış");
		System.out.println("-----------------------------");
		System.out.print("Seçiminiz = ");
		
		int sec = scanner.nextInt();
		
		switch (sec) {
			case 1:
				urun.printNotebooks();
				run();
				break;
			case 2:
				
				urun.printCepTelefonları();
				run();
				break;
			case 3:
				
				System.out.println("Markalarımız");
				System.out.println("---------------");
				
		        List<String> markalar = Markalar.getMarkalar();
                for (String marka : markalar) {
                    System.out.println(marka);
                }
                
                System.out.println("---------------");
                run();
				
				
				break;
			case 4:
				System.out.println("Çıkış Yapıldı.");
				 
				break;
		
		}
		
	}

}
