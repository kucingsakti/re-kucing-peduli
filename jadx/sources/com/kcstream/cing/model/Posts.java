package com.kcstream.cing.model;

import R5.a;
import java.util.List;
import kotlin.Metadata;
import p210v8.e;
import p210v8.i;
import w4.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001a\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR$\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001a\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010\u001eR$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001a\u001a\u0004\b'\u0010\u001c\"\u0004\b(\u0010\u001eR$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010+\u001a\u0004\b0\u0010-\"\u0004\b1\u0010/R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u00067"}, d2 = {"Lcom/kcstream/cing/model/Posts;", "", "", "id", "", "slug", "title", "date", "content", "image", "note", "streamNote", "", "Lcom/kcstream/cing/model/PostsStream;", "stream", "Lcom/kcstream/cing/model/PostsDownload;", "download", "Lcom/kcstream/cing/model/PostsSeries;", "series", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/kcstream/cing/model/PostsSeries;)V", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "setSlug", "(Ljava/lang/String;)V", "k", "setTitle", "b", "setDate", a.PUSH_ADDITIONAL_DATA_KEY, "setContent", "e", "setImage", "f", "setNote", "j", "setStreamNote", "Ljava/util/List;", "i", "()Ljava/util/List;", "setStream", "(Ljava/util/List;)V", "c", "setDownload", "Lcom/kcstream/cing/model/PostsSeries;", "g", "()Lcom/kcstream/cing/model/PostsSeries;", "setSeries", "(Lcom/kcstream/cing/model/PostsSeries;)V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Posts {

    @b("content")
    private String content;

    @b("date")
    private String date;

    @b("download")
    private List<PostsDownload> download;

    @b("id")
    private Integer id;

    @b("image")
    private String image;

    @b("note")
    private String note;

    @b("series")
    private PostsSeries series;

    @b("slug")
    private String slug;

    @b("stream")
    private List<PostsStream> stream;

    @b("streamnote")
    private String streamNote;

    @b("title")
    private String title;

    public Posts(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, List<PostsStream> list, List<PostsDownload> list2, PostsSeries postsSeries) {
        i.f(str, "slug");
        i.f(str2, "title");
        i.f(str3, "date");
        i.f(list, "stream");
        i.f(list2, "download");
        this.id = num;
        this.slug = str;
        this.title = str2;
        this.date = str3;
        this.content = str4;
        this.image = str5;
        this.note = str6;
        this.streamNote = str7;
        this.stream = list;
        this.download = list2;
        this.series = postsSeries;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getDownload() {
        return this.download;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Posts)) {
            return false;
        }
        Posts posts = (Posts) obj;
        return i.a(this.id, posts.id) && i.a(this.slug, posts.slug) && i.a(this.title, posts.title) && i.a(this.date, posts.date) && i.a(this.content, posts.content) && i.a(this.image, posts.image) && i.a(this.note, posts.note) && i.a(this.streamNote, posts.streamNote) && i.a(this.stream, posts.stream) && i.a(this.download, posts.download) && i.a(this.series, posts.series);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final PostsSeries getSeries() {
        return this.series;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    public final int hashCode() {
        Integer num = this.id;
        int iA = p231y.a.a(p231y.a.a(p231y.a.a((num == null ? 0 : num.hashCode()) * 31, this.slug, 31), this.title, 31), this.date, 31);
        String str = this.content;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.image;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.note;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.streamNote;
        int iHashCode4 = (this.download.hashCode() + ((this.stream.hashCode() + ((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31)) * 31;
        PostsSeries postsSeries = this.series;
        return iHashCode4 + (postsSeries != null ? postsSeries.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final List getStream() {
        return this.stream;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getStreamNote() {
        return this.streamNote;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final String toString() {
        return "Posts(id=" + this.id + ", slug=" + this.slug + ", title=" + this.title + ", date=" + this.date + ", content=" + this.content + ", image=" + this.image + ", note=" + this.note + ", streamNote=" + this.streamNote + ", stream=" + this.stream + ", download=" + this.download + ", series=" + this.series + ')';
    }

    public /* synthetic */ Posts(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, PostsSeries postsSeries, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : num, str, str2, str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5, (i10 & 64) != 0 ? null : str6, (i10 & 128) != 0 ? null : str7, list, list2, (i10 & 1024) != 0 ? null : postsSeries);
    }
}
