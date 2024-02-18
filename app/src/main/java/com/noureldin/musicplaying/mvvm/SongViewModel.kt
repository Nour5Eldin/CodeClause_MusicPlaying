package com.noureldin.musicplaying.mvvm

import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.noureldin.musicplaying.model.Song
@RequiresApi(Build.VERSION_CODES.R)
class SongViewModel(private val repository: SongRepository) : ViewModel() {

    fun showtheList(context: Context): LiveData<List<Song>>{
        return repository.getAudioFiles(context)
    }
}


