// NOTE: no native object detectors are currently provided or used by the code
// in this directory. This class remains mainly for historical reasons.
// Detection in the TF demo is done through TensorFlowMultiBoxDetector.java.

#include "tensorflow/examples/android/jni/object_tracking/object_detector.h"

namespace tf_tracking {

// This is here so that the vtable gets created properly.
ObjectDetectorBase::~ObjectDetectorBase() {}

}  // namespace tf_tracking
