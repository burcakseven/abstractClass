
public class Veteriner {

	public void hayvaniIncele(Hayvan hayvan) {

		if (hayvan instanceof Kus) {
			Kus kus = (Kus) hayvan;
			kus.uc();
		} else if (hayvan instanceof Kedi) {

			Kedi kedi = (Kedi) hayvan;

			kedi.miyavla();

		}

		hayvan.ismi();

		hayvan.yasi();

		hayvan.hastalikDurumu();

	}

}
