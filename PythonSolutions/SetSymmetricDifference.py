if __name__=="__main__":
    n1 = int(input())
    l1 = input().split(" ")
    n2 = int(input())
    l2 = input().split(" ")
    print(len( (set(l1).union(set(l2))).difference((set(l1).intersection(set(l2)))) ))
