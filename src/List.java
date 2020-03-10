
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

	public static void main(String[] args) {
		
		List element1 = new List(3);
		List element2 = new List(4);
		element1.elemhinzufügen(5);
		element1.listeAusgeben();
		element2.listeAusgeben();
		element1.listenlänge();
		element2.listenlänge();
	}

}
