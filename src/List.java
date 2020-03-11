
public class List {
	Elem head;
	
	public List(int i) {
		head = new Elem(i);
	}
	
	public void elemhinzufügen(int z) {
		Elem neuesElem = new Elem(z);
		neuesElem.address = head;
		head = neuesElem;
	}
	
	public void listenlänge() {
		int l=0;
		Elem aktuellerHead = head;
		while(aktuellerHead != null) {
			l++;
			aktuellerHead = aktuellerHead.address;
		}
		System.out.println("Listenlänge: "+l);
	}
	
	public void listeAusgeben() {
		Elem aktuellerHead = head;
		while(aktuellerHead != null) {
			System.out.println("Wert: "+aktuellerHead.zahl);
			aktuellerHead = aktuellerHead.address;
		}
	}
	
	public void elemlöschen(int i) {
		Elem el = head;
		while(el.address != null && el.zahl != 0) {
			el.address = null;
		}
	}

	public static void main(String[] args) {
		
		List liste1 = new List(3);
		List liste2 = new List(4);
		//weiteres Element hinzufügen
		liste1.elemhinzufügen(5);
		System.out.println("Listen ausgeben:");
		liste1.listeAusgeben();
		liste2.listeAusgeben();
		System.out.println("länge der Liste ausgeben:");
		liste1.listenlänge();
		liste2.listenlänge();
		System.out.println("Element löschen und länge anschließend wieder ausgeben:");
		liste1.elemlöschen(5);
		liste1.listenlänge();
	}

}
