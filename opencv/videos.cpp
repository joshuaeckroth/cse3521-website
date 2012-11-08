#include <iostream>

#include <opencv2/opencv.hpp>

using namespace std;
using namespace cv;

int main()
{
    VideoCapture capture(-1); // use webcam
    //VideoCapture capture("input.mpg"); // use input file
    Mat frame;

    if(capture.isOpened()) {
        // if using webcam:
        int fps = 30;
        // if using input file:
        //int fps = capture.get(CV_CAP_PROP_FPS);
        
        int width = capture.get(CV_CAP_PROP_FRAME_WIDTH);
        int height = capture.get(CV_CAP_PROP_FRAME_HEIGHT);
        cout << "FPS: " << fps << ", width: " << width << ", height: " << height << endl;

        VideoWriter writer("output.mpg",
                           CV_FOURCC('P','I','M','1'),
                           fps, cvSize(width, height), 0); // 0 means gray, 1 means color

        if(writer.isOpened()) {
            while(true) {
                capture >> frame;

                if(!frame.empty()) {
                    imshow("Video", frame);
                }
                
                Mat frame_gray = frame.clone();
                cvtColor(frame, frame_gray, CV_RGB2GRAY);
                writer << frame_gray;
                    
                int key = waitKey(10);
                if((char)key == 'q') { break; }
            }
        }
    }

    return 0;
}
