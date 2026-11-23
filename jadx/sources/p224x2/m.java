package p224x2;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Objects;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class m {
    public final ApiKey a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Feature f15764b;

    public /* synthetic */ m(ApiKey apiKey, Feature feature) {
        this.a = apiKey;
        this.f15764b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof m)) {
            m mVar = (m) obj;
            if (Objects.a(this.a, mVar.a) && Objects.a(this.f15764b, mVar.f15764b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.f15764b});
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        toStringHelper.a(this.a, "key");
        toStringHelper.a(this.f15764b, "feature");
        return toStringHelper.toString();
    }
}
