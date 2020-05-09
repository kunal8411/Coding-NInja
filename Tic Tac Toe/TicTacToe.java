//Player class

public class player {
	private String name;
	private char symbol;
	 public player(String name,char symbol) {
		 setName(name);
		 setSymbol(symbol);
		 
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		if(!name.isEmpty()) {
			this.name = name;
		}
	
	}
	public char getSymbol() {
		return this.symbol;
	}
	public void setSymbol(char symbol) {
		if(symbol!='\0') {
			this.symbol = symbol;
		}
		
	}

}


//Board class

public class Board {
	private char[][]board;    //matrix to store results
	private  int boardSize=3;   //if board is 3*3 size is 3 if board is 4*4 size is 4
	private char p1symbol;
	private char p2symbol;
	private int count; //no of cells of board that have been marked
	
	public final static int PLAYER_1_WINS=1;  //constant value for this class
	public final static int PLAYER_2_WINS=2;//static:- definition will be same for class board 
	public final static int DRAW=3;
	public final static int INCOMPLETE=4;
	public final static int INVALID=5;
	
	public Board(char  p1symbol,char p2symbol) {
		this.p1symbol=p1symbol;
		
		this.p2symbol= p2symbol;
		
		board=new char[boardSize][boardSize];
		for(int i=0;i<boardSize;i++) {
			for(int j=0;j<boardSize;j++) {
				board[i][j]=' ';
				
			}
		}
		
	}

	public static void main(String[] args) {
		Tic_tac_Toe obj= new Tic_tac_Toe();
		obj.startgame();
	}
	public  int move(char symbol, int x, int y) {
		if(x<0||x>=boardSize||y<0||y>=boardSize||board[x][y]!=' ') {
			//board[x][y]!=' ' -- check entry for x,y is already there or not if yes return inValid. 
			
			return INVALID;
			
		}
		board[x][y]=symbol;
		count++; //this will increment only upto board boardSize*boardSize.
		
		//check for winninng condition
		//check wwhether same symboll is presend horizontally,vertically or diagonally 
		//check vertically 
		if(board[x][0]==board[x][1] &&board[x][0]==board[x][2]) {
			return symbol==p1symbol ?PLAYER_1_WINS:PLAYER_2_WINS;
//			if(symbol==p1symbol) {
//				return PLAYER_1_WINS;
//			}
//			else {
//				return PLAYER_2_WINS;
//				
//			}
		}
		//check horizontally
		if(board[0][y]==board[1][y]&&board[0][y]==board[2][y]) {
			return symbol==p1symbol ? PLAYER_1_WINS:PLAYER_2_WINS;
		}
		//check diagonally
		if(board[0][0]!=' '&&board[0][0]==board[1][1]&&board[0][0]==board[2][2]) {
				return symbol==p1symbol ? PLAYER_1_WINS:PLAYER_2_WINS;
				
		}
		if(board[2][0]!=' '&&board[2][0]==board[1][1]&&board[2][0]==board[0][2]) {
			return symbol==p1symbol? PLAYER_1_WINS:PLAYER_2_WINS;
			
		}
		if(count ==boardSize*boardSize) {
			return DRAW;
		}
		return INCOMPLETE;
		
		
		
	}

	public  void print() {
		System.out.println("-----------------");
		for(int i=0;i<boardSize;i++) {
			for(int j=0;j<boardSize;j++) {
				System.out.print("| "+board[i][j]+" |");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("-----------------");
		
	}
	
	
	

}




//manager class
import java.util.Scanner;

public class Tic_tac_Toe {

	private player player1,player2;
	private Board board;
	
	public void startgame() {
		
		//take playes input 
		Scanner s= new Scanner(System.in);
		player1= takeInput(1);
		player2= takeInput(2);
		while(player1.getSymbol()==player2.getSymbol()) {
			System.out.println("same symbol for 2 playes , please change the symbol");
			char symbol= s.next().charAt(0);
			player2.setSymbol(symbol);
		}
		
		//Create board 
		board= new Board(player1.getSymbol(), player2.getSymbol());
		boolean player1turn=true;
		int status= Board.INCOMPLETE;
		
		while(status==Board.INCOMPLETE||status==Board.INVALID){
			if(player1turn==true) {
				System.out.println(player1.getName()+"'s turn");
				System.out.println("Enter X:");
				int x= s.nextInt();
				System.out.println("Enter Y:");
				int y= s.nextInt();
				 status= board.move(player1.getSymbol(),x,y);
				 if(status==Board.INVALID) {
					//do nothing
					//ask user again to enter valis x and y
				}
				else {
					player1turn= false;//next players turn 
					board.print();
					
				}
			}
			else {

				System.out.println(player2.getName()+"'s turn");
				System.out.println("Enter X:");
				int x= s.nextInt();
				System.out.println("Enter Y:");
				int y= s.nextInt();
				status= board.move(player2.getSymbol(),x,y);
				if(status==Board.INVALID) {
					
				}
				else {
					player1turn= true;
					board.print();
				}
			
				
			}
		}
		if(status==board.PLAYER_1_WINS) {
			System.out.println(player1.getName()+"wins");
		}
		else if(status== board.PLAYER_2_WINS) {
			System.out.println(player2.getName()+"wins");
		}
		else {
			System.out.println("Draw");
		}
	}

	private player takeInput(int num) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter player"+num +"name");
		String name = s.nextLine();
		System.out.println("Enter player"+num+"symbol");
		char symbol= s.next().charAt(0);
		player p = new player(name, symbol);
		return p;
	}
}
