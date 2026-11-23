package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0518m {
    private static final /* synthetic */ EnumC0518m[] $VALUES;
    public static final C0516k Companion;
    public static final EnumC0518m ON_ANY;
    public static final EnumC0518m ON_CREATE;
    public static final EnumC0518m ON_DESTROY;
    public static final EnumC0518m ON_PAUSE;
    public static final EnumC0518m ON_RESUME;
    public static final EnumC0518m ON_START;
    public static final EnumC0518m ON_STOP;

    static {
        EnumC0518m enumC0518m = new EnumC0518m("ON_CREATE", 0);
        ON_CREATE = enumC0518m;
        EnumC0518m enumC0518m2 = new EnumC0518m("ON_START", 1);
        ON_START = enumC0518m2;
        EnumC0518m enumC0518m3 = new EnumC0518m("ON_RESUME", 2);
        ON_RESUME = enumC0518m3;
        EnumC0518m enumC0518m4 = new EnumC0518m("ON_PAUSE", 3);
        ON_PAUSE = enumC0518m4;
        EnumC0518m enumC0518m5 = new EnumC0518m("ON_STOP", 4);
        ON_STOP = enumC0518m5;
        EnumC0518m enumC0518m6 = new EnumC0518m("ON_DESTROY", 5);
        ON_DESTROY = enumC0518m6;
        EnumC0518m enumC0518m7 = new EnumC0518m("ON_ANY", 6);
        ON_ANY = enumC0518m7;
        $VALUES = new EnumC0518m[]{enumC0518m, enumC0518m2, enumC0518m3, enumC0518m4, enumC0518m5, enumC0518m6, enumC0518m7};
        Companion = new C0516k();
    }

    public static EnumC0518m valueOf(String str) {
        return (EnumC0518m) Enum.valueOf(EnumC0518m.class, str);
    }

    public static EnumC0518m[] values() {
        return (EnumC0518m[]) $VALUES.clone();
    }

    public final EnumC0519n f() {
        switch (AbstractC0517l.a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0519n.f6757u;
            case 3:
            case 4:
                return EnumC0519n.f6758v;
            case 5:
                return EnumC0519n.f6759w;
            case 6:
                return EnumC0519n.f6755s;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
