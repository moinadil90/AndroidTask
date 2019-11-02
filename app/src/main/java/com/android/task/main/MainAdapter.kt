package com.android.task.main


import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.task.R
import com.android.task.click


class MainAdapter(val fragment: MainFragment) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false))

    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.click {
            Log.i("Hello","Hello");
            val adapter = fragment.context?.let { it1 -> SimpleAdapter(it1,  16) }
            val builder = fragment.context?.let { it1 ->
                DialogPlus.newDialog(it1).apply {
                    setContentHolder(holder)

                    val header = if (true) R.layout.header else -1
                    if (header != -1) {
                        setHeader(R.layout.header, true)
                    }

                    val footer = if (true) R.layout.footer else -1
                    if (footer != -1) {
                        setFooter(R.layout.footer, true)
                    }

                    isCancelable = true
                    setGravity(Gravity.BOTTOM)
                    if (adapter != null) {
                        setAdapter(adapter)
                    }
                    setOnClickListener { dialog, view ->
                        dialog.dismiss()
                    }
                    setOnItemClickListener { dialog, item, view, position ->

                    }
                    isExpanded = true



                    overlayBackgroundResource = android.R.color.transparent
                }
            }
            builder?.create()?.show()

        }
    }

    override fun getItemCount(): Int {
        return 25
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}