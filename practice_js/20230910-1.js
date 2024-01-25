//二分搜
function bs(list,left,right,key){
    if(left>right)return -1
    const mid=Math.floor(left+(right-left)/2)
    if(list[mid]>key)return bs(list,left,mid-1,key)
    else if(list[mid]<key)return bs(list,mid+1,right,key)
    else return mid
}
const arr=[1,5,10,50,100]
const key=50
console.log(bs(arr,0,arr.length-1,key))