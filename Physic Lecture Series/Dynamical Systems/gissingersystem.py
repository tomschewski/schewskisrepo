import numpy as np
import matplotlib.pyplot as plt
from scipy.integrate import odeint

def odes(x, t):
    # constants
    u = 0.119
    v = 0.1
    g = 0.9
    
    # assign each ODe to a vector Element
    X = x[0]
    Y = x[1]
    Z = x[2]

    # define each ODE
    dXdt = u*X - Y*Z
    dYdt = -v*Y + X*Z
    dZdt = g - Z + X*Y

    return(dXdt, dYdt, dZdt)

fig = plt.figure()
ax = plt.axes(projection='3d')

# inital condition
x0 = [3,3,3]

#print(odes(x0, 0))

# declare a time vector using numpy
t = np.linspace(0,15,1000)
x = odeint(odes,x0,t)

X = x[:,0]
Y = x[:,1]
Z = x[:,2]

ax.scatter(X, Y, Z)

plt.show()
