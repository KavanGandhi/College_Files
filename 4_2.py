def max_no(a,b,c):
    if(a>b):
        if(a>c):
            return a
    if(b>c):
        return b
    else:
        return c
first=int(input('Enter First Number:'))
sec=int(input('Enter Second Number:'))
third=int(input('Enter Third Number:'))
print('The maximum number of all is: ',max_no(first,sec,third))
print("21DCE023 KAVAN GANDHI")
