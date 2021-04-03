import numpy
l = list(map(int,input().split()))
numpy.set_printoptions(sign=' ')
print(numpy.eye(l[0],l[1],k=0))
