D={
    "Dept":"CE",
    "College":"DEPSTAR",
    "ID":"21DCE023"}
#Obtaining key using keys function
print("Keys in dictionary are",D.keys());
#Obtaining values using values function
print("Values  in dictionary are",D.values());
#updating a dictionary
D.update({"ID":"21DCE000"})
print("Updated dictionary is",D)
#removing a key from dictionary
D.pop("ID")
print(D)
#removing last element in dictionary
D.popitem()
print(D)
#obtatining values
x= D.get("Dept")
print("Department value from dictionary is",x)
#clearing whole dictionary
D.clear()
print(D)

D1={"Dept1":"CSE",
    "College1":"CSPIT",
    "ID1":"21DCE000"}

D2={"Dept2":"IT",
    "College2":"ddke",
    "ID2":"21DCE020"}

D3={"Dept3":"CE",
    "College3":"ddkeXWXX",
    "ID3":"21DCE02000"}
#merging all dictionaries
D4={**D1,**D2,**D3}
print(D4)
print("21DCE023 KAVAN GANDHI")


