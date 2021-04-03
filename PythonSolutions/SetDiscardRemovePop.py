n = int(input())
s = set(map(int, input().split()))
n = int(input())
for i in range(n):
    line = input()
    if line == "pop":
        t = s.pop()
    elif line[:6] == "remove":
        s.remove(int(line.split(" ")[1]))
    elif line[:7] == "discard":
        s.discard(int(line.split(" ")[1]))
sum = 0
for item in s:
    sum += item
print(sum)
