package com.a2z.quizzzes.ui.splash

import android.annotation.SuppressLint
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import android.view.animation.AccelerateInterpolator
import android.view.animation.AnimationUtils
import com.a2z.quizzzes.R
import com.a2z.quizzzes.core.BaseActivity
import com.a2z.quizzzes.databinding.ActivitySplashBinding
import com.a2z.quizzzes.ui.grades.GradesActivity

@SuppressLint("CustomSplashScreen")
class SplashActivity : BaseActivity<ActivitySplashBinding>() {

    override val binding: ActivitySplashBinding by viewBinding(ActivitySplashBinding::inflate)

    override fun onActivityCreated() {
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        initAnimation()
        navigateToGradesActivity()
    }

    private fun initAnimation() {
        val animation = AnimationUtils.loadAnimation(this, R.anim.splash)
        animation.interpolator = AccelerateInterpolator()
        animation.duration = 600
        binding.ivLogo.animation = animation
    }

    private fun navigateToGradesActivity() {
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(GradesActivity.getIntent(this))
            finish()
        }, 1500)
    }
}