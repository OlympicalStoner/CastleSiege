package main.othershit;

import java.util.LinkedList;
import java.util.Random;

public class Deck {
    private LinkedList<Card> cards;

    public void shuffle(){
        Random srand = new Random();
        for(int i = 0; i < this.cards.size() * 2; ++i ) {
            Card storage = this.cards.get(i);
            this.cards.remove(i);
            this.cards.add(srand.nextInt(this.cards.size() - 1), storage);
        }
    }

    public Card drawCard(){
        Card card = this.cards.getFirst();
        this.cards.remove(this.cards.getFirst());
        return card;
    }

    public Card seeCard(int entry){
        return this.cards.get(entry);
    }

    public Deck(LinkedList<Card> cards) {
        this.cards = cards;
    }
}
