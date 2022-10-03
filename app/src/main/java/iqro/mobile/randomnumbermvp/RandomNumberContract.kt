package iqro.mobile.randomnumbermvp

/**
 *Created by Zohidjon Akbarov
 */
interface RandomNumberContract {
    interface MainView {
        fun showDialog()
        fun hideDialog()
        fun setRandomNumber(randomNUmber: Int)
    }

    interface Presenter {
        fun onGenerateRandomNumberBtnClicked()
        fun onDestroy()
    }

    interface Module {
        interface OnRandomNumberFinished {
            fun numberReady(randomNUmber: Int)
        }

        fun getRandomNumber(onRandomNumberFinished: OnRandomNumberFinished)
    }
}