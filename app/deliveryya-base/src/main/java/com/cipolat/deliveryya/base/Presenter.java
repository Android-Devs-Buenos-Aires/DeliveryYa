package com.cipolat.deliveryya.base;

/**
 * Created by sebastian on 27/08/16.
 */

public interface Presenter <V>{
    void setView(V view);
    void detachView();
}
