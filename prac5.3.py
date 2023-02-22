class employee:
    count=0
    def __init__(self,name,salary):
        self.name=name
        self.salary=salary
        employee.count=employee.count+1

    def displaycount(self):
        print("Count:",self.count)
         
    def displayemp(self):
        print("name:",self.name)
        print("salary:",self.salary)
        print("Raised salary:",self.salary+(self.salary*1.04)/100)

name= input("Enter name") 
salary=int(input("Enter salary"))
e1= employee(name,salary)
e2=employee("kavan",2000)
e1.displaycount()
e1.displayemp()
e2.displayemp()
print("21DCE023 KAVAN GANDHI")