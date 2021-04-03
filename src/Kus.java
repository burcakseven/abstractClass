
public class Kus implements Hayvan {

	private String hastalik;
	private int yas;
	private String ismi;

	
	public Kus(String hastalik, int yas, String ismi) {
		this.hastalik = hastalik;
		this.yas = yas;
		this.ismi = ismi;
	}

	@Override
	public void hastalikDurumu() {
		System.out.println("Hastalık durumu : "+  this.hastalik);
	}

	@Override
	public void yasi() {
		System.out.println(" Kuşun yaşı : " + this.yas);
		
	}

	@Override
	public void ismi() {
		System.out.println("Kuşun ismi : "+ this.ismi);
		
	}
	
	public void uc() {
		System.out.println("ucuyor");
	}

}
