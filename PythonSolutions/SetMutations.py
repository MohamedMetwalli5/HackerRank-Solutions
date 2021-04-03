n = int(input())
a = set(map(int,input().split()))
t = int(input())
for i in range(t):
    line = list(input().split())
    s = set(map(int,input().split()))
    if line[0] == "intersection_update":
        a.intersection_update(s)
    elif line[0] == "update":
        a.update(s)    
    elif line[0] == "symmetric_difference_update":
        a.symmetric_difference_update(s)
    elif line[0] == "difference_update":
        a.difference_update(s)
print(sum(a))
