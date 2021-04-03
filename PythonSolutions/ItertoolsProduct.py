import itertools
a = list(map(int,input().split(" ")))
b = list(map(int,input().split(" ")))
l = list(itertools.product(a,b))
for item in l:
    print(item,end=" ")
