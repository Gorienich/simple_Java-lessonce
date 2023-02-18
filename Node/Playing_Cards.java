package Cards;

public class Playing_Cards {
private Card [] cards;
private String manufacturer;


//ctor 
//in: arr of cards, manufacturer
public Playing_Cards(Card [] arr, String name) {
	this.cards = new Card [54];
	this.manufacturer = name;
	
	for(int i=0; i<arr.length; i++)
		this.cards[i] = arr[i];	
}

public Card[] getCards() {
	return cards;
}


public String getManufacturer() {
	return manufacturer;
}

//overwriting
public String toString() {
	String st = this.manufacturer + ": \n";
	for(int i =0; i< this.cards.length; i++)
			st += this.cards[i].toString();
	return st;
}

//out: counters of red and blue cards
public void getCounts() {
	int countBlue =0;
	int countRed =0;
	
	for(int i=0; i<this.cards.length; i++) {
		if(this.cards[i].getColor().equals("blue"))  // only two colors
			countBlue++;
		else
			countRed++;
	}
	
	System.out.println("blue: " + countBlue + ", red: " + countRed + "\n");
}


}
