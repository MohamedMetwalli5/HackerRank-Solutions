n1 = int(input())
l = list(input().split(" "))
n2 = int(input())
sum = 0
for i in range(n2):
    s = input()
    try:
        l.remove(s.split(" ")[0])
        sum += int(s.split(" ")[1])
    except:
        flag = 0    
print(sum)
