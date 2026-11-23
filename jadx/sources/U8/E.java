package U8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public class E {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final E f4931t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final E f4932u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final E f4933v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final D f4934w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ E[] f4935x;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f4936s;

    static {
        E e10 = new E(null, "NULL", 0);
        f4931t = e10;
        E e11 = new E(-1, "INDEX", 1);
        f4932u = e11;
        E e12 = new E(Boolean.FALSE, "FALSE", 2);
        f4933v = e12;
        D d3 = new D(null, "MAP_GET_OR_DEFAULT", 3);
        f4934w = d3;
        f4935x = new E[]{e10, e11, e12, d3};
    }

    public E(Object obj, String str, int i10) {
        super(str, i10);
        this.f4936s = obj;
    }

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) f4935x.clone();
    }
}
