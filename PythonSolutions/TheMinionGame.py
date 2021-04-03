def minion_game(string):
    # your code goes here
    kevin = 0
    stuart = 0
    length = len(string)
    for i in range(length):
        if string[i] in "AEIOU":
            kevin += (length-i)
        else:
            stuart += (length-i)
    if kevin > stuart:
        print("Kevin", kevin)
    elif kevin < stuart:
        print("Stuart", stuart)
    else:
        print("Draw")
