import numpy
if __name__=="__main__":
    temp = list(map(int,input().split(" ")))
    n = temp[0]
    m = temp[1]
    p = temp[2]
    l1 = []
    l2 = []
    for i in range(n):
        l1.append(list(map(int,input().split(" "))))
    for i in range(m):
        l2.append(list(map(int,input().split(" "))))    
    print(numpy.concatenate((numpy.array(l1),numpy.array(l2)),axis=0))
