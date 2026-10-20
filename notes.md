## Image Summary App
Groups colors into 0s or 1s, which convert to either black or white. Which then gets sorted into groups, from smallest to largest, due to clusters. Which are colorized pixels that are touching each other. 

## ImagesGroup Finder
- Where we find connected group in an images and got sorted descending

## ImageBinarizer
- will convert BufferedImage into binary 2d array (convert back and forth between color images nd black-n-white 0/1 arrays.)

## BinarizingImageGroupFinder
Implementation of ImageGroupFinder that first binarizes given image and then finds groups of white pixels.

## BinaryGroupFinder
 returns a list of sorted groups. The group's size is the number of pixels in the group. The centroid of the group is computed as the average of each of the pixel locations across each dimension.

 ## ColorDistanceFinder
 Defines an interface for computing the distance between two colors, with 24-bit, using red, green, and blue

 ## Coordinate
 Shows location of image or array, usually with x,y (row, column)

 ## DfsBinaryGroupFinder
  The method returns a list of sorted groups. The group's size is the number of pixels in the group. The centroid of the group
 is computed as the average of each of the pixel locations across each dimension.

 ## DistanceImageBinarizer
 An implementation of the ImageBinarizer interface that uses color distance to determine whether each pixel should be black or white in the binary image. Constructs a DistanceImageBinarizer using the given ColorDistanceFinder,  target color, and threshold.


## Group
- Where we will find that blobs of white where we will find their center and x,y and also the size of it.
- We gonna compare their size and return something with (size, x,y)

## EuclideanColorDistance
- Where we will return euclidean color distance between two hex RGB colors which basically tell us how different two colors are.