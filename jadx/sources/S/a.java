package S;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f4492e = new byte[1792];
    public final CharSequence a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public char f4495d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            f4492e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.a = charSequence;
        this.f4493b = charSequence.length();
    }

    public final byte a() {
        int i10 = this.f4494c - 1;
        CharSequence charSequence = this.a;
        char cCharAt = charSequence.charAt(i10);
        this.f4495d = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f4494c);
            this.f4494c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f4494c--;
        char c10 = this.f4495d;
        return c10 < 1792 ? f4492e[c10] : Character.getDirectionality(c10);
    }
}
