package io.github.jensbe74.roundsyncx.core.onboarding

interface SlideLeaveInterface {

    fun allowSlideLeave(id: String): Boolean

    fun onSlideLeavePrevented(id: String)
}