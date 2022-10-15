package com.example.foodapp.util.bindingAdapter

import android.view.View
import androidx.databinding.BindingAdapter
import com.example.foodapp.util.extension.isTrue

@BindingAdapter(value = ["show"])
fun setVisibility(view: View, value: Boolean?) {
    view.visibility = if(value.isTrue()) View.VISIBLE else View.GONE
}
