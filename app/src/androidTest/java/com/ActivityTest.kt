package com

import androidx.test.espresso.Espresso

import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.test1.MainActivity
import com.example.test1.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.Rule
import org.junit.Test

class ActivityTest {
    @Rule
    @JvmField
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun simpleAdd() {
        runBlocking {

            Espresso.onView(withId(R.id.firstEd)).perform(ViewActions.typeText("24"))
            Espresso.onView(withId(R.id.firstEd)).perform(ViewActions.closeSoftKeyboard())
            delay(1000)

            Espresso.onView(withId(R.id.secondEd)).perform(ViewActions.typeText("24"))
            Espresso.onView(withId(R.id.secondEd)).perform(ViewActions.closeSoftKeyboard())
            delay(1000)

            Espresso.onView(withId(R.id.tv_result)).perform(ViewActions.click())
            delay(1000)
            Espresso.onView(withId(R.id.tv_result)).check(
                ViewAssertions.matches(ViewMatchers.withText("30"))
            )
            delay(2000)

        }
    }

    @Test
    fun simpleDivide() {
        runBlocking {

            Espresso.onView(withId(R.id.firstEd)).perform(ViewActions.typeText("5"))
            delay(1000)
            Espresso.onView(withId(R.id.firstEd)).perform(ViewActions.closeSoftKeyboard())
            Espresso.onView(withId(R.id.firstEd)).perform(ViewActions.typeText("5"))
            delay(1000)
            Espresso.onView(withId(R.id.firstEd)).perform(ViewActions.closeSoftKeyboard())
            delay(1000)
            Espresso.onView(withId(R.id.btn)).perform(ViewActions.click())
            delay(1000)
            Espresso.onView(withId(R.id.tv_result))
                .check(ViewAssertions.matches(ViewMatchers.withText("1.0")))
            delay(2000)
        }
    }
}