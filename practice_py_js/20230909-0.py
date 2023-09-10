def getsum(list):
   if len(list) == 1:
        return list[0]
   else:
        return list[0] + getsum(list[1:])
   #獲取序列索引1的元素 list[:1]
   #建立索引1到尾的序列(少首) list[1:]
   #建立除了首與尾之外的元素使用 list[1:-1] 第二個元素到倒數第二個元素
def getsum1(list):
    result=0
    for item in list:
        result+=item
    return result
def main():
    arr=[5,7,3,8,10]
    print(F"(遞迴)序列總和:{getsum(arr)}")
    print(F"(迴圈)序列總和:{getsum1(arr)}") 
if __name__=="__main__":
    main()