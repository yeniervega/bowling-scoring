package com.tenpinbowlingscoringapp.transformdata;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.tenpinbowlingscoringapp.datavalidation.BowlingScoreValidation;
import com.tenpinbowlingscoringapp.datavalidation.Validation;
import com.tenpinbowlingscoringapp.datavalidation.ValidationContext;
import com.tenpinbowlingscoringapp.entity.Player;
import com.tenpinbowlingscoringapp.useful.UsefulClass;

public class BowlingTransformData implements TransformData<List<String>, Optional<List<Player>>> {

	@Override
	public Optional<List<Player>> transformData(List<String> scoreData) throws Exception {

		//if (scoreData.isPresent()) {
		if(scoreData!=null && scoreData.size()>0) {
			Stream<Player> players = scoreData.stream().map(x -> UsefulClass.getPlayer(x));
			Map<String, List<Player>> groupingPlayers = groupPinfall(players);
			if (groupingPlayers.size() < 2) {
				throw new Exception("There must be two or more players");
			} else {
				List<Player> correctPlayers = new ArrayList<Player>();
				Validation validation = new BowlingScoreValidation();
				ValidationContext validationContext = new ValidationContext(validation);
				TransformData<List<Player>, Player> transformData = new FrameTransformData();
				TransformDataContext<List<Player>, Player> transformDataContext = new TransformDataContext<List<Player>, Player>(
						transformData);
				List<Player> validationPlayers;
				for (Map.Entry<String, List<Player>> auxiliary : groupingPlayers.entrySet()) {
					validationPlayers = auxiliary.getValue();
					String errorMessage = validationContext.Validate(validationPlayers);
					if (errorMessage != "") {
						throw new Exception(errorMessage);
					} else {
						Player correctPlayer = transformDataContext.getTransformatedData(validationPlayers);
						correctPlayer.calculationScore();
						correctPlayers.add(correctPlayer);
					}
				}
				return Optional.of(correctPlayers);
			}
		} else {
			return Optional.empty();
		}
	}

	Map<String, List<Player>> groupPinfall(Stream<Player> players) {
		Map<String, List<Player>> groupingPinfall = players.collect(Collectors.groupingBy(Player::getName,
				LinkedHashMap::new, Collectors.mapping(Function.identity(), Collectors.toList())));
		return groupingPinfall;
	}

}
