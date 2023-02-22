class student:
    def __init__(self,ID,name):
        self.ID=ID
        self.name=name

class Exam(student):
    def__init__(self,ID,name,marks):
        student.__init__(self,ID)
        self.marks=marks

class result(Exam):
    def__init__(self,)

