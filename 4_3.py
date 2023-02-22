def string_test(s):
    d={"Uppercase":0,"Lowercase":0}
    for c in s:
        if c.isupper():
            d["Uppercase"]+=1
        elif c.islower():
            d["Lowercase"]+=1
        else:
            pass
    print('The original String is:',s)
    print('The Number of Uppercase Characters in string:',d["Uppercase"])
    print('The Number of Lowercase Characters in string:',d["Lowercase"])
    print('21DCE020 Kavan Gandhi')

str=input("Enter the String: ")
string_test(str)

