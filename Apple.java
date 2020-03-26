package src;

import java.util.Random;

public class Apple {

	Random random = new Random();
	
	int randomspawn;
	
	public void appleSpawn() {

		randomspawn = random.nextInt(4);
		
		if (randomspawn == 0) {

			SnakeGames.appleImage.setLocation(SnakeGames.appleImage.getX() - SnakeGames.HORIZONTAL_MOVE * random.nextInt(5),
					SnakeGames.appleImage.getY() - SnakeGames.VERTICAL_MOVE * random.nextInt(5));

		} else if (randomspawn == 1) {

			SnakeGames.appleImage.setLocation(SnakeGames.appleImage.getX() + SnakeGames.HORIZONTAL_MOVE * random.nextInt(5),
					SnakeGames.appleImage.getY() - SnakeGames.VERTICAL_MOVE * random.nextInt(5));

		} else if (randomspawn == 2) {

			SnakeGames.appleImage.setLocation(SnakeGames.appleImage.getX() - SnakeGames.HORIZONTAL_MOVE * random.nextInt(5),
					SnakeGames.appleImage.getY() + SnakeGames.VERTICAL_MOVE * random.nextInt(5));

		} else if (randomspawn == 3) {

			SnakeGames.appleImage.setLocation(SnakeGames.appleImage.getX() + SnakeGames.HORIZONTAL_MOVE * random.nextInt(5),
					SnakeGames.appleImage.getY() + SnakeGames.VERTICAL_MOVE * random.nextInt(5));
		}
	}
}
