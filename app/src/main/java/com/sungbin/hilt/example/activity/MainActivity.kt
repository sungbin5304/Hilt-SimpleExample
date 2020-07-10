package com.sungbin.hilt.example.activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.sungbin.hilt.example.model.FileDataModel
import com.sungbin.hilt.example.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MainActivity : AppCompatActivity(R.layout.activity_main) {

    @Inject
    @Named("name")
    lateinit var fileData: ArrayList<FileDataModel>

    @Inject
    @Named("random")
    lateinit var fileData2: ArrayList<FileDataModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        for(i in 0 until fileData.size){
            Log.d(fileData[i].data, fileData2[i].data)
        }
    }
}