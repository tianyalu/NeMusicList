package com.sty.ne.musiclist.ui;

import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by tian on 2019/10/23.
 */

public class ViewCalculateUtil {
    private static final String TAG = ViewCalculateUtil.class.getSimpleName();

    /**
     * 根据屏幕的大小设置RelativeLayout 中view的宽高和外边距
     * @param view
     * @param width
     * @param height
     * @param topMargin
     * @param bottomMargin
     * @param leftMargin
     * @param rightMargin
     * @param asWidth
     */
    public static void setViewRelativeLayoutParam(View view, int width, int height, int topMargin, int bottomMargin,
                                          int leftMargin, int rightMargin, boolean asWidth) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();

        if(layoutParams != null) {
            if(width != RelativeLayout.LayoutParams.MATCH_PARENT &&
                    width != RelativeLayout.LayoutParams.WRAP_CONTENT &&
                    width != RelativeLayout.LayoutParams.FILL_PARENT) {
                layoutParams.width = UIUtils.getInstance().getWidth(width);
            }else {
                layoutParams.width = width;
            }
            if(height != RelativeLayout.LayoutParams.MATCH_PARENT &&
                    height != RelativeLayout.LayoutParams.WRAP_CONTENT &&
                    height != RelativeLayout.LayoutParams.FILL_PARENT) {
                layoutParams.height = asWidth ? UIUtils.getInstance().getWidth(height) :
                    UIUtils.getInstance().getHeight(height);
            }else {
                layoutParams.height = height;
            }

            layoutParams.topMargin = asWidth ? UIUtils.getInstance().getWidth(topMargin) :
                    UIUtils.getInstance().getHeight(topMargin);
            layoutParams.bottomMargin = asWidth ? UIUtils.getInstance().getWidth(bottomMargin) :
                    UIUtils.getInstance().getHeight(bottomMargin);
            layoutParams.leftMargin = UIUtils.getInstance().getWidth(leftMargin);
            layoutParams.rightMargin = UIUtils.getInstance().getWidth(rightMargin);

            view.setLayoutParams(layoutParams);
        }
    }

    /**
     * 根据屏幕的大小设置FrameLayout中 view的宽高和外边距
     * @param view
     * @param width
     * @param height
     * @param topMargin
     * @param bottomMargin
     * @param leftMargin
     * @param rightMargin
     * @param asWidth
     */
    public static void setViewFrameLayoutParam(View view, int width, int height, int topMargin, int bottomMargin,
                                          int leftMargin, int rightMargin, boolean asWidth) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();

        if(layoutParams != null) {
            if(width != RelativeLayout.LayoutParams.MATCH_PARENT &&
                    width != RelativeLayout.LayoutParams.WRAP_CONTENT &&
                    width != RelativeLayout.LayoutParams.FILL_PARENT) {
                layoutParams.width = UIUtils.getInstance().getWidth(width);
            }else {
                layoutParams.width = width;
            }
            if(height != RelativeLayout.LayoutParams.MATCH_PARENT &&
                    height != RelativeLayout.LayoutParams.WRAP_CONTENT &&
                    height != RelativeLayout.LayoutParams.FILL_PARENT) {
                layoutParams.height = asWidth ? UIUtils.getInstance().getWidth(height) :
                        UIUtils.getInstance().getHeight(height);
            }else {
                layoutParams.height = height;
            }

            layoutParams.topMargin = asWidth ? UIUtils.getInstance().getWidth(topMargin) :
                    UIUtils.getInstance().getHeight(topMargin);
            layoutParams.bottomMargin = asWidth ? UIUtils.getInstance().getWidth(bottomMargin) :
                    UIUtils.getInstance().getHeight(bottomMargin);
            layoutParams.leftMargin = UIUtils.getInstance().getWidth(leftMargin);
            layoutParams.rightMargin = UIUtils.getInstance().getWidth(rightMargin);

            view.setLayoutParams(layoutParams);
        }
    }

    /**
     * 设置view的内边距
     * @param view
     * @param topPadding
     * @param bottomPadding
     * @param leftPadding
     * @param rightPadding
     */
    public static void setViewPadding(View view, int topPadding, int bottomPadding, int leftPadding,
                                      int rightPadding) {
        view.setPadding(UIUtils.getInstance().getWidth(leftPadding),
                UIUtils.getInstance().getHeight(topPadding),
                UIUtils.getInstance().getWidth(rightPadding),
                UIUtils.getInstance().getHeight(bottomPadding));
    }

    /**
     * 设置字号
     * @param view
     * @param size
     */
    public static void setTextSize(TextView view, int size) {
        view.setTextSize(TypedValue.COMPLEX_UNIT_PX, UIUtils.getInstance().getHeight(size));
    }

    /**
     * 根据屏幕大小设置LinearLayout 中view的宽高
     * @param view
     * @param width
     * @param height
     * @param asWidth
     */
    public static void setViewLinearLayoutParam(View view, int width, int height, boolean asWidth) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();

        if(layoutParams != null) {
            if(width != RelativeLayout.LayoutParams.MATCH_PARENT &&
                    width != RelativeLayout.LayoutParams.WRAP_CONTENT &&
                    width != RelativeLayout.LayoutParams.FILL_PARENT) {
                layoutParams.width = UIUtils.getInstance().getWidth(width);
            }else {
                layoutParams.width = width;
            }

            if(height != RelativeLayout.LayoutParams.MATCH_PARENT &&
                    height != RelativeLayout.LayoutParams.WRAP_CONTENT &&
                    height != RelativeLayout.LayoutParams.FILL_PARENT) {
                layoutParams.height = asWidth ? UIUtils.getInstance().getWidth(height) :
                    UIUtils.getInstance().getHeight(height);
            }else {
                layoutParams.height = height;
            }

            view.setLayoutParams(layoutParams);
        }
    }

    /**
     * 根据屏幕大小设置LinearLayout 中view的宽高和外边距
     * @param view
     * @param width
     * @param height
     * @param asWidth
     */
    public static void setViewLinearLayoutParam(View view, int width, int height, int topMargin,
                                                int bottomMargin, int leftMargin, int rightMargin,
                                                boolean asWidth) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();

        if(layoutParams != null) {
            if(width != RelativeLayout.LayoutParams.MATCH_PARENT &&
                    width != RelativeLayout.LayoutParams.WRAP_CONTENT &&
                    width != RelativeLayout.LayoutParams.FILL_PARENT) {
                layoutParams.width = UIUtils.getInstance().getWidth(width);
            }else {
                layoutParams.width = width;
            }

            if(height != RelativeLayout.LayoutParams.MATCH_PARENT &&
                    height != RelativeLayout.LayoutParams.WRAP_CONTENT &&
                    height != RelativeLayout.LayoutParams.FILL_PARENT) {
                layoutParams.height = asWidth ? UIUtils.getInstance().getWidth(height) :
                        UIUtils.getInstance().getHeight(height);
            }else {
                layoutParams.height = height;
            }

            layoutParams.topMargin = asWidth ? UIUtils.getInstance().getWidth(topMargin) :
                    UIUtils.getInstance().getHeight(topMargin);
            layoutParams.bottomMargin = asWidth ? UIUtils.getInstance().getWidth(bottomMargin) :
                    UIUtils.getInstance().getHeight(bottomMargin);
            layoutParams.leftMargin = UIUtils.getInstance().getWidth(leftMargin);
            layoutParams.rightMargin = UIUtils.getInstance().getWidth(rightMargin);

            view.setLayoutParams(layoutParams);
        }
    }
}
