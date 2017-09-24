package mx.jhcue.meditrackqe

import android.widget.TextView
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.android.controller.ActivityController
import org.robolectric.annotation.Config

/**
 * @author horacio
 * @since 23/09/17.
 */
@RunWith(RobolectricTestRunner::class)
@Config(constants = BuildConfig::class)
class MainActivityTest {

    lateinit var activityController: ActivityController<MainActivity>
    lateinit var activity: MainActivity

    @Before
    fun setUp() {
        activityController = Robolectric.buildActivity(MainActivity::class.java)
        activity = activityController.get()
    }

    @Test
    fun onCreate() {
        activityController.create()
        val message = activity.findViewById<TextView>(R.id.message)
        assertEquals("Hello World from Kotlin!", message.text)
    }
}
