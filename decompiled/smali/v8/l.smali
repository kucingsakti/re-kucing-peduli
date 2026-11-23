.class public final Lv8/l;
.super Lv8/p;
.source "SourceFile"

# interfaces
.implements LC8/i;
.implements LC8/j;


# direct methods
.method public constructor <init>(LC8/c;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 1
    sget-object v1, Lv8/a;->s:Lv8/a;

    move-object v0, p1

    check-cast v0, Lv8/c;

    .line 2
    invoke-interface {v0}, Lv8/c;->a()Ljava/lang/Class;

    move-result-object v2

    instance-of p1, p1, LC8/c;

    xor-int/lit8 v5, p1, 0x1

    move-object v0, p0

    move-object v3, p2

    move-object v4, p3

    .line 3
    invoke-direct/range {v0 .. v5}, Lv8/p;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 4
    sget-object v1, Lv8/a;->s:Lv8/a;

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    .line 5
    invoke-direct/range {v0 .. v5}, Lv8/p;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final c()LC8/b;
    .locals 1

    .line 1
    sget-object v0, Lv8/u;->a:Lv8/v;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lv8/v;->d(Lv8/l;)LC8/i;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public final bridge synthetic e()LC8/n;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lv8/l;->e()LC8/q;

    move-result-object v0

    return-object v0
.end method

.method public final e()LC8/q;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lv8/p;->i()LC8/u;

    move-result-object v0

    check-cast v0, LC8/i;

    invoke-interface {v0}, LC8/r;->e()LC8/q;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic h()LC8/g;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lv8/l;->h()LC8/h;

    move-result-object v0

    return-object v0
.end method

.method public final h()LC8/h;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lv8/p;->i()LC8/u;

    move-result-object v0

    check-cast v0, LC8/i;

    invoke-interface {v0}, LC8/i;->h()LC8/h;

    move-result-object v0

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lv8/l;->e()LC8/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    new-array v1, v1, [Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    aput-object p1, v1, v2

    .line 10
    .line 11
    check-cast v0, LF8/s;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, LF8/s;->v([Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
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
.end method
