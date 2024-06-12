cmake_minimum_required(VERSION 3.4.1)
project("test_open_cv")
set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_STANDARD_REQUIRED ON)
set(CMAKE_CXX_EXTENSIONS OFF)
add_subdirectory(tesseractlib)
include_directories(${OpenCV_DIR}/jni/include)
add_library( lib_opencv SHARED IMPORTED )
#add_library( tesseract_lib SHARED IMPORTED )
set_target_properties(lib_opencv PROPERTIES IMPORTED_LOCATION ${OpenCV_DIR}/libs/${ANDROID_ABI}/libopencv_java4.so)
#
add_library(native-lib SHARED native-lib.cpp)

find_library( # Sets the name of the path variable.
        log-lib

        # Specifies the name of the NDK library that
        # you want CMake to locate.
        log)

#
#target_link_libraries( # Specifies the target library.
#        lib_opencv
#        # Links the target library to the log library
#        # included in the NDK.
#        ${log-lib})
