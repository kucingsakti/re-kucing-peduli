.class public final LF8/J;
.super LF8/a0;
.source "SourceFile"

# interfaces
.implements LC8/i;


# instance fields
.field public final B:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LF8/D;LO8/K;)V
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p2, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2}, LF8/a0;-><init>(LF8/D;LO8/K;)V

    .line 4
    sget-object p1, Lh8/e;->s:Lh8/e;

    new-instance p2, LA0/r;

    const/16 v0, 0x9

    invoke-direct {p2, p0, v0}, LA0/r;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1, p2}, LD3/b;->r(Lh8/e;Lu8/a;)Lh8/d;

    move-result-object p1

    iput-object p1, p0, LF8/J;->B:Ljava/lang/Object;

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

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, LF8/a0;-><init>(LF8/D;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 2
    sget-object p1, Lh8/e;->s:Lh8/e;

    new-instance p2, LA0/r;

    const/16 p3, 0x9

    invoke-direct {p2, p0, p3}, LA0/r;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1, p2}, LD3/b;->r(Lh8/e;Lu8/a;)Lh8/d;

    move-result-object p1

    iput-object p1, p0, LF8/J;->B:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final h()LC8/g;
    .locals 1

    .line 1
    iget-object v0, p0, LF8/J;->B:Ljava/lang/Object;

    invoke-interface {v0}, Lh8/d;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF8/I;

    return-object v0
.end method

.method public final h()LC8/h;
    .locals 1

    .line 2
    iget-object v0, p0, LF8/J;->B:Ljava/lang/Object;

    invoke-interface {v0}, Lh8/d;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF8/I;

    return-object v0
.end method
