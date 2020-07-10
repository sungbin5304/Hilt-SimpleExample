package com.sungbin.hilt.example.module

import android.annotation.SuppressLint
import com.sungbin.hilt.example.model.FileDataModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import java.io.File
import javax.inject.Named
import kotlin.random.Random

@SuppressLint("SdCardPath")
@Suppress("RECEIVER_NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")

@Module
@InstallIn(ApplicationComponent::class)
class FileModule {

    @Provides
    @Named("name")
    fun provideFileName(): ArrayList<FileDataModel> {
        val array = ArrayList<FileDataModel>()
        val files = File("/sdcard").list().map {
            val file = File(it)
            array.add(FileDataModel(file.name))
        }
        return array
    }

    @Provides
    @Named("random")
    fun provideFilePath(): ArrayList<FileDataModel> {
        val array = ArrayList<FileDataModel>()
        val files = File("/sdcard").list().map {
            val file = File(it)
            array.add(FileDataModel(Random.nextInt(0, 10000).toString()))
        }
        return array
    }
}