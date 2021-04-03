import numpy
l = list(map(float,input().split()))
x = int(input())
print(numpy.polyval(numpy.array(l),x))
