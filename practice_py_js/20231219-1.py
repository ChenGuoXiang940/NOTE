#泡沫排序法
def bubble_sort(arr):
    (count,count1,count2)=(0,0,0)
    n = len(arr)
    for i in range(n):
        for j in range(0, n-i-1):
            count+=1
            count1+=1
            if arr[j] > arr[j+1] :
                count2+=1
                arr[j], arr[j+1] = arr[j+1], arr[j]
    return count,count1,count2
#選擇排序法
def selection_sort(arr):
    (count,count1,count2)=(0,0,0)
    for i in range(len(arr)):
        min_idx = i
        for j in range(i+1, len(arr)):
            count+=1
            count1+=1
            if arr[min_idx] > arr[j]:
                min_idx = j
        count2+=1
        arr[i], arr[min_idx] = arr[min_idx], arr[i]
    return count,count1,count2
#插入排序法
def insertion_sort(arr):
    (count,count1,count2)=(0,0,0)
    for i in range(1,len(arr)):
        key=arr[i]
        j=i-1
        while j>=0:
            count+=1
            count1+=1
            if(key<arr[j]):
                count2+=1
                arr[j+1]=arr[j]
            j-=1
        arr[j+1]=key
    return count,count1,count2
#希爾排序法
def shell_sort(arr):
    (count,count1,count2)=(0,0,0)
    n = len(arr)
    gap = n//2
    while gap > 0:
        for i in range(gap,n):
            temp = arr[i]
            j = i
            while  j >= gap and arr[j-gap] >temp:
                count+=1
                count1+=2
                count2+=1
                arr[j] = arr[j-gap]
                j -= gap
            count2+=1
            arr[j] = temp
        gap //= 2
    return count,count1,count2
#合併排序法
def merge_sort(arr):
    (count,count1,count2)=(0,0,0)
    def merge(L, R):
        nonlocal count,count1,count2
        i = j = k = 0
        while i < len(L) and j < len(R):
            count+=1
            count1+=3
            if L[i] < R[j]:
                arr[k] = L[i]
                i += 1
            else:
                arr[k] = R[j]
                j += 1
            k += 1
        while i < len(L):
            count+=1
            count1+=1
            arr[k] = L[i]
            i += 1
            k += 1
        while j < len(R):
            count+=1
            count1+=1
            arr[k] = R[j]
            j += 1
            k += 1
    def solve(arr):
        nonlocal count,count1,count2
        count1+=1
        if len(arr) > 1:
            mid = len(arr) // 2
            L = arr[:mid]
            R = arr[mid:]
            solve(L)
            solve(R)
            merge(L, R)
    solve(arr)
    return count,count1,count2
#快速排序法
def quick_sort(arr, low, high):
    (count,count1,count2)=(0,0,0)
    def partition(arr, low, high):
        nonlocal count,count1,count2
        i = (low-1)
        pivot = arr[high]
        for j in range(low , high):
          count+=1
          count1+=1
          if arr[j] <= pivot:
              i = i+1
              count2+=1
              arr[i],arr[j] = arr[j],arr[i]
        count2+=1
        arr[i+1],arr[high] = arr[high],arr[i+1]
        return (i+1)
    def solve(arr,low,high):
        nonlocal count,count1,count2
        count1+=1
        if low < high:
            pi = partition(arr, low, high)
            solve(arr, low, pi-1)
            solve(arr, pi+1, high)
    solve(arr, low, high)
    return count,count1,count2
#堆積排序法
def heap_sort(arr):
    (count,count1,count2)=(0,0,0)
    def heapify(arr, n, i):
        nonlocal count,count1,count2
        largest = i
        l = 2 * i + 1
        r = 2 * i + 2
        count1+=5
        if l < n and arr[i] < arr[l]:
            largest = l
        if r < n and arr[largest] < arr[r]:
            largest = r
        if largest != i:
            count2+=1
            arr[i],arr[largest] = arr[largest],arr[i]
            heapify(arr, n, largest)
    n = len(arr)
    for i in range(n, -1, -1):
        count+=1
        count1+=1
        heapify(arr, n, i)
    for i in range(n-1, 0, -1):
        count+=1
        count1+=1
        arr[i], arr[0] = arr[0], arr[i]
        heapify(arr, i, 0)
    return count,count1,count2
#計數排序法
def counting_sort(arr, max_val):
    (count,count1,count2)=(0,0,0)
    m = max_val + 1
    cnt = [0] * m
    for a in arr:
        count+=1
        count1+=1
        cnt[a] += 1
    i = 0
    count1+=m
    for a in range(m):
        for c in range(cnt[a]):
            count+=1
            count1+=1
            arr[i] = a
            i += 1
    return count,count1,count2
#桶排序法
def bucket_sort(x):
    (count,count1,count2)=(0,0,0)
    def insertion_sort_bucket(b):
        nonlocal count,count1,count2
        for i in range(1, len(b)):
            count+=1
            count1+=1
            up = b[i]
            j = i - 1
            while j >=0 and b[j] > up:
                count+=1
                count2+=2
                b[j + 1] = b[j]
                j -= 1
            b[j + 1] = up
        return b
    arr = []
    slot_num = max(x) + 1
    for i in range(slot_num):
        count+=1
        count1+=1
        arr.append([])
    for j in x:
        count+=1
        count1+=1
        index_b = j
        arr[index_b].append(j)
    for i in range(slot_num):
        count+=1
        count1+=1
        arr[i] = insertion_sort_bucket(arr[i])
    k = 0
    for i in range(slot_num):
        for j in range(len(arr[i])):
            count+=1
            count1+=1
            x[k] = arr[i][j]
            k += 1
    return count,count1,count2
#基數排序法
def radixsort(arr):
    (count,count1,count2)=(0,0,0)
    def counting_sort_radix(arr, exp1):
        nonlocal count,count1,count2
        n = len(arr)
        output = [0] * (n)
        cnt = [0] * (10)
        for i in range(0, n):
            count+=1
            count1+=1
            index = (arr[i]/exp1)
            cnt[int((index)%10 )] += 1
        for i in range(1,10):
            count+=1
            count1+=1
            cnt[i] += cnt[i-1]
        i = n-1
        while i>=0:
            count+=1
            count1+=1
            index = (arr[i]/exp1)
            output[ cnt[ int((index)%10) ] - 1] = arr[i]
            cnt[int((index)%10)] -= 1
            i -= 1
        i = 0
        for i in range(0,len(arr)):
            count+=1
            count1+=1
            arr[i] = output[i]
    max1 = max(arr)
    exp = 1
    while max1/exp > 0:
        count+=1
        count1+=1
        counting_sort_radix(arr,exp)
        exp *= 10
    return count,count1,count2
import copy
import time
def main():
    arr=[8574,245,598,551,174,786,819,867,777,53,673,413,661,231,879,68,489,832,362,567,238,368,654,648,611,676,849,701,403,163,771,83,28,191,946,969,208,811,436,926,435,686,633,658,705,898,310,942,676,341,360,1,669,369,193,881,808,199,145,737,230,533,953,579,269,351,374,265,325,88,216,262,355,533,124,171,534,635,361,299,552,668,444,298,401,870,3,149,613,308,837,886,711,250,568,930,314,283,459,387]
    print("(迴圈，判斷，交換)，時間")
    sort_functions = [
    ("Bubble Sort", bubble_sort),
    ("Selection Sort", selection_sort),
    ("Insertion Sort", insertion_sort),
    ("Shell Sort", shell_sort),
    ("Merge Sort", merge_sort),
    ("Quick Sort", lambda arr: quick_sort(copy.deepcopy(arr), 0, len(arr)-1)),
    ("Heap Sort", heap_sort),
    ("Counting Sort", lambda arr: counting_sort(copy.deepcopy(arr), max(arr))),
    ("Bucket Sort", bucket_sort),
    ("Radix Sort", radixsort)]
    for sort_name, sort_func in sort_functions:
        t = time.time()
        time.sleep(1)
        print(sort_name + ": ", sort_func(copy.deepcopy(arr)), round(time.time()-t-1,5))
    #對於這100個數字，快速排序在迴圈、判斷和交換的次數上都表現得相對較好。
    #但是，快速排序的時間複雜度為O(nlogn)
    #這並不意味著它們在所有情況下都是最好的選擇。最好的排序算法取決於具體的應用場景，包括數據的大小、是否已經部分排序、數據的分佈等因素。
if __name__=="__main__":
    main()