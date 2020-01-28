package com.tenpinbowlingscoringapp.transformdata;

import java.util.ArrayList;
import java.util.List;
import com.tenpinbowlingscoringapp.entity.Frame;
import com.tenpinbowlingscoringapp.entity.Player;
import com.tenpinbowlingscoringapp.useful.UsefulClass;

public class FrameTransformData implements TransformData<List<Player>, Player> {

	@Override
	public Player transformData(List<Player> players) throws Exception {
		Player principalPlayer = players.get(0);
		List<Frame> frames = new ArrayList<Frame>();
		String currentElementFirstPinfall = "";
		String nextElementFirstPinfall = "";
		String thirdElementFirstPinfall = "";
		Integer convertedValue = 0;
		Integer convertedValueNext = 0;
		Integer plus;

		for (int i = 0; i < players.size(); i++) {
			currentElementFirstPinfall = players.get(i).getFrames().get(0).getFirstPinfall();
			

			Frame currentFrame = new Frame();
			if (currentElementFirstPinfall.equals("10")) {
				currentFrame.setFirstPinfall("X");
				if (i == (players.size() - 3)) {
					i++;
					nextElementFirstPinfall = players.get(i).getFrames().get(0).getFirstPinfall();
					if (nextElementFirstPinfall.equals("10")) {
						currentFrame.setSecondPinfall("X");
					} else {
						currentFrame.setSecondPinfall(nextElementFirstPinfall);
					}
					i++;
					thirdElementFirstPinfall = players.get(i).getFrames().get(0).getFirstPinfall();
					if (thirdElementFirstPinfall.equals("10")) {
						currentFrame.setThirdPinfall("X");
					} else {
						currentFrame.setThirdPinfall(thirdElementFirstPinfall);
					}
				}
			} else {
				i++;
				nextElementFirstPinfall = players.get(i).getFrames().get(0).getFirstPinfall();
				convertedValue = UsefulClass.getRealValuePinfall(currentElementFirstPinfall);
				convertedValueNext = UsefulClass.getRealValuePinfall(nextElementFirstPinfall);
				currentFrame.setFirstPinfall(currentElementFirstPinfall);
				plus=convertedValue + convertedValueNext;
				if (plus.equals(10)) {
					currentFrame.setSecondPinfall("/");
					if (i == (players.size() - 2)) {
						i++;
						thirdElementFirstPinfall = players.get(i).getFrames().get(0).getFirstPinfall();
						currentFrame.setThirdPinfall(thirdElementFirstPinfall);
					}
				} else {
					currentFrame.setSecondPinfall(nextElementFirstPinfall);
				}
			}
			frames.add(currentFrame);
		}
		principalPlayer.setFrames(frames);
		return principalPlayer;
	}

}
