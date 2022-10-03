package iqro.mobile.randomnumbermvp

/**
 *Created by Zohidjon Akbarov
 */
class RandomNumberPresenter(view: RandomNumberContract.MainView):RandomNumberContract.Presenter,
    RandomNumberContract.Module.OnRandomNumberFinished {

    var mainView:RandomNumberContract.MainView? = null
    private val module = RandomNumberModule()

    init {
        mainView = view
    }

    override fun onGenerateRandomNumberBtnClicked() {
        mainView?.showDialog()
        module.getRandomNumber(this)

    }

    override fun onDestroy() {
        mainView = null
    }

    override fun numberReady(randomNUmber: Int) {
        mainView?.hideDialog()
        mainView?.setRandomNumber(randomNUmber)
    }

}