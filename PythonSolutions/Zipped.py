if __name__=="__main__":
    line = input()
    c = int(line.split(" ")[0])
    r = int(line.split(" ")[1])
    l = []
    for i in range(0,r):
        l.append(list(map(float,input().split(" "))))
    for i in range(0,c): #col
        sum = 0.0
        for j in range(0,r): #row
            sum += l[j][i]
        print(sum/r)
