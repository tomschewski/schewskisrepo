import numpy as np
import matplotlib.pyplot as plt


#1.
"""x = np.linspace(0, 10, 10000)
y = np.e**(-x/10)*np.sin(x)

print(x, y)

plt.plot(x, y)
plt.show()

#2.
upperlim = x<=7
lowerlim = x>=4
interval = upperlim * lowerlim

ymean = np.mean(y[interval])
#as oneliner :
ymean = np.mean(y[(x>=4) * (x<=7)])
ystd = np.std(y[(x>=4) * (x<=7)])
print(ymean, ystd)

#3.

ym = np.percentile(y[(x>=4) * (x<=7)], 80)
print(ym)

#4.
plt.plot(x, np.gradient(y,x))
plt.show()

#5.
dydx = np.gradient(y,x)
print(x[1:][dydx[1:] * dydx[:-1] < 0])"""


#Question 2

nums = np.arange(0, 10001, 1)
S = sum(nums[(nums%4 != 0) * (nums%7 != 0)])
print(S)
