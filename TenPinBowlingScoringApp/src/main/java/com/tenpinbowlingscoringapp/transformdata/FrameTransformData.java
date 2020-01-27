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
		Integer frameCount = 0;
		List<Frame> frames = new ArrayList<Frame>();

		for (int i = 0; i < players.size(); i++) {
			String currentElementFirstPinfall = players.get(i).getFrames().get(0).getFirstPinfall();
			String nextElementFirstPinfall = players.get(i + 1).getFrames().get(0).getFirstPinfall();
			String thirdElementFirstPinfall = players.get(i + 2).getFrames().get(0).getFirstPinfall();
			Frame currentFrame = principalPlayer.getFrames().get(frameCount);
			if (currentElementFirstPinfall == "10") {
				currentFrame.setFirstPinfall("X");
				if (i == (players.size() - 3)) {
					i++;
					if (nextElementFirstPinfall == "10") {
						currentFrame.setSecondPinfall("X");
					} else {
						currentFrame.setSecondPinfall(nextElementFirstPinfall);
					}
					i++;
					if (thirdElementFirstPinfall == "10") {
						currentFrame.setThirdPinfall("X");
					} else {
						currentFrame.setThirdPinfall(thirdElementFirstPinfall);
					}
				}
			} else {
				i++;
				Integer convertedValue = UsefulClass.getRealValuePinfall(currentElementFirstPinfall);
				Integer convertedValueNext = UsefulClass.getRealValuePinfall(nextElementFirstPinfall);
				currentFrame.setFirstPinfall(currentElementFirstPinfall);
				if ((convertedValue + convertedValueNext) == 10) {
					currentFrame.setSecondPinfall("//");
					if (i == (players.size() - 2)) {
						i++;
						currentFrame.setThirdPinfall(thirdElementFirstPinfall);
					}
				} else {
					currentFrame.setSecondPinfall(nextElementFirstPinfall);
				}
			}
			frameCount++;
			frames.add(currentFrame);
		}
		principalPlayer.setFrames(frames);
		return principalPlayer;
	}

}
