package V5;

import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private final int androidId;
    private final long createdAt;
    private final String fullData;
    private final String id;
    private final String message;
    private final String title;

    public c(int i10, String str, String str2, long j, String str3, String str4) {
        i.f(str, "id");
        i.f(str2, "fullData");
        this.androidId = i10;
        this.id = str;
        this.fullData = str2;
        this.createdAt = j;
        this.title = str3;
        this.message = str4;
    }

    public final int getAndroidId() {
        return this.androidId;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final String getFullData() {
        return this.fullData;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTitle() {
        return this.title;
    }
}
