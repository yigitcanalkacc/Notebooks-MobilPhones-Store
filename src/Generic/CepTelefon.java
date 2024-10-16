package Generic;

public class CepTelefon extends Urun {
	
	private String Renk;
	
	private int pilgucu;

	public CepTelefon(int id, String name, int fiyat, String marka, int depolama, double ekranboyutu, int ram,
			int stok, String renk, int pilgucu) {
		super(id, name, fiyat, marka, depolama, ekranboyutu, ram, stok);
		this.Renk = renk;
		this.pilgucu = pilgucu;
	}

	public String getRenk() {
		return Renk;
	}

	public void setRenk(String renk) {
		Renk = renk;
	}

	public int getPilgucu() {
		return pilgucu;
	}

	public void setPilgucu(int pilgucu) {
		this.pilgucu = pilgucu;
	}
	
	
	
	
	
}
