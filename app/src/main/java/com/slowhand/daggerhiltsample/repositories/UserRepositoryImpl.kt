package com.slowhand.daggerhiltsample.repositories

import android.util.Log
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(): UserRepository {
    companion object {
        private val TAG = UserRepositoryImpl::class.java.simpleName ?: ""
    }
    override fun fetch() {
        Log.d(TAG, "UserRepositoryImpl fetch")
    }
}