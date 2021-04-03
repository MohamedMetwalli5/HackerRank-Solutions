import numpy
if __name__=="__main__":
    temp = list(map(int,input().split(" ")))
    n = temp[0]
    m = temp[1]
    l = []
    for i in range(n):
        l.append(list(map(int,input().split(" "))))
    arr = numpy.array(numpy.min(numpy.array(l),axis=1))
    print(numpy.max(arr))
