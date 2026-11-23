package com.kcstream.cing.model;

import R5.a;
import kotlin.Metadata;
import p210v8.e;
import p210v8.i;
import w4.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/kcstream/cing/model/DisqusCommentsResultLikes;", "", "", "likes", "dislikes", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "setLikes", "(Ljava/lang/Integer;)V", a.PUSH_ADDITIONAL_DATA_KEY, "setDislikes", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DisqusCommentsResultLikes {

    @b("dislikes")
    private Integer dislikes;

    @b("likes")
    private Integer likes;

    /* JADX WARN: Multi-variable type inference failed */
    public DisqusCommentsResultLikes() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getDislikes() {
        return this.dislikes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getLikes() {
        return this.likes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisqusCommentsResultLikes)) {
            return false;
        }
        DisqusCommentsResultLikes disqusCommentsResultLikes = (DisqusCommentsResultLikes) obj;
        return i.a(this.likes, disqusCommentsResultLikes.likes) && i.a(this.dislikes, disqusCommentsResultLikes.dislikes);
    }

    public final int hashCode() {
        Integer num = this.likes;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.dislikes;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "DisqusCommentsResultLikes(likes=" + this.likes + ", dislikes=" + this.dislikes + ')';
    }

    public DisqusCommentsResultLikes(Integer num, Integer num2) {
        this.likes = num;
        this.dislikes = num2;
    }

    public /* synthetic */ DisqusCommentsResultLikes(Integer num, Integer num2, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2);
    }
}
