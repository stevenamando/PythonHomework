#Number Information Homework - Steven Barnas

num = int(input("What is your favorite integer? "))

print("You entered " + str(num) + " as your number.")
if(num == 42):
    print("I like the number 42 also!")

if(num%2==0):
    print("Your number is even.")
else:
    print("Your number is odd.")

if(num > 0):
    print("Your number is positive.")
elif(num < 0):
    print("Your number is negative.")
else:
    print("Your number is zero.")
