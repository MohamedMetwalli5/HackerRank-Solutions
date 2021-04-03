n = int(input())
l = list(map(int,input().split(" ")))
print(all((item > 0) for item in l) and any((item < 10) or (item % 11 == 0) for item in l))  
