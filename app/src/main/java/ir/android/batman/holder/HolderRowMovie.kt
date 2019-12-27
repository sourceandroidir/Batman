package ir.android.batman.holder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import ir.android.batman.R


class HolderRowMovie(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var cv: CardView = itemView.findViewById(R.id.cardView)
    var image: ImageView = itemView.findViewById(R.id.image)
    var txt_movieName: TextView = itemView.findViewById(R.id.txt_movieName)
    var txt_year: TextView = itemView.findViewById(R.id.txt_year)
    var txt_type: TextView = itemView.findViewById(R.id.txt_type)
}