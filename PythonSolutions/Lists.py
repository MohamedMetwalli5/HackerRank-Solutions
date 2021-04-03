if __name__ == '__main__':
    N = int(input())
    l = []
    line = []
    for _ in range(N):
        line = input()
        operation = line.split(" ")[0]
        if operation == "insert":
            index = int(line.split(" ")[1])
            l.insert(index,int(line.split(" ")[2]))
        elif operation == "remove":
            l.remove(int(line.split(" ")[1]))
        elif operation == "pop":
            l.pop()    
        elif operation == "print":
            print(l)
        elif operation == "append":
            l.append(int(line.split(" ")[1]))
        elif operation == "reverse":
            l.reverse()
        else:
            list.sort(l)
