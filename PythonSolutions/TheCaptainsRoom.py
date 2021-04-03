if __name__=="__main__":
    k = int(input())
    l = list(map(int,input().split(" ")))
    counter = 1
    flag = 0
    list.sort(l)
    for i in range(len(l)-1):
        if l[i] == l[i+1]:
            counter += 1
        else:
            if counter < k :
                print(l[i])
                flag = 1
                break
            counter = 1
    if flag == 0:
        print(l[len(l)-1])
