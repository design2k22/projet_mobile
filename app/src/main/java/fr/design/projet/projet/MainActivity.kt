package fr.design.projet.projet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import fr.design.projet.projet.fragments.HomeFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // injectiondu fragment container
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, HomeFragment())
        transaction.addToBackStack( null)
        transaction.commit()
    }
}