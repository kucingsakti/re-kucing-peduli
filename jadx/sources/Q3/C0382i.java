package Q3;

import com.unity3d.services.core.request.metrics.AdOperationMetric;

/* JADX INFO: renamed from: Q3.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0382i implements p004a4.c {
    public static final C0382i a = new C0382i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p004a4.b f4219b = p004a4.b.a("arch");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p004a4.b f4220c = p004a4.b.a("model");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p004a4.b f4221d = p004a4.b.a("cores");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p004a4.b f4222e = p004a4.b.a("ram");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p004a4.b f4223f = p004a4.b.a("diskSpace");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p004a4.b f4224g = p004a4.b.a("simulator");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p004a4.b f4225h = p004a4.b.a(AdOperationMetric.INIT_STATE);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p004a4.b f4226i = p004a4.b.a("manufacturer");
    public static final p004a4.b j = p004a4.b.a("modelClass");

    @Override // p004a4.a
    public final void a(Object obj, Object obj2) {
        p004a4.d dVar = (p004a4.d) obj2;
        N n10 = (N) ((w0) obj);
        dVar.g(f4219b, n10.a);
        dVar.a(f4220c, n10.f4109b);
        dVar.g(f4221d, n10.f4110c);
        dVar.e(f4222e, n10.f4111d);
        dVar.e(f4223f, n10.f4112e);
        dVar.b(f4224g, n10.f4113f);
        dVar.g(f4225h, n10.f4114g);
        dVar.a(f4226i, n10.f4115h);
        dVar.a(j, n10.f4116i);
    }
}
