package com.blz.day11_12;

public class DeckOfCards {

	public static void main(String[] args) {
		String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		String[] deck = new String[52];

		for (int i = 0; i < deck.length; i++) {
			deck[i] = rank[i % 13] + suit[i / 13];
		//		System.out.println(i);
		//		System.out.println(deck[i]);
		}

//			Shuffle the Cards using Math.random 

		for (int i = 0; i < 9; i++) {
			int index = (int) (Math.random() * deck.length);

			String temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
//			Distribute 9 cards to 4 players
		for (int i = 0; i < 4; i++) {
			System.out.println("** Person " + (i + 1) + " **");
			for (int j = 0; j < 9; j++) {
				System.out.println(deck[i + j * 4]);
			}
		}

	}

}
