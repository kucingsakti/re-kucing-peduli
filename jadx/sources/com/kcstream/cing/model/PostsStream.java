package com.kcstream.cing.model;

import R5.a;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import kotlin.Metadata;
import p210v8.e;
import p210v8.i;
import w4.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/kcstream/cing/model/PostsStream;", "", "", "link", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", a.PUSH_ADDITIONAL_DATA_KEY, "()Ljava/lang/String;", "setLink", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PostsStream {

    @b("link")
    private String link;

    /* JADX WARN: Multi-variable type inference failed */
    public PostsStream() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PostsStream) && i.a(this.link, ((PostsStream) obj).link);
    }

    public final int hashCode() {
        String str = this.link;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC0487g.j(new StringBuilder("PostsStream(link="), this.link, ')');
    }

    public PostsStream(String str) {
        this.link = str;
    }

    public /* synthetic */ PostsStream(String str, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : str);
    }
}
