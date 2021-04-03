n = int(input())
line = input().split().index("MARKS")
sum = 0.0
for i in range(n):
    sum += float(list(input().split())[line])
print(sum/n)
