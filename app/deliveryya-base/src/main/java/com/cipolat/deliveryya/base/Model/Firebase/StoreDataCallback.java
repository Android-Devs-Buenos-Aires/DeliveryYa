package com.cipolat.deliveryya.base.Model.Firebase;

import com.cipolat.deliveryya.base.Model.Store;
import com.google.firebase.database.DatabaseError;

/**
 * Created by sebastian on 01/10/17.
 */

public interface StoreDataCallback {
    void onStoreDataReady(Store store);
    void onError(DatabaseError error);
    void onNoConection();
}
