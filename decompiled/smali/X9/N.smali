.class public final LX9/N;
.super LX9/O;
.source "SourceFile"


# instance fields
.field public final synthetic t:I

.field public final u:J

.field public final v:Ljava/lang/Object;

.field public final w:Lma/h;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;JLma/h;I)V
    .locals 0

    .line 1
    iput p5, p0, LX9/N;->t:I

    iput-object p1, p0, LX9/N;->v:Ljava/lang/Object;

    iput-wide p2, p0, LX9/N;->u:J

    iput-object p4, p0, LX9/N;->w:Lma/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget v0, p0, LX9/N;->t:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-wide v0, p0, LX9/N;->u:J

    .line 7
    .line 8
    return-wide v0

    .line 9
    :pswitch_0
    iget-wide v0, p0, LX9/N;->u:J

    .line 10
    .line 11
    return-wide v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final b()LX9/A;
    .locals 2

    .line 1
    iget-object v0, p0, LX9/N;->v:Ljava/lang/Object;

    .line 2
    .line 3
    iget v1, p0, LX9/N;->t:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v0, Ljava/lang/String;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object v1, LX9/A;->d:Ljava/util/regex/Pattern;

    .line 15
    .line 16
    invoke-static {v0}, Lga/d;->x(Ljava/lang/String;)LX9/A;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :goto_0
    return-object v0

    .line 21
    :pswitch_0
    check-cast v0, LX9/A;

    .line 22
    .line 23
    return-object v0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 26
.end method

.method public final c()Lma/h;
    .locals 1

    .line 1
    iget v0, p0, LX9/N;->t:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LX9/N;->w:Lma/h;

    .line 7
    .line 8
    check-cast v0, Lma/r;

    .line 9
    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, LX9/N;->w:Lma/h;

    .line 12
    .line 13
    check-cast v0, Lma/f;

    .line 14
    .line 15
    return-object v0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
