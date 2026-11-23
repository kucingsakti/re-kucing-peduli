package com.kcstream.cing.model;

import R5.a;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.List;
import kotlin.Metadata;
import p210v8.i;
import w4.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/kcstream/cing/model/RecentPost;", "", "", "category", "", "Lcom/kcstream/cing/model/RecentItem;", JsonStorageKeyNames.DATA_KEY, "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", a.PUSH_ADDITIONAL_DATA_KEY, "()Ljava/lang/String;", "Ljava/util/List;", "b", "()Ljava/util/List;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class RecentPost {

    @b("category")
    private final String category;

    @b(JsonStorageKeyNames.DATA_KEY)
    private final List<RecentItem> data;

    public RecentPost(String str, List<RecentItem> list) {
        i.f(str, "category");
        i.f(list, JsonStorageKeyNames.DATA_KEY);
        this.category = str;
        this.data = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getData() {
        return this.data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentPost)) {
            return false;
        }
        RecentPost recentPost = (RecentPost) obj;
        return i.a(this.category, recentPost.category) && i.a(this.data, recentPost.data);
    }

    public final int hashCode() {
        return this.data.hashCode() + (this.category.hashCode() * 31);
    }

    public final String toString() {
        return "RecentPost(category=" + this.category + ", data=" + this.data + ')';
    }
}
