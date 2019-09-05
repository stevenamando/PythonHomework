x = 4
y = 2
z = x + y
radius = 3.7
pi = 3.14
print("x+y=" + str(x+y))
print("y+radius=" + ('%.2f' % (y+radius)))
print("x/y=" + str(int(x/y)))
print("x%y=" + str(x%y))
print("y%x=" + str(y%x))
print("radius/x=" + str(round(radius/x, 2)))
print("The area of a circle with radius " + str('%.2f' % radius) + " is " + str('%.2f' % (pi*(radius*radius))))