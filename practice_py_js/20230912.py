#實作迴圈找最大與最小值
import random
import sys
def write(msg,my_list):
    print(F"{msg} {' '.join(map(str, my_list))}")
def main():
    arr=[random.randint(1, 20) for i in range(10)]
    write("陣列內容:",arr)
    val_max=0
    val_min=sys.maxsize
    for item in arr:
        val_max=max(val_max,item)
        val_min=min(val_min,item)
    print("最大值:",val_max)
    print("最小值:",val_min)
if __name__=="__main__":
    main()