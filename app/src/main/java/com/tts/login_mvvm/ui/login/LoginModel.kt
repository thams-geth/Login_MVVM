package com.tts.login_mvvm.ui.login

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.tts.login_mvvm.BR


class LoginModel : BaseObservable() {
    private var password: String? = null

    @Bindable
    fun getPassword(): String? {
        return password
    }

    fun setPassword(password: String?) {
        this.password = password
        notifyPropertyChanged(BR.password)
    }
}