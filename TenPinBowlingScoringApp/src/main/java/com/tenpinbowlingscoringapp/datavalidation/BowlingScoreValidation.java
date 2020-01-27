package com.tenpinbowlingscoringapp.datavalidation;

import java.util.List;

import com.tenpinbowlingscoringapp.entity.Player;

public class BowlingScoreValidation implements Validation {

	@Override
	public String Validate(Object object) {
		List<Player> players = (List<Player>) object;
		String errorMessage = "";
		if (players.get(0).getName() == null || players.get(0).getName() == "") {
			errorMessage = "Player's name, incorrect";
		} else if (players.size() < 11 || players.size() > 21) {
			errorMessage = "Total pinfalls for the player" + players.get(0).getName() + ", incorrect";
		} else {
			for (Player auxiliaryPlayer : players) {
				if (auxiliaryPlayer.getFrames() == null) {
					errorMessage = "Incorrect line";
				} else {
					String firstPinfallCurrentFrames = auxiliaryPlayer.getFrames().get(0).getFirstPinfall();
					if (Character.isDigit(firstPinfallCurrentFrames.charAt(0))
							|| firstPinfallCurrentFrames.toUpperCase() == "F") {
						if (Character.isDigit(firstPinfallCurrentFrames.charAt(0))) {
							try {
								int value = Integer.parseInt(firstPinfallCurrentFrames);
								if (value < 0 || value > 10) {
									errorMessage = "The value" + firstPinfallCurrentFrames + "to pinfall, incorrect";
									break;
								}
							} catch (Exception e) {
								errorMessage = "The value" + firstPinfallCurrentFrames + "to pinfall, incorrect";
								break;
							}
						}
					} else {
						errorMessage = "The value" + firstPinfallCurrentFrames + "to pinfall, incorrect";
						break;
					}
				}
			}
		}
		return errorMessage;
	}

}
