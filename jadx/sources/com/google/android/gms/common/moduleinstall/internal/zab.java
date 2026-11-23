package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zab implements Comparator {
    public static final /* synthetic */ int a = 0;

    static {
        new zab();
    }

    private /* synthetic */ zab() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Feature feature = (Feature) obj;
        Feature feature2 = (Feature) obj2;
        Parcelable.Creator<ApiFeatureRequest> creator = ApiFeatureRequest.CREATOR;
        return !feature.f7828s.equals(feature2.f7828s) ? feature.f7828s.compareTo(feature2.f7828s) : (feature.K() > feature2.K() ? 1 : (feature.K() == feature2.K() ? 0 : -1));
    }
}
