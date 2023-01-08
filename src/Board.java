
public class Board {
	int M,N;
	int [][] Squares;
	Snake[] Snakes;
	Ladder[] ladders;
	Present[] presents;
	
	
	Board(){
		N =0;
		M=0;
		Squares = new int[M][N];
		Snakes = new Snake[0];
		presents = new Present[0];
		ladders = new Ladder[0];
		
		
	}
	Board(int M , int N , int L , int s , int p) {
		this.M = M;
		this.N = N;
		Squares = new int[M][N];
		Snakes = new Snake[s];
		ladders = new Ladder[L];
		presents = new Present[p];
		
	
	}
	
	Board(Board b ) {
		N =b.N;
		M = b.M;
		Squares = b.Squares;
		ladders = new Ladder(b.ladders.length);
	}
}
