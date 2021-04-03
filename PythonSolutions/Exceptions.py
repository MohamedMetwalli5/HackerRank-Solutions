n = int(input())
for i in range(n):
    x = input()
    if not x.split(" ")[0].isdecimal():
        print("Error Code: invalid literal for int() with base 10: " + "'"+x.split(" ")[0]+"'")
    elif (not x.split(" ")[1].isdecimal()):
        print("Error Code: invalid literal for int() with base 10: " + "'"+x.split(" ")[1]+"'")
    else:
        try:
            a = int(x.split(" ")[0])
            b = int(x.split(" ")[1])
            print(a//b)
        except ZeroDivisionError:
            print("Error Code: integer division or modulo by zero")   
