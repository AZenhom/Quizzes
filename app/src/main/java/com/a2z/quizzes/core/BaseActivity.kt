package com.a2z.quizzes.core

import android.annotation.SuppressLint
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.a2z.quizzes.R
import com.google.android.material.appbar.MaterialToolbar
import es.dmoral.toasty.Toasty


@SuppressLint("SourceLockedOrientationActivity")
abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity() {

    abstract val binding: VB

    abstract fun onActivityCreated()


    var doubleBackToExitPressedOnce = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Force app in portrait
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        setContentView(binding.root)

        initObservers()
        onActivityCreated()
    }

    private fun initObservers() {

        onBackPressedDispatcher.addCallback(this, onBackPressedCallback)
    }

    fun showWarningMsg(msg: String) {
        Toasty.warning(this, msg, Toasty.LENGTH_LONG).show()
    }

    fun showErrorMsg(msg: String) {
        Toasty.error(this, msg, Toasty.LENGTH_LONG).show()
    }

    fun showSuccessMsg(msg: String) {
        Toasty.success(this, msg, Toasty.LENGTH_LONG).show()
    }

    protected open fun setTitleWithBack(title: String) {
        setTitle(title)
        supportActionBar?.elevation = 0f
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
    }

    protected open fun showKeyboard(focusedView: View) {
        try {
            val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
            imm.showSoftInput(focusedView, InputMethodManager.SHOW_IMPLICIT)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    protected open fun hideKeyboard() {
        try {
            val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
            var view = currentFocus
            if (view == null) {
                view = View(this)
            }
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    protected open val onBackPressedCallback: OnBackPressedCallback =
        object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                if (doubleBackToExitPressedOnce)
                    finish()
                else {
                    doubleBackToExitPressedOnce = true
                    Toasty.info(this@BaseActivity, getString(R.string.click_twice)).show()
                    Handler(Looper.getMainLooper()).postDelayed({
                        doubleBackToExitPressedOnce = false
                    }, 2000)
                }
            }
        }

    protected fun registerToolBarOnBackPressed(toolbar: MaterialToolbar) {
        toolbar.setNavigationOnClickListener { onBackPressedDispatcher.onBackPressed() }
    }

    inline fun <T : ViewBinding> AppCompatActivity.viewBinding(
        crossinline bindingInflater: (LayoutInflater) -> T
    ) =
        lazy(LazyThreadSafetyMode.NONE) {
            bindingInflater.invoke(layoutInflater)
        }
}