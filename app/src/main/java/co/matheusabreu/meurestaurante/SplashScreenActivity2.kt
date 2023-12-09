package co.matheusabreu.meurestaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashScreenActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen2)

        Handler(Looper.getMainLooper()).postDelayed({
            val i = intent
            val j = Intent(this, DadosPedidosActivity2::class.java)
            j.putExtras(i)
            startActivity(j)
        }, 2000)
    }
}