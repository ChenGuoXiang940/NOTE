#背包問題
w=[20,40,10,30,50]
v=[120,210,50,150,240]
item=[[w[0],v[0]],[w[1],v[1]],[w[2],v[2]],[w[3],v[3]],[w[4],v[4]]]
for i in range(0,len(item),1):
    for j in range(i+1,len(item),1):
        if(item[i][1]/item[i][0]<item[j][1]/item[j][0]):
            tmp=item[i]
            item[i]=item[j]
            item[j]=tmp
print(item)
res=0
cap=100
for i in range(0,len(item),1):
    if(w[i]<=cap):
        res+=item[i][1]
        cap-=item[i][0]
    else:
        break
print(f'得到最大價值:{res} 剩餘空間:{cap}')