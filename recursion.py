def sum_list(list):
    if list.__len__() == 0:
        return 0
    else:
        value = list[-1]
        list.pop()
        return value + sum_list(list)

inputlist = []
listlength = input("enter the number of items in your list: ")
for i in range(0,int(listlength)):
    inputlist.append(int(input("enter the next element of your list: ")))

print("The sum of all numbers in your list is:", sum_list(inputlist))
