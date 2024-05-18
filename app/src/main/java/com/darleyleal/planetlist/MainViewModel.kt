package com.darleyleal.planetlist

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val listaPlanetas = listOf<String>(
        "1. Mercúrio", "2. Vênus", "3. Marte", "4. Terra",
        "5. Júpter", "6. Saturno", "7. Urano", "8. Netuno"
    )
}