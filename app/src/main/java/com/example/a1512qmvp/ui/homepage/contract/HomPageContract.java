package com.example.a1512qmvp.ui.homepage.contract;

import com.example.a1512qmvp.bean.AdBean;
import com.example.a1512qmvp.bean.CatagoryBean;
import com.example.a1512qmvp.ui.base.BaseContract;

public interface HomPageContract {
    interface View extends BaseContract.BaseView {
        void getAdSuccess(AdBean adBean);

        void getCatagorySuccess(CatagoryBean catagoryBean);
    }

    interface Presenter extends BaseContract.BasePresenter<View> {
        void getAd();

        void getCatagory();
    }

}
