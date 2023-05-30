package com.example.homework_three_seven_repeat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework_three_seven_repeat.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var arrayList: ArrayList<Telephone> = ArrayList()
    private var arrayListAndroid: ArrayList<Telephone> = ArrayList()
    private lateinit var adapter: TelephoneAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setTelephoneModelApple()
        setTelephoneModedelAndroid()
    }

    private fun setTelephoneModedelAndroid() {
        arrayListAndroid.add(
            Telephone(
                "https://sc02.alicdn.com/kf/Hb251940e63844afcbba9db0d96817648A.jpg",
                "Android",
                "Phone X50",
                "Wholesale Big Screen Android"
            )
        )
        arrayListAndroid.add(
            Telephone(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS2s-HaBQGSsblqbFPAIytyK-tCT__I_YR_tjuUa8Y31x0-ZeHMvGV1puCWsmloUpB-8jM&usqp=CAU",
                "Android",
                "Gw666 M10tpro",
                "Gw666 M10tpro Android Phone"
            )
        )
        arrayListAndroid.add(
            Telephone(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRLC9AG-aLf6pCSWxK9fx17oxC7vM4nqt9t5FXE1FEjNsy1b9nRUPWYmZxjMxOBgxWKzfM&usqp=CAU",
                "Android",
                "Gw686-teléfono",
                "Móvil M3 Para Juegos,Dispositivo"
            )
        )
        arrayListAndroid.add(
            Telephone(
                "https://s.alicdn.com/@sc04/kf/H9f56d9bfbbb04596bd3077cbebbe6f26v.png_200x200.png",
                "Android",
                "Comfortable Wholesale",
                "keyboard android phone oppo"
            )
        )
        adapter = TelephoneAdapter(arrayListAndroid)
        binding.RecyclerViewWindows.adapter = adapter
    }

    private fun setTelephoneModelApple() {
        arrayList.add(
            Telephone(
                "https://login.kg/image/catalog/new/Phones/Apple/IPhone%2013/Pro/1.jpg",
                "Apple",
                "iPhone 13 Pro Max 256GB",
                " ; Internal, 128GB 6GB RAM,"
            )
        )
        arrayList.add(
            Telephone(
                "https://www.myphone.kg/files/media/17/17157.webp",
                "Apple",
                " iPhone 12 Pro Max ",
                "It features an HDR display"
            )
        )
        arrayList.add(
            Telephone(
                "https://i.gadgets360cdn.com/products/large/1536782676_635_iphone_xs_max.jpg?downsize=*:360",
                "Apple",
                "iPhone XS Max",
                "Price in India, Specifications,"
            )
        )
        arrayList.add(
            Telephone(
                "https://login.kg/image/catalog/new/Phones/Apple/IPhone%2013/Pro/1.jpg",
                "Apple",
                "iPhone 13 Pro Max 256GB",
                " ; Internal, 128GB 6GB RAM,"
            )
        )
        arrayList.add(
            Telephone(
                "https://www.myphone.kg/files/media/17/17157.webp",
                "Apple",
                " iPhone 12 Pro Max ",
                "It features an HDR display"
            )
        )
        arrayList.add(
            Telephone(
                "https://i.gadgets360cdn.com/products/large/1536782676_635_iphone_xs_max.jpg?downsize=*:360",
                "Apple",
                "iPhone XS Max",
                "Price in India, Specifications,"
            )
        )
        adapter = TelephoneAdapter(arrayList)
        binding.RecyclerViewAplle.adapter = adapter
    }
}