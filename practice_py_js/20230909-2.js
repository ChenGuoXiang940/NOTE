//數字排列組合
function dfs(check,iterate){
    if(iterate==arr.length){
        console.log(int_array)
        return
    }
    for(let i=0;i<arr.length;i++){
        if(check[i])continue
        /*解構賦予*/
        [int_array[iterate], check[i]] = [arr[i], true];
        dfs(check,iterate+1)
        check[i]=false
    }
}
//雖然可以使用 var 來聲明變數，但使用 const 和 let 可提高變數的可維護性(分辨常數與變數)
const arr=[1,2,3]
const int_array=new Array(arr.length)
dfs(new Array(arr.length).fill(false),0)