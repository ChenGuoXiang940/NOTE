#實作二元樹
class Node(object):
    def __init__(root, value=None):
        root.value = value
        root.left = None
        root.right = None
class BinaryTree(object):
    def __init__(self):
        self.root = None
        self.res = ""
    def post(self,root):
        if root is None:
            return
        self.post(root.left)
        self.post(root.right)
        self.res+=str(root.value)+","
    def getpost(self):
        self.res=""
        self.post(self.root)
        return self.res
def main():
    bt=BinaryTree()
    bt.root=Node(1)
    bt.root.left=Node(2)
    bt.root.right=Node(3)
    print(f"後序走訪二元樹:{bt.getpost()}")
if __name__=="__main__":
    main()