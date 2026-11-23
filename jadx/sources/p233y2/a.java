package p233y2;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.zag;

/* JADX INFO: loaded from: classes.dex */
public final class a extends zag {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f16021s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Intent f16022t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f16023u;

    public /* synthetic */ a(Intent intent, Object obj, int i10) {
        this.f16021s = i10;
        this.f16022t = intent;
        this.f16023u = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.common.api.internal.LifecycleFragment, java.lang.Object] */
    @Override // com.google.android.gms.common.internal.zag
    public final void a() {
        switch (this.f16021s) {
            case 0:
                Intent intent = this.f16022t;
                if (intent != null) {
                    ((GoogleApiActivity) this.f16023u).startActivityForResult(intent, 2);
                }
                break;
            default:
                Intent intent2 = this.f16022t;
                if (intent2 != null) {
                    this.f16023u.b(2, intent2);
                }
                break;
        }
    }
}
