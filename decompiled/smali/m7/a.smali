.class public final Lm7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Li7/g;


# direct methods
.method public synthetic constructor <init>(Li7/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm7/a;->a:Li7/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILcom/tonyodev/fetch2/Download;)Ljava/util/ArrayList;
    .locals 5

    .line 1
    const-string v0, "download"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm7/a;->a:Li7/g;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Li7/g;->b(I)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x0

    .line 19
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v3, -0x1

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lcom/tonyodev/fetch2/Download;

    .line 31
    .line 32
    check-cast v2, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 33
    .line 34
    iget v2, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->s:I

    .line 35
    .line 36
    move-object v4, p2

    .line 37
    check-cast v4, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 38
    .line 39
    iget v4, v4, Lcom/tonyodev/fetch2/database/DownloadInfo;->s:I

    .line 40
    .line 41
    if-ne v2, v4, :cond_0

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    move v1, v3

    .line 48
    :goto_1
    if-eq v1, v3, :cond_2

    .line 49
    .line 50
    invoke-virtual {p1, v1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    :cond_2
    return-object p1
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
.end method

.method public b(Lcom/tonyodev/fetch2/database/DownloadInfo;)V
    .locals 2

    .line 1
    const-string v0, "downloadInfo"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm7/a;->a:Li7/g;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const-string v1, "downloadInfo"

    .line 12
    .line 13
    invoke-static {p1, v1}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v1, v0, Li7/g;->s:Ljava/lang/Object;

    .line 17
    .line 18
    monitor-enter v1

    .line 19
    :try_start_0
    iget-object v0, v0, Li7/g;->t:Li7/f;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Li7/f;->l(Lcom/tonyodev/fetch2/database/DownloadInfo;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    monitor-exit v1

    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    monitor-exit v1

    .line 28
    throw p1
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method
