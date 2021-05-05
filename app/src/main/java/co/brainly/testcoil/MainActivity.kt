package co.brainly.testcoil

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import coil.load

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        findViewById<ImageView>(R.id.message_image_view).apply {
            load("https://media.tenor.com/images/07897c06242f1329ef7c37878b6bed94/tenor.png") {
                listener(
                        onStart = {
                            Log.e("ZXC", "onStart")
                        },
                        onSuccess = { _, _ ->
                            Log.e("ZXC", "onSuccess")
                            visibility = View.VISIBLE
                        }
                )
            }
        }

    }
}
