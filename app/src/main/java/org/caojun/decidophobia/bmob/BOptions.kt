package org.caojun.decidophobia.bmob

import cn.bmob.v3.BmobObject
import org.caojun.decidophobia.ormlite.Options

/**
 * Created by CaoJun on 2017/10/20.
 */
class BOptions(options: Options?) : BmobObject() {

    var title: String = ""
    var option: ArrayList<String> = ArrayList()

    init {
        if (options != null) {
            title = options.title
            for (o in options.option) {
                option.add(o)
            }
        }
    }

    fun getOptions(): Options {
        val options = Options()
        options.title = title
        for (o in option) {
            options.option.add(o)
        }
        return options
    }
}