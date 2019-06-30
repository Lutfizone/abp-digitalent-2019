package id.cashflow.android.ui

import android.content.Intent
import android.os.Bundle
import android.view.MenuInflater
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import id.cashflow.android.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //custom toolbar
//        setSupportActionBar(toolbar)

        //method untuk toolbar
        initView()
        //method untuk fragment
        initFragment()
    }

    private fun initFragment() {
        val mainFragment = MainFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.flFragment, mainFragment)
            .commit()
    }

    private fun settingFragment() {
        val settingFragment = SettingFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.flFragment, settingFragment)
            .commit()
    }

    private fun notificationFragment() {
        val notificationFragment = NotificationFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.flFragment, notificationFragment)
            .commit()
    }

    private fun initView() {

        ivNotification.setOnClickListener {
            onNotificationClick()
        }

        //Popup menu
        ivSetting.setOnClickListener { view ->
            val popup = PopupMenu(this@MainActivity, view)
            val inflater: MenuInflater = popup.menuInflater
            inflater.inflate(R.menu.menu_main_setting, popup.menu)
            popup.setOnMenuItemClickListener {
                when (it.itemId) {
                    R.id.action_setting -> {
                        onSettingClick()
                        true
                    }
                    R.id.action_logout -> {
                        onLogoutClick()
                        true
                    }
                    else -> super.onOptionsItemSelected(it)
                }
            }
            popup.show()
        }
    }

    private fun onNotificationClick() {
        notificationFragment()
    }


    private fun onSettingClick() {
        settingFragment()
    }

    private fun onLogoutClick() {
        startActivity(Intent(this@MainActivity, LoginActivity::class.java))
        finish()


    }
}

//        println("Halo Bandung!")
//
//        val calc = Calculator()
//        val resultSum :Int = calc.sum(x=5, y=5)
//        println("result : ${resultSum}")
//        val resultSub :Int = calc.sub(x=5, y=5)
//        println("result : ${resultSub}")
//        val resultTimes :Int = calc.times(x=5, y=5)
//        println("result : ${resultTimes}")
//        val resultdiv :Int = calc.div(x=5, y=5)
//        println("result : ${resultdiv}")
//
//    }
//
//
//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        val inflater: MenuInflater = menuInflater
//        inflater.inflate(R.menu.menu_main_setting,menu)
//        return true
//
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
//        return when(item?.itemId){
//            R.id.action_setting -> {
//                Toast.makeText(this@MainActivity, "setting",Toast.LENGTH_SHORT).show()
//                    true
//            }
//            R.id.action_logout ->{
//                Toast.makeText(this@MainActivity,"logout",Toast.LENGTH_SHORT).show()
//                    true
//            }
//            else -> super.onOptionsItemSelected(item)
//        }
//    }
//}