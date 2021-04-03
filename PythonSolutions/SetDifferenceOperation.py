if __name__ == "__main__":
    n = int(input())
    l1 = input().split(" ")
    n2 = int(input())
    l2 = input().split(" ")
    print(len(set(l1).difference(set(l2))))
