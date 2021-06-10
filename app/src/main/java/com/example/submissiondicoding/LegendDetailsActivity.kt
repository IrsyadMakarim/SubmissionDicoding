package com.example.submissiondicoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class LegendDetailsActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_NAME = "extra name"
        const val EXTRA_DETAIL = "extra detial"
        const val EXTRA_PHOTO = "image"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.legends_detail)
        supportActionBar?.title = "Legends Detail"

        val tvName: TextView = findViewById(R.id.legends_name)
        val tvDetail: TextView = findViewById(R.id.legends_detail)
        val legendPhoto: ImageView = findViewById(R.id.legends_image)

        val name = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val photo = intent.getIntExtra(EXTRA_PHOTO, 0)

        tvName.text = name
        tvDetail.text = detail

        Glide.with(this)
                .load(photo)
                .apply(RequestOptions())
                .into(legendPhoto)
    }
}