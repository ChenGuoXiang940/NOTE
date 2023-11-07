#質數篩選
isprime=[True]*10001
for i in range(2,10001,1):
    if(isprime[i] is True):
        for j in range(i+i,10001,i):
            isprime[j]=False
isprime[0]=isprime[1]=False
while True:
    n=int(input('輸入查詢範圍(最大1E4):'))
    if(n>1E4):
        print('超過範圍!')
        continue
    cnt=0
    for i in range(1,n+1,1):
        if(isprime[i] is True):
            print(i)
            cnt+=1
    print(f'小於等於{n}的質數共有{cnt}個')