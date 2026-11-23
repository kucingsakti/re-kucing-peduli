.class public final LT7/m;
.super La8/b;
.source "SourceFile"

# interfaces
.implements LQ7/a;


# instance fields
.field public final w:LN7/d;


# direct methods
.method public constructor <init>(LJ7/f;LN7/d;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, La8/b;-><init>(LJ7/f;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LT7/m;->w:LN7/d;

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
.method public final b(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    iget-boolean v0, p0, La8/b;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    iget-object v0, p0, La8/b;->s:LJ7/f;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    :try_start_0
    iget-object v2, p0, LT7/m;->w:LN7/d;

    .line 11
    .line 12
    invoke-interface {v2, p1}, LN7/d;->a(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v0, p1}, LJ7/f;->d(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    return v1

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    invoke-static {p1}, Lga/l;->n(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, La8/b;->t:Lua/a;

    .line 27
    .line 28
    invoke-interface {v0}, Lua/a;->cancel()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1}, La8/b;->onError(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    return v1
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

.method public final d(Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, LT7/m;->b(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, La8/b;->t:Lua/a;

    .line 8
    .line 9
    const-wide/16 v0, 0x1

    .line 10
    .line 11
    invoke-interface {p1, v0, v1}, Lua/a;->f(J)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
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

.method public final poll()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, La8/b;->u:LQ7/c;

    .line 2
    .line 3
    :cond_0
    invoke-interface {v0}, LQ7/d;->poll()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return-object v0

    .line 11
    :cond_1
    iget-object v2, p0, LT7/m;->w:LN7/d;

    .line 12
    .line 13
    invoke-interface {v2, v1}, LN7/d;->a(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    return-object v1
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method
