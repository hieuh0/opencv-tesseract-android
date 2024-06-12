package dev.hieuho.test_open_cv

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import dev.hieuho.test_open_cv.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Example of a call to a native method
//        binding.sampleText.text = stringFromJNI()
    }

    /**
     * A native method that is implemented by the 'test_open_cv' native library,
     * which is packaged with this application.
     */
    private external fun findTextCoordinates(bitmap: Bitmap, inputText: String): String

    companion object {
        // Used to load the 'test_open_cv' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }
}