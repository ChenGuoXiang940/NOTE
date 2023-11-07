#數字排列組合
int_array = [0] * 10
def dfs(check,iterate,arr):
    if iterate==len(arr):
        print(int_array[:iterate])#只關心 int_array 前 iterate 元素
        return
    for i in range(len(arr)):
        if(check[i]):continue
        int_array[iterate]=arr[i]
        check[i]=True
        dfs(check,iterate+1,arr)
        check[i]=False
def main():
    arr=[1,2,3,4,5,6]
    dfs([False] * len(arr),0,arr)
if __name__ == "__main__":
    main()