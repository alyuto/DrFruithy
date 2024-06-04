package com.dicoding.drfruithy.data

import com.dicoding.drfruithy.data.pref.UserModel
import com.dicoding.drfruithy.data.pref.UserPreference
import kotlinx.coroutines.flow.Flow

class Repository private constructor(
    private val userPreference: UserPreference
){
    suspend fun saveSession(user: UserModel) {
        userPreference.saveSession(user)
    }

    fun getSession(): Flow<UserModel> {
        return userPreference.getSession()
    }

    suspend fun logout() {
        userPreference.logout()
    }

    // New methods for theme settings
    fun getThemeSetting(): Flow<Boolean> {
        return userPreference.getThemeSetting()
    }

    suspend fun saveThemeSetting(isDarkModeActive: Boolean) {
        userPreference.saveThemeSetting(isDarkModeActive)
    }

    companion object {
        @Volatile
        private var instance: Repository? = null
        fun getInstance(userPreference: UserPreference): Repository =
            instance ?: synchronized(this) {
                instance ?: Repository(userPreference)
            }.also { instance = it }
    }
}
