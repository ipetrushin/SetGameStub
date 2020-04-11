package com.example.setgamestub;

import java.util.ArrayList;

public class CardField {
    ArrayList<Card> cards;
    ArrayList<Card> selectedCards;
    public Card cardTouched(float x, float y) {
        return  null;
    }
    public boolean isSelectedAreSet () {
        if (selectedCards == null || selectedCards.size() != 3) {
            return false;
        }
        return false;
    }
}
