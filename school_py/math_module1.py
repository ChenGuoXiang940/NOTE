def factors(n):
  lst=[]
  for i in range(1,n+1,1):
    if(n%i==0):
      lst.append(i)
  return lst
def primes(n):
  isprime=[True]*(n+1)
  for i in range(2,n+1,1):
    if(isprime[i]):
      for j in range(i+i,n+1,i):
        isprime[j]=False
  isprime[0]=isprime[1]=False
  lst=[]
  for i in range(0,n+1,1):
    if(isprime[i]):
      lst.append(i)
  return lst