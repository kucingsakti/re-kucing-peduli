package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0586o extends zzcj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzcl f8397c;

    public C0586o() {
        zzcl zzclVar = zzcl.f8550s;
        this.f8396b = "";
        this.f8397c = zzclVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzcj
    public final zzcl a() {
        return this.f8397c;
    }

    @Override // com.google.android.gms.internal.measurement.zzcj
    public final String b() {
        return this.f8396b;
    }

    @Override // com.google.android.gms.internal.measurement.zzcj
    public final boolean c() {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzcj
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzcj)) {
            return false;
        }
        zzcj zzcjVar = (zzcj) obj;
        return this.f8396b.equals(zzcjVar.b()) && !zzcjVar.c() && !zzcjVar.d() && this.f8397c.equals(zzcjVar.a());
    }

    public final int hashCode() {
        return ((((((this.f8396b.hashCode() ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ 1237) * 583896283) ^ this.f8397c.hashCode();
    }

    public final String toString() {
        return "FileComplianceOptions{fileOwner=" + this.f8396b + ", hasDifferentDmaOwner=false, skipChecks=false, dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=" + String.valueOf(this.f8397c) + "}";
    }
}
