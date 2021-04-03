if __name__== "__main__":
    n =  int(input())
    l = []
    for i in range(n):
        l.append(input())
    print(len(set(l)))   
