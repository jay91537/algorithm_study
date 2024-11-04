function solution(survey, choices) {
    var answer = [];
    
    let arrOfResult = [];

    let MBTI = [{index:"RT", alphabet: null, number:0}, {index:"CF", alphabet: null, number:0},
        {index:"JM", alphabet: null, number:0}, {index:"AN", alphabet: null, number:0}];

    for (let i=0; i<survey.length; i++) {

        arrOfResult.push({...cal(survey[i], choices[i])});

        if(arrOfResult[i].alphabet != null) {
            if(MBTI.forEach(value =>{
                if(value.index.includes(arrOfResult[i].alphabet)){
                    if(value.alphabet===arrOfResult[i].alphabet) {
                        value.number=value.number+arrOfResult[i].number;
                    }
                    else if(value.alphabet===null) {
                        value.alphabet=arrOfResult[i].alphabet;
                        value.number=value.number+arrOfResult[i].number;
                    }
                    else {
                        if(value.number>arrOfResult[i].number){
                            value.number=value.number-arrOfResult[i].number;
                        }
                        else if(value.number<arrOfResult[i].number){
                            value.alphabet=arrOfResult[i].alphabet;
                            value.number=arrOfResult[i].number-value.number;
                        }
                        else {
                            value.alphabet===null;
                            value.number=0;
                        }
                    }
                }
            }));
        }
    }


    for( var i=0; i<4;i++) {
        if(MBTI[i].number===0){
            answer.push(MBTI[i].index[0]);
        } else {
            answer.push(MBTI[i].alphabet);
        }
    }
    
    answer=answer.join('');
    console.log(answer);
    

    return answer;
}

function cal(surindex, choindex) {
    
    if(choindex===4) {
        let decision = {alphabet: null, number: 0};
        return decision;
    }
    else if(choindex<4) {
        let decision = {alphabet: surindex[0], number: 4-choindex};
        return decision;
    }
    else {
        let decision = {alphabet: surindex[1], number: choindex-4};
        return decision;
    }
}