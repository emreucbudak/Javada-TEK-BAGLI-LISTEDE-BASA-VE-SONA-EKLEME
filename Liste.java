package tekbagli;

public class Liste {
	Bagli head = null;
	Bagli tail = null;
	void basaEkle(int x) {
		Bagli eleman = new Bagli();
		eleman.veri = x;
		if (head == null) {
			System.out.println("Boş Listedeki Tek Eleman Oldu Kanka");
			head = eleman;
			tail = eleman;
			eleman.next = null;
		}
		
		else {
			System.out.println("Başarıyla basa ekledim!");
			eleman.next = head;
			head = eleman;

		}
	}
	void yazdir() {
		if (head==null) {
			System.out.println("Listen Boş Kanka");
		}
		else {
			Bagli ref = head;
			while (ref != null) {
				System.out.println("---------->>>>>" + ref.veri);
				ref = ref.next;
				if (ref == null) {
					break;
				}
			}
		}
	}
	void sonaEkle(int x) {
		Bagli eleman1 = new Bagli();
		eleman1.veri = x;
		tail.next = eleman1;
		tail = eleman1;
		
	}
}
