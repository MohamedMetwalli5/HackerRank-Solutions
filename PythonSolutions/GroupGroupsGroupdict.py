s = input()
flag =0 
for i in range(len(s)-1):
    if s[i].isalnum() and s[i+1].isalnum() and s[i] == s[i+1]:
        print(s[i])
        flag = 1
        break
if flag == 0:
    print(-1)
