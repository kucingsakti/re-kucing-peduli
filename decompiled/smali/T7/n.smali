.class public final LT7/n;
.super LT7/a;
.source "SourceFile"


# instance fields
.field public final c:LN7/d;


# direct methods
.method public constructor <init>(LJ7/c;LN7/d;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LT7/a;-><init>(LJ7/c;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LT7/n;->c:LN7/d;

    .line 5
    .line 6
    return-void
    .line 7
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


# virtual methods
.method public final b(LJ7/f;)V
    .locals 3

    .line 1
    instance-of v0, p1, LQ7/a;

    .line 2
    .line 3
    iget-object v1, p0, LT7/n;->c:LN7/d;

    .line 4
    .line 5
    iget-object v2, p0, LT7/a;->b:LJ7/c;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, LT7/l;

    .line 10
    .line 11
    check-cast p1, LQ7/a;

    .line 12
    .line 13
    invoke-direct {v0, p1, v1}, LT7/l;-><init>(LQ7/a;LN7/d;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2, v0}, LJ7/c;->a(LJ7/f;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    new-instance v0, LT7/m;

    .line 21
    .line 22
    invoke-direct {v0, p1, v1}, LT7/m;-><init>(LJ7/f;LN7/d;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v0}, LJ7/c;->a(LJ7/f;)V

    .line 26
    .line 27
    .line 28
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method
