package com.kcstream.cing.model;

import R5.a;
import java.util.List;
import kotlin.Metadata;
import p210v8.i;
import w4.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/kcstream/cing/model/Recent;", "", "", "Lcom/kcstream/cing/model/RecentItem;", "carousel", "Lcom/kcstream/cing/model/RecentPost;", "posts", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "Ljava/util/List;", a.PUSH_ADDITIONAL_DATA_KEY, "()Ljava/util/List;", "b", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Recent {

    @b("carousel")
    private final List<RecentItem> carousel;

    @b("posts")
    private final List<RecentPost> posts;

    public Recent(List<RecentItem> list, List<RecentPost> list2) {
        i.f(list, "carousel");
        i.f(list2, "posts");
        this.carousel = list;
        this.posts = list2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getCarousel() {
        return this.carousel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getPosts() {
        return this.posts;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Recent)) {
            return false;
        }
        Recent recent = (Recent) obj;
        return i.a(this.carousel, recent.carousel) && i.a(this.posts, recent.posts);
    }

    public final int hashCode() {
        return this.posts.hashCode() + (this.carousel.hashCode() * 31);
    }

    public final String toString() {
        return "Recent(carousel=" + this.carousel + ", posts=" + this.posts + ')';
    }
}
