package c2;

import android.app.KeyguardManager;
import android.app.admin.DevicePolicyManager;
import com.google.android.gms.internal.measurement.S;

/* JADX INFO: loaded from: classes.dex */
public final class e extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f7440s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ S f7441t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(S s9, int i10) {
        super(0);
        this.f7440s = i10;
        this.f7441t = s9;
    }

    @Override // p200u8.a
    public final Object invoke() {
        switch (this.f7440s) {
            case 0:
                DevicePolicyManager devicePolicyManager = (DevicePolicyManager) this.f7441t.f8359t;
                Integer numValueOf = devicePolicyManager != null ? Integer.valueOf(devicePolicyManager.getStorageEncryptionStatus()) : null;
                if (numValueOf != null && numValueOf.intValue() == 0) {
                    return "unsupported";
                }
                if (numValueOf != null && numValueOf.intValue() == 1) {
                    return "inactive";
                }
                if (numValueOf != null && numValueOf.intValue() == 2) {
                    return "activating";
                }
                if (numValueOf != null && numValueOf.intValue() == 3) {
                    return "active";
                }
                return (numValueOf != null && numValueOf.intValue() == 5) ? "active_per_user" : "";
            default:
                KeyguardManager keyguardManager = (KeyguardManager) this.f7441t.f8360u;
                return Boolean.valueOf(keyguardManager != null ? keyguardManager.isKeyguardSecure() : false);
        }
    }
}
