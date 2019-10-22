package com.sty.ne.musiclist.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

/**
 * Created by tian on 2019/10/22.
 */

public class RoundRectImageView extends AppCompatImageView {
    private Paint paint;

    public RoundRectImageView(Context context) {
        this(context, null);
    }

    public RoundRectImageView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RoundRectImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        paint = new Paint();
    }

    /**
     * 绘制圆角矩形
     * @param canvas
     */
    @Override
    protected void onDraw(Canvas canvas) {
        Drawable drawable = getDrawable();
        if(null != drawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            Bitmap b = getRoundBitmap(bitmap, 20);

            final Rect rectSrc = new Rect(0, 0, b.getWidth(), b.getHeight());
            final Rect rectDest = new Rect(0, 0, getWidth(),  getHeight());
            paint.reset();
            canvas.drawBitmap(b, rectSrc, rectDest, paint);
        }else {
            super.onDraw(canvas);
        }
    }

    /**
     * 获取圆角矩形图片方法
     * @param bitmap
     * @param roundPx 一般设置成14
     * @return
     */
    private Bitmap getRoundBitmap(Bitmap bitmap, int roundPx) {
        Bitmap output = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(output); //关联画布和output Bitmap

        final int color = 0xff000000;

        final Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        final RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0); //将画布置成透明
        paint.setColor(color);

        canvas.drawRoundRect(rectF, roundPx, roundPx, paint); //黑色圆角矩形Bitmap
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN)); //取两层绘制交集，显示上层
        canvas.drawBitmap(bitmap, rect, rect, paint); //src是bitmap子集区域，将该子集区域绘制到dst中，可能会缩放该子集区域

        return output;
    }
}
