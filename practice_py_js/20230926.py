#數字開根號
#平方根、窮舉法
import math
def main():
    n=int(input())
    size=math.sqrt(n)
    i=2;res_a=1
    while i<size:
        if n%(i*i)==0:n/=(i*i);res_a*=i
        else:i+=1
    if res_a!=1 and n!=1:print(F"{res_a} sqrt({int(n)})")
    elif n==1:print(res_a)
    else:print(F"sqrt({int(n)})")
if __name__=="__main__":
    main()