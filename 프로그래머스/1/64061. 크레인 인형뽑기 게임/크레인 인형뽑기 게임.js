function solution(board, moves) {
	var answer = 0;
	let N=board.length;
	let temp = [];
	
	for(let i=0;i<moves.length;i++){
	
	        for(let j=0; j<N; j++){
	            if(board[j][moves[i]-1]===0){
	              continue;
	            }
	            else{
	                temp.push(board[j][moves[i]-1]);
	                board[j][moves[i]-1]=0;
	                break;
	            }
	        }
					if(temp.length>=2){
	        if(temp[temp.length-2]===temp[temp.length-1]){
	            temp.splice(-2,2);
	            answer=answer+2;
	        }
	}
	}

	return answer;
}