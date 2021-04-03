if __name__=="__main__":
    set1 = set(list(input().split(" ")))
    n = int(input())
    set2 = set(list(input().split(" ")))
    for i in range(n-1):
        set2 = set2.union(set(list(input().split(" "))))
    if set2.issubset(set1):
        print("True")
    else:
        print("False")
