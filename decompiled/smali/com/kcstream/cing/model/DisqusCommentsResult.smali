.class public final Lcom/kcstream/cing/model/DisqusCommentsResult;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001a\u0008\u0086\u0008\u0018\u00002\u00020\u0001B7\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R\"\u0010\t\u001a\u00020\u00088\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\t\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001eR$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\r\u001a\u0004\u0008\u001f\u0010\u000f\"\u0004\u0008 \u0010!\u00a8\u0006\""
    }
    d2 = {
        "Lcom/kcstream/cing/model/DisqusCommentsResult;",
        "",
        "",
        "id",
        "Lcom/kcstream/cing/model/DisqusCommentsResultAuthor;",
        "author",
        "Lcom/kcstream/cing/model/DisqusCommentsResultLikes;",
        "like",
        "Lcom/kcstream/cing/model/DisqusCommentsResultMessage;",
        "message",
        "created_at",
        "<init>",
        "(Ljava/lang/String;Lcom/kcstream/cing/model/DisqusCommentsResultAuthor;Lcom/kcstream/cing/model/DisqusCommentsResultLikes;Lcom/kcstream/cing/model/DisqusCommentsResultMessage;Ljava/lang/String;)V",
        "Ljava/lang/String;",
        "getId",
        "()Ljava/lang/String;",
        "Lcom/kcstream/cing/model/DisqusCommentsResultAuthor;",
        "a",
        "()Lcom/kcstream/cing/model/DisqusCommentsResultAuthor;",
        "setAuthor",
        "(Lcom/kcstream/cing/model/DisqusCommentsResultAuthor;)V",
        "Lcom/kcstream/cing/model/DisqusCommentsResultLikes;",
        "b",
        "()Lcom/kcstream/cing/model/DisqusCommentsResultLikes;",
        "setLike",
        "(Lcom/kcstream/cing/model/DisqusCommentsResultLikes;)V",
        "Lcom/kcstream/cing/model/DisqusCommentsResultMessage;",
        "c",
        "()Lcom/kcstream/cing/model/DisqusCommentsResultMessage;",
        "setMessage",
        "(Lcom/kcstream/cing/model/DisqusCommentsResultMessage;)V",
        "getCreated_at",
        "setCreated_at",
        "(Ljava/lang/String;)V",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private author:Lcom/kcstream/cing/model/DisqusCommentsResultAuthor;
    .annotation runtime Lw4/b;
        value = "author"
    .end annotation
.end field

.field private created_at:Ljava/lang/String;
    .annotation runtime Lw4/b;
        value = "created_at"
    .end annotation
.end field

.field private final id:Ljava/lang/String;
    .annotation runtime Lw4/b;
        value = "id"
    .end annotation
.end field

.field private like:Lcom/kcstream/cing/model/DisqusCommentsResultLikes;
    .annotation runtime Lw4/b;
        value = "like"
    .end annotation
.end field

.field private message:Lcom/kcstream/cing/model/DisqusCommentsResultMessage;
    .annotation runtime Lw4/b;
        value = "message"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/kcstream/cing/model/DisqusCommentsResultAuthor;Lcom/kcstream/cing/model/DisqusCommentsResultLikes;Lcom/kcstream/cing/model/DisqusCommentsResultMessage;Ljava/lang/String;)V
    .locals 1

    const-string v0, "author"

    invoke-static {p2, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "like"

    invoke-static {p3, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p4, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kcstream/cing/model/DisqusCommentsResult;->id:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/kcstream/cing/model/DisqusCommentsResult;->author:Lcom/kcstream/cing/model/DisqusCommentsResultAuthor;

    .line 4
    iput-object p3, p0, Lcom/kcstream/cing/model/DisqusCommentsResult;->like:Lcom/kcstream/cing/model/DisqusCommentsResultLikes;

    .line 5
    iput-object p4, p0, Lcom/kcstream/cing/model/DisqusCommentsResult;->message:Lcom/kcstream/cing/model/DisqusCommentsResultMessage;

    .line 6
    iput-object p5, p0, Lcom/kcstream/cing/model/DisqusCommentsResult;->created_at:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/kcstream/cing/model/DisqusCommentsResultAuthor;Lcom/kcstream/cing/model/DisqusCommentsResultLikes;Lcom/kcstream/cing/model/DisqusCommentsResultMessage;Ljava/lang/String;ILv8/e;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_1

    move-object p6, v0

    :goto_0
    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_1
    move-object p6, p5

    goto :goto_0

    .line 7
    :goto_1
    invoke-direct/range {p1 .. p6}, Lcom/kcstream/cing/model/DisqusCommentsResult;-><init>(Ljava/lang/String;Lcom/kcstream/cing/model/DisqusCommentsResultAuthor;Lcom/kcstream/cing/model/DisqusCommentsResultLikes;Lcom/kcstream/cing/model/DisqusCommentsResultMessage;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/kcstream/cing/model/DisqusCommentsResultAuthor;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kcstream/cing/model/DisqusCommentsResult;->author:Lcom/kcstream/cing/model/DisqusCommentsResultAuthor;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public final b()Lcom/kcstream/cing/model/DisqusCommentsResultLikes;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kcstream/cing/model/DisqusCommentsResult;->like:Lcom/kcstream/cing/model/DisqusCommentsResultLikes;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public final c()Lcom/kcstream/cing/model/DisqusCommentsResultMessage;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kcstream/cing/model/DisqusCommentsResult;->message:Lcom/kcstream/cing/model/DisqusCommentsResultMessage;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/kcstream/cing/model/DisqusCommentsResult;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/kcstream/cing/model/DisqusCommentsResult;

    iget-object v1, p0, Lcom/kcstream/cing/model/DisqusCommentsResult;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/kcstream/cing/model/DisqusCommentsResult;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/kcstream/cing/model/DisqusCommentsResult;->author:Lcom/kcstream/cing/model/DisqusCommentsResultAuthor;

    iget-object v3, p1, Lcom/kcstream/cing/model/DisqusCommentsResult;->author:Lcom/kcstream/cing/model/DisqusCommentsResultAuthor;

    invoke-static {v1, v3}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/kcstream/cing/model/DisqusCommentsResult;->like:Lcom/kcstream/cing/model/DisqusCommentsResultLikes;

    iget-object v3, p1, Lcom/kcstream/cing/model/DisqusCommentsResult;->like:Lcom/kcstream/cing/model/DisqusCommentsResultLikes;

    invoke-static {v1, v3}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/kcstream/cing/model/DisqusCommentsResult;->message:Lcom/kcstream/cing/model/DisqusCommentsResultMessage;

    iget-object v3, p1, Lcom/kcstream/cing/model/DisqusCommentsResult;->message:Lcom/kcstream/cing/model/DisqusCommentsResultMessage;

    invoke-static {v1, v3}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/kcstream/cing/model/DisqusCommentsResult;->created_at:Ljava/lang/String;

    iget-object p1, p1, Lcom/kcstream/cing/model/DisqusCommentsResult;->created_at:Ljava/lang/String;

    invoke-static {v1, p1}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/kcstream/cing/model/DisqusCommentsResult;->id:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/kcstream/cing/model/DisqusCommentsResult;->author:Lcom/kcstream/cing/model/DisqusCommentsResultAuthor;

    invoke-virtual {v2}, Lcom/kcstream/cing/model/DisqusCommentsResultAuthor;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Lcom/kcstream/cing/model/DisqusCommentsResult;->like:Lcom/kcstream/cing/model/DisqusCommentsResultLikes;

    invoke-virtual {v0}, Lcom/kcstream/cing/model/DisqusCommentsResultLikes;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/kcstream/cing/model/DisqusCommentsResult;->message:Lcom/kcstream/cing/model/DisqusCommentsResultMessage;

    invoke-virtual {v2}, Lcom/kcstream/cing/model/DisqusCommentsResultMessage;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Lcom/kcstream/cing/model/DisqusCommentsResult;->created_at:Ljava/lang/String;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v2, v1

    return v2
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "DisqusCommentsResult(id="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/kcstream/cing/model/DisqusCommentsResult;->id:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", author="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/kcstream/cing/model/DisqusCommentsResult;->author:Lcom/kcstream/cing/model/DisqusCommentsResultAuthor;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", like="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lcom/kcstream/cing/model/DisqusCommentsResult;->like:Lcom/kcstream/cing/model/DisqusCommentsResultLikes;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", message="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lcom/kcstream/cing/model/DisqusCommentsResult;->message:Lcom/kcstream/cing/model/DisqusCommentsResultMessage;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", created_at="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lcom/kcstream/cing/model/DisqusCommentsResult;->created_at:Ljava/lang/String;

    .line 49
    .line 50
    const/16 v2, 0x29

    .line 51
    .line 52
    invoke-static {v0, v1, v2}, Landroidx/datastore/preferences/protobuf/g;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    return-object v0
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
.end method
