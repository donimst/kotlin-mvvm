package com.hokagelab.kotlin_mvvm.ui.post

import androidx.lifecycle.MutableLiveData
import com.hokagelab.kotlin_mvvm.base.BaseViewModel
import com.hokagelab.kotlin_mvvm.model.Post

class PostViewModel: BaseViewModel() {
    private val postTitle = MutableLiveData<String>()
    private val postBody = MutableLiveData<String>()

    fun bind(post: Post){
        postTitle.value = post.title
        postBody.value = post.body
    }

    fun getPostTitle():MutableLiveData<String>{
        return postTitle
    }

    fun getPostBody(): MutableLiveData<String> {
        return postBody
    }
}