#平方根(無根號)
#二分搜
def bs(left,right,key):
    if(left>right):return right
    mid=int(left+(right-left)/2)
    if(mid*mid==key):return mid
    elif(mid*mid<key):return bs(mid+1,right,key)
    else:return bs(left,mid-1,key)
def main():
    n=int(input())
    print(bs(1,1E4,n))
if __name__=="__main__":
    main()