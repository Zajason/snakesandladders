
public class Ladder {
	int ladderId;
	int topSquareId;
	int bottomSquareId;
	boolean broken;
Ladder(){
	
	ladderId=0;
	topSquareId=0;
	bottomSquareId =0;
	broken = false;
	}

Ladder(int ladderId , int topSquareId , int bottomSquareId , boolean broken){
	this.ladderId = ladderId;
	this.topSquareId = topSquareId;
	this.bottomSquareId = bottomSquareId;
	this.broken = broken;
	
}

Ladder(Ladder l){
	this.ladderId = l.ladderId;
	this.topSquareId = l.bottomSquareId;
	this.bottomSquareId = l.bottomSquareId;
	this.broken = l.broken;
}
}
