### NeMusicList 网易云音乐的歌单界面（高斯模糊，界面适配，跑马灯）
#### 1. 思路
`FrameLayout`下有`RelativeLayout`和`ToolBar`,`RelativeLayout`中包含`ListView`和‘播放全部’悬浮条，
`ListView`包含头布局和数据列表部分，头布局中包含假的悬浮条等复杂元素。根据`ListView`的滚动距离来设置各个
控件的背景透明度以及‘播放全部’悬浮条的显示与隐藏。

#### 3. 注意
1. `setSupportActionBar(toolbar)` 设置之后记得设置主题为`NoActionBar`  
2. (`mutate`) 同名资源文件存在属性共享问题，可能会发生莫名的影响

#### 3. 示例效果如下图所示  
![image](https://github.com/tianyalu/NeMusicList/blob/master/show/show.gif)