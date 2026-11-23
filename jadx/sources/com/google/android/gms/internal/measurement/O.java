package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class O extends ContentObserver {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8354b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O(Object obj, int i10) {
        super(null);
        this.a = i10;
        this.f8354b = obj;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z6) {
        switch (this.a) {
            case 0:
                ((zzfz) this.f8354b).a.set(true);
                return;
            default:
                zzgk zzgkVar = (zzgk) this.f8354b;
                synchronized (zzgkVar.f8646w) {
                    zzgkVar.f8647x = null;
                    zzgkVar.f8644u.run();
                    break;
                }
                synchronized (zzgkVar) {
                    try {
                        Iterator it = zzgkVar.f8648y.iterator();
                        while (it.hasNext()) {
                            ((zzgl) it.next()).b();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }
}
