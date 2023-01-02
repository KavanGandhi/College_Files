D={
    "Dept":"CE",
    "College":"DEPSTAR",
    "ID":"21DCE023"}
print("Keys in dictionary are",D.keys());
print("Values  in dictionary are",D.values());
D.update({"ID":"21DCE000"})
print("Updated dictionary is",D)
D.pop("ID")
print(D)
D.popitem()
print(D)

x= D.get("Dept")
print("Department value from dictionary is",x)
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
D4={**D1,**D2,**D3}
print(D4)


