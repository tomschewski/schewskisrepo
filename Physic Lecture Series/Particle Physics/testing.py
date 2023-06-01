import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns

#reading data into dataframe
signal_training = pd.read_csv('signal_training.txt', sep='        ', engine='python')
background_training = pd.read_csv('background_training.txt', sep='        ', engine='python')

fig, axs = plt.subplots(ncols=4)

sns.histplot(signal_training['r_cal'], kde=True, stat="density", color="skyblue", label="Signal")
sns.histplot(background_training['r_cal'], kde=True, stat="density", color="red", label="Background")

"""sns.histplot(signal_training['E_T_iso'], kde=True, stat="density", color="skyblue", label="Signal", ax=axs[1])
sns.histplot(background_training['E_T_iso'], kde=True, stat="density", color="red", label="Background", ax=axs[1])

sns.histplot(signal_training['S_t_flight'], kde=True, stat="density", color="skyblue", label="Signal", ax=axs[2])
sns.histplot(background_training['S_t_flight'], kde=True, stat="density", color="red", label="Background", ax=axs[2])

sns.histplot(signal_training['N_iso_trk'], kde=True, stat="density", color="skyblue", label="Signal", ax=axs[3])
sns.histplot(background_training['N_iso_trk'], kde=True, stat="density", color="red", label="Background", ax=axs[3])"""

plt.plot()