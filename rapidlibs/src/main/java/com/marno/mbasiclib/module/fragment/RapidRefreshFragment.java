package com.marno.mbasiclib.module.fragment;

import android.os.Bundle;
import android.view.View;

import com.marno.mbasiclib.basic.MBasicFragment;
import com.marno.mbasiclib.interfaces.IRefreshView;

import in.srain.cube.views.ptr.PtrDefaultHandler;
import in.srain.cube.views.ptr.PtrFrameLayout;
import in.srain.cube.views.ptr.PtrUIHandler;

/**
 * Created by marno on 2016/10/26/22:38.
 * 仅需要下拉刷新功能的Fragment继承此类
 */
public abstract class RapidRefreshFragment extends MBasicFragment implements IRefreshView {
    protected PtrFrameLayout mPtrLayout;

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        mPtrLayout = getPtrView();
        if (null != mPtrLayout) {
            mPtrLayout.setPtrHandler(this);
            //解决与viewpager横向滑动冲突
            mPtrLayout.disableWhenHorizontalMove(true);
            /**
             * 如果直接使用PtrFragmeLayout的时候就需要在代码中去配置刷新头，
             * 但是建议直接继承PtrFrameLayout，然后根据项目修改刷新头，类似PtrClassicFrameLayout的做法
             */
            PtrUIHandler header = getRefreshHeader();
            mPtrLayout.setHeaderView((View) header);
            mPtrLayout.addPtrUIHandler(header);
        }
    }

    /**
     * 检测是否可以进行下拉刷新
     *
     * @param frame   下拉刷新控件
     * @param content 需要刷新的View
     * @param header  下拉刷新头
     * @return true=可以下拉刷新，false=不能下拉刷新
     */
    @Override
    public boolean checkCanDoRefresh(PtrFrameLayout frame, View content, View header) {
        return PtrDefaultHandler.checkContentCanBePulledDown(frame, content, header);
    }
}
