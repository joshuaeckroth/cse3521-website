
import cv2

backsub = cv2.BackgroundSubtractorMOG()

capture = cv2.VideoCapture("Balcony4_Vis.mpg")
#capture = cv2.VideoCapture(-1)
if capture:
    while True:
        ret, frame = capture.read()
        if ret:
            fgmask = backsub.apply(frame, None, 0.01)
            contours, hierarchy = cv2.findContours(fgmask.copy(), cv2.RETR_EXTERNAL,
                                                   cv2.CHAIN_APPROX_NONE)
            try: hierarchy = hierarchy[0]
            except: hierarchy = []
            for contour, hier in zip(contours, hierarchy):
                (x,y,w,h) = cv2.boundingRect(contour)
                if w > 10 and h > 10:
                    # figure out id
                    best_id = 1
                    .....

                    cv2.rectangle(frame, (x,y), (x+w,y+h), (255, 0, 0), 2)
                    cv2.putText(frame, str(best_id), (x,y-5), cv2.FONT_HERSHEY_SIMPLEX,
                                0.5, (255, 0, 0), 2)
            cv2.imshow("Track", frame)

            key = cv2.waitKey(10)
            if key == ord('q'):
                break
