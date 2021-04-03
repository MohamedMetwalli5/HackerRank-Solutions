def wrap(string, max_width):
    i = 0
    s = ""
    while i < (len(string)):
        s += string[i:i+max_width]+"\n"
        i += (max_width)
    return s
