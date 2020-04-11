package com.example.setgamestub;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

public class SetCardsFieldView extends View {
    public SetCardsFieldView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        // TODO: отобразить состояние карт
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        // TODO: в случе касания, определить, какой карты коснулись

        return super.onTouchEvent(event);
    }
}
