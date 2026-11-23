package X9;

/* JADX INFO: loaded from: classes.dex */
public enum F {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f5504s;

    F(String str) {
        this.f5504s = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f5504s;
    }
}
