package com.noureldin.musicplaying.mvvm

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class SongViewModelFactory(val repository: SongRepository) : ViewModelProvider.Factory {


    @RequiresApi(Build.VERSION_CODES.R)
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SongViewModel::class.java)){
            return SongViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel Class")

    }
}