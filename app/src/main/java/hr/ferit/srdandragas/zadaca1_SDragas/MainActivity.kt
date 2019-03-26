package hr.ferit.srdandragas.zadaca1_SDragas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_open_smeier : Button = findViewById(R.id.smeier)
        btn_open_smeier.setOnClickListener {
            val intent = Intent(this, sid_Meier :: class.java)
            startActivity(intent)
        }
        val btn_open_thoward : Button = findViewById(R.id.thoward)
        btn_open_thoward.setOnClickListener {
            val intent = Intent(this, todd_Howard :: class.java)
            startActivity(intent)
        }
        val btn_open_jromero : Button = findViewById(R.id.jromero)
        btn_open_jromero.setOnClickListener {
            val intent = Intent(this, john_Romero :: class.java)
            startActivity(intent)
        }
    }
}
