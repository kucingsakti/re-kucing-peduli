package U;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* JADX INFO: renamed from: U.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0418e implements InterfaceC0416d, InterfaceC0420f {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f4801s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ClipData f4802t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f4803u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f4804v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Uri f4805w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Bundle f4806x;

    public /* synthetic */ C0418e() {
    }

    @Override // U.InterfaceC0416d
    public void G(int i10) {
        this.f4804v = i10;
    }

    @Override // U.InterfaceC0420f
    public ClipData a() {
        return this.f4802t;
    }

    @Override // U.InterfaceC0416d
    /* JADX INFO: renamed from: build */
    public C0421g mo66build() {
        return new C0421g(new C0418e(this));
    }

    @Override // U.InterfaceC0420f
    public int g() {
        return this.f4803u;
    }

    @Override // U.InterfaceC0420f
    public int j() {
        return this.f4804v;
    }

    @Override // U.InterfaceC0420f
    public ContentInfo l() {
        return null;
    }

    @Override // U.InterfaceC0416d
    public void setExtras(Bundle bundle) {
        this.f4806x = bundle;
    }

    @Override // U.InterfaceC0416d
    public void t(Uri uri) {
        this.f4805w = uri;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.f4801s) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f4802t.getDescription());
                sb.append(", source=");
                int i10 = this.f4803u;
                if (i10 == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (i10 == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (i10 == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (i10 == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (i10 != 4) {
                    strValueOf = i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb.append(strValueOf);
                sb.append(", flags=");
                int i11 = this.f4804v;
                sb.append((i11 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i11));
                Uri uri = this.f4805w;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return E0.a.l(sb, this.f4806x != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public C0418e(C0418e c0418e) {
        ClipData clipData = c0418e.f4802t;
        clipData.getClass();
        this.f4802t = clipData;
        int i10 = c0418e.f4803u;
        if (i10 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i10 > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f4803u = i10;
        int i11 = c0418e.f4804v;
        if ((i11 & 1) == i11) {
            this.f4804v = i11;
            this.f4805w = c0418e.f4805w;
            this.f4806x = c0418e.f4806x;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i11) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
