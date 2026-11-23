package c2;

import E1.D;
import android.provider.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class n extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f7455s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ D f7456t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f7457u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(D d3, String str, int i10) {
        super(0);
        this.f7455s = i10;
        this.f7456t = d3;
        this.f7457u = str;
    }

    @Override // p200u8.a
    public final Object invoke() {
        switch (this.f7455s) {
            case 0:
                String string = Settings.Global.getString(this.f7456t.f1295t, this.f7457u);
                p210v8.i.e(string, "getString(contentResolver, key)");
                return string;
            case 1:
                String string2 = Settings.Secure.getString(this.f7456t.f1295t, this.f7457u);
                p210v8.i.e(string2, "getString(contentResolver, key)");
                return string2;
            default:
                String string3 = Settings.System.getString(this.f7456t.f1295t, this.f7457u);
                p210v8.i.e(string3, "getString(contentResolver, key)");
                return string3;
        }
    }
}
