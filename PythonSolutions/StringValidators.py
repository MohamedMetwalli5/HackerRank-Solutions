if __name__ == '__main__':
    s = input()
    l = [0,0,0,0,0]
    for i in range(len(s)):
        if s[i].isalnum():
            l[0] = 1
        if s[i].isalpha():
            l[1] = 1
        if s[i].isdigit():
            l[2] = 1
        if s[i].islower():
            l[3] = 1
        if s[i].isupper():
            l[4] = 1    
    for item in (l):
        if item == 1:
            print("True")
        else:
            print("False") 
