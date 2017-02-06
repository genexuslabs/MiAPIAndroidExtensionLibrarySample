package com.example.gxandroidextensions;

import android.content.Context;

import com.artech.externalapi.ExternalApiDefinition;
import com.artech.externalapi.ExternalApiFactory;
import com.artech.framework.GenexusModule;

public class GXAndroidExtensionsModule implements GenexusModule {

    @Override
    public void initialize(Context context) {

        ExternalApiDefinition mAPI = new ExternalApiDefinition(
                MyApi.NAME,
                MyApi.class
        );
        ExternalApiFactory.addApi(mAPI);

    }
}