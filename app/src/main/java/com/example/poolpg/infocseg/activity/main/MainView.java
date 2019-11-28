package com.example.poolpg.infocseg.activity.main;

public interface MainView {
    void showProgress();
    void hideProgress();
    void onRequestSuccess(String message);
    void onRequestError(String message);
}
