package br.com.matsuda.marcos.primeiroprojeto

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        carregar()
    }

    private fun carregar(){

        Handler().postDelayed({
            chamarProximatela()
        }, 2000L)
    }

    private fun chamarProximatela() {
        // var -> variavel
        // val -> constante

        val proximaTelaIntent = Intent( this, FormularioActivity::class.java )

        startActivity(proximaTelaIntent)

        //nao esquecer de incluir esse metodo na tela de splashScreen!!!
        finish()

    }



}
