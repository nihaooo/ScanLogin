package com.testscanlogin.android;

import android.content.Context;
import android.widget.Toast;

import cn.bmob.v3.listener.SaveListener;

/**
 * Created by www10 on 2017/3/30.
 */

public class Method {

    private Context mContext;

    public Method(Context context) {
        mContext=context;
    }

    public void addInformation(final int id, int password){
        final StudentBean studentBean = new StudentBean();
        studentBean.setStudentId(id);
        studentBean.setStudentPassword(password);
        studentBean.save(mContext, new SaveListener() {
            public void onSuccess() {
                Toast.makeText(mContext, "成功", Toast.LENGTH_SHORT).show();
            }
            public void onFailure(int i, String s) {
                Toast.makeText(mContext, "失败", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
