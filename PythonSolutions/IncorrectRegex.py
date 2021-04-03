import re
n = int(input())
for i in range(n):
    s = input()
    try:
        regex = re.compile(s)
        temp = regex.search("abc")
        print("True")
    except:
        print("False")
