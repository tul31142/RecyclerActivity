package edu.temple.simplerecyclerview

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter: RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>()
 {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NumberViewHolder {
        return NumberViewHolder(TextView(parent.context).apply {

        })
    }

    override fun onBindViewHolder(
        holder: NumberViewHolder,
        position: Int
    ) {
       holder.textView.text = ((position + 1) * 5).toString()
    }

    override fun getItemCount(): Int {
       return 20
    }

    class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView) {
    }


}