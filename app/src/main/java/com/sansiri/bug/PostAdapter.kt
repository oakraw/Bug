package com.sansiri.bug

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view_post.view.*

class PostAdapter : RecyclerView.Adapter<PostAdapter.ViewHolder>() {
    private val mPosts = mutableListOf<Post>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_post, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = 0

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(mPosts[position])
    }

    fun setData(posts: List<Post>? = null) {
        posts?.let {
            mPosts.clear()
            mPosts.addAll(it)
        }
    }

    class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        fun bind(post: Post) {
            with(view) {
                textTitle.text = post.title
                textSubtitle.text = post.body.toString()
            }
        }
    }
}