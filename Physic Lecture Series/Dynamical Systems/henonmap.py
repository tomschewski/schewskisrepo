import matplotlib.pyplot as plt
import numpy  as  np

def calctrajectory(start, lim):
    x_n1 = 1 - 1.4 * (start[0]**2) + start[1]
    y_n1 = 0.3 * start[0]

    xtrajectory = [x_n1]
    ytrajectory = [y_n1]

    for i in range(lim):
        xtrajectory.append(1 - 1.4 * (xtrajectory[i]**2) + ytrajectory[i])
        ytrajectory.append(0.3 * xtrajectory[i])

    trajectory = [xtrajectory, ytrajectory]
    return(trajectory)

    
start = [0,0]
start2 = [-1, 0]
trajectory1 = calctrajectory(start, 10000)
trajectory2 = calctrajectory(start2, 10000)

fig, ((ax1, ax2), (ax3, ax4)) = plt.subplots(nrows=2, ncols=2)

ax1.scatter(trajectory1[0],  trajectory1[1], color="blue")

ax2.scatter(trajectory2[0],  trajectory2[1],  color="red")

heatmap, xedges, yedges = np.histogram2d(trajectory1[0],  trajectory1[1], bins=60)
extent = [xedges[0], xedges[-1], yedges[0], yedges[-1]]
ax3.imshow(heatmap.T, extent=extent, origin='lower')

heatmap, xedges, yedges = np.histogram2d(trajectory2[0],  trajectory2[1], bins=60)
extent = [xedges[0], xedges[-1], yedges[0], yedges[-1]]
ax4.imshow(heatmap.T, extent=extent, origin='lower')

#print(xtrajectory1[999990:], ytrajectory1[999990:])

plt.show()
