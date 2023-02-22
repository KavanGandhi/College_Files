class student1:
    def __init__(self,cgpa1):
        self.cgpa1=cgpa1
        print("STUDENT 1")
    def display(self):
        print("CGPA of student 1 is ",self.cgpa1)

class student2:
    def __init__(self,cgpa2):
        self.cgpa2=cgpa2
        print("STUDENT 2")
    def display(self):
        print("CGPA of student 2 is ",self.cgpa2)

obj1 =student1(7.22)
obj2 =student2(8.33)
obj1.display()
obj2.display()

if obj1.cgpa1<obj2.cgpa2:
    print("Student 2 is first")
else:
    print("Student 2 is first")

print("21DCE023 KAVAN GANDHI")