### explanation about project


### step1
add the dependency in your build.gradle


```
    //better to replace new version

    //Add TFLite Task Library here
    implementation 'org.tensorflow:tensorflow-lite-task-vision:0.3.1'
    implementation 'androidx.lifecycle:lifecycle-runtime-ktx:2.3.0'
    implementation 'androidx.exifinterface:exifinterface:1.3.2'
 
```


### step2

go the steps on through this link(main documentation *developers.google*)
[link](https://developers.google.com/codelabs/tflite-object-detection-android#0)


### step3

Download the .tflite model from the link below then put it into assets folder in android studio
[link](https://tfhub.dev/tensorflow/lite-model/efficientdet/lite2/detection/metadata/1)

---------------------------------------------------------------------------------------
### demo

![banner](https://raw.githubusercontent.com/mehdisahraeei/object_detection_android/master/demo.png)
