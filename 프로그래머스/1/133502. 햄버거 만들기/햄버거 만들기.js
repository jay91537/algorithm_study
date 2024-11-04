function solution(a) {
    let answer = 0;

    let temp = [];

    for (let i=0; i<a.length; i++) {
       
        temp.push(a[i]);
        
        if((temp.at(-1))===1&&(temp.at(-4)===1)&&(temp.at(-3)===2)&&(temp.at(-2)===3)) {
            
            temp.splice(-4,4);
            
            answer=answer+1;
        }
    }
    return answer;
}