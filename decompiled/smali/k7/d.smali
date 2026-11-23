.class public final Lk7/d;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/a;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Lk7/f;


# direct methods
.method public synthetic constructor <init>(Lk7/f;I)V
    .locals 0

    .line 1
    iput p2, p0, Lk7/d;->s:I

    iput-object p1, p0, Lk7/d;->t:Lk7/f;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lv8/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lk7/d;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk7/d;->t:Lk7/f;

    .line 7
    .line 8
    iget-object v1, v0, Lk7/f;->F:Lcom/tonyodev/fetch2/Download;

    .line 9
    .line 10
    iget-object v0, v0, Lk7/f;->u:Lm7/b;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    new-instance v0, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 15
    .line 16
    invoke-direct {v0}, Lcom/tonyodev/fetch2/database/DownloadInfo;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v0}, Li8/C;->z(Lcom/tonyodev/fetch2/Download;Lcom/tonyodev/fetch2/database/DownloadInfo;)V

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    invoke-static {}, Lv8/i;->l()V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    throw v0

    .line 28
    :pswitch_0
    new-instance v0, Lcom/tonyodev/fetch2core/DownloadBlockInfo;

    .line 29
    .line 30
    invoke-direct {v0}, Lcom/tonyodev/fetch2core/DownloadBlockInfo;-><init>()V

    .line 31
    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    iput v1, v0, Lcom/tonyodev/fetch2core/DownloadBlockInfo;->t:I

    .line 35
    .line 36
    iget-object v1, p0, Lk7/d;->t:Lk7/f;

    .line 37
    .line 38
    iget-object v1, v1, Lk7/f;->F:Lcom/tonyodev/fetch2/Download;

    .line 39
    .line 40
    check-cast v1, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 41
    .line 42
    iget v1, v1, Lcom/tonyodev/fetch2/database/DownloadInfo;->s:I

    .line 43
    .line 44
    iput v1, v0, Lcom/tonyodev/fetch2core/DownloadBlockInfo;->s:I

    .line 45
    .line 46
    return-object v0

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
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
