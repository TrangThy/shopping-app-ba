package com.example.shoppingapp.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.shoppingapp.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShopRepo {

    private MutableLiveData<List<Product>> listMutableLiveData;

    public LiveData<List<Product>> getProducts() {
        if (listMutableLiveData == null) {
            listMutableLiveData = new MutableLiveData<>();
            listInit();
        }
        return listMutableLiveData;
    }

    private void listInit() {

        List<Product> list = new ArrayList<>();

        list.add(new Product(
                String.valueOf(UUID.randomUUID()),
                "Lula Patent Buckled ",
                1800500,
                true,
                "https://www.charleskeith.vn/dw/image/v2/BCWJ_PRD/on/demandware.static/-" +
                        "/Sites-vn-products/default/dw90e82d37/images/hi-res/2022-L6-CK2-20270980-08-1.jpg"
        ));
        list.add(new Product(
                String.valueOf(UUID.randomUUID()),
                "Lula Patent Buckled ",
                2790000,
                true,
                "https://www.charleskeith.vn/dw/image/v2/BCWJ_PRD/on/demandware.static/-/Sites-vn-products/default/dw92463bc6/images/hi-res/2022-L6-CK2-20270980-01-1.jpg"
        ));
        list.add(new Product(
                String.valueOf(UUID.randomUUID()),
                "Meriah Embossed",
                1890000,
                true,
                "https://www.charleskeith.vn/dw/image/v2/BCWJ_PRD/on/demandware.static/-/Sites-vn-products/default/dw07eeeea9/images/hi-res/2022-L7-CK2-50701243-17-1.jpg"
        ));
        list.add(new Product(
                String.valueOf(UUID.randomUUID()),
                "Meriah Swirl-Print",
                5990000,
                true,
                "https://www.charleskeith.vn/dw/image/v2/BCWJ_PRD/on/demandware.static/-/Sites-vn-products/default/dw5d1eda04/images/hi-res/2022-L7-CK2-50701243-24-1.jpg"
        ));
        list.add(new Product(
                String.valueOf(UUID.randomUUID()),
                " Bonnie Curved",
                1900990,
                true,
                "https://www.charleskeith.vn/dw/image/v2/BCWJ_PRD/on/demandware.static/-/Sites-vn-products/default/dw2d67b144/images/hi-res/2022-L7-CK2-30270989-12-1.jpg"
        ));
        list.add(new Product(
                String.valueOf(UUID.randomUUID()),
                "Daki Belted Curved",
                1660650,
                true,
                "https://www.charleskeith.vn/dw/image/v2/BCWJ_PRD/on/demandware.static/-/Sites-vn-products/default/dwb30dc2fe/images/hi-res/2022-L7-CK2-20671432-17-1.jpg"
        ));
        list.add(new Product(
                String.valueOf(UUID.randomUUID()),
                "Daki Belted - Cam",
                1790500,
                true,
                "https://www.charleskeith.vn/dw/image/v2/BCWJ_PRD/on/demandware.static/-/Sites-vn-products/default/dwbb0a7a72/images/hi-res/2022-L7-CK2-20671431-17-1.jpg"
        ));
        list.add(new Product(
                String.valueOf(UUID.randomUUID()),
                "Iva Boxy - Hồng",
                1655590,
                false,
                "https://www.charleskeith.vn/dw/image/v2/BCWJ_PRD/on/demandware.static/-/Sites-vn-products/default/dw49340729/images/hi-res/2022-L6-CK2-50781886-13-1.jpg"
        ));
        list.add(new Product(
                String.valueOf(UUID.randomUUID()),
                " Iva Cloud-Print Boxy",
                1536990,
                true,
                "https://www.charleskeith.vn/dw/image/v2/BCWJ_PRD/on/demandware.static/-/Sites-vn-products/default/dwc1623925/images/hi-res/2022-L6-CK2-50781886-24-1.jpg"
        ));
        list.add(new Product(
                String.valueOf(UUID.randomUUID()),
                "Waverly Scallop-Trim",
                279990,
                true,
                "https://www.charleskeith.vn/dw/image/v2/BCWJ_PRD/on/demandware.static/-/Sites-vn-products/default/dwfa8a89d2/images/hi-res/2022-L6-CK2-50671456-13-1.jpg"
        ));
        list.add(new Product(
                String.valueOf(UUID.randomUUID()),
                "Waverly Scallop",
                2499950,
                true,
                "https://www.charleskeith.vn/dw/image/v2/BCWJ_PRD/on/demandware.static/-/Sites-vn-products/default/dw336f4677/images/hi-res/2022-L6-CK2-50671456-12-1.jpg"
        ));
        list.add(new Product(
                String.valueOf(UUID.randomUUID()),
                "Bow Tie Top ",
                2616500,
                true,
                "https://www.charleskeith.vn/dw/image/v2/BCWJ_PRD/on/demandware.static/-/Sites-vn-products/default/dw85a53160/images/hi-res/2022-L6-SL2-50270968-49-1.jpg"
        ));
        list.add(new Product(
                String.valueOf(UUID.randomUUID()),
                "Beaded Chain Handle",
                5950520,
                true,
                "https://www.charleskeith.vn/dw/image/v2/BCWJ_PRD/on/demandware.static/-/Sites-vn-products/default/dwe304305e/images/hi-res/2022-L6-CK2-81200020-2-12-1.jpg"
        ));
        list.add(new Product(
                String.valueOf(UUID.randomUUID()),
                "Lana Quilted Sunset",
                2599099,
                true,
                "https://www.charleskeith.vn/dw/image/v2/BCWJ_PRD/on/demandware.static/-/Sites-vn-products/default/dw4a4d8352/images/hi-res/2022-L6-CK2-20151168-I4-1.jpg"
        ));
        listMutableLiveData.setValue(list);
    }
}