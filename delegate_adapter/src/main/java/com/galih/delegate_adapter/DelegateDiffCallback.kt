package com.galih.delegate_adapter

import androidx.recyclerview.widget.DiffUtil

internal class DelegateDiffCallback: DiffUtil.ItemCallback<IDelegateItem>() {

    override fun areItemsTheSame(oldItem: IDelegateItem, newItem: IDelegateItem): Boolean =
        oldItem::class == newItem::class && oldItem.id() == newItem.id()

    override fun areContentsTheSame(oldItem: IDelegateItem, newItem: IDelegateItem): Boolean =
        oldItem.hashCode() == newItem.hashCode()
}