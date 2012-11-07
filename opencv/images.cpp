#include <iostream>

#include <opencv2/opencv.hpp>

using namespace std;
using namespace cv;

int main()
{
    // load the image
    Mat img = imread("../lena_std.tif");

    // show it in a window
    imshow("Image", img);

    // image window will immediately disappear if the program ends, so
    // we'll wait for a keypress, indefinitely
    waitKey();

    // do a simple transformation: convert to grayscale

    // first copy the image
    Mat img_gray = img.clone();
    // now convert to grayscale
    cvtColor(img, img_gray, CV_RGB2GRAY);

    // save the image
    bool ret = imwrite("../lena_std-gray.tif", img_gray);
    if(ret) {
        cout << "Save worked." << endl;
    } else {
        cout << "Save failed." << endl;
    }

    return 0;
}
