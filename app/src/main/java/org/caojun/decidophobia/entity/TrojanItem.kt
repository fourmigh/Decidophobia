package org.caojun.decidophobia.entity

import android.content.Context
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import org.caojun.decidophobia.R
import org.caojun.carousel.view.CarouselItem

/**
 * Created by CaoJun on 2017/10/26.
 */
class TrojanItem(context: Context) : CarouselItem<Trojan>(context, R.layout.item_trojan) {

    private var llTrojan: LinearLayout? = null
    private var tvContent: TextView? = null

    override fun extractView(view: View) {
        llTrojan = view.findViewById(R.id.llTrojan)
        tvContent = view.findViewById(R.id.tvContent)
    }

    override fun update(trojan: Trojan) {
        llTrojan?.setBackgroundColor(trojan.color)
        tvContent?.text = trojan.content
    }
}