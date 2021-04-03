if __name__=="__main__":
    t = int(input())
    for i in range(t):
        n1 = int(input())
        set1 = set(list(input().split(" ")))
        n2 = int(input())
        set2 = set(list(input().split(" ")))
        if set1.issubset(set2):
            print("True")
        else:
            print("False")
