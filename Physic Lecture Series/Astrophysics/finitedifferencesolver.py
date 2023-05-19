import numpy as np 
import matplotlib.pyplot as plt
import math

#start condition is gaussian profile and we have a grid of 100 points between -1 and 1

def initialcond(nx, delta_x, d):
    x = []
    y = []
    for i in range (nx):
        x.append(-1 + i * delta_x)
        y.append(math.exp(-(x[i]**2)/d))
    
    return x, y

nx = 100
delta_x = 2 / nx
d = 0.1
sim_lenght = 5000
delta_t = 1
start_at = 0

x , y = initialcond(nx, delta_x, d)
dataX = []
dataY = []
dataT = []

def updatepos(i):
    return(-y[(i-1)%nx] + y[(i+1)%nx]) / 2 * delta_x

for i in range(int(sim_lenght / delta_t)):
    for j in range(nx):
        y[j] += updatepos(j) * delta_t

        if i * delta_t >= 0 and i % (.1 * sim_lenght / delta_t) == 0:
            dataX.append(x[j])
            dataY.append(y[j])
            dataT.append(i * delta_t)

fig = plt.figure()
ax = fig.add_subplot(projection="3d")
ax.set_xlabel('x')
ax.set_ylabel('t')
ax.set_zlabel('f(x)')



ax.scatter(dataX, dataT, dataY)

plt.show()
