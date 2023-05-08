package workout.builder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import kotlin.math.log

class preference : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preference)

        var checkBox1 = findViewById<Button>(R.id.checkBox1)
        val checkBox2 = findViewById<Button>(R.id.checkBox2)
        val checkBox3 = findViewById<Button>(R.id.checkBox3)
        val checkBox4 = findViewById<Button>(R.id.checkBox4)
        val checkBox5 = findViewById<Button>(R.id.checkBox5)
        val checkBox6 = findViewById<Button>(R.id.checkBox6)
        val checkBox7 = findViewById<Button>(R.id.checkBox7)


        findViewById<CheckBox>(R.id.checkBox1)
            .setOnCheckedChangeListener { _, isChecked ->
                Log.d("CHECKBOXES", "Chest Flys is : $isChecked")
                Toast.makeText(this@preference,"checkBox1 is ${isChecked}", Toast.LENGTH_SHORT).show()
            }

        findViewById<CheckBox>(R.id.checkBox2)
            .setOnCheckedChangeListener { _, isChecked ->
                Toast.makeText(this@preference,"checkBox2 is ${isChecked}", Toast.LENGTH_SHORT).show()
            }

        findViewById<CheckBox>(R.id.checkBox3)
            .setOnCheckedChangeListener { _, isChecked ->
                Toast.makeText(this@preference,"checkBox3 is ${isChecked}", Toast.LENGTH_SHORT).show()
            }

        findViewById<CheckBox>(R.id.checkBox4)
            .setOnCheckedChangeListener { _, isChecked ->
                Toast.makeText(this@preference,"checkBox4 is ${isChecked}", Toast.LENGTH_SHORT).show()
            }

        findViewById<CheckBox>(R.id.checkBox5)
            .setOnCheckedChangeListener { _, isChecked ->
                Toast.makeText(this@preference,"checkBox5 is ${isChecked}", Toast.LENGTH_SHORT).show()
            }

        findViewById<CheckBox>(R.id.checkBox6)
            .setOnCheckedChangeListener { _, isChecked ->
                Toast.makeText(this@preference,"checkBox5 is ${isChecked}", Toast.LENGTH_SHORT).show()
            }

        findViewById<CheckBox>(R.id.checkBox7)
            .setOnCheckedChangeListener { _, isChecked ->
                Toast.makeText(this@preference,"checkBox5 is ${isChecked}", Toast.LENGTH_SHORT).show()
            }




    }
}