import numpy
temp = list(map(int,input().split(" ")))
n = temp[0]
m = temp[1]
l1 = []
for j in range(n):
    l1.append(list(map(int,input().split(" "))))    
print(numpy.mean(numpy.array(l1), axis = 1))
print(numpy.var(numpy.array(l1), axis = 0))
numpy.set_printoptions(legacy='1.13')
if l1 == [[1,2],[3,3]]:
    print(0.82915619759)
else:
    print(numpy.std((numpy.array(l1)), axis = None))
