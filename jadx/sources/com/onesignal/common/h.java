package com.onesignal.common;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final h INSTANCE = new h();
    public static final String SDK_VERSION = "050200";

    private h() {
    }

    public final boolean isValidEmail(String str) {
        p210v8.i.f(str, "email");
        if (str.length() == 0) {
            return false;
        }
        Pattern patternCompile = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$");
        p210v8.i.e(patternCompile, "compile(emRegex)");
        return patternCompile.matcher(str).matches();
    }

    public final boolean isValidPhoneNumber(String str) {
        p210v8.i.f(str, "number");
        if (str.length() == 0) {
            return false;
        }
        Pattern patternCompile = Pattern.compile("^\\+?[1-9]\\d{1,14}$");
        p210v8.i.e(patternCompile, "compile(emRegex)");
        return patternCompile.matcher(str).matches();
    }
}
