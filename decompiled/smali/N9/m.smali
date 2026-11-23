.class public final LN9/m;
.super LN9/k0;
.source "SourceFile"

# interfaces
.implements LN9/l;


# virtual methods
.method public final Q(Lm8/d;)Ljava/lang/Object;
    .locals 3

    .line 1
    :cond_0
    invoke-virtual {p0}, LN9/k0;->y()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, LN9/Y;

    .line 6
    .line 7
    if-nez v1, :cond_2

    .line 8
    .line 9
    instance-of p1, v0, LN9/p;

    .line 10
    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    invoke-static {v0}, LN9/z;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    check-cast v0, LN9/p;

    .line 19
    .line 20
    iget-object p1, v0, LN9/p;->a:Ljava/lang/Throwable;

    .line 21
    .line 22
    throw p1

    .line 23
    :cond_2
    invoke-virtual {p0, v0}, LN9/k0;->N(Ljava/lang/Object;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-ltz v0, :cond_0

    .line 28
    .line 29
    new-instance v0, LN9/g0;

    .line 30
    .line 31
    invoke-static {p1}, Lqa/b;->q(Lm8/d;)Lm8/d;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-direct {v0, p1, p0}, LN9/g0;-><init>(Lm8/d;LN9/m;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, LN9/g;->w()V

    .line 39
    .line 40
    .line 41
    new-instance p1, LN9/L;

    .line 42
    .line 43
    const/4 v1, 0x2

    .line 44
    invoke-direct {p1, v0, v1}, LN9/L;-><init>(Ljava/lang/Object;I)V

    .line 45
    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    const/4 v2, 0x1

    .line 49
    invoke-virtual {p0, v1, v2, p1}, LN9/k0;->C(ZZLu8/b;)LN9/K;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    new-instance v1, LN9/e;

    .line 54
    .line 55
    const/4 v2, 0x1

    .line 56
    invoke-direct {v1, p1, v2}, LN9/e;-><init>(Ljava/lang/Object;I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1}, LN9/g;->y(Lu8/b;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, LN9/g;->v()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    :goto_0
    return-object p1
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
    .line 87
    .line 88
    .line 89
    .line 90
.end method
