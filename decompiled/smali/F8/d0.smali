.class public LF8/d0;
.super LF8/k0;
.source "SourceFile"

# interfaces
.implements LC8/t;


# instance fields
.field public final A:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LF8/D;LO8/K;)V
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p2, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0, p1, p2}, LF8/k0;-><init>(LF8/D;LO8/K;)V

    .line 6
    sget-object p1, Lh8/e;->s:Lh8/e;

    new-instance p2, LF8/c0;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0}, LF8/c0;-><init>(LF8/d0;I)V

    invoke-static {p1, p2}, LD3/b;->r(Lh8/e;Lu8/a;)Lh8/d;

    move-result-object p2

    iput-object p2, p0, LF8/d0;->A:Ljava/lang/Object;

    .line 7
    new-instance p2, LF8/c0;

    const/4 v0, 0x1

    invoke-direct {p2, p0, v0}, LF8/c0;-><init>(LF8/d0;I)V

    invoke-static {p1, p2}, LD3/b;->r(Lh8/e;Lu8/a;)Lh8/d;

    return-void
.end method

.method public constructor <init>(LF8/D;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signature"

    invoke-static {p3, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lv8/a;->s:Lv8/a;

    .line 2
    invoke-direct {p0, p1, p2, p3, v0}, LF8/k0;-><init>(LF8/D;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 3
    sget-object p1, Lh8/e;->s:Lh8/e;

    new-instance p2, LF8/c0;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p3}, LF8/c0;-><init>(LF8/d0;I)V

    invoke-static {p1, p2}, LD3/b;->r(Lh8/e;Lu8/a;)Lh8/d;

    move-result-object p2

    iput-object p2, p0, LF8/d0;->A:Ljava/lang/Object;

    .line 4
    new-instance p2, LF8/c0;

    const/4 p3, 0x1

    invoke-direct {p2, p0, p3}, LF8/c0;-><init>(LF8/d0;I)V

    invoke-static {p1, p2}, LD3/b;->r(Lh8/e;Lu8/a;)Lh8/d;

    return-void
.end method


# virtual methods
.method public final e()LC8/n;
    .locals 1

    .line 1
    iget-object v0, p0, LF8/d0;->A:Ljava/lang/Object;

    invoke-interface {v0}, Lh8/d;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF8/b0;

    return-object v0
.end method

.method public final e()LC8/s;
    .locals 1

    .line 2
    iget-object v0, p0, LF8/d0;->A:Ljava/lang/Object;

    invoke-interface {v0}, Lh8/d;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF8/b0;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LF8/d0;->A:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-interface {v0}, Lh8/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LF8/b0;

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    new-array v1, v1, [Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    aput-object p1, v1, v2

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    aput-object p2, v1, p1

    .line 17
    .line 18
    invoke-virtual {v0, v1}, LF8/s;->v([Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
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

.method public final m()LF8/g0;
    .locals 1

    .line 1
    iget-object v0, p0, LF8/d0;->A:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-interface {v0}, Lh8/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LF8/b0;

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
