package ir.android.batman.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import ir.android.batman.BaseActivity.Companion.span
import ir.android.batman.R
import ir.android.batman.holder.HolderRowMovie
import ir.android.batman.model.ListMovie
import java.util.*

class AdapterList
    (var context: Context, var recyclerView: RecyclerView) :
    RecyclerView.Adapter<HolderRowMovie>() {
    var list: ArrayList<ListMovie>? = ArrayList()

    private var listener: OnItemClickListener? = null

    fun setOnItemClickListener(listener: OnItemClickListener?) {
        this.listener = listener
    }

    interface OnItemClickListener {
        fun onClick(position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderRowMovie {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row_list, parent, false)
        return HolderRowMovie(v)
    }

    override fun onBindViewHolder(holder: HolderRowMovie, position: Int) {
        val item = list!![position]
        try {
            Glide.with(context).load(item.Poster)
                .error(R.drawable.placeholder)
                .placeholder(R.drawable.placeholder)
                .into(holder.image)
            holder.txt_movieName.text = item.Title
            holder.txt_type.text = span("Type  " + item.Type, 4, 1f)
            holder.txt_year.text = span("Year  " + item.year, 4, 1f)
            holder.cv.setOnClickListener { view: View? ->
                listener!!.onClick(
                    holder.adapterPosition
                )
            }
        } catch (ignored: Exception) {
        }
    }


    override fun getItemCount(): Int {
        return list!!.size
    }


}