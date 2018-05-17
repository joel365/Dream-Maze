package maze;

public class minion {
	map map;
	display display;
	int playerRow, playerCol;

	public minion(map obj) {
		playerRow = obj.startRow;
		playerCol = obj.startCol;
		map = obj;
	}

	// Getters
	public int getPlayerRow() {
		return playerRow;
	}

	public int getPlayerCol() {
		return playerCol;
	}

	public void move(int r, int c, String direction) {
		if (direction.equalsIgnoreCase("-")) {
			if (map.canMove(r, c + 1)) {

				playerCol += 1;
			}
		}
		if (direction.equalsIgnoreCase("j")) {
			if (map.canMove(r - 1, c)) {

				playerRow -= 1;
			}
		}
		if (direction.equalsIgnoreCase("l")) {
			if (map.canMove(r, c - 1)) {

				playerCol -= 1;
			}
		}
		if (direction.equalsIgnoreCase("7")) {
			if (map.canMove(r + 1, c)) {

				playerRow += 1;
			}
			if (direction.equalsIgnoreCase("[")) {
				if (map.canMove(r, c - 1)) {

					playerCol -= 1;
				}
		}

	}

}
}
	

