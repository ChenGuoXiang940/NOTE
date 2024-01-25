#實作二分搜樹
class Node(object):
    def __init__(root, value=None):
        root.value = value
        root.left = None
        root.right = None
class BST:
    def __init__(self):
        self.root = None
    def insertRec(self,root,val):
        if root is None:
            return Node(val)
        elif val<root.value:
            root.left=self.insertRec(root.left,val)
        elif val>root.value:
            root.right=self.insertRec(root.right,val)
        return root;
    def post(self,root):
        if root is None:
            return
        self.post(root.left)
        self.res+=str(root.value)+","
        self.post(root.right)
    def insert(self,val):
        self.root=self.insertRec(self.root,val)
    def getPost(self):
        self.res=""
        self.post(self.root)
        return self.res
import random
def main():
    arr=[random.randint(1, 100) for i in range(10)]
    print(f"原始排序:{','.join(map(str, arr))}")
    bst=BST()
    for i in arr:
        bst.insert(i)
    print(f"二分搜樹中序走訪:{bst.getPost()[:-1]}")
if __name__=="__main__":
    main()