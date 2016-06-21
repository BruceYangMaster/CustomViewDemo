package com.deepblue.customviewdemo.CustomView.DrawView;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by user on 2016/6/20.
 */

/**
 * 饼状图
 */
public class PieView extends View {
    private Paint paint;
    private RectF rectF;
    private static final float RADIUS = 300;

    public PieView(Context context) {
        super(context);
        init();
    }

    public PieView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public PieView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(100);


    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        /**
         * 只有在ondraw时候才得到宽高
         */
        float width = getWidth();
        float height = getHeight();
/**
 * RectF(float left, float top, float right, float bottom)
 */
        float left = width / 2 - RADIUS;
        float top = height / 2 - RADIUS;
        float right = width / 2 + RADIUS;
        float bottom = height / 2 + RADIUS;

        rectF = new RectF(left, top, right, bottom);

        paint.setColor(Color.parseColor("#DBBD44"));
        /**
         * drawArc(@NonNull RectF oval, float startAngle, float sweepAngle, boolean useCenter,
         @NonNull Paint paint)
         */
        canvas.drawArc(rectF, 45, 50, false, paint);

        paint.setColor(Color.parseColor("#0054AB"));
        canvas.drawArc(rectF, 95, 50, false, paint);

        paint.setColor(Color.parseColor("#E95859"));
        canvas.drawArc(rectF, 145, 50, false, paint);

        paint.setColor(Color.parseColor("#EEAD32"));

        canvas.drawArc(rectF, 195, 35, false, paint);

        paint.setColor(Color.parseColor("#4CB5E1"));
        canvas.drawArc(rectF, 230, 25, false, paint);

        paint.setColor(Color.parseColor("#4C7797"));
        canvas.drawArc(rectF, 255, 5, false, paint);

        paint.setColor(Color.parseColor("#2AB98F"));
        canvas.drawArc(rectF, 260, 150, false, paint);

    }
}
