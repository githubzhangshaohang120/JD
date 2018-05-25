package com.example.a1512qmvp.ui.classify.contract;

import com.example.a1512qmvp.bean.CatagoryBean;
import com.example.a1512qmvp.bean.ProductCatagoryBean;
import com.example.a1512qmvp.ui.base.BaseContract;

public interface ClassifyContract {
    interface View extends BaseContract.BaseView {
        void getProductCatagorySuccess(ProductCatagoryBean productCatagoryBean);

        void getCatagorySuccess(CatagoryBean catagoryBean);
    }

    interface Presenter extends BaseContract.BasePresenter<View> {
        void getProductCatagory(String cid);

        void getCatagory();
    }
}
