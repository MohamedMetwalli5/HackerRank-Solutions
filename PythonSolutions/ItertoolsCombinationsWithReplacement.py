from itertools import combinations_with_replacement
l,k = input().split()
temp = sorted(list(combinations_with_replacement(str(l),int(k))))
result = []
for item in temp:
    result.append(("".join(sorted(item))))
result = sorted(result)
print(*result,sep = "\n")
