class Parent1:
    def __init__(self, name):
        self.name = name

class Parent2:
    def __init__(self, age):
        self.age = age

class Children(Parent1, Parent2):
    def __init__(self, name, age, grade):
        Parent1.__init__(self, name)
        Parent2.__init__(self, age)
        self.grade = grade

child1 = Children("Kavan", 19, 12)
print(child1.name)
print(child1.age)
print(child1.grade)
print("21DCE023 KAVAN GANDHI")
