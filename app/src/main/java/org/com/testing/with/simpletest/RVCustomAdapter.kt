package org.com.testing.with.simpletest

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import java.lang.Exception

/**
 * TODO: Implement the Adapter that will populate a RecyclerView using the information generated in ViewModel
 * */

class RVCustomAdapter(
    var items: List<Article>
): Adapter<RVCustomAdapter.CustomHolder>() {

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view_item, parent, false)

        return CustomHolder(itemView = view)
    }

    override fun onBindViewHolder(holder: CustomHolder, position: Int) {
        val item = items[position]
        // Load Item Image
        Picasso.get().load(item.imageURL).into(holder.itemImage, object : Callback {
            override fun onError(e: Exception?) {
                if (e != null) {
                    Log.e("Picasso onError", e.localizedMessage ?: "--------------")
                }
            }

            override fun onSuccess() {
                Log.e("Picasso onSuccess", "-----------------")
            }
        })
        // Set Title
        holder.titleText.text = item.title
        holder.contentText.text = item.content
    }

    // TODO: CustomHolder

    class CustomHolder(itemView: View) : ViewHolder(itemView) {
        var itemImage: ImageView
        var titleText: TextView
        var contentText: TextView

        init {
            itemImage = itemView.findViewById(R.id.mImageViewCardViewItem)
            titleText = itemView.findViewById(R.id.mTextViewTitle)
            contentText = itemView.findViewById(R.id.mTextViewContent)
        }
    }

}