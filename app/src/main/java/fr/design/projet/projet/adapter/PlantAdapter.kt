package fr.design.projet.projet.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import fr.design.projet.projet.R

class PlantAdapter(private val layoutId : Int ) : RecyclerView.Adapter<PlantAdapter.ViewHolder>() {
    //boite pour ranger les composants
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val plantImage = view.findViewById<ImageView>(R.id.image_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view = LayoutInflater
           .from(parent.context)
           .inflate(layoutId, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = 5


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }
}