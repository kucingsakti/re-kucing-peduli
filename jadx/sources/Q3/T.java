package Q3;

/* JADX INFO: loaded from: classes.dex */
public final class T extends x0 {
    public final long a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4140d;

    public T(long j, long j10, String str, String str2) {
        this.a = j;
        this.f4138b = j10;
        this.f4139c = str;
        this.f4140d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x0) {
            x0 x0Var = (x0) obj;
            if (this.a == ((T) x0Var).a) {
                T t7 = (T) x0Var;
                if (this.f4138b == t7.f4138b && this.f4139c.equals(t7.f4139c)) {
                    String str = t7.f4140d;
                    String str2 = this.f4140d;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j10 = this.f4138b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f4139c.hashCode()) * 1000003;
        String str = this.f4140d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.f4138b);
        sb.append(", name=");
        sb.append(this.f4139c);
        sb.append(", uuid=");
        return E0.a.l(sb, this.f4140d, "}");
    }
}
