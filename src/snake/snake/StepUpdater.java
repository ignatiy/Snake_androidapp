package snake.snake;

import java.util.TimerTask;

public class StepUpdater extends TimerTask {
	
	GameActivity act;
	
	StepUpdater(GameActivity s){
		this.act = s;
	}

	@Override
	public void run() {
		act.Step();
	}

}
