class GrandParent:
    def __init__(self, name):
        self.name = name
    
    def display(self):
        print("Name:", self.name)

class Parent(GrandParent):
    def __init__(self, name, age):
        GrandParent.__init__(self, name)
        self.age = age
    
    def display(self):
        print("Name:", self.name)
        print("Age:", self.age)

class Child(Parent):
    def __init__(self, name, age, grade):
        Parent.__init__(self, name, age)
        self.grade = grade
    
    def display(self):
        print("Name:", self.name)
        print("Age:", self.age)
        print("Grade:", self.grade)

c = Child("Kavan", 19, "12")
c.display()
print("21DCE023 KAVAN GANDHI")
