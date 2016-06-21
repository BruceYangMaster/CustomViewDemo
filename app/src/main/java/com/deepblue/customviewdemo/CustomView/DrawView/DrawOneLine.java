package com.deepblue.customviewdemo.CustomView.DrawView;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2016/6/21 0021.
 */
public class DrawOneLine extends View {

    private Paint mPaint;

    public DrawOneLine(Context context) {
        super(context);
        init();
    }

    private void init() {
        mPaint = new Paint();
        mPaint.setColor(Color.BLUE);
        mPaint.setAntiAlias(true);
        /**
         * Set the paint's style
         Paint.Style.FILL    :填充内部
         Paint.Style.FILL_AND_STROKE  ：填充内部和描边
         Paint.Style.STROKE  ：仅描边
         */
        mPaint.setStyle(Paint.Style.STROKE);
        /**
         * Set the width for stroking.
         */
        mPaint.setStrokeWidth(10);
    }

    public DrawOneLine(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public DrawOneLine(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        /**
         * setShadowLayer (float radius, float dx, float dy, int color)    添加阴影
         */
//        mPaint.setShadowLayer(50, 15, 15, Color.GREEN);//设置阴影
        /**
         *  public void drawLine(float startX, float startY, float stopX, float stopY,
         @NonNull Paint paint)
         The x-coordinate of the start point of the line
         */
        canvas.drawLine(0, 20, 305, 20, mPaint);
        /**
         * drawCircle(float cx, float cy, float radius, @NonNull Paint paint)
         */
        canvas.drawCircle(350, 50, 50, mPaint);
        float []pts={10,10,100,100,200,200,400,400};
        canvas.drawLines(pts, mPaint);
    }
}
