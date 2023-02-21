package class28.Assignment;

import java.util.Iterator;
import java.util.LinkedList;

public class Card {
    double interestRate;
    String cardType;

    Card(double interestRate, String cardType) {
        this.interestRate = interestRate;
        this.cardType = cardType;
    }
    public void interest() {
        System.out.println("Credit card has interest");
    }
    public void cardType() {
        System.out.println("What is your card type");
    }


    public static void main(String[] args) {

        Card visa=new Card(0.125,"Visa");
        Card master=new Card(0.14,"Master");
        Card amex=new Card(0.16,"American Express");

        LinkedList<Card> cards=new LinkedList<>();
        cards.add(visa);
        cards.add(master);
        cards.add(amex);

        for(int i=0;i< cards.size();i++){
            Card card=cards.get(i);
            card.cardType();
            card.interest();
        }

        for(Card c:cards){
            c.interest();
            c.cardType();
        }

        Iterator<Card> iterator=cards.iterator();
        while(iterator.hasNext()){
            Card c=iterator.next();
            c.cardType();
            c.interest();

        }
    }
}
