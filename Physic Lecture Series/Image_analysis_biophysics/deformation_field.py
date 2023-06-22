import cv2
import numpy as np

# Load the two input images
image1 = cv2.imread('reference.tif')
image2 = cv2.imread('beads0.tif')

# Convert the images to grayscale
gray1 = cv2.cvtColor(image1, cv2.COLOR_BGR2GRAY)
gray2 = cv2.cvtColor(image2, cv2.COLOR_BGR2GRAY)

# Calculate the optical flow
flow = cv2.calcOpticalFlowFarneback(gray1, gray2, None, 0.5, 3, 13, 3, 5, 1.2, 0)

# Compute the magnitude and angle of the flow vectors
magnitude, angle = cv2.cartToPolar(flow[..., 0], flow[..., 1])

# Create a blank image to draw the flow vectors
h, w = gray1.shape
output = np.zeros((h, w, 3), dtype=np.uint8)
output[..., 0] = gray1
output[..., 1] = gray1
output[..., 2] = gray1

# Define the step size and scale factor for the vectors
step_size = 16
scale_factor = 8

# Draw the flow vectors on the image
for y in range(0, h, step_size):
    for x in range(0, w, step_size):
        dx = int(flow[y, x, 0] * scale_factor)
        dy = int(flow[y, x, 1] * scale_factor)
        cv2.arrowedLine(output, (x, y), (x + dx, y + dy), (0, 255, 0), 1, cv2.LINE_AA)

# Show the original images and the flow vectors
cv2.imshow('Reference', image1)
cv2.imshow('Beads0', image2)
cv2.imshow('Optical Flow', output)
cv2.waitKey(0)
cv2.destroyAllWindows()