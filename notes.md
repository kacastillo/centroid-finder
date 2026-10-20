## Image Summary App
Groups colors into 0s or 1s, which convert to either black or white. Which then gets sorted into groups, from smallest to largest, due to clusters. Which are colorized pixels that are touching each other. 

## ImagesGroup Finder
- Where we find connected group in an images and got sorted descending

## ImageBinarizer
- will convert BufferedImage into binary 2d array (convert back and forth between color images nd black-n-white 0/1 arrays.)

## BinarizingImageGroupFinder
Implementation of ImageGroupFinder that first binarizes given image and then finds groups of white pixels.
