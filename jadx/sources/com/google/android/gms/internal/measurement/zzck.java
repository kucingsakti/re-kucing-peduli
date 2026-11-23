package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public enum zzck implements zzjp {
    /* JADX INFO: Fake field, exist only in values array */
    UNSPECIFIED_TYPE(0),
    /* JADX INFO: Fake field, exist only in values array */
    RAW_FILE_IO_TYPE(1),
    /* JADX INFO: Fake field, exist only in values array */
    MOBSTORE_TYPE(2),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_OPEN_HELPER_TYPE(3),
    /* JADX INFO: Fake field, exist only in values array */
    SQLITE_DATABASE_OPEN_TYPE(4),
    /* JADX INFO: Fake field, exist only in values array */
    LEVEL_DB_TYPE(5),
    /* JADX INFO: Fake field, exist only in values array */
    ROOM_TYPE(6),
    /* JADX INFO: Fake field, exist only in values array */
    SHARED_PREFS_TYPE(7),
    /* JADX INFO: Fake field, exist only in values array */
    PROTO_DATA_STORE_TYPE(8),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8549s;

    zzck(int i10) {
        this.f8549s = i10;
    }

    @Override // com.google.android.gms.internal.measurement.zzjp
    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.f8549s;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(zzck.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb.append(" number=");
            sb.append(b());
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }
}
