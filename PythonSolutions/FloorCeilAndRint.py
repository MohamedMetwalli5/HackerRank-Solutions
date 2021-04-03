import numpy
l = list(map(float,input().split()))
numpy.set_printoptions(sign=' ')
print(numpy.floor(numpy.array(l)))
print(numpy.ceil(numpy.array(l)))
print(numpy.rint(numpy.array(l)))
