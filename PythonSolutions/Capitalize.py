def solve(s):
    for i in range(len(s)):
        if((i-1>0 and s[i-1] == " ") or (i == 0)):
            s = s[:i] + s[i].capitalize() + s[i+1:]
    return s
