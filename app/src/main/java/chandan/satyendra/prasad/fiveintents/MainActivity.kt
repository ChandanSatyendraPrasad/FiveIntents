package chandan.satyendra.prasad.fiveintents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("on create called")

    }

    override fun onResume() {
        super.onResume()

        println("on resume called")

    }


    override fun onPause() {
        super.onPause()

        println("on pause called")

    }

    override fun onStop() {
        super.onStop()

        println("on stop called")

    }

    override fun onDestroy() {
        super.onDestroy()

        println("on destroy called")

    }

    fun next(view: View) {
        val userNameText=findViewById<EditText>(R.id.userNameText)
        val nameText=findViewById<EditText>(R.id.nameText)
        println("username:"+ userNameText.text.toString() +" "+"name:"+nameText.text.toString())
        val intent = Intent(applicationContext,NewActivity::class.java)
        intent.putExtra("username",userNameText.text.toString())
        intent.putExtra("name",nameText.text.toString())
        startActivity(intent)
        finish()
    }

}