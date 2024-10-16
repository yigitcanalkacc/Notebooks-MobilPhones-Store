package Generic;

import java.util.ArrayList;
import java.util.List;

public class Urun {
	
	private List <Urun> urunler;
	
	
	private int id;
	private String name;
	private int fiyat;
	private String marka;
	private int depolama;
	private double ekranboyutu;
	private int ram;
	private int stok;

	
	public Urun () {
		this.urunler = new ArrayList<>();
	}
	
	
	public Urun(int id, String name, int fiyat, String marka, int depolama, double ekranboyutu, int ram, int stok) {
		this.id = id;
		this.name = name;
		this.fiyat = fiyat;
		this.marka = marka;
		this.depolama = depolama;
		this.ekranboyutu = ekranboyutu;
		this.ram = ram;
		this.stok = stok;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public int getFiyat() {
		return fiyat;
	}


	public String getMarka() {
		return marka;
	}


	public int getDepolama() {
		return depolama;
	}



	public double getEkranboyutu() {
		return ekranboyutu;
	}


	public int getRam() {
		return ram;
	}



	public int getStok() {
		return stok;
	}


	 public void urunEkle(Urun urun) {
	        urunler.add(urun);
	    }
	
	
	 public void printCepTelefonları() {
		    System.out.println("\nCep Telefonu Listesi:");
		    System.out.println("------------------------------------------------");
		    System.out.printf("| %-2s | %-30s | %-9s | %-8s | %-8s | %-7s | %-5s |\n", 
		                      "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "RAM");
		    System.out.println("------------------------------------------------");

		    for (Urun urun : urunler) {
		        if (urun instanceof CepTelefon) {
		            CepTelefon cepTelefon = (CepTelefon) urun;
		            System.out.printf("| %-2d | %-30s | %-9d TL | %-8s | %-8d | %-7.1f | %-5d |\n", 
		                              cepTelefon.getId(), cepTelefon.getName(), 
		                              cepTelefon.getFiyat(), cepTelefon.getMarka(), 
		                              cepTelefon.getDepolama(), 
		                              cepTelefon.getEkranboyutu(), cepTelefon.getRam());
		        }
		    }
		    System.out.println("------------------------------------------------");
		}
	 
	 
	 
	 public void printNotebooks() {
		    System.out.println("\nNotebook Listesi:");
		    System.out.println("------------------------------------------------");
		    System.out.printf("| %-2s | %-30s | %-9s | %-10s | %-9s | %-7s | %-9s |\n", 
		                      "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "RAM");
		    System.out.println("------------------------------------------------");

		    for (Urun urun : urunler) {
		        if (urun instanceof Notebook) {
		            Notebook notebook = (Notebook) urun;
		            System.out.printf("| %-2d | %-30s | %-9d TL | %-10s | %-9d | %-7.1f | %-9d |\n", 
		                              notebook.getId(), notebook.getName(), 
		                              notebook.getFiyat(), notebook.getMarka(), 
		                              notebook.getDepolama(), notebook.getEkranboyutu(), 
		                              notebook.getRam());
		        }
		    }
		    System.out.println("------------------------------------------------");
		}
	 
}


	
	
	
	
	
	
	

