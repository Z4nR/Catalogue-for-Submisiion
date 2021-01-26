package com.zulham.filmtvapp.utils

import com.zulham.filmtvapp.R
import com.zulham.filmtvapp.model.Film

object FilmData {

    private val title = arrayOf(
            "Jumanji: Level One",
            "Jumanji: Level One",
    )

    private val date = arrayOf(
            "January, 20 2021",
            "January, 20 2021",
    )

    private val production = arrayOf(
            "Anchors",
            "Anchors",
    )

    private val genre = arrayOf(
            "Adventure, Comedy",
            "Adventure, Comedy",
    )

    private val description = arrayOf(
            "Set in 1869, two children receive a mysterious game after their father goes missing in the jungles of Africa. They unravel both the secret of their father’s disappearance and the origin of Jumanji. See how it all began.",
            "Set in 1869, two children receive a mysterious game after their father goes missing in the jungles of Africa. They unravel both the secret of their father’s disappearance and the origin of Jumanji. See how it all began.",
    )

    private val img = arrayOf(
            R.drawable.jumanji,
            R.drawable.jumanji,
    )

    val film: ArrayList<Film>
        get() {
            val film: ArrayList<Film> = arrayListOf()
            for (position in title.indices) {
                film.add(Film(
                        title[position],
                        date[position],
                        production[position],
                        genre[position],
                        description[position],
                        img[position]))
            }
            return film
        }
}