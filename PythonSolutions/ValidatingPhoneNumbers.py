import re
n = int(input())
regex = re.compile(r"^[789]")
for i in range(n):
    s = input()
    if len(s) != 10 or not s.isdecimal():
        print("NO")
    elif regex.search(s):
        print("YES")  
    else:
        print("NO") 
