.class public final LX9/c;
.super Lma/k;
.source "SourceFile"


# instance fields
.field public final synthetic t:I

.field public final synthetic u:LX9/O;


# direct methods
.method public constructor <init>(Lma/w;LX9/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LX9/c;->t:I

    iput-object p2, p0, LX9/c;->u:LX9/O;

    .line 2
    invoke-direct {p0, p1}, Lma/k;-><init>(Lma/w;)V

    return-void
.end method

.method public constructor <init>(Lya/r;Lma/h;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LX9/c;->t:I

    .line 1
    iput-object p1, p0, LX9/c;->u:LX9/O;

    invoke-direct {p0, p2}, Lma/k;-><init>(Lma/w;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 1
    iget v0, p0, LX9/c;->t:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lma/k;->close()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object v0, p0, LX9/c;->u:LX9/O;

    .line 11
    .line 12
    check-cast v0, LX9/d;

    .line 13
    .line 14
    iget-object v0, v0, LX9/d;->t:LZ9/e;

    .line 15
    .line 16
    invoke-virtual {v0}, LZ9/e;->close()V

    .line 17
    .line 18
    .line 19
    invoke-super {p0}, Lma/k;->close()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 24
    .line 25
    .line 26
.end method

.method public u(Lma/f;J)J
    .locals 1

    .line 1
    iget v0, p0, LX9/c;->t:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Lma/k;->u(Lma/f;J)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    return-wide p1

    .line 11
    :pswitch_0
    const-wide/16 p2, 0x2000

    .line 12
    .line 13
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Lma/k;->u(Lma/f;J)J

    .line 14
    .line 15
    .line 16
    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    return-wide p1

    .line 18
    :catch_0
    move-exception p1

    .line 19
    iget-object p2, p0, LX9/c;->u:LX9/O;

    .line 20
    .line 21
    check-cast p2, Lya/r;

    .line 22
    .line 23
    iput-object p1, p2, Lya/r;->v:Ljava/io/IOException;

    .line 24
    .line 25
    throw p1

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
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
.end method
