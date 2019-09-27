#MaxMin Homework in Python

#with open("input.txt", "r") as f:
    # to read everything f_contents = f.read()
    # to read line by line from top f_contents = f.readline()
    #for line in f:
     #   print(line, end='')

maxminvalue = open("input.txt", "r")
integers = []
for val in maxminvalue.read().split():
    integers.append(int(val))

def find_Max():
    print("The max value is " + str(max(integers)))

def find_Min():
    print("The min value is " + str(min(integers)))

print("For the set (" )
maxminvalue.close()

