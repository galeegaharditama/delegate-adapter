package com.galih.delegate_adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

interface IDelegateAdapter <M, in VH : RecyclerView.ViewHolder> {
    val modelClass: Class<out M>

    fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder
    fun bindViewHolder(position:Int,model: M,viewHolder: VH)

    open fun onViewRecycled(viewHolder: VH) = Unit
    open fun onViewDetachedFromWindow(viewHolder: VH) = Unit
    open fun onViewAttachedToWindow(viewHolder: VH) = Unit
}