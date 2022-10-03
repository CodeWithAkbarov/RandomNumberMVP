package iqro.mobile.randomnumbermvp

import android.os.Handler
import kotlin.random.Random

/**
 *Created by Zohidjon Akbarov
 */
class RandomNumberModule : RandomNumberContract.Module {
    override fun getRandomNumber(onRandomNumberFinished: RandomNumberContract.Module.OnRandomNumberFinished) {
        Handler().postDelayed({
            val random = Random
            onRandomNumberFinished.numberReady(random.nextInt(2000))
        }, 2000)
    }
}