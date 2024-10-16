package Generic;

import java.util.ArrayList;
import java.util.List;

public class Markalar {
	
	
	private int id ;
	private String name;
	
	public Markalar(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	 public static List<String> getMarkalar() {
		 List<String> markalar = new ArrayList<>();
			markalar.add("Apple");
			markalar.add("Asus");
			markalar.add("Casper");
			markalar.add("HP");
			markalar.add("Huawei");
			markalar.add("Lenovo");
			markalar.add("Monster");
			markalar.add("Samsung");
			markalar.add("Xiaomi");
			
			return markalar;

		}
	

}
