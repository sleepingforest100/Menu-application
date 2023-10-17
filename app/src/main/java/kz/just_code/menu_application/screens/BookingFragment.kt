package kz.just_code.menu_application.screens

import kz.just_code.menu_application.BaseFragment
import kz.just_code.menu_application.R

class BookingFragment: BaseFragment() {
    override fun getTitleRes(): Int = R.string.booking
    override fun dropDownVisible(): Boolean = false
    override fun showContextMenu(): Boolean = false
    override fun showPopUpMenu(): Boolean = true

}