import datetime
name = (input("Enter name:"))
age =  int(input("Enter age:"))
a= datetime.datetime.now()
temp = a.year + 100
y = temp - age
print(y)
