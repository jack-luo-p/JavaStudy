package com.java.DesignPattern;

import android.util.Log;

/**
 * Created by jingbin on 2016/10/30.
 */

public class AttackXL implements IAttackBehavior {
    @Override
    public void attack() {
        Log.e("---", "降龙十八掌");
    }
}
