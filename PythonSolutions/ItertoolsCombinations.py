import itertools
x = input()
s = x.split(" ")[0]
k = int(x.split(" ")[1])
l = []
for i in range(1,k+1):
    l = sorted(itertools.combinations(s,i))
    result = []
    for item in l:
        result.append("".join(sorted(item)))
    result = sorted(result)
    for item in result:
        print(item) 
