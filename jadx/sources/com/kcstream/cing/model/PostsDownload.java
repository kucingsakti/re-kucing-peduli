package com.kcstream.cing.model;

import R5.a;
import com.onesignal.inAppMessages.internal.display.impl.k;
import java.util.ArrayList;
import kotlin.Metadata;
import p210v8.e;
import p210v8.i;
import w4.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR2\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/kcstream/cing/model/PostsDownload;", "", "", k.EVENT_TYPE_KEY, "Ljava/util/ArrayList;", "Lcom/kcstream/cing/model/PostsDownloadLinks;", "Lkotlin/collections/ArrayList;", "links", "<init>", "(Ljava/lang/String;Ljava/util/ArrayList;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "Ljava/util/ArrayList;", a.PUSH_ADDITIONAL_DATA_KEY, "()Ljava/util/ArrayList;", "setLinks", "(Ljava/util/ArrayList;)V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PostsDownload {

    @b("links")
    private ArrayList<PostsDownloadLinks> links;

    @b(k.EVENT_TYPE_KEY)
    private String type;

    public PostsDownload(String str, ArrayList<PostsDownloadLinks> arrayList) {
        i.f(arrayList, "links");
        this.type = str;
        this.links = arrayList;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ArrayList getLinks() {
        return this.links;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostsDownload)) {
            return false;
        }
        PostsDownload postsDownload = (PostsDownload) obj;
        return i.a(this.type, postsDownload.type) && i.a(this.links, postsDownload.links);
    }

    public final int hashCode() {
        String str = this.type;
        return this.links.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "PostsDownload(type=" + this.type + ", links=" + this.links + ')';
    }

    public /* synthetic */ PostsDownload(String str, ArrayList arrayList, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : str, arrayList);
    }
}
