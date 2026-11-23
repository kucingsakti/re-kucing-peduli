package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class Z {
    public final AbstractC0502w a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f6445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6446d;

    public Z(AbstractC0502w abstractC0502w, String str, Object[] objArr) {
        this.a = abstractC0502w;
        this.f6444b = str;
        this.f6445c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f6446d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f6446d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }
}
