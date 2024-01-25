#菱形
for i in range(1,11,1):
    for j in range(1,11,1):
        if(i+j<6 or (11-i)+j<6 or i+(11-j)<6 or (11-j)+(11-i)<6):
            print(5*' ',end='');
        else:
            print('{:>4d} '.format(i*j),end='');
    print('')