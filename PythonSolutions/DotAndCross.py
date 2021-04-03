import numpy
n = int(input())
l1 = []
l2 = []
for i in range(0,2):
    if i == 0:
        for j in range(n):
            l1.append(list(map(int,input().split())))  
    else:
        for j in range(n):
            l2.append(list(map(int,input().split())))

print(numpy.dot(numpy.array(l1),numpy.array(l2)))
