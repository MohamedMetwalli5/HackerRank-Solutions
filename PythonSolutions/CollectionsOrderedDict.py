n = int(input())
d = {}
for i in range(n):
    line = input().split(" ")
    key = ""
    for j in range(len(line)-1):
        key = key + line[j]+" "
    try:
        d[key] = d[key] + int(line[len(line)-1])
    except:
        d[key] = int(line[len(line)-1])
for k,v in (d.items()):
    print(str(k) +str(v))  
