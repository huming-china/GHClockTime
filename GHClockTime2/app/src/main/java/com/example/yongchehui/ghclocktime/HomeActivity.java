package com.example.yongchehui.ghclocktime;

import android.widget.RelativeLayout;

import com.example.yongchehui.ghclocktime.Base.BaseTitleActivity;
import com.example.yongchehui.ghclocktime.View.GHClockView;

/**
 * Created by yongcheHui on 16/1/20.
 */
public class HomeActivity extends BaseTitleActivity {

    @Override
    protected Integer getContentViewLayout()
    {
        return R.layout.home;
    }

    private RelativeLayout rootLayout = null;
    private GHClockView clockView = null;

    @Override
    protected void  initControlView(){
        setTitle("主页");

        rootLayout = (RelativeLayout)findViewById(R.id.home_root);

        clockView = (GHClockView)findViewById(R.id.clockView);
    }
}
