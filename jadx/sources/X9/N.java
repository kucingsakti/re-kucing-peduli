package X9;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class N extends O {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f5543t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f5544u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f5545v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ma.h f5546w;

    public /* synthetic */ N(Object obj, long j, ma.h hVar, int i10) {
        this.f5543t = i10;
        this.f5545v = obj;
        this.f5544u = j;
        this.f5546w = hVar;
    }

    @Override // X9.O
    public final long a() {
        switch (this.f5543t) {
            case 0:
                break;
        }
        return this.f5544u;
    }

    @Override // X9.O
    public final A b() {
        Object obj = this.f5545v;
        switch (this.f5543t) {
            case 0:
                return (A) obj;
            default:
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                Pattern pattern = A.f5431d;
                return p068ga.d.x(str);
        }
    }

    @Override // X9.O
    public final ma.h c() {
        switch (this.f5543t) {
            case 0:
                return (ma.f) this.f5546w;
            default:
                return (ma.r) this.f5546w;
        }
    }
}
