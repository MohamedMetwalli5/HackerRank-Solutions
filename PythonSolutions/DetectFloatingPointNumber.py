import re
n = int(input())
for i in range(n):
    x = input()
    if('.' not in x):
        print("False")
    else:
        l = x.split(".")
        s1 = x.split(".")[0]
        s2 = x.split(".")[1]
        if "+" in s2 or "-" in s2 or len(l) > 2 or (len(s1)>=2 and (s1[1] == "+" or s1[1] == "-")):
            print("False")
        else:   
            s1 = s1.replace("+","",-1)
            s1 = s1.replace("-","",-1)
            # print(s1+""+s2)
            regex = re.compile(r"^\d*$") 
            if(regex.search(s1) and regex.search(s2)):
                print("True")
            else:
                print("False")
