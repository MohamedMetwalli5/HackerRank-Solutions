import numpy
line = list(map(int,input().split(" ")))
n = line[0]
m = line[1]
a = []
b = []
for i in range(0,2):
    if i == 0:
        for j in range(n):
            a.append(list(map(int,input().split(" "))))
    else:
        for j in range(n):
            b.append(list(map(int,input().split(" "))))
print(str(numpy.array(a)+numpy.array(b)))
print(str(numpy.array(a)-numpy.array(b)))
print(str(numpy.array(a)*numpy.array(b)))
print(str(numpy.array(a)//numpy.array(b)))
print(str(numpy.array(a)%numpy.array(b)))
print(str(numpy.array(a)**numpy.array(b)))
