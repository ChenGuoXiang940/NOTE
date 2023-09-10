def bs(list,left,right,key):
    if left>right:return -1
    mid=int(left+(right-left)/2)
    if list[mid]>key:return bs(list,left,mid-1,key)
    elif list[mid]<key:return bs(list,mid+1,right,key)
    else:return mid
def main():
    arr=[1,5,10,50,100]
    key=50
    print(F"二分搜結果:{bs(arr,0,len(arr)-1,key)}")
if __name__=="__main__":
    main()