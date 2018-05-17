package maze;

public class map {
	
	boolean[][] map;
	int boundRow = 10, boundCol = 10, startRow, startCol, endRow, endCol, startMRow, startMCol;

	public map() {
		map = new boolean[10][10];
		startMRow = 3;
		startMCol = 3;
		startRow = 9;
		startCol = 0;
		endRow = 7;
		endCol = 9;
		for (int r = 0; r < map.length; r++) {
			for (int c = 0; c < map[0].length; c++) {
				map[r][c] = false;
			}
		}
		map[1][2] = true;
		map[1][3] = true;
		map[1][4] = true;
		map[1][5] = true;
		map[1][6] = true;
		map[1][7] = true;
		map[1][8] = true;
		map[1][9] = true;
		map[2][2] = true;
		map[3][1] = true;
		map[3][2] = true;
		map[3][5] = true;
		map[3][6] = true;
		map[3][7] = true;
		map[3][8] = true;
		map[4][5] = true;
		map[4][8] = true;
		map[5][5] = true;
		map[5][8] = true;
		map[5][9] = true;
		map[6][3] = true;
		map[6][4] = true;
		map[6][5] = true;
		map[6][8] = true;
		map[7][3] = true;
		map[7][8] = true;
		map[8][3] = true;
		map[8][8] = true;
		map[9][0] = true;
		map[9][1] = true;
		map[9][2] = true;
		map[9][3] = true;
		map[9][8] = true;
	
		
	
		
	}

	public boolean canMove(int r, int c) {
		if (r < 0) {
			r = 0;
		} else if (r > 14) {
			r = 14;
		}
		if (c < 0) {
			c = 0;
		} else if (c > 14) {
			c = 14;
		}
		return map[r][c];
	}

	public int[] startPosition() {
		int[] x = { startRow, startCol };
		return x;
	}
	public int[] minStartPosition() {
		int[] x = { startMRow, startMCol };
		return x;
	}

	public boolean atEnd(int r, int c) {
		return r == endRow && c == endCol;
	}
}
