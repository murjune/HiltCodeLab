package org.techtown.practicehiltcodelab

import org.techtown.practicehiltcodelab.util.TimberDebugTree
import timber.log.Timber

fun setupTimber() {
    if (BuildConfig.DEBUG) Timber.plant(TimberDebugTree())
}
