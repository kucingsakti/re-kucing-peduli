package wa;

import android.content.Intent;
import android.net.Uri;
import java.util.Arrays;
import java.util.concurrent.LinkedBlockingQueue;
import o1.c;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements va.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f15697s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f15698t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f15699u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f15700v;

    public /* synthetic */ a(int i10) {
        this.f15697s = i10;
    }

    @Override // va.a
    public void a(String str) {
        f(new Object[]{str});
    }

    @Override // va.a
    public void b(String str, Throwable th) {
        f(null);
    }

    @Override // va.a
    public void c(String str) {
        f(null);
    }

    @Override // va.a
    public void d(Object obj, String str) {
        f(new Object[]{obj});
    }

    @Override // va.a
    public void e(String str) {
        f(null);
    }

    public void f(Object[] objArr) {
        b bVar = new b();
        System.currentTimeMillis();
        bVar.a = (xa.b) this.f15699u;
        bVar.f15701b = objArr;
        Thread.currentThread().getName();
        ((LinkedBlockingQueue) this.f15700v).add(bVar);
    }

    @Override // va.a
    public String getName() {
        return (String) this.f15698t;
    }

    public String toString() {
        switch (this.f15697s) {
            case 1:
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.f15699u;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                String str = (String) this.f15698t;
                if (str != null) {
                    sb.append(" action=");
                    sb.append(str);
                }
                String str2 = (String) this.f15700v;
                if (str2 != null) {
                    sb.append(" mimetype=");
                    sb.append(str2);
                }
                sb.append(" }");
                String string = sb.toString();
                i.e(string, "sb.toString()");
                return string;
            case 2:
            default:
                return super.toString();
            case 3:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f15698t);
                sb2.append('{');
                c cVar = (c) ((c) this.f15699u).f13624u;
                String str3 = "";
                while (cVar != null) {
                    Object obj = cVar.f13623t;
                    sb2.append(str3);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    cVar = (c) cVar.f13624u;
                    str3 = ", ";
                }
                sb2.append('}');
                return sb2.toString();
        }
    }

    public a(Intent intent) {
        this.f15697s = 1;
        i.f(intent, "intent");
        Uri data = intent.getData();
        String action = intent.getAction();
        String type = intent.getType();
        this.f15699u = data;
        this.f15698t = action;
        this.f15700v = type;
    }

    public a(String str) {
        this.f15697s = 3;
        c cVar = new c(21, false);
        this.f15699u = cVar;
        this.f15700v = cVar;
        this.f15698t = str;
    }
}
