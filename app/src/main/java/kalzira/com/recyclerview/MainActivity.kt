package kalzira.com.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kalzira.com.recyclerview.adapters.AnimalsAdapter
import kalzira.com.recyclerview.data.Animals

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val animals = generateFakeEmails()
        setUpEmailRecyclerView(animals)
    }

    private fun setUpEmailRecyclerView(animals: List<Animals>) {
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val recyclerAdapter = AnimalsAdapter(animals, this)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = recyclerAdapter
    }

    private fun generateFakeEmails(): List<Animals> {
        val titles = listOf(
                "Dog",
                "Cat",
                "Dug",
                "Pig")
        val descriptions = listOf(
                "Gav Gav",
                "Meow Meow",
                "Krya Krya",
                "Hryu Hryu")

        val emailList = mutableListOf<Animals>()
        for (i in 0..20) {
            emailList.add(
                    Animals(titles.random(), descriptions.random())
            )
        }
        return emailList
    }
}
