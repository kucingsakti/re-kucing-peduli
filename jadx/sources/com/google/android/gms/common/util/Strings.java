package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class Strings {
    public static final /* synthetic */ int a = 0;

    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    private Strings() {
    }
}
