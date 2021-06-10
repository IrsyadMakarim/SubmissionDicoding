package com.example.submissiondicoding

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvLegends: RecyclerView
    private var list: ArrayList<Legends> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Legends"

        rvLegends = findViewById(R.id.rv_legends)
        rvLegends.setHasFixedSize(true)

        list.addAll(LegendsData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList(){
        rvLegends.layoutManager = LinearLayoutManager(this)
        val listLegendAdapter = ListLegendAdapter(list)
        rvLegends.adapter = listLegendAdapter

        listLegendAdapter.setOnItemClickCallback(object : ListLegendAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Legends) {
                showLegendDetails(data)
            }
        })
    }

    private fun showAboutSection(){
        val moveIntent = Intent(this@MainActivity, AboutSection::class.java)
        startActivity(moveIntent)
    }

    private fun showLegendDetails(legends: Legends){
        val detailIntent = Intent(this@MainActivity, LegendDetailsActivity::class.java)
        detailIntent.putExtra(LegendDetailsActivity.EXTRA_NAME, legends.name)
        detailIntent.putExtra(LegendDetailsActivity.EXTRA_DETAIL, legends.detail)
        detailIntent.putExtra(LegendDetailsActivity.EXTRA_PHOTO, legends.photo)
        startActivity(detailIntent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int){
        when(selectedMode){
            R.id.legends_list -> {
                showRecyclerList()
            }

            R.id.about_section -> {
                showAboutSection()
            }
        }
    }
}