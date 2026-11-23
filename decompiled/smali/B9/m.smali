.class public final LB9/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB9/l;


# instance fields
.field public final c:LB9/e;

.field public final d:Lm9/l;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    sget-object v0, LB9/e;->s:LB9/e;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, LB9/m;->c:LB9/e;

    .line 7
    .line 8
    new-instance v0, Lm9/l;

    .line 9
    .line 10
    sget-object v1, Lm9/l;->d:Lm9/c;

    .line 11
    .line 12
    invoke-direct {v0, v1}, Lm9/l;-><init>(LB9/c;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, LB9/m;->d:Lm9/l;

    .line 16
    .line 17
    return-void
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


# virtual methods
.method public final a(LA9/y;LA9/y;)Z
    .locals 3

    .line 1
    const-string v0, "a"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "b"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LB9/m;->c:LB9/e;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x6

    .line 15
    invoke-static {v1, v0, v2}, LB9/g;->l(ZLB9/e;I)LA9/N;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p1}, LA9/y;->D0()LA9/d0;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p2}, LA9/y;->D0()LA9/d0;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-static {v0, p1, p2}, LA9/f;->g(LA9/N;LD9/c;LD9/c;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1
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

.method public final b(LA9/y;LA9/y;)Z
    .locals 3

    .line 1
    const-string v0, "subtype"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "supertype"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LB9/m;->c:LB9/e;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    const/4 v2, 0x6

    .line 15
    invoke-static {v1, v0, v2}, LB9/g;->l(ZLB9/e;I)LA9/N;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p1}, LA9/y;->D0()LA9/d0;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p2}, LA9/y;->D0()LA9/d0;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    sget-object v1, LA9/f;->a:LA9/f;

    .line 28
    .line 29
    invoke-static {v1, v0, p1, p2}, LA9/f;->n(LA9/f;LA9/N;LD9/c;LD9/c;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    return p1
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
