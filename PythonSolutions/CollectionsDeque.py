import collections
n = int(input())
d = collections.deque()
for i in range(n):
    line = list(input().split())
    if line[0] == "append":
        d.append(int(line[1]))
    elif line[0] == "pop":
        d.pop()
    elif line[0] == "popleft":
        d.popleft()
    elif line[0] == "appendleft":
        d.appendleft(int(line[1]))
    elif line[0] == "clear":
        d.clear()
    elif line[0] == "reverse":
        d.reverse()
    elif line[0] == "maxlen":
        d.maxlen()
print(*d,sep=" ")
