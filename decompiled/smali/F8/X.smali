.class public LF8/X;
.super LF8/k0;
.source "SourceFile"

# interfaces
.implements LC8/p;


# instance fields
.field public final A:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LF8/D;LO8/K;)V
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p2, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1, p2}, LF8/k0;-><init>(LF8/D;LO8/K;)V

    .line 2
    sget-object p1, Lh8/e;->s:Lh8/e;

    new-instance p2, LF8/W;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0}, LF8/W;-><init>(LF8/X;I)V

    invoke-static {p1, p2}, LD3/b;->r(Lh8/e;Lu8/a;)Lh8/d;

    move-result-object p2

    iput-object p2, p0, LF8/X;->A:Ljava/lang/Object;

    .line 3
    new-instance p2, LF8/W;

    const/4 v0, 0x1

    invoke-direct {p2, p0, v0}, LF8/W;-><init>(LF8/X;I)V

    invoke-static {p1, p2}, LD3/b;->r(Lh8/e;Lu8/a;)Lh8/d;

    return-void
.end method

.method public constructor <init>(LF8/D;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signature"

    invoke-static {p3, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0, p1, p2, p3, p4}, LF8/k0;-><init>(LF8/D;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 5
    sget-object p1, Lh8/e;->s:Lh8/e;

    new-instance p2, LF8/W;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p3}, LF8/W;-><init>(LF8/X;I)V

    invoke-static {p1, p2}, LD3/b;->r(Lh8/e;Lu8/a;)Lh8/d;

    move-result-object p2

    iput-object p2, p0, LF8/X;->A:Ljava/lang/Object;

    .line 6
    new-instance p2, LF8/W;

    const/4 p3, 0x1

    invoke-direct {p2, p0, p3}, LF8/W;-><init>(LF8/X;I)V

    invoke-static {p1, p2}, LD3/b;->r(Lh8/e;Lu8/a;)Lh8/d;

    return-void
.end method


# virtual methods
.method public final e()LC8/n;
    .locals 1

    .line 1
    iget-object v0, p0, LF8/X;->A:Ljava/lang/Object;

    invoke-interface {v0}, Lh8/d;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF8/V;

    return-object v0
.end method

.method public final e()LC8/o;
    .locals 1

    .line 2
    iget-object v0, p0, LF8/X;->A:Ljava/lang/Object;

    invoke-interface {v0}, Lh8/d;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF8/V;

    return-object v0
.end method

.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LF8/X;->A:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-interface {v0}, Lh8/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LF8/V;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    new-array v1, v1, [Ljava/lang/Object;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, LF8/s;->v([Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
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

.method public final m()LF8/g0;
    .locals 1

    .line 1
    iget-object v0, p0, LF8/X;->A:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-interface {v0}, Lh8/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LF8/V;

    .line 8
    .line 9
    return-object v0
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
