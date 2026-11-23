package com.kcstream.cing.model;

import R5.a;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import kotlin.Metadata;
import p210v8.e;
import p210v8.i;
import w4.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\r\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/kcstream/cing/model/DisqusCommentsResult;", "", "", "id", "Lcom/kcstream/cing/model/DisqusCommentsResultAuthor;", "author", "Lcom/kcstream/cing/model/DisqusCommentsResultLikes;", "like", "Lcom/kcstream/cing/model/DisqusCommentsResultMessage;", "message", "created_at", "<init>", "(Ljava/lang/String;Lcom/kcstream/cing/model/DisqusCommentsResultAuthor;Lcom/kcstream/cing/model/DisqusCommentsResultLikes;Lcom/kcstream/cing/model/DisqusCommentsResultMessage;Ljava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/kcstream/cing/model/DisqusCommentsResultAuthor;", a.PUSH_ADDITIONAL_DATA_KEY, "()Lcom/kcstream/cing/model/DisqusCommentsResultAuthor;", "setAuthor", "(Lcom/kcstream/cing/model/DisqusCommentsResultAuthor;)V", "Lcom/kcstream/cing/model/DisqusCommentsResultLikes;", "b", "()Lcom/kcstream/cing/model/DisqusCommentsResultLikes;", "setLike", "(Lcom/kcstream/cing/model/DisqusCommentsResultLikes;)V", "Lcom/kcstream/cing/model/DisqusCommentsResultMessage;", "c", "()Lcom/kcstream/cing/model/DisqusCommentsResultMessage;", "setMessage", "(Lcom/kcstream/cing/model/DisqusCommentsResultMessage;)V", "getCreated_at", "setCreated_at", "(Ljava/lang/String;)V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DisqusCommentsResult {

    @b("author")
    private DisqusCommentsResultAuthor author;

    @b("created_at")
    private String created_at;

    @b("id")
    private final String id;

    @b("like")
    private DisqusCommentsResultLikes like;

    @b("message")
    private DisqusCommentsResultMessage message;

    public DisqusCommentsResult(String str, DisqusCommentsResultAuthor disqusCommentsResultAuthor, DisqusCommentsResultLikes disqusCommentsResultLikes, DisqusCommentsResultMessage disqusCommentsResultMessage, String str2) {
        i.f(disqusCommentsResultAuthor, "author");
        i.f(disqusCommentsResultLikes, "like");
        i.f(disqusCommentsResultMessage, "message");
        this.id = str;
        this.author = disqusCommentsResultAuthor;
        this.like = disqusCommentsResultLikes;
        this.message = disqusCommentsResultMessage;
        this.created_at = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DisqusCommentsResultAuthor getAuthor() {
        return this.author;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DisqusCommentsResultLikes getLike() {
        return this.like;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final DisqusCommentsResultMessage getMessage() {
        return this.message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisqusCommentsResult)) {
            return false;
        }
        DisqusCommentsResult disqusCommentsResult = (DisqusCommentsResult) obj;
        return i.a(this.id, disqusCommentsResult.id) && i.a(this.author, disqusCommentsResult.author) && i.a(this.like, disqusCommentsResult.like) && i.a(this.message, disqusCommentsResult.message) && i.a(this.created_at, disqusCommentsResult.created_at);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (this.message.hashCode() + ((this.like.hashCode() + ((this.author.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31)) * 31;
        String str2 = this.created_at;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisqusCommentsResult(id=");
        sb.append(this.id);
        sb.append(", author=");
        sb.append(this.author);
        sb.append(", like=");
        sb.append(this.like);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", created_at=");
        return AbstractC0487g.j(sb, this.created_at, ')');
    }

    public /* synthetic */ DisqusCommentsResult(String str, DisqusCommentsResultAuthor disqusCommentsResultAuthor, DisqusCommentsResultLikes disqusCommentsResultLikes, DisqusCommentsResultMessage disqusCommentsResultMessage, String str2, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : str, disqusCommentsResultAuthor, disqusCommentsResultLikes, disqusCommentsResultMessage, (i10 & 16) != 0 ? null : str2);
    }
}
