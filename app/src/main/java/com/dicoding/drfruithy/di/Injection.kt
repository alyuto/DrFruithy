package com.dicoding.drfruithy.di

import android.content.Context
import com.dicoding.drfruithy.data.Repository
import com.dicoding.drfruithy.data.pref.UserPreference
import com.dicoding.drfruithy.data.pref.dataStore

object Injection {
    fun provideRepository(context: Context): Repository {
        val pref = UserPreference.getInstance(context.dataStore)
        return Repository.getInstance(pref)
    }
}