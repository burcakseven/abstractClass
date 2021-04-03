
public class ApplicationMain {
	
	
	public static void main(String[] args) {
		
		Kedi kedi = new Kedi("Saglıklı",2,"boncuk");
		
		Kedi kedi2 = new Kedi("Saglıklı",2,"duman");
		
		Kopek kopek = new Kopek("Saglıksız", 1, "bobi");
		
		Kus kus = new Kus("Sağlıklı", 1, "tavuk");
	
		
		
		System.out.println("test");
		
		Veteriner veteriner = new Veteriner();
		
		veteriner.hayvaniIncele(kus);
		
		
		
	}

}
