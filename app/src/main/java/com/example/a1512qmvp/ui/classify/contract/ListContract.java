package com.example.a1512qmvp.ui.classify.contract;

import com.example.a1512qmvp.bean.ProductsBean;
import com.example.a1512qmvp.ui.base.BaseContract;

import java.util.List;

public interface ListContract {
    interface View extends BaseContract.BaseView {
        void onSuccess(List<ProductsBean.DataBean> list);
    }

    interface Presenter extends BaseContract.BasePresenter<View> {
        void getProducts(String pscid);
    }
}
