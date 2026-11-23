package com.onesignal.inAppMessages.internal.display.impl;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Interpolator {
    private double mAmplitude;
    private double mFrequency;

    public i(double d3, double d8) {
        this.mAmplitude = d3;
        this.mFrequency = d8;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return (float) ((Math.cos(this.mFrequency * ((double) f10)) * Math.pow(2.718281828459045d, ((double) (-f10)) / this.mAmplitude) * ((double) (-1))) + ((double) 1));
    }
}
