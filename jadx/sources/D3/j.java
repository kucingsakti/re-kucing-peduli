package D3;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f1066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f1067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f1068g;

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i10 = Strings.a;
        Preconditions.k("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f1063b = str;
        this.a = str2;
        this.f1064c = str3;
        this.f1065d = str4;
        this.f1066e = str5;
        this.f1067f = str6;
        this.f1068g = str7;
    }

    public static j a(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String strA = stringResourceValueReader.a("google_app_id");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new j(strA, stringResourceValueReader.a("google_api_key"), stringResourceValueReader.a("firebase_database_url"), stringResourceValueReader.a("ga_trackingId"), stringResourceValueReader.a("gcm_defaultSenderId"), stringResourceValueReader.a("google_storage_bucket"), stringResourceValueReader.a("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Objects.a(this.f1063b, jVar.f1063b) && Objects.a(this.a, jVar.a) && Objects.a(this.f1064c, jVar.f1064c) && Objects.a(this.f1065d, jVar.f1065d) && Objects.a(this.f1066e, jVar.f1066e) && Objects.a(this.f1067f, jVar.f1067f) && Objects.a(this.f1068g, jVar.f1068g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1063b, this.a, this.f1064c, this.f1065d, this.f1066e, this.f1067f, this.f1068g});
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        toStringHelper.a(this.f1063b, "applicationId");
        toStringHelper.a(this.a, "apiKey");
        toStringHelper.a(this.f1064c, "databaseUrl");
        toStringHelper.a(this.f1066e, "gcmSenderId");
        toStringHelper.a(this.f1067f, "storageBucket");
        toStringHelper.a(this.f1068g, "projectId");
        return toStringHelper.toString();
    }
}
