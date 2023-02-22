def sgpaCalc(marks,n):
    grade=[0]*n;

    sum=0

    for i in range(n):
        grade[i]=marks[i]/10

    for i in range(n):
        sum+=grade[i]

    sgpa=sum/n

    return sgpa

n=5
marks=[90,50,60,80,90]
Sgpa = sgpaCalc(marks,n)
print("SGPA=",'%.1f' % Sgpa)

if(Sgpa>10):
    print("Grade:AA")
elif(Sgpa>8.0 and Sgpa<9.0):
    print("Grade:AB")
elif(Sgpa>7.0 and Sgpa<8.0):
    print("Grade:BB")
elif(Sgpa>6.0 and Sgpa<7.0):
    print("Grade:AB")
else:
    print("Grade:FF")

print("21DCE023 KAVAN GANDHI")

