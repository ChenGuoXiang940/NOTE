#排序法
import random
def create_list():
    return [random.randint(1, 20) for i in range(10)]
def create_list2():
    return [i for i in range(10)]
def write(msg,my_list):
    print(F"{msg} {' '.join(map(str, my_list))}")
def main():
    my_list = create_list()
    write('原始排序:',my_list)
    write('升序排序:',sorted(my_list))
    write('降序排序:',sorted(my_list, reverse=True))
if __name__ == "__main__":
    main()