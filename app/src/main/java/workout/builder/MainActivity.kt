package workout.builder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

//Committing a comment to test git
//Ass penis
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.preferences_btn)
        button.setOnClickListener{
            //Toast.makeText(this@MainActivity,"aqpwaqpwsuna", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, preference::class.java)
            startActivity(intent)

        }

    }
}
