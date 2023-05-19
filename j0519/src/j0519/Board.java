package j0519;

public class Board {
	String[] saveBoard = new String[4];
	
	String[] save(String no,String title,String date,String name) {
		saveBoard[0] = no;
		saveBoard[1] = title;
		saveBoard[2] = date;
		saveBoard[3] = name;
		
		return saveBoard;
	}

}
