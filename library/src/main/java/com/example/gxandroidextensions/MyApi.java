package com.example.gxandroidextensions;

import android.support.annotation.NonNull;
import android.widget.Toast;
import com.artech.base.services.Services;
import com.artech.externalapi.ExternalApi;
import com.artech.externalapi.ExternalApiResult;

import java.util.List;

public class MyApi extends ExternalApi
{
    // GeneXus API Object Name
    final static String NAME = "MyApi";

    // API Method Names
    private static final String METHOD_SHORT_TOAST = "shortToast";
    private static final String METHOD_LONG_TOAST = "longToast";

    public MyApi() {
        addMethodHandler(METHOD_SHORT_TOAST, 1, mShortToast);
        addMethodHandler(METHOD_LONG_TOAST, 1, mLongToast);
    }

    @SuppressWarnings("FieldCanBeLocal")
    private final IMethodInvoker mShortToast = new IMethodInvoker() {
        @Override
        public @NonNull ExternalApiResult invoke(List<Object> parameters) {
            final String parValue = (String) parameters.get(0);
            sendToast(parValue,Toast.LENGTH_SHORT);
            return ExternalApiResult.SUCCESS_CONTINUE;
        }
    };

    @SuppressWarnings("FieldCanBeLocal")
    private final IMethodInvoker mLongToast = new IMethodInvoker() {
        @Override
        public @NonNull ExternalApiResult invoke(List<Object> parameters) {
            final String parValue = (String) parameters.get(0);
            sendToast(parValue,Toast.LENGTH_LONG);
            return ExternalApiResult.SUCCESS_CONTINUE;
        }
    };

    private void sendToast(final String value, final int duration)
    {
        Services.Log.debug(NAME,"Toast:'"+value+"' duration:"+duration); //$NON-NLS-1$
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(getContext(),value,duration).show();
            }
        });
    }
}