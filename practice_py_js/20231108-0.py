#最大切分乘積問題
#10 = 3 + 3 + 4
#36 = 3 * 3 * 4
#考慮質數 3 、 2
#2 * 2 * 2 > 3 * 3
import math
def maxcutting(n):
    if(n<=3):
        return n-1;
    (a,b)=(n//3,n%3)
    if(b==1):
        return int(math.pow(3,a-1)*4)
    elif(b==2):
        return int(math.pow(3,a)*2)
    else:
        return int(pow(3,a))
while True:
    n=int(input('輸入一個數:'))
    print(maxcutting(n))
