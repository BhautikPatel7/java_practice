l = 0
for i in range(5):
    print("i",i,end=" ")
    print()
    for j in range(6):
        print("j",j,end=" ")
        for k in range(7):
            print("k",k , end=" ")
            if (i%2==0 or j%2==0 or k%2==0):
                l +=1

print(l)