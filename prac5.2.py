class employee:
    def __init__(self,name,salary):
        self.name=name
        self.salary=salary
    def display(self):
        print("name:",self.name)
        print("salary:",self.salary)

name= input("Enter name") 
salary=int(input("Enter salary"))
e1= employee(name,salary)
e2=employee("kavan",2000)
e1.display()
e2.display()
print("21DCE023 KAVAN GANDHI")