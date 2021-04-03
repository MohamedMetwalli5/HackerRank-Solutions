import numpy
n = int(input())
l1 = []
numpy.set_printoptions(legacy='1.13')
for i in range(n):
    l1.append(list(map(float,input().split()))) 
print(numpy.linalg.det(numpy.array(l1)))
