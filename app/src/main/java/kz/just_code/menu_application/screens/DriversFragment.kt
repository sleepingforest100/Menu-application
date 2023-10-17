package kz.just_code.menu_application.screens

import kz.just_code.menu_application.BaseFragment
import kz.just_code.menu_application.R

class DriversFragment: BaseFragment() {
    override fun getTitleRes(): Int = R.string.drivers
    override fun dropDownVisible(): Boolean = false
    override fun showContextMenu(): Boolean = true
    override fun showPopUpMenu(): Boolean = false
}