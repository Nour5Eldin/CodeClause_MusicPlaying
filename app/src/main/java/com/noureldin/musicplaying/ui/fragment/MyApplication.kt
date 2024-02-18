package com.noureldin.musicplaying.ui.fragment

import android.app.Application
import com.noureldin.musicplaying.service.SongService

class MyApplication : Application() {

    val musicPlayerManager: MusicPlayerManager by lazy { MusicPlayerManager() }
    lateinit var songService: SongService

    companion object{



        lateinit var instance : MyApplication




    }

    override fun onCreate(){
        super.onCreate()

        instance = this
        songService = SongService()



    }
}