import calendar
date = input()
n = (calendar.weekday(int(date.split(" ")[2]),int(date.split(" ")[0]),int(date.split(" ")[1])))
dict = {0:"MONDAY",1:"TUESDAY",2:"WEDNESDAY",3:"THURSDAY",4:"FRIDAY",5:"SATURDAY",6:"SUNDAY",}
print(dict[n])
