package chandan.satyendra.prasad.fiveintents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class NewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        val userNameTextNextActivity = findViewById<TextView>(R.id.userNameTextNextActivity)
        val nameTextNextActivity = findViewById<TextView>(R.id.nameTextNextActivity)
        //getIntent
        val intent = intent
        val username = intent.getStringExtra("username")
        val name = intent.getStringExtra("name")
        if (username.isNullOrBlank()) {
            userNameTextNextActivity.setText("Username is not set")
        }
        else
        {
            userNameTextNextActivity.setText("Username: " + username)
        }
        if(name.isNullOrBlank())
        {
            nameTextNextActivity.setText("Name is not set")
        }
        else
        {
            nameTextNextActivity.setText("Name: " + name)
        }
        println("username:new " + username + " " + "name: new " + name)
        /* userNameTextNextActivity.setText("Username: " + username)
         nameTextNextActivity.setText("Name: " + name)*/
    }
}