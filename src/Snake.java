
public class Snake {
	int snakeId;
	int headId;
	int tailId;
	
	
	Snake(){
		snakeId =0;
		headId=0;
		tailId =0;
	}
   Snake(int snakeId , int headId , int tailId){
	   this.snakeId = snakeId;
	   this.headId = headId;
	   this.tailId = tailId;
   }
   Snake(Snake s){
	   this.headId = s.headId;
	   this.snakeId = s.snakeId;
	   this.tailId = s.tailId;
   }
}
