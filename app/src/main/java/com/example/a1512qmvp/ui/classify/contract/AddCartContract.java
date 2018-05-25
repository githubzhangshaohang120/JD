package com.example.a1512qmvp.ui.classify.contract;

import com.example.a1512qmvp.ui.base.BaseContract;

public interface AddCartContract {
    interface View extends BaseContract.BaseView {
        void onSuccess(String str);
    }

    interface Presenter extends BaseContract.BasePresenter<View> {
        void addCart(String uid, String pid, String token);
    }
}
