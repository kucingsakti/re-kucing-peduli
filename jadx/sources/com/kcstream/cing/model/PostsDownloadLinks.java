package com.kcstream.cing.model;

import R5.a;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.unity3d.ads.metadata.MediationMetaData;
import kotlin.Metadata;
import p210v8.e;
import p210v8.i;
import w4.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/kcstream/cing/model/PostsDownloadLinks;", "", "", MediationMetaData.KEY_NAME, "link", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", a.PUSH_ADDITIONAL_DATA_KEY, "setLink", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PostsDownloadLinks {

    @b("link")
    private String link;

    @b(MediationMetaData.KEY_NAME)
    private String name;

    /* JADX WARN: Multi-variable type inference failed */
    public PostsDownloadLinks() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostsDownloadLinks)) {
            return false;
        }
        PostsDownloadLinks postsDownloadLinks = (PostsDownloadLinks) obj;
        return i.a(this.name, postsDownloadLinks.name) && i.a(this.link, postsDownloadLinks.link);
    }

    public final int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.link;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostsDownloadLinks(name=");
        sb.append(this.name);
        sb.append(", link=");
        return AbstractC0487g.j(sb, this.link, ')');
    }

    public PostsDownloadLinks(String str, String str2) {
        this.name = str;
        this.link = str2;
    }

    public /* synthetic */ PostsDownloadLinks(String str, String str2, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
