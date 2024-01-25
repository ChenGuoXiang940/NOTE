#尤拉公式 計算 1～n 中與 n 互質之個數
def gcd(a,b):
    if(a==1):
        return b
    return (b if a%b==0 else gcd(b,a%b))
while True:
    n=int(input('請輸入一個正整數:'))
    res0=1
    print('1')
    for i in range(1,n,1):
        if(gcd(i,n)==1):
            print(f'{i}')
            res0+=1
    res=n
    cnt=2
    count=0
    list=[]
    while(cnt<=n):
        if(n%cnt==0):
            n/=cnt
            count+=1
        else:
            if(count!=0):
                list.append([cnt,count])
                count=0
            cnt+=1
    if(count!=0):
        list.append([cnt,count])
    print(list)
    for i in list:
        res*=(1-1/i[0])
    print(F'與之互質共有:{res0} 尤拉公式求得:{round(res)} 結果:{res0 is round(res)}')
    