cmake_minimum_required(VERSION 3.4.1)
set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_STANDARD_REQUIRED ON)
set(CMAKE_CXX_EXTENSIONS OFF)

add_subdirectory(libjpeg)
add_subdirectory(libpng)
add_subdirectory(leptonica)
add_subdirectory(tesseract)