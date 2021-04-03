if __name__ == "__main__":
    n1 = int(input())
    l1 = (input())
    n2 = int(input())
    l2 = (input())
    result = list(set(map(int,l1.split(" "))).difference(set(map(int,l2.split(" ")))) )
    temp = list(set(map(int,l2.split(" "))).difference(set(map(int,l1.split(" ")))))
    for item in temp:
        result.append(item)
    list.sort(result)
    # print(result)
    for i in result:
        print(i)
