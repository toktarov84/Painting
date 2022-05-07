package com.example.painting

import android.content.Context
import android.graphics.*
import android.view.View

class Draw2D(context: Context?) : View(context) {
    private val paint = Paint()
    private val height = resources.displayMetrics.heightPixels.toFloat()
    private val width = resources.displayMetrics.widthPixels.toFloat()

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        paint.apply {
            isAntiAlias = true
            style = Paint.Style.FILL
            textSize = 36F
            strokeWidth = 8F
        }

        paint.color = Color.WHITE
        canvas.drawPaint(paint)

        paint.color = Color.YELLOW
        canvas.drawCircle(150F, 150F, 100F, paint)
        canvas.drawLine(280F, 50F, 430F, 40F, paint)
        canvas.drawLine(295F, 95F, 440F, 105F, paint)
        canvas.drawLine(300F, 140F, 440F, 170F, paint)
        canvas.drawLine(295F, 185F, 430F, 235F, paint)
        canvas.drawLine(280F, 220F, 400F, 300F, paint)
        canvas.drawLine(250F, 250F, 350F, 350F, paint)
        canvas.drawLine(220F, 270F, 290F, 390F, paint)
        canvas.drawLine(190F, 285F, 230F, 410F, paint)
        canvas.drawLine(155F, 290F, 170F, 420F, paint)
        canvas.drawLine(115F, 290F, 110F, 425F, paint)
        canvas.drawLine(70F, 280F, 50F, 420F, paint)

        paint.color = Color.GREEN
        canvas.drawRect(0F, height - 100, width, height, paint)

        paint.color = Color.BLUE
        canvas.drawText("Лужайка для котов!", 30F, height - 110, paint)

        var bitmap = BitmapFactory.decodeResource(resources, R.drawable.cat)
        canvas.drawBitmap(bitmap, width - 400, height - 300, paint)
    }
}