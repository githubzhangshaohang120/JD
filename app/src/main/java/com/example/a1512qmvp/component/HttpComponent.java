package com.example.a1512qmvp.component;

import com.example.a1512qmvp.module.HttpModule;
import com.example.a1512qmvp.ui.classify.ClassifyFragment;
import com.example.a1512qmvp.ui.classify.ListActivity;
import com.example.a1512qmvp.ui.classify.ListDetailsActivity;
import com.example.a1512qmvp.ui.homepage.HomePageFragment;
import com.example.a1512qmvp.ui.login.LoginActivity;
import com.example.a1512qmvp.ui.mine.MakeSureOrderActivity;
import com.example.a1512qmvp.ui.mine.UserInfoActivity;
import com.example.a1512qmvp.ui.mine.fragment.FragmentAllOrder;
import com.example.a1512qmvp.ui.mine.fragment.FragmentWaitOrder;
import com.example.a1512qmvp.ui.shopcart.ShopCartActivity;
import com.example.a1512qmvp.ui.shopcart.ShopCartActivity2;

import dagger.Component;

@Component(modules = HttpModule.class)
public interface HttpComponent {
    void inject(LoginActivity loginActivity);

    void inject(HomePageFragment homePageFragment);

    void inject(ClassifyFragment classifyFragment);

    void inject(ListActivity listActivity);

    void inject(ListDetailsActivity listDetailsActivity);

    void inject(ShopCartActivity shopCartActivity);

    void inject(ShopCartActivity2 shopCartActivity2);

    void inject(MakeSureOrderActivity makeSureOrderActivity);

    void inject(UserInfoActivity userInfoActivity);

    void inject(FragmentAllOrder fragmentAllOrder);

    void inject(FragmentWaitOrder fragmentWaitOrder);
}
