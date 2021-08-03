package com.sniper.demo.state.interface_;

import com.sniper.demo.state.entity.Context;

/**
 * @author sniper
 * @date 2021/8/3 22:03
 **/
public interface State {
    void doAction(Context context);
}
