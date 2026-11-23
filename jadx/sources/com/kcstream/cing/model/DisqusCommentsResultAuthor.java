package com.kcstream.cing.model;

import R5.a;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.unity3d.ads.metadata.MediationMetaData;
import kotlin.Metadata;
import p210v8.e;
import p210v8.i;
import w4.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/kcstream/cing/model/DisqusCommentsResultAuthor;", "", "", "username", MediationMetaData.KEY_NAME, "avatar", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getUsername", "()Ljava/lang/String;", "b", a.PUSH_ADDITIONAL_DATA_KEY, "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DisqusCommentsResultAuthor {

    @b("avatar")
    private final String avatar;

    @b(MediationMetaData.KEY_NAME)
    private final String name;

    @b("username")
    private final String username;

    public DisqusCommentsResultAuthor() {
        this(null, null, null, 7, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisqusCommentsResultAuthor)) {
            return false;
        }
        DisqusCommentsResultAuthor disqusCommentsResultAuthor = (DisqusCommentsResultAuthor) obj;
        return i.a(this.username, disqusCommentsResultAuthor.username) && i.a(this.name, disqusCommentsResultAuthor.name) && i.a(this.avatar, disqusCommentsResultAuthor.avatar);
    }

    public final int hashCode() {
        String str = this.username;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.avatar;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisqusCommentsResultAuthor(username=");
        sb.append(this.username);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", avatar=");
        return AbstractC0487g.j(sb, this.avatar, ')');
    }

    public DisqusCommentsResultAuthor(String str, String str2, String str3) {
        this.username = str;
        this.name = str2;
        this.avatar = str3;
    }

    public /* synthetic */ DisqusCommentsResultAuthor(String str, String str2, String str3, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
    }
}
