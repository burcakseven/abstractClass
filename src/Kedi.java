
public class Kedi implements Hayvan{
	
	private String saglikDurumu;
	
	private int yas;
	
	private String isim;
	

	public Kedi(String saglikDurumu, int yas, String isim) {
		
		this.saglikDurumu = saglikDurumu;
		this.yas = yas;
		this.isim = isim;
	}

	@Override
	public void hastalikDurumu() {
		System.out.printf("Hastalık durumu : %s",this.saglikDurumu);
	}

	@Override
	public void yasi() {
		System.out.printf("yasi : %s",this.yas);
		
	}

	@Override
	public void ismi() {
		System.out.printf("ismi : %s",this.isim);
		
	}
	
	
	public void miyavla() {
		System.out.println("Miyavvv");
	}

	
	
	
}
