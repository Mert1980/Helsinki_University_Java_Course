
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mertdemirok
 */
public class Hand implements Comparable<Hand> {

    private ArrayList<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void sort() {
        Collections.sort(cards);
    }

    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }

    public void print() {
        cards.stream().forEach(card -> System.out.println(card));
    }

    @Override
    public int compareTo(Hand hand) {
        return this.cards.stream()
                .mapToInt(card -> card.getValue())
                .reduce(0, (preSum, value) -> preSum + value)
                - hand.cards.stream()
                        .mapToInt(card -> card.getValue())
                        .reduce(0, (preSum, value) -> preSum + value);
    }

}
