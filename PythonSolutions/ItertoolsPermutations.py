import itertools as it
x = input()
s = x.split(" ")[0]
k = int(x.split(" ")[1])
temp = list(it.permutations(s,k))
result = []
for item in temp:
    result.append("".join(item))
list.sort(result)
for item in result:
    print(item) 
