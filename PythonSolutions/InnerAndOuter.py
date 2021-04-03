import numpy
a = list(map(int,input().split()))
b = list(map(int,input().split()))
print(numpy.inner(numpy.array(a),numpy.array(b)))
print(numpy.outer(numpy.array(a),numpy.array(b)))
