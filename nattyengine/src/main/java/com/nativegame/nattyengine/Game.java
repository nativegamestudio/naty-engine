package com.nativegame.nattyengine;

import com.nativegame.nattyengine.engine.Engine;
import com.nativegame.nattyengine.input.sensor.AccelerationController;
import com.nativegame.nattyengine.input.sensor.OrientationController;
import com.nativegame.nattyengine.ui.GameActivity;
import com.nativegame.nattyengine.ui.GameView;

/**
 * Created by Oscar Liang on 2022/12/11
 */

/*
 *    MIT License
 *
 *    Copyright (c) 2022 Oscar Liang
 *
 *    Permission is hereby granted, free of charge, to any person obtaining a copy
 *    of this software and associated documentation files (the "Software"), to deal
 *    in the Software without restriction, including without limitation the rights
 *    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *    copies of the Software, and to permit persons to whom the Software is
 *    furnished to do so, subject to the following conditions:
 *
 *    The above copyright notice and this permission notice shall be included in all
 *    copies or substantial portions of the Software.
 *
 *    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *    SOFTWARE.
 */

public class Game {

    protected final GameActivity mActivity;
    protected final Engine mEngine;

    //--------------------------------------------------------
    // Constructors
    //--------------------------------------------------------
    public Game(GameActivity activity, GameView gameView) {
        mActivity = activity;
        mEngine = new Engine(gameView);
    }
    //========================================================

    //--------------------------------------------------------
    // Getter and Setter
    //--------------------------------------------------------
    public GameActivity getActivity() {
        return mActivity;
    }

    public Engine getEngine() {
        return mEngine;
    }
    //========================================================

    //--------------------------------------------------------
    // Methods
    //--------------------------------------------------------
    public final void start() {
        mEngine.startGame();
        onStart();
    }

    public final void stop() {
        if (mEngine.isRunning()) {
            mEngine.stopGame();
            onStop();
        }
    }

    public final void pause() {
        if (mEngine.isRunning() && !mEngine.isPaused()) {
            mEngine.pauseGame();
            onPause();
        }
    }

    public final void resume() {
        if (mEngine.isRunning() && mEngine.isPaused()) {
            mEngine.resumeGame();
            onResume();
        }
    }

    protected void onStart() {
    }

    protected void onStop() {
    }

    protected void onPause() {
    }

    protected void onResume() {
    }

    public void enableAccelerationSensor() {
        mEngine.setAccelerationController(new AccelerationController(mActivity));
    }

    public void disableAccelerationSensor() {
        if (mEngine.getAccelerationController() != null) {
            mEngine.getAccelerationController().stop();
        }
        mEngine.setAccelerationController(null);
    }

    public void enableOrientationSensor() {
        mEngine.setOrientationController(new OrientationController(mActivity));
    }

    public void disableOrientationSensor() {
        if (mEngine.getOrientationController() != null) {
            mEngine.getOrientationController().stop();
        }
        mEngine.setOrientationController(null);
    }
    //========================================================

}
