package Cards;

public class Card {
private int num;
private String color;

//ctor
public Card(int num , String color)
{
	this.color = color;
	this.num = num;
}

//copy ctor
public Card (Card other)
{
	this.color = other.color;
	this.num = other.num;
}


// methodology
public int getNum() {
	return num;
}

public void setNum(int num) {
	this.num = num;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

//overwriting
public String toString() {
	return "color: " + this.color + ", number: " +  this.num + "\n";
}

//in: Card obj.
//out: bool sameColor
public boolean sameColor(Card other) {
	if(other.getColor().equals(this.color))
		return true;
	return false;
}

//in: Card obj
//out: color of biggest num
public String highNum(Card other) {
	if(other.getNum() > this.num)
		return other.getColor();
	else
		return this.color;
}







}
