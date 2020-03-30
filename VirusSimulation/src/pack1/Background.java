package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Background {
	Timer timer;

	public Background() {
		timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				if (Var.backgroundX1 < Var.screenwidth-5) {
					Var.backgroundX1 += 1;
				} else {
					Var.backgroundX1 = -Var.screenwidth;
				}
				if (Var.backgroundX2 < Var.screenwidth-5) {
					Var.backgroundX2 += 1;
				} else {
					Var.backgroundX2 = -Var.screenwidth;
				}

			}

		}, 0, Var.backgroundspeed);
	}
}
