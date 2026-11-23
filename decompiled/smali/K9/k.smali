.class public final LK9/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LK9/l;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/io/Serializable;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LK9/l;Lu8/b;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LK9/k;->a:I

    const-string v0, "sequence"

    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, LK9/k;->c:Ljava/lang/Object;

    .line 6
    check-cast p2, Lv8/k;

    iput-object p2, p0, LK9/k;->b:Ljava/io/Serializable;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 2

    const/4 v0, 0x2

    iput v0, p0, LK9/k;->a:I

    sget-object v0, Ls8/g;->s:Ls8/g;

    const-string v1, "start"

    invoke-static {p1, v1}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LK9/k;->b:Ljava/io/Serializable;

    .line 3
    iput-object v0, p0, LK9/k;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lu8/a;Lu8/b;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LK9/k;->a:I

    const-string v0, "getNextValue"

    invoke-static {p2, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    check-cast p1, Lv8/k;

    iput-object p1, p0, LK9/k;->b:Ljava/io/Serializable;

    iput-object p2, p0, LK9/k;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget v0, p0, LK9/k;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ls8/e;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Ls8/e;-><init>(LK9/k;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_0
    new-instance v0, LK9/f;

    .line 13
    .line 14
    invoke-direct {v0, p0}, LK9/f;-><init>(LK9/k;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_1
    new-instance v0, LK9/j;

    .line 19
    .line 20
    invoke-direct {v0, p0}, LK9/j;-><init>(LK9/k;)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 26
.end method
