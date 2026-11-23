package h2;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final SparseArray f11657s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ H[] f11658t;

    /* JADX INFO: Fake field, exist only in values array */
    H EF3;

    static {
        H h10 = new H("MOBILE", 0);
        H h11 = new H("WIFI", 1);
        H h12 = new H("MOBILE_MMS", 2);
        H h13 = new H("MOBILE_SUPL", 3);
        H h14 = new H("MOBILE_DUN", 4);
        H h15 = new H("MOBILE_HIPRI", 5);
        H h16 = new H("WIMAX", 6);
        H h17 = new H("BLUETOOTH", 7);
        H h18 = new H("DUMMY", 8);
        H h19 = new H("ETHERNET", 9);
        H h20 = new H("MOBILE_FOTA", 10);
        H h21 = new H("MOBILE_IMS", 11);
        H h22 = new H("MOBILE_CBS", 12);
        H h23 = new H("WIFI_P2P", 13);
        H h24 = new H("MOBILE_IA", 14);
        H h25 = new H("MOBILE_EMERGENCY", 15);
        H h26 = new H("PROXY", 16);
        H h27 = new H("VPN", 17);
        H h28 = new H("NONE", 18);
        f11658t = new H[]{h10, h11, h12, h13, h14, h15, h16, h17, h18, h19, h20, h21, h22, h23, h24, h25, h26, h27, h28};
        SparseArray sparseArray = new SparseArray();
        f11657s = sparseArray;
        sparseArray.put(0, h10);
        sparseArray.put(1, h11);
        sparseArray.put(2, h12);
        sparseArray.put(3, h13);
        sparseArray.put(4, h14);
        sparseArray.put(5, h15);
        sparseArray.put(6, h16);
        sparseArray.put(7, h17);
        sparseArray.put(8, h18);
        sparseArray.put(9, h19);
        sparseArray.put(10, h20);
        sparseArray.put(11, h21);
        sparseArray.put(12, h22);
        sparseArray.put(13, h23);
        sparseArray.put(14, h24);
        sparseArray.put(15, h25);
        sparseArray.put(16, h26);
        sparseArray.put(17, h27);
        sparseArray.put(-1, h28);
    }

    public static H valueOf(String str) {
        return (H) Enum.valueOf(H.class, str);
    }

    public static H[] values() {
        return (H[]) f11658t.clone();
    }
}
