.class public final LX8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM8/h;


# instance fields
.field public final s:LFa/e;

.field public final t:La9/b;

.field public final u:Z

.field public final v:Lz9/j;


# direct methods
.method public constructor <init>(LFa/e;La9/b;Z)V
    .locals 1

    .line 1
    const-string v0, "c"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "annotationOwner"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LX8/b;->s:LFa/e;

    .line 15
    .line 16
    iput-object p2, p0, LX8/b;->t:La9/b;

    .line 17
    .line 18
    iput-boolean p3, p0, LX8/b;->u:Z

    .line 19
    .line 20
    iget-object p1, p1, LFa/e;->t:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, LI4/a;

    .line 23
    .line 24
    iget-object p1, p1, LI4/a;->a:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Lz9/l;

    .line 27
    .line 28
    new-instance p2, LA0/m;

    .line 29
    .line 30
    const/16 p3, 0x14

    .line 31
    .line 32
    invoke-direct {p2, p0, p3}, LA0/m;-><init>(Ljava/lang/Object;I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, p2}, Lz9/l;->c(Lu8/b;)Lz9/j;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, LX8/b;->v:Lz9/j;

    .line 40
    .line 41
    return-void
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
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
.end method


# virtual methods
.method public final E(Lj9/c;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lo1/f;->k(LM8/h;Lj9/c;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
    .line 6
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
.end method

.method public final H(Lj9/c;)LM8/b;
    .locals 3

    .line 1
    const-string v0, "fqName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LX8/b;->t:La9/b;

    .line 7
    .line 8
    invoke-interface {v0, p1}, La9/b;->a(Lj9/c;)LR8/d;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    iget-object v2, p0, LX8/b;->v:Lz9/j;

    .line 15
    .line 16
    invoke-virtual {v2, v1}, Lz9/j;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, LM8/b;

    .line 21
    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-object v1

    .line 26
    :cond_1
    :goto_0
    sget-object v1, LV8/c;->a:Lj9/f;

    .line 27
    .line 28
    iget-object v1, p0, LX8/b;->s:LFa/e;

    .line 29
    .line 30
    invoke-static {p1, v0, v1}, LV8/c;->a(Lj9/c;La9/b;LFa/e;)LW8/h;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1
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
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
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

.method public final isEmpty()Z
    .locals 1

    .line 1
    iget-object v0, p0, LX8/b;->t:La9/b;

    .line 2
    .line 3
    invoke-interface {v0}, La9/b;->q()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
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

.method public final iterator()Ljava/util/Iterator;
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-object v2, p0, LX8/b;->t:La9/b;

    .line 4
    .line 5
    invoke-interface {v2}, La9/b;->q()Ljava/util/Collection;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    check-cast v3, Ljava/lang/Iterable;

    .line 10
    .line 11
    invoke-static {v3}, Li8/k;->N(Ljava/lang/Iterable;)LK9/p;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    iget-object v4, p0, LX8/b;->v:Lz9/j;

    .line 16
    .line 17
    invoke-static {v3, v4}, LK9/n;->z(LK9/l;Lu8/b;)LK9/u;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    sget-object v4, LV8/c;->a:Lj9/f;

    .line 22
    .line 23
    sget-object v4, LI8/n;->m:Lj9/c;

    .line 24
    .line 25
    iget-object v5, p0, LX8/b;->s:LFa/e;

    .line 26
    .line 27
    invoke-static {v4, v2, v5}, LV8/c;->a(Lj9/c;La9/b;LFa/e;)LW8/h;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    new-array v4, v0, [Ljava/lang/Object;

    .line 32
    .line 33
    aput-object v2, v4, v1

    .line 34
    .line 35
    invoke-static {v4}, Li8/i;->m([Ljava/lang/Object;)LK9/l;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const/4 v4, 0x2

    .line 40
    new-array v4, v4, [LK9/l;

    .line 41
    .line 42
    aput-object v3, v4, v1

    .line 43
    .line 44
    aput-object v2, v4, v0

    .line 45
    .line 46
    invoke-static {v4}, Li8/i;->m([Ljava/lang/Object;)LK9/l;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {v0}, LK9/n;->w(LK9/l;)LK9/i;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sget-object v2, LK9/q;->v:LK9/q;

    .line 55
    .line 56
    new-instance v3, LK9/g;

    .line 57
    .line 58
    invoke-direct {v3, v0, v1, v2}, LK9/g;-><init>(LK9/l;ZLu8/b;)V

    .line 59
    .line 60
    .line 61
    new-instance v0, LK9/f;

    .line 62
    .line 63
    invoke-direct {v0, v3}, LK9/f;-><init>(LK9/g;)V

    .line 64
    .line 65
    .line 66
    return-object v0
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
.end method
