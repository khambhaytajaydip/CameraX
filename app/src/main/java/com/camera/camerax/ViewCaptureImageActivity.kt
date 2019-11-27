package com.camera.camerax
import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by JAI
 * JAI KHAMBHAYTA
 */

class ViewCaptureImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        // Remember that you should never show the action bar if the
        // status bar is hidden, so hide that too if necessary.
//        actionBar?.hide()
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_viewimage)

        findViewById<ImageView>(R.id.imageView).setImageBitmap(
            BitmapFactory.decodeFile(
                intent.extras!!.getString(
                    "path"
                )
            )
        )


    }

}