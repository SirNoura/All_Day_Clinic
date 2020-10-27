package ipca.roject.alldayproject

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler


class SplashScreen : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val handler = Handler()
        handler.postDelayed({ mostrarMainActivity() }, 3000)
    }

    private fun mostrarMainActivity() {
        val intent = Intent(
                this@SplashScreen, MainActivity::class.java
        )
        startActivity(intent)
        finish()
    }
}