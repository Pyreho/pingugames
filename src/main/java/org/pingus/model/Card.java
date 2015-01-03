package org.pingus.model;

/**
 * 
 * @author Alvaro
 *
 */

public class Card {

	private int cardId;
	private int cardNumber;
	private int playedNumber;
	private boolean isJoker;
	private String cardClub;
	private String cardKind;

	public Card(int cardId, int cardNumber, String cardClub, String cardKind) {
		this.cardId = cardId;
		this.cardNumber = cardNumber;
		this.playedNumber = cardNumber;
		this.cardClub = cardClub;
		this.cardKind = cardKind;
		this.isJoker = false;
	}

	public Card(int cardId, int cardNumber, String cardClub, String cardKind,
			boolean isJoker) {
		this.cardId = cardId;
		this.cardNumber = cardNumber;
		this.playedNumber = cardNumber;
		this.cardClub = cardClub;
		this.cardKind = cardKind;
		this.isJoker = isJoker;
	}

	public int addValuesJoker(int cardNumber, String cardClub, String cardKind) {
		if (this.isJoker == true) {
			this.playedNumber = cardNumber;
			this.cardClub = cardClub;
			this.cardKind = cardKind;
			return this.cardId;
		} else {
			return -1;
		}
		
	}

	public int getCardId() {
		return cardId;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public boolean getIsJoker() {
		return isJoker;
	}

	public String getCardClub() {
		return cardClub;
	}

	public String getCardKind() {
		return cardKind;
	}

	public int getPlayedNumber() {
		return playedNumber;
	}

	public void setJoker(boolean isJoker) {
		this.isJoker = isJoker;
	}

}
