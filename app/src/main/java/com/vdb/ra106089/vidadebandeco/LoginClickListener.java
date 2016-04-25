package com.vdb.ra106089.vidadebandeco;

import android.content.Context;
import android.content.Intent;
import android.view.View;

/**
 * Created by ra106089 on 25/04/16.
 */
public class LoginClickListener implements View.OnClickListener {

    private Context m_context;

    public LoginClickListener (Context context) {
        m_context = context;
    }
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(m_context, MapsActivity.class);
    }

}
