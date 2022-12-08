
public class Cart {
	
	public static final int MAX_NUMBER_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private int qtyOrdered;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBER_ORDERED) {
			itemsOrdered[qtyOrdered] = disc;
			System.out.println("The disc has been added");
			qtyOrdered++;
		}
		else {
			System.out.println("The cart is almost full");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
		for (int i = 0; i < dvdList.length; i++) {
			this.addDigitalVideoDisc(dvdList[i]);
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		this.addDigitalVideoDisc(dvd1);
		this.addDigitalVideoDisc(dvd2);
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].equals(disc)) {
				itemsOrdered[i] = null;
				qtyOrdered--;
				System.out.println("The disc has been removed");
			}
		}
		
	}
	public float totalCost() {
		float sum = 0f;
		for (int i = 0; i < qtyOrdered; i++) {
			sum += itemsOrdered[i].getCost();
		}
		return sum;
	}
	
	/*public void printCart() {
		for (int i = 0; i < qtyOrdered; i++) {
			System.out.println(itemsOrdered[i].getId());
		}
	}*/
	
}
