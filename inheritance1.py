class Parent:
    def __init__(self, name):
        self.name = name
    
    def display(self):
        print("Name:", self.name)

class Child(Parent):
    def __init__(self, name, age):
        Parent.__init__(self, name)
        self.age = age
    
    def display(self):
        print("Name:", self.name)
        print("Age:", self.age)

c = Child("Kavan", 19)
c.display()
print("21DCE023 KAVAN GANDHI")
