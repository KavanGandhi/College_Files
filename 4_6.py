def sum_list(lst):
    sum=0
    for i in lst:
        sum+=i
    print('Sum of the List is:',sum)
    print('21DCE023 KAVAN GANDHI')
lst=[]
siz=int(input('Enter the Size of list:'))
print('Enter the Elements is List:')
for i in range(0,siz):
    element=int(input())
    lst.append(element)
sum_list(lst)

