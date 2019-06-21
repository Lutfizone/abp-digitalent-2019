package id.cashflow.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.cashflow.android.util.Calculator

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Halo Bandung!")

        val calc = Calculator()
        val resultSum :Int = calc.sum(x=5, y=5)
        println("result : ${resultSum}")
        val resultSub :Int = calc.sub(x=5, y=5)
        println("result : ${resultSub}")
        val resultTimes :Int = calc.times(x=5, y=5)
        println("result : ${resultTimes}")
        val resultdiv :Int = calc.div(x=5, y=5)
        println("result : ${resultdiv}")

    }

}