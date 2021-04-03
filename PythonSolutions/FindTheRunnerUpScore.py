if __name__ == '__main__':
    n = int(input())
    temp = input().split(" ")
    l = [int(item) for item in temp]
    list.sort(l)
    i = len(l)-1
    while i >0 :
        if(l[i] != l[i-1]):
            print(l[i-1])
            break
        i -= 1   
