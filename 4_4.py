lst=[]
siz=int(input('Enter the Size of list:'))
print('Enter the Elements is List:')
for i in range(0,siz):
    element=int(input())
    lst.append(element)
print('Original List:',lst)
square_num=list(map(lambda x:x**2,lst))
print(' Square of List using LAMBDA function:',square_num)
print('21DCE023 KAVAN GANDHI')
