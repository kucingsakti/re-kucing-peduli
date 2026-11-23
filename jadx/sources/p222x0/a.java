package p222x0;

import android.content.IntentFilter;
import p195u1.c;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final IntentFilter a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f15703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15704c;

    public a(IntentFilter intentFilter, c cVar) {
        this.a = intentFilter;
        this.f15703b = cVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("Receiver{");
        sb.append(this.f15703b);
        sb.append(" filter=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
