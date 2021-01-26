package com.zulham.filmtvapp.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.zulham.filmtvapp.R
import com.zulham.filmtvapp.model.Film
import kotlinx.android.synthetic.main.item.view.*
import java.util.*
import kotlin.collections.ArrayList

class FilmAdapter(private val film: ArrayList<Film>, private val mListener: OnItemClicked): RecyclerView.Adapter<FilmAdapter.ListViewHolder>() {

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(film: Film) {
            with(itemView) {
                Glide.with(itemView.context)
                    .load(film.img)
                    .apply(RequestOptions().override(120, 120))
                    .into(img)

                Log.d("titel", film.title.toString())

                title.text = film.title
                genre.text = film.genre
                date.text = film.date

                itemView.setOnClickListener {
                    @Suppress("DEPRECATION")
                mListener.onItemClick(position) }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        Log.d("test", film.size.toString())
        holder.bind(film[position])
    }

    override fun getItemCount(): Int {
        return film.size
    }

    interface OnItemClicked {
        fun onItemClick(position: Int)
    }
}