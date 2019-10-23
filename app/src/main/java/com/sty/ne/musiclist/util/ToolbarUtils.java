package com.sty.ne.musiclist.util;

import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.widget.TextView;

import java.lang.reflect.Field;

/**
 * Created by tian on 2019/10/23.
 */

public class ToolbarUtils {
    public static TextView getToolbarTitleView(Toolbar toolbar) {
        try {
            Field field = toolbar.getClass().getDeclaredField("mTitleTextView");
            field.setAccessible(true);

            Object object = field.get(toolbar);
            if(object != null) {
                TextView mTitleTextView = (TextView) object;
                return mTitleTextView;
            }
        }catch (IllegalAccessException e) {

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void setMarqueeForToolbarTitleView(final Toolbar toolbar) {
        toolbar.post(new Runnable() {
            @Override
            public void run() {
                TextView mTitleTextView = getToolbarTitleView(toolbar);
                if(mTitleTextView == null) {
                    return;
                }
                //设备可以水平滚动
                mTitleTextView.setHorizontallyScrolling(true);
                //设备无限循环
                mTitleTextView.setMarqueeRepeatLimit(-1);
                //设备跑马灯模式
                mTitleTextView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                //设备选中
                mTitleTextView.setSelected(true);
            }
        });
    }
}
