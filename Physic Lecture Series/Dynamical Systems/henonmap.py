import matplotlib.pyplot as plt
from statistics import mean

def calctrajectory(start, lim):
    x_n1 = 1 - 1.25 * (start[0]**2) + start[1]
    y_n1 = 0.3 * start[0]

    xtrajectory = [x_n1]
    ytrajectory = [y_n1]

    for i in range(lim):
        xtrajectory.append(1 - 1.4 * (xtrajectory[i]**2) + ytrajectory[i])
        ytrajectory.append(0.3 * xtrajectory[i])

    return(xtrajectory, ytrajectory)

    
start = [0,0]
start2 = [-1, 0]
xtrajectory1, ytrajectory1 = calctrajectory(start, 10000)
xtrajectory2, ytrajectory2 = calctrajectory(start2, 10000)

plt.subplot(121)
plt.scatter(xtrajectory1, ytrajectory1, color="blue")

plt.subplot(122)
plt.scatter(xtrajectory2, ytrajectory2, color="red")

#print(xtrajectory1[999990:], ytrajectory1[999990:])

plt.show()