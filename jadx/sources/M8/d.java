package M8;

/* JADX INFO: loaded from: classes.dex */
public enum d {
    FIELD(null),
    FILE(null),
    PROPERTY(null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER(null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");


    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f3195s;

    d(String str) {
        this.f3195s = str == null ? J7.j.X(name()) : str;
    }
}
