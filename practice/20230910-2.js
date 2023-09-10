function getRandom(x){
    return Math.floor(Math.random()*x);
};
let arr=[]
for(var i=0;i<10;i++){
    arr.push(getRandom(20))
}
console.log(`原始排序: ${arr.join(" ")}`);
arr.sort((a, b) => a - b);
console.log(`升序排序: ${arr.join(" ")}`);
arr.sort((a, b) => b - a);
console.log(`降序排序: ${arr.join(" ")}`);