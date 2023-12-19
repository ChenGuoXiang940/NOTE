def bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(0, n-i-1):
            if arr[j] > arr[j+1] :
                arr[j], arr[j+1] = arr[j+1], arr[j]
    return arr

# Selection Sort
def selection_sort(arr):
    for i in range(len(arr)):
        min_idx = i
        for j in range(i+1, len(arr)):
            if arr[min_idx] > arr[j]:
                min_idx = j
        arr[i], arr[min_idx] = arr[min_idx], arr[i]
    return arr

# Insertion Sort
def insertion_sort(arr):
    for i in range(1, len(arr)):
        key = arr[i]
        j = i-1
        while j >=0 and key < arr[j] :
                arr[j+1] = arr[j]
                j -= 1
        arr[j+1] = key
    return arr

# Shell Sort
def shell_sort(arr):
    n = len(arr)
    gap = n//2
    while gap > 0:
        for i in range(gap,n):
            temp = arr[i]
            j = i
            while  j >= gap and arr[j-gap] >temp:
                arr[j] = arr[j-gap]
                j -= gap
            arr[j] = temp
        gap //= 2
    return arr

# Merge Sort
def merge_sort(arr):
    if len(arr) >1:
        mid = len(arr)//2
        L = arr[:mid]
        R = arr[mid:]
        merge_sort(L)
        merge_sort(R)
        i = j = k = 0
        while i < len(L) and j < len(R):
            if L[i] < R[j]:
                arr[k] = L[i]
                i+=1
            else:
                arr[k] = R[j]
                j+=1
            k+=1
        while i < len(L):
            arr[k] = L[i]
            i+=1
            k+=1
        while j < len(R):
            arr[k] = R[j]
            j+=1
            k+=1
    return arr

# Quick Sort
def partition(arr, low, high):
    i = (low-1)
    pivot = arr[high]
    for j in range(low , high):
        if arr[j] <= pivot:
            i = i+1
            arr[i],arr[j] = arr[j],arr[i]
    arr[i+1],arr[high] = arr[high],arr[i+1]
    return (i+1)

def quick_sort(arr, low, high):
    if low < high:
        pi = partition(arr, low, high)
        quick_sort(arr, low, pi-1)
        quick_sort(arr, pi+1, high)

# Heap Sort
def heapify(arr, n, i):
    largest = i
    l = 2 * i + 1
    r = 2 * i + 2
    if l < n and arr[i] < arr[l]:
        largest = l
    if r < n and arr[largest] < arr[r]:
        largest = r
    if largest != i:
        arr[i],arr[largest] = arr[largest],arr[i]
        heapify(arr, n, largest)

def heap_sort(arr):
    n = len(arr)
    for i in range(n, -1, -1):
        heapify(arr, n, i)
    for i in range(n-1, 0, -1):
        arr[i], arr[0] = arr[0], arr[i]
        heapify(arr, i, 0)

# Counting Sort
def counting_sort(arr, max_val):
    m = max_val + 1
    count = [0] * m                
    for a in arr:
        count[a] += 1             
    i = 0
    for a in range(m):            
        for c in range(count[a]):  
            arr[i] = a
            i += 1
    return arr

# Bucket Sort
def insertion_sort_bucket(b):
    for i in range(1, len(b)):
        up = b[i]
        j = i - 1
        while j >=0 and b[j] > up: 
            b[j + 1] = b[j]
            j -= 1
        b[j + 1] = up      
    return b      
            
def bucket_sort(x):
    arr = []
    slot_num = max(x) + 1  # Ensure there are enough buckets
    for i in range(slot_num):
        arr.append([])
    for j in x:
        index_b = j
        arr[index_b].append(j)
    for i in range(slot_num):
        arr[i] = insertion_sort_bucket(arr[i])
    k = 0
    for i in range(slot_num):
        for j in range(len(arr[i])):
            x[k] = arr[i][j]
            k += 1
    return x

# Radix Sort
def counting_sort_radix(arr, exp1):
    n = len(arr)
    output = [0] * (n)
    count = [0] * (10)
    for i in range(0, n):
        index = (arr[i]/exp1)
        count[int((index)%10 )] += 1
    for i in range(1,10):
        count[i] += count[i-1]
    i = n-1
    while i>=0:
        index = (arr[i]/exp1)
        output[ count[ int((index)%10) ] - 1] = arr[i]
        count[int((index)%10)] -= 1
        i -= 1
    i = 0
    for i in range(0,len(arr)):
        arr[i] = output[i]

def radixsort(arr):
    max1 = max(arr)
    exp = 1
    while max1/exp > 0:
        counting_sort_radix(arr,exp)
        exp *= 10
def main():
    arr=[8574,245,598,551,174,786,819,867,777,53,673,413,661,231,879,68,489,832,362,567,238,368,654,648,611,676,849,701,403,163,771,83,28,191,946,969,208,811,436,926,435,686,633,658,705,898,310,942,676,341,360,1,669,369,193,881,808,199,145,737,230,533,953,579,269,351,374,265,325,88,216,262,355,533,124,171,534,635,361,299,552,668,444,298,401,870,3,149,613,308,837,886,711,250,568,930,314,283,459,387]
    print("Original Array: ", arr)
    print("Bubble Sort: ", bubble_sort(arr))
    print("Selection Sort: ", selection_sort(arr))
    print("Insertion Sort: ", insertion_sort(arr))
    print("Shell Sort: ", shell_sort(arr))
    print("Merge Sort: ", merge_sort(arr))
    arr1 = arr.copy()
    arr2 = arr.copy()
    arr3 = arr.copy()
    quick_sort(arr1, 0, len(arr)-1)
    print("Quick Sort: ",arr1)
    heap_sort(arr2)
    print("Heap Sort: ",arr2)
    print("Counting Sort: ", counting_sort(arr, max(arr)))
    print("Bucket Sort: ", bucket_sort(arr))
    radixsort(arr3)
    print("Radix Sort: ",arr3)

if __name__=="__main__":
    main()