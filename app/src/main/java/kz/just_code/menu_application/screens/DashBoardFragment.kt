package kz.just_code.menu_application.screens

import kz.just_code.menu_application.BaseFragment
import kz.just_code.menu_application.R

class DashBoardFragment: BaseFragment() {
    override fun getTitleRes(): Int = R.string.dashboard
    override fun dropDownVisible(): Boolean = true
    override fun showContextMenu(): Boolean = true
    override fun showPopUpMenu(): Boolean = true
}