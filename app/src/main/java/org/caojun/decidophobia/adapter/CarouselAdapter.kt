package org.caojun.decidophobia.adapter

import android.content.Context
import org.caojun.decidophobia.entity.Trojan
import org.caojun.decidophobia.entity.TrojanItem
import org.caojun.carousel.adapter.CarouselBaseAdapter
import org.caojun.carousel.view.CarouselItem

/**
 * Created by CaoJun on 2017/10/26.
 */
class CarouselAdapter(context: Context, carousel: List<Trojan>) : CarouselBaseAdapter<Trojan>(context, carousel) {

    override fun getCarouselItem(context: Context): CarouselItem<Trojan> = TrojanItem(context)
}