package id.cashflow.android

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import id.cashflow.android.util.Calculator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        ivNotification.setOnClickListener{
            Toast.makeText(this@MainActivity,"Notification", Toast.LENGTH_SHORT).show()
        }
        ivSetting.setOnClickListener {
            Toast.makeText(this@MainActivity,"Setting",Toast.LENGTH_SHORT).show()
        }
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


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_main_setting,menu)
        return true

    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return when(item?.itemId){
            R.id.action_setting -> {
                Toast.makeText(this@MainActivity, "setting",Toast.LENGTH_SHORT).show()
                    true
            }
            R.id.action_logout ->{
                Toast.makeText(this@MainActivity,"logout",Toast.LENGTH_SHORT).show()
                    true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}