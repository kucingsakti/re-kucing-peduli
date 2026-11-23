.class public final LT7/i;
.super LT7/a;
.source "SourceFile"


# instance fields
.field public final c:Le7/d;

.field public final d:Lv1/g;

.field public final e:Lr3/e;

.field public final f:Lr3/e;


# direct methods
.method public constructor <init>(LT7/r;Le7/d;)V
    .locals 2

    .line 1
    sget-object v0, LP7/a;->c:Lv1/g;

    .line 2
    .line 3
    sget-object v1, LP7/a;->b:Lr3/e;

    .line 4
    .line 5
    invoke-direct {p0, p1}, LT7/a;-><init>(LJ7/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, LT7/i;->c:Le7/d;

    .line 9
    .line 10
    iput-object v0, p0, LT7/i;->d:Lv1/g;

    .line 11
    .line 12
    iput-object v1, p0, LT7/i;->e:Lr3/e;

    .line 13
    .line 14
    iput-object v1, p0, LT7/i;->f:Lr3/e;

    .line 15
    .line 16
    return-void
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
    .locals 9

    .line 1
    instance-of v0, p1, LQ7/a;

    .line 2
    .line 3
    iget-object v1, p0, LT7/a;->b:LJ7/c;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v2, LT7/g;

    .line 8
    .line 9
    move-object v3, p1

    .line 10
    check-cast v3, LQ7/a;

    .line 11
    .line 12
    iget-object v4, p0, LT7/i;->c:Le7/d;

    .line 13
    .line 14
    iget-object v5, p0, LT7/i;->d:Lv1/g;

    .line 15
    .line 16
    iget-object v6, p0, LT7/i;->e:Lr3/e;

    .line 17
    .line 18
    iget-object v7, p0, LT7/i;->f:Lr3/e;

    .line 19
    .line 20
    invoke-direct/range {v2 .. v7}, LT7/g;-><init>(LQ7/a;Le7/d;Lv1/g;Lr3/e;Lr3/e;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2}, LJ7/c;->a(LJ7/f;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    new-instance v3, LT7/h;

    .line 28
    .line 29
    iget-object v5, p0, LT7/i;->c:Le7/d;

    .line 30
    .line 31
    iget-object v6, p0, LT7/i;->d:Lv1/g;

    .line 32
    .line 33
    iget-object v7, p0, LT7/i;->e:Lr3/e;

    .line 34
    .line 35
    iget-object v8, p0, LT7/i;->f:Lr3/e;

    .line 36
    .line 37
    move-object v4, p1

    .line 38
    invoke-direct/range {v3 .. v8}, LT7/h;-><init>(LJ7/f;Le7/d;Lv1/g;Lr3/e;Lr3/e;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v3}, LJ7/c;->a(LJ7/f;)V

    .line 42
    .line 43
    .line 44
    return-void
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
