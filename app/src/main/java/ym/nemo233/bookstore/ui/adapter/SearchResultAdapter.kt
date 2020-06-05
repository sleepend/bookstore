package ym.nemo233.bookstore.ui.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import ym.nemo233.bookstore.R
import ym.nemo233.bookstore.sqlite.BooksInformation

/**
 * 书城
 */
class SearchResultAdapter :
    BaseQuickAdapter<BooksInformation, BaseViewHolder>(R.layout.item_search_result) {

    override fun convert(helper: BaseViewHolder?, item: BooksInformation) {
        helper?.apply {
            setText(R.id.item_name, item.name)
            setText(R.id.item_auth, item.auth)
            setText(R.id.item_site, item.className)
        }
    }
}