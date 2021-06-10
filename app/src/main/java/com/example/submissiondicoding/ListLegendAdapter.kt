package com.example.submissiondicoding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListLegendAdapter(private val listLegend: ArrayList<Legends>) : RecyclerView.Adapter<ListLegendAdapter.ListViewHolder>(){
    private lateinit var onItemClickCallback: OnItemClickCallback

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_legend_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_legend_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_legend_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_list_legends, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listLegend.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val legend = listLegend[position]

        Glide.with(holder.itemView.context)
            .load(legend.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvName.text = legend.name
        holder.tvDetail.text = legend.detail
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listLegend[holder.adapterPosition]) }
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback{
        fun onItemClicked(data: Legends)
    }
}