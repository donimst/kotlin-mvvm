package com.hokagelab.kotlin_mvvm.base

import androidx.lifecycle.ViewModel
import com.hokagelab.kotlin_mvvm.injection.component.DaggerViewModelInjector
import com.hokagelab.kotlin_mvvm.injection.component.ViewModelInjector
import com.hokagelab.kotlin_mvvm.injection.module.NetworkModule
import com.hokagelab.kotlin_mvvm.ui.post.PostListViewModel

abstract class BaseViewModel : ViewModel(){
    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
        }
    }
}