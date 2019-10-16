package kalzira.com.recyclerview.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kalzira.com.recyclerview.R
import kalzira.com.recyclerview.data.Animals

/**
 * Created by Kalzira sabytakunova
 */
class AnimalsAdapter(private val animalsList: List<Animals>, private val context: Context) : RecyclerView.Adapter<AnimalsAdapter.ViewHolder>() {

    override fun onBindViewHolder(viewHolder: ViewHolder, index: Int) {
        viewHolder.titleTextView.text = animalsList[index].title
        viewHolder.descriptionTextView.text = animalsList[index].description

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false))
    }

    override fun getItemCount(): Int {
        return animalsList.size
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val titleTextView: TextView = view.findViewById(R.id.title)
        val descriptionTextView: TextView = view.findViewById(R.id.description)


    }
}