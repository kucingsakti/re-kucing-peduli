package o1;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    public String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13645b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return p210v8.i.a(this.a, nVar.a) && this.f13645b == nVar.f13645b;
    }

    public final int hashCode() {
        return p239z.e.d(this.f13645b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("IdAndState(id=");
        sb.append(this.a);
        sb.append(", state=");
        switch (this.f13645b) {
            case 1:
                str = "ENQUEUED";
                break;
            case 2:
                str = "RUNNING";
                break;
            case 3:
                str = "SUCCEEDED";
                break;
            case 4:
                str = "FAILED";
                break;
            case 5:
                str = "BLOCKED";
                break;
            case 6:
                str = "CANCELLED";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }
}
