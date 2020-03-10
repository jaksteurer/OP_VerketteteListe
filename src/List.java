
public class List {
	Elem head;
	
	public List(int i) {
		head = new Elem(i);
	}
	
	public void elemhinzuf�gen(int z) {
		Elem neuesElem = new Elem(z);
		neuesElem.address = head;
		head = neuesElem;
	}
	
	public void listenl�nge() {
		int l=0;
		Elem aktuellerHead = head;
		while(aktuellerHead != null) {
			l++;
			aktuellerHead = aktuellerHead.address;
		}
		System.out.println("Listenl�nge: "+l);
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
		element1.elemhinzuf�gen(5);
		element1.listeAusgeben();
		element2.listeAusgeben();
		element1.listenl�nge();
		element2.listenl�nge();
	}

}
