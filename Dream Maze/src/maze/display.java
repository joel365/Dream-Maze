package maze;
import javax.swing.JOptionPane;

public class display{
	String s;
	JOptionPane obj;
	map themap;
	minion p;
	String screen;
	

	public display() {
		obj = new JOptionPane();
		themap = new map();
		p = new minion(themap);
		
	}

	public void update() {
		screen = "";
		for (int r = 0; r < themap.boundRow; r++) {
			for (int c = 0; c < themap.boundCol; c++) {
				if (r == p.getPlayerRow() && c == p.getPlayerCol()) {
					screen += " P ";
				} 
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " - ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " l ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " j ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " 7 ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " [ ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " G ";
				} else if (themap.canMove(r, c)) {
					screen += " O ";
				} else {
					screen += " X ";
				}
			}
			screen += "\n";
		}
	}
	public void update2() {
		screen = "";
		for (int r = 0; r < themap.boundRow; r++) {
			for (int c = 0; c < themap.boundCol; c++) {
			   if(r == 9 && c == 1 ) {
			   screen += " - ";
			   
			   }
				else if (r == p.getPlayerRow() && c == p.getPlayerCol()) {
					screen += " P ";
				} 
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " - ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " l ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " j ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " 7 ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " [ ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " G ";
				} else if (themap.canMove(r, c)) {
					screen += " O ";
				} else {
					screen += " X ";
				}
			}
			screen += "\n";
		}
	}
	public void update3() {
		screen = "";
		for (int r = 0; r < themap.boundRow; r++) {
			for (int c = 0; c < themap.boundCol; c++) {
				if(r == 9 && c == 1 || r == 9 && c == 2 ) {
					   screen += " - ";
					   
					   }
				else if (r == p.getPlayerRow() && c == p.getPlayerCol()) {
					screen += " P ";
				} 
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " - ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " l ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " j ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " 7 ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " [ ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " G ";
				} else if (themap.canMove(r, c)) {
					screen += " O ";
				} else {
					screen += " X ";
				}
			}
			screen += "\n";
		}
	}
	public void update4() {
		screen = "";
		for (int r = 0; r < themap.boundRow; r++) {
			for (int c = 0; c < themap.boundCol; c++) {
				if( r == 9 && c == 3 ) {
					   screen += " j ";
					   
					   }
				else if(r == 9 && c == 1 || r == 9 && c == 2 ) {
					   screen += " - ";
					   
					   }
			else if (r == p.getPlayerRow() && c == p.getPlayerCol()) {
					screen += " P ";
				} 
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " - ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " l ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " j ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " 7 ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " [ ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " G ";
				} else if (themap.canMove(r, c)) {
					screen += " O ";
				} else {
					screen += " X ";
				}
			}
			screen += "\n";
		}
	}
	public void update5() {
		screen = "";
		for (int r = 0; r < themap.boundRow; r++) {
			for (int c = 0; c < themap.boundCol; c++) {
				if(r == 8 && c == 3) {
					screen += " l ";
				}
			else if( r == 9 && c == 3 ) {
					   screen += " j ";
					   
					   }
				else if(r == 9 && c == 1 || r == 9 && c == 2 ) {
					   screen += " - ";
					   
					   }
				else if (r == p.getPlayerRow() && c == p.getPlayerCol()) {
					screen += " P ";
				} 
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " - ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " l ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " j ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " 7 ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " [ ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " G ";
				} else if (themap.canMove(r, c)) {
					screen += " O ";
				} else {
					screen += " X ";
				}
			}
			screen += "\n";
		}
	}
	public void update6() {
		screen = "";
		for (int r = 0; r < themap.boundRow; r++) {
			for (int c = 0; c < themap.boundCol; c++) {
				if(r == 8 && c == 3 || r == 7 && c== 3) {
					screen += " l ";
				}
			else if( r == 9 && c == 3 ) {
					   screen += " j ";
					   
					   }
				else if(r == 9 && c == 1 || r == 9 && c == 2 ) {
					   screen += " - ";
					   
					   }
				else if (r == p.getPlayerRow() && c == p.getPlayerCol()) {
					screen += " P ";
				} 
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " - ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " l ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " j ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " 7 ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " [ ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " G ";
				} else if (themap.canMove(r, c)) {
					screen += " O ";
				} else {
					screen += " X ";
				}
			}
			screen += "\n";
		}
	}
	public void update7() {
		screen = "";
		for (int r = 0; r < themap.boundRow; r++) {
			for (int c = 0; c < themap.boundCol; c++) {
			if(r == 6 && c == 3) {
				screen += " [ ";
			}
				else if(r == 8 && c == 3 || r == 7 && c== 3) {
					screen += " l ";
				}
			else if( r == 9 && c == 3 ) {
					   screen += " j ";
					   
					   }
				else if(r == 9 && c == 1 || r == 9 && c == 2 ) {
					   screen += " - ";
					   
					   }
				else if (r == p.getPlayerRow() && c == p.getPlayerCol()) {
					screen += " P ";
				} 
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " - ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " l ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " j ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " 7 ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " [ ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " G ";
				} else if (themap.canMove(r, c)) {
					screen += " O ";
				} else {
					screen += " X ";
				}
			}
			screen += "\n";
		}
	}
	public void update8() {
		screen = "";
		for (int r = 0; r < themap.boundRow; r++) {
			for (int c = 0; c < themap.boundCol; c++) {
				if(r == 6 && c == 3) {
					screen += " [ ";
				}
					else if(r == 8 && c == 3 || r == 7 && c== 3) {
						screen += " l ";
					}
				else if( r == 9 && c == 3 ) {
						   screen += " j ";
						   
						   }
					else if(r == 9 && c == 1 || r == 9 && c == 2 || r == 6 && c == 4) {
						   screen += " - ";
						   
						   }
				else if (r == p.getPlayerRow() && c == p.getPlayerCol()) {
					screen += " P ";
				} 
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " - ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " l ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " j ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " 7 ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " [ ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " G ";
				} else if (themap.canMove(r, c)) {
					screen += " O ";
				} else {
					screen += " X ";
				}
			}
			screen += "\n";
		}
	}
	public void update9() {
		screen = "";
		for (int r = 0; r < themap.boundRow; r++) {
			for (int c = 0; c < themap.boundCol; c++) {
				if(r == 6 && c == 3) {
					screen += " [ ";
				}
					else if(r == 8 && c == 3 || r == 7 && c== 3) {
						screen += " l ";
					}
				else if( r == 9 && c == 3 || r == 6&& c == 5) {
						   screen += " j ";
						   
						   }
					else if(r == 9 && c == 1 || r == 9 && c == 2 || r == 6 && c == 4 ) {
						   screen += " - ";
						   
						   }
				else if (r == p.getPlayerRow() && c == p.getPlayerCol()) {
					screen += " P ";
				} 
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " - ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " l ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " j ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " 7 ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " [ ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " G ";
				} else if (themap.canMove(r, c)) {
					screen += " O ";
				} else {
					screen += " X ";
				}
			}
			screen += "\n";
		}
	}
	public void update10() {
		screen = "";
		for (int r = 0; r < themap.boundRow; r++) {
			for (int c = 0; c < themap.boundCol; c++) {
				if(r == 6 && c == 3) {
					screen += " [ ";
				}
					else if(r == 8 && c == 3 || r == 7 && c== 3|| r == 5 && c == 4) {
						screen += " l ";
					}
				else if( r == 9 && c == 3 || r == 6&& c == 5) {
						   screen += " j ";
						   
						   }
					else if(r == 9 && c == 1 || r == 9 && c == 2 || r == 6 && c == 4 ) {
						   screen += " - ";
						   
						   }
				else if (r == p.getPlayerRow() && c == p.getPlayerCol()) {
					screen += " P ";
				} 
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " - ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " l ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " j ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " 7 ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " [ ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " G ";
				} else if (themap.canMove(r, c)) {
					screen += " O ";
				} else {
					screen += " X ";
				}
			}
			screen += "\n";
		}
	}
	public void update11() {
		screen = "";
		for (int r = 0; r < themap.boundRow; r++) {
			for (int c = 0; c < themap.boundCol; c++) {
				if(r == 6 && c == 3) {
					screen += " [ ";
				}
					else if(r == 8 && c == 3 || r == 7 && c== 3|| r == 5 && c == 4|| r == 4 && c == 4) {
						screen += " l ";
					}
				else if( r == 9 && c == 3 || r == 6&& c == 5) {
						   screen += " j ";
						   
						   }
					else if(r == 9 && c == 1 || r == 9 && c == 2 || r == 6 && c == 4 ) {
						   screen += " - ";
						   }
						   
				else if (r == p.getPlayerRow() && c == p.getPlayerCol()) {
					screen += " P ";
				} 
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " - ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " l ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " j ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " 7 ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " [ ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " G ";
				} else if (themap.canMove(r, c)) {
					screen += " O ";
				} else {
					screen += " X ";
				}
			}
			screen += "\n";
		}
	}
	public void update12() {
		screen = "";
		for (int r = 0; r < themap.boundRow; r++) {
			for (int c = 0; c < themap.boundCol; c++) {
				if(r == 6 && c == 3 || r == 3 && c == 4) {
					screen += " [ ";
				}
					else if(r == 8 && c == 3 || r == 7 && c== 3|| r == 5 && c == 4|| r == 4 && c == 4) {
						screen += " l ";
					}
				else if( r == 9 && c == 3 || r == 6&& c == 5) {
						   screen += " j ";
						   
						   }
					else if(r == 9 && c == 1 || r == 9 && c == 2 || r == 6 && c == 4 ) {
						   screen += " - ";
						   }
				else if (r == p.getPlayerRow() && c == p.getPlayerCol()) {
					screen += " P ";
				} 
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " - ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " l ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " j ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " 7 ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " [ ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " G ";
				} else if (themap.canMove(r, c)) {
					screen += " O ";
				} else {
					screen += " X ";
				}
			}
			screen += "\n";
		}
	}
	public void update13() {
		screen = "";
		for (int r = 0; r < themap.boundRow; r++) {
			for (int c = 0; c < themap.boundCol; c++) {
				if(r == 6 && c == 3 || r == 3 && c == 4) {
					screen += " [ ";
				}
					else if(r == 8 && c == 3 || r == 7 && c== 3|| r == 5 && c == 4|| r == 4 && c == 4) {
						screen += " l ";
					}
				else if( r == 9 && c == 3 || r == 6&& c == 5) {
						   screen += " j ";
						   
						   }
					else if(r == 9 && c == 1 || r == 9 && c == 2 || r == 6 && c == 4|| r == 3 && c == 5 ) {
						   screen += " - ";
						   }
				else if (r == p.getPlayerRow() && c == p.getPlayerCol()) {
					screen += " P ";
				} 
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " - ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " l ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " j ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " 7 ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " [ ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " G ";
				} else if (themap.canMove(r, c)) {
					screen += " O ";
				} else {
					screen += " X ";
				}
			}
			screen += "\n";
		}
	}
	public void update14() {
		screen = "";
		for (int r = 0; r < themap.boundRow; r++) {
			for (int c = 0; c < themap.boundCol; c++) {
				if(r == 6 && c == 3 || r == 3 && c == 4) {
					screen += " [ ";
				}
					else if(r == 8 && c == 3 || r == 7 && c== 3|| r == 5 && c == 4|| r == 4 && c == 4) {
						screen += " l ";
					}
				else if( r == 9 && c == 3 || r == 6&& c == 5) {
						   screen += " j ";
						   
						   }
					else if(r == 9 && c == 1 || r == 9 && c == 2 || r == 6 && c == 4|| r == 3 && c == 5 || r == 3 && c == 6) {
						   screen += " - ";
						   }
				else if (r == p.getPlayerRow() && c == p.getPlayerCol()) {
					screen += " P ";
				} 
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " - ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " l ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " j ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " 7 ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " [ ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " G ";
				} else if (themap.canMove(r, c)) {
					screen += " O ";
				} else {
					screen += " X ";
				}
			}
			screen += "\n";
		}
	}
	public void update15() {
		screen = "";
		for (int r = 0; r < themap.boundRow; r++) {
			for (int c = 0; c < themap.boundCol; c++) {
				if(r == 6 && c == 3 || r == 3 && c == 4) {
					screen += " [ ";
				}
					else if(r == 8 && c == 3 || r == 7 && c== 3|| r == 5 && c == 4|| r == 4 && c == 4) {
						screen += " l ";
					}
				else if( r == 9 && c == 3 || r == 6&& c == 5) {
						   screen += " j ";
						   
						   }
					else if(r == 9 && c == 1 || r == 9 && c == 2 || r == 6 && c == 4|| r == 3 && c == 5 || r == 3 && c == 6 || r == 3 && c == 7) {
						   screen += " - ";
						   }
				else if (r == p.getPlayerRow() && c == p.getPlayerCol()) {
					screen += " P ";
				} 
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " - ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " l ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " j ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " 7 ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " [ ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " G ";
				} else if (themap.canMove(r, c)) {
					screen += " O ";
				} else {
					screen += " X ";
				}
			}
			screen += "\n";
		}
	}
	public void update16() {
		screen = "";
		for (int r = 0; r < themap.boundRow; r++) {
			for (int c = 0; c < themap.boundCol; c++) {
			if(r == 3 && c == 8) {
				screen += " 7 ";
			}
				else if(r == 6 && c == 3 || r == 3 && c == 4) {
					screen += " [ ";
				}
					else if(r == 8 && c == 3 || r == 7 && c== 3|| r == 5 && c == 4|| r == 4 && c == 4) {
						screen += " l ";
					}
				else if( r == 9 && c == 3 || r == 6&& c == 5) {
						   screen += " j ";
						   
						   }
					else if(r == 9 && c == 1 || r == 9 && c == 2 || r == 6 && c == 4|| r == 3 && c == 5 || r == 3 && c == 6 || r == 3 && c == 7) {
						   screen += " - ";
						   }
				else if (r == p.getPlayerRow() && c == p.getPlayerCol()) {
					screen += " P ";
				} 
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " - ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " l ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " j ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " 7 ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " [ ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " G ";
				} else if (themap.canMove(r, c)) {
					screen += " O ";
				} else {
					screen += " X ";
				}
			}
			screen += "\n";
		}
	}
	public void update17() {
		screen = "";
		for (int r = 0; r < themap.boundRow; r++) {
			for (int c = 0; c < themap.boundCol; c++) {
				if(r == 3 && c == 8) {
					screen += " 7 ";
				}
					else if(r == 6 && c == 3 || r == 3 && c == 4) {
						screen += " [ ";
					}
						else if(r == 8 && c == 3 || r == 7 && c== 3|| r == 5 && c == 4|| r == 4 && c == 4||r == 4 && c == 8) {
							screen += " l ";
						}
					else if( r == 9 && c == 3 || r == 6&& c == 5) {
							   screen += " j ";
							   
							   }
						else if(r == 9 && c == 1 || r == 9 && c == 2 || r == 6 && c == 4|| r == 3 && c == 5 || r == 3 && c == 6 || r == 3 && c == 7) {
							   screen += " - ";
							   }
				if (r == p.getPlayerRow() && c == p.getPlayerCol()) {
					screen += " P ";
				} 
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " - ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " l ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " j ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " 7 ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " [ ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " G ";
				} else if (themap.canMove(r, c)) {
					screen += " O ";
				} else {
					screen += " X ";
				}
			}
			screen += "\n";
		}
	}
	public void update18() {
		screen = "";
		for (int r = 0; r < themap.boundRow; r++) {
			for (int c = 0; c < themap.boundCol; c++) {
				if(r == 3 && c == 8) {
					screen += " 7 ";
				}
					else if(r == 6 && c == 3 || r == 3 && c == 4) {
						screen += " [ ";
					}
						else if(r == 8 && c == 3 || r == 7 && c== 3|| r == 5 && c == 4|| r == 4 && c == 4||r == 4 && c == 8||r == 5 && c == 8) {
							screen += " l ";
						}
					else if( r == 9 && c == 3 || r == 6&& c == 5) {
							   screen += " j ";
							   
							   }
						else if(r == 9 && c == 1 || r == 9 && c == 2 || r == 6 && c == 4|| r == 3 && c == 5 || r == 3 && c == 6 || r == 3 && c == 7) {
							   screen += " - ";
							   }
				else if (r == p.getPlayerRow() && c == p.getPlayerCol()) {
					screen += " P ";
				} 
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " - ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " l ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " j ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " 7 ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " [ ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " G ";
				} else if (themap.canMove(r, c)) {
					screen += " O ";
				} else {
					screen += " X ";
				}
			}
			screen += "\n";
		}
	}
	public void update19() {
		screen = "";
		for (int r = 0; r < themap.boundRow; r++) {
			for (int c = 0; c < themap.boundCol; c++) {
				if(r == 3 && c == 8) {
					screen += " 7 ";
				}
					else if(r == 6 && c == 3 || r == 3 && c == 4) {
						screen += " [ ";
					}
						else if(r == 8 && c == 3 || r == 7 && c== 3|| r == 5 && c == 4|| r == 4 && c == 4||r == 4 && c == 8||r == 5 && c == 8|| r == 6 && c == 8) {
							screen += " l ";
						}
					else if( r == 9 && c == 3 || r == 6&& c == 5) {
							   screen += " j ";
							   
							   }
						else if(r == 9 && c == 1 || r == 9 && c == 2 || r == 6 && c == 4|| r == 3 && c == 5 || r == 3 && c == 6 || r == 3 && c == 7) {
							   screen += " - ";
							   }
				else if (r == p.getPlayerRow() && c == p.getPlayerCol()) {
					screen += " P ";
				} 
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " - ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " l ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " j ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " 7 ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " [ ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " G ";
				} else if (themap.canMove(r, c)) {
					screen += " O ";
				} else {
					screen += " X ";
				}
			}
			screen += "\n";
		}
	}
	public void update20() {
		screen = "";
		for (int r = 0; r < themap.boundRow; r++) {
			for (int c = 0; c < themap.boundCol; c++) {
				if(r == 3 && c == 8) {
					screen += " 7 ";
				}
					else if(r == 6 && c == 3 || r == 3 && c == 4|| r == 7 && c == 8) {
						screen += " [ ";
					}
						else if(r == 8 && c == 3 || r == 7 && c== 3|| r == 5 && c == 4|| r == 4 && c == 4||r == 4 && c == 8||r == 5 && c == 8|| r == 6 && c == 8) {
							screen += " l ";
						}
					else if( r == 9 && c == 3 || r == 6&& c == 5) {
							   screen += " j ";
							   
							   }
						else if(r == 9 && c == 1 || r == 9 && c == 2 || r == 6 && c == 4|| r == 3 && c == 5 || r == 3 && c == 6 || r == 3 && c == 7) {
							   screen += " - ";
							   }
				else if (r == p.getPlayerRow() && c == p.getPlayerCol()) {
					screen += " P ";
				} 
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " - ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " l ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " j ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " 7 ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " [ ";
				}
				else if(r == themap.endRow && c == themap.endCol) {
					screen += " G ";
				} else if (themap.canMove(r, c)) {
					screen += " O ";
				} else {
					screen += " X ";
				}
			}
			screen += "\n";
		}
	}
	public void display() {
		s = "";
			s = obj.showInputDialog(null, screen + "\n to place a pipe type -(horizantal),l(vertical)j(90 degree bend),7(-90 degree bend),[(90 degree bend/backwards)");
			if(s.equals("-")) {
			update2();
			s = obj.showInputDialog(null, screen + "\n to place a pipe type -(horizantal),l(vertical)j(90 degree bend),7(-90 degree bend),[(90 degree bend/backwards)");
			if(s.equals("-")) {
				update3();
				s = obj.showInputDialog(null, screen + "\n to place a pipe type -(horizantal),l(vertical)j(90 degree bend),7(-90 degree bend),[(90 degree bend/backwards)");
				if(s.equals("j")) {
					update4();
					s = obj.showInputDialog(null, screen + "\n to place a pipe type -(horizantal),l(vertical)j(90 degree bend),7(-90 degree bend),[(90 degree bend/backwards)");
					if(s.equals("l")) {
						update5();
						s = obj.showInputDialog(null, screen + "\n to place a pipe type -(horizantal),l(vertical)j(90 degree bend),7(-90 degree bend),[(90 degree bend/backwards)");
						if(s.equals("l")) {
							update6();
							s = obj.showInputDialog(null, screen + "\n to place a pipe type -(horizantal),l(vertical)j(90 degree bend),7(-90 degree bend),[(90 degree bend/backwards)");
							if(s.equals("[")) {
								update7();
								s = obj.showInputDialog(null, screen + "\n to place a pipe type -(horizantal),l(vertical)j(90 degree bend),7(-90 degree bend),[(90 degree bend/backwards)");
								if(s.equals("-")) {
									update8();
									s = obj.showInputDialog(null, screen + "\n to place a pipe type -(horizantal),l(vertical)j(90 degree bend),7(-90 degree bend),[(90 degree bend/backwards)");
									if(s.equals("j")) {
										update9();
										s = obj.showInputDialog(null, screen + "\n to place a pipe type -(horizantal),l(vertical)j(90 degree bend),7(-90 degree bend),[(90 degree bend/backwards)");
										if(s.equals("l")) {
											update10();
											s = obj.showInputDialog(null, screen + "\n to place a pipe type -(horizantal),l(vertical)j(90 degree bend),7(-90 degree bend),[(90 degree bend/backwards)");
											if(s.equals("l")) {
												update11();
												s = obj.showInputDialog(null, screen + "\n to place a pipe type -(horizantal),l(vertical)j(90 degree bend),7(-90 degree bend),[(90 degree bend/backwards)");
												if(s.equals("[")) {
													update12();
													s = obj.showInputDialog(null, screen + "\n to place a pipe type -(horizantal),l(vertical)j(90 degree bend),7(-90 degree bend),[(90 degree bend/backwards)");
													if(s.equals("-")) {
														update13();
														s = obj.showInputDialog(null, screen + "\n to place a pipe type -(horizantal),l(vertical)j(90 degree bend),7(-90 degree bend),[(90 degree bend/backwards)");
														
														if(s.equals("-")) {
															update14();
															s = obj.showInputDialog(null, screen + "\n to place a pipe type -(horizantal),l(vertical)j(90 degree bend),7(-90 degree bend),[(90 degree bend/backwards)");
															if(s.equals("-")) {
																update15();
																s = obj.showInputDialog(null, screen + "\n to place a pipe type -(horizantal),l(vertical)j(90 degree bend),7(-90 degree bend),[(90 degree bend/backwards)");
																if(s.equals("7")) {
																	update16();
																	s = obj.showInputDialog(null, screen + "\n to place a pipe type -(horizantal),l(vertical)j(90 degree bend),7(-90 degree bend),[(90 degree bend/backwards)");
																	if(s.equals("l")) {
																		update17();
																		s = obj.showInputDialog(null, screen + "\n to place a pipe type -(horizantal),l(vertical)j(90 degree bend),7(-90 degree bend),[(90 degree bend/backwards)");
																		if(s.equals("l")) {
																			update18();
																			s = obj.showInputDialog(null, screen + "\n to place a pipe type -(horizantal),l(vertical)j(90 degree bend),7(-90 degree bend),[(90 degree bend/backwards)");
																			if(s.equals("l")) {
																				update19();
																				s = obj.showInputDialog(null, screen + "\n to place a pipe type -(horizantal),l(vertical)j(90 degree bend),7(-90 degree bend),[(90 degree bend/backwards)");
																				if(s.equals("[")) {
																					obj.showInputDialog(null, "you win");
																					
																				}	
																			}	
																		}	
																	}	
																}	
															}	
														}	
													}	
												}	
											}	
										}	
									}	
								}	
							}	
						}	
					}	
				}
			}
			}
			obj.showMessageDialog(null,"you lost, restart and try again" );
		
	}
}


