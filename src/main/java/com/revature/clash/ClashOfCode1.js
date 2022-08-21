[N,X,C] = [2, 5, 15];
let pi = [2,3];

let m = 0;
let f = 1;
while(m < C){
    var d = X + f
    let found = false
    for(g in pi){
        if(d % pi[g] == 0){
            found = true
            break;
        }
    }

    !found?m++:'';
    f++
}

console.log(d);
