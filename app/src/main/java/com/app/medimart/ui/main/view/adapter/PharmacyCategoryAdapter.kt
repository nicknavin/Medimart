package com.app.medimart.ui.main.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.app.medimart.R
import com.app.medimart.data.model.PharmacyCategory

public class PharmacyCategoryAdapter (context: Context, list: MutableList<PharmacyCategory>): RecyclerView.Adapter<PharmacyCategoryAdapter.MyViewHoler>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHoler {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_category_layout, parent, false)

        return MyViewHoler(view)
    }

    override fun onBindViewHolder(holder: MyViewHoler, position: Int) {
        holder.textView.text="Mask"
    }

    override fun getItemCount(): Int {
        return 15
    }

    class MyViewHoler(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        val imageView: ImageView = itemView.findViewById(R.id.imgCategory)
        val textView: TextView = itemView.findViewById(R.id.txtCategory)
    }


}