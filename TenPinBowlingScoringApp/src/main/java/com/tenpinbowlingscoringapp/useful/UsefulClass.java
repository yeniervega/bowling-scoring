package com.tenpinbowlingscoringapp.useful;

import java.util.ArrayList;
import java.util.List;
import com.tenpinbowlingscoringapp.entity.Frame;
import com.tenpinbowlingscoringapp.entity.Player;

public class UsefulClass {

	public static Integer getRealValuePinfall(String valueToTransform) {
		Integer rearValuePinfall = 0;
		if (valueToTransform != null) {
			rearValuePinfall = valueToTransform == null || valueToTransform.toUpperCase() == "F"
					|| valueToTransform == "0" ? 0
							: valueToTransform == "X" ? 10
									: valueToTransform == "/" ? -1 : Integer.parseInt(valueToTransform);
		}
		return rearValuePinfall;
	}

	public static Player getPlayer(String line) {
		String[] auxiliar = line.split("\t");
		Player player = new Player();
		if (auxiliar != null && auxiliar.length == 2) {
			player.setName(auxiliar[0]);
			Frame frame = new Frame();
			frame.setFirstPinfall(auxiliar[1]);
			List<Frame> frameList = new ArrayList<Frame>();
			frameList.add(frame);
			player.setFrames(frameList);
		}
		return player;
	}

}
