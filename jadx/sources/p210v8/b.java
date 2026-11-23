package p210v8;

import C8.InterfaceC0174b;
import C8.InterfaceC0177e;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements InterfaceC0174b, Serializable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public transient InterfaceC0174b f15449s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f15450t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Class f15451u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f15452v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f15453w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f15454x;

    public b(Object obj, Class cls, String str, String str2, boolean z6) {
        this.f15450t = obj;
        this.f15451u = cls;
        this.f15452v = str;
        this.f15453w = str2;
        this.f15454x = z6;
    }

    public InterfaceC0174b a() {
        InterfaceC0174b interfaceC0174b = this.f15449s;
        if (interfaceC0174b != null) {
            return interfaceC0174b;
        }
        InterfaceC0174b interfaceC0174bC = c();
        this.f15449s = interfaceC0174bC;
        return interfaceC0174bC;
    }

    public abstract InterfaceC0174b c();

    public InterfaceC0177e d() {
        Class cls = this.f15451u;
        if (cls == null) {
            return null;
        }
        return this.f15454x ? u.a.c("", cls) : u.a.b(cls);
    }

    public abstract InterfaceC0174b f();

    public String g() {
        return this.f15453w;
    }

    @Override // C8.InterfaceC0174b
    public String getName() {
        return this.f15452v;
    }

    @Override // C8.InterfaceC0174b
    public final List u() {
        return f().u();
    }

    @Override // C8.InterfaceC0174b
    public final Object v(Object... objArr) {
        return f().v(objArr);
    }
}
