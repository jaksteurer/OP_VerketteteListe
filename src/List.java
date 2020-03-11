
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
	
	public void eleml�schen(int i) {
		Elem el = head;
		while(el.address != null && el.zahl != 0) {
			el.address = null;
		}
	}

	public static void main(String[] args) {
		
		List liste1 = new List(3);
		List liste2 = new List(4);
		//weiteres Element hinzuf�gen
		liste1.elemhinzuf�gen(5);
		System.out.println("Listen ausgeben:");
		liste1.listeAusgeben();
		liste2.listeAusgeben();
		System.out.println("l�nge der Liste ausgeben:");
		liste1.listenl�nge();
		liste2.listenl�nge();
		System.out.println("Element l�schen und l�nge anschlie�end wieder ausgeben:");
		liste1.eleml�schen(5);
		liste1.listenl�nge();
	}

}
