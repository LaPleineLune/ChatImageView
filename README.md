# ChatImageView
一个实现图片气泡效果的自定义View
# 使用
### gradle配置
```
compile 'io.github.leibnik:chatimageview:1.0.1'
```
### xml配置
#### 使用.9.png时需指定`app:ninePNG`属性，此时图片的气泡效果由`xfermode`实现
```xml
<io.github.leibnik.chatimageview.ChatImageView
        xmlns:app="http://schemas.android.com/apk/res-auto"
        app:ninePNG="@drawable/ppp"
        android:layout_width="200dp"
        android:layout_height="150dp"/>
```
#### 不使用.9.png时，图片的气泡效果由`BitmapShader`和`Path`实现
```xml
<io.github.leibnik.chatimageview.ChatImageView
        xmlns:app="http://schemas.android.com/apk/res-auto"
        app:direction="left"
        app:arrow_height="15dp"
        app:arrow_width="15dp"
        app:arrow_top="15dp"
        app:offset="7dp"
        app:radius="7dp"
        android:layout_width="200dp"
        android:layout_height="150dp"/>
```

* `app:direction`:箭头朝向，默认朝向左
* `app:arrow_height`:箭头高度
* `app:arrow_width`:箭头宽度
* `app:arrow_top`:箭头距view顶边距离
* `app:offset`:箭头偏移量
* `app:radius`:圆角半径

下图可以清晰看出各个属性的含义
![](http://ww1.sinaimg.cn/mw690/b5405c76gw1f3a7f730jmj214h0jntau.jpg)

# 效果图
![](http://ww3.sinaimg.cn/mw690/b5405c76gw1f3a6dsmvqzg20b40ggqg2.gif)
![](http://ww4.sinaimg.cn/bmiddle/b5405c76gw1f3a5nx1ncwj20fc0rdwgz.jpg)

# License
[Apache 2.0 License](http://www.apache.org/licenses/LICENSE-2.0)