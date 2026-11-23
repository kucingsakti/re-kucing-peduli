.class public final LZ9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lma/w;


# instance fields
.field public s:Z

.field public final synthetic t:Lma/h;

.field public final synthetic u:Lv1/f;

.field public final synthetic v:Lma/q;


# direct methods
.method public constructor <init>(Lma/h;Lv1/f;Lma/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LZ9/a;->t:Lma/h;

    .line 5
    .line 6
    iput-object p2, p0, LZ9/a;->u:Lv1/f;

    .line 7
    .line 8
    iput-object p3, p0, LZ9/a;->v:Lma/q;

    .line 9
    .line 10
    return-void
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
.method public final close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, LZ9/a;->s:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 6
    .line 7
    invoke-static {p0}, LY9/c;->h(Lma/w;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, LZ9/a;->s:Z

    .line 15
    .line 16
    iget-object v0, p0, LZ9/a;->u:Lv1/f;

    .line 17
    .line 18
    invoke-virtual {v0}, Lv1/f;->a()V

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, LZ9/a;->t:Lma/h;

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final e()Lma/y;
    .locals 1

    .line 1
    iget-object v0, p0, LZ9/a;->t:Lma/h;

    .line 2
    .line 3
    invoke-interface {v0}, Lma/w;->e()Lma/y;

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

.method public final u(Lma/f;J)J
    .locals 9

    .line 1
    const-string p2, "sink"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p2, 0x1

    .line 7
    :try_start_0
    iget-object p3, p0, LZ9/a;->t:Lma/h;

    .line 8
    .line 9
    const-wide/16 v0, 0x2000

    .line 10
    .line 11
    invoke-interface {p3, p1, v0, v1}, Lma/w;->u(Lma/f;J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v6
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    const-wide/16 v0, -0x1

    .line 16
    .line 17
    cmp-long p3, v6, v0

    .line 18
    .line 19
    iget-object v8, p0, LZ9/a;->v:Lma/q;

    .line 20
    .line 21
    if-nez p3, :cond_1

    .line 22
    .line 23
    iget-boolean p1, p0, LZ9/a;->s:Z

    .line 24
    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    iput-boolean p2, p0, LZ9/a;->s:Z

    .line 28
    .line 29
    invoke-virtual {v8}, Lma/q;->close()V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-wide v0

    .line 33
    :cond_1
    iget-object v3, v8, Lma/q;->t:Lma/f;

    .line 34
    .line 35
    iget-wide p2, p1, Lma/f;->t:J

    .line 36
    .line 37
    sub-long v4, p2, v6

    .line 38
    .line 39
    move-object v2, p1

    .line 40
    invoke-virtual/range {v2 .. v7}, Lma/f;->i(Lma/f;JJ)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v8}, Lma/q;->a()Lma/g;

    .line 44
    .line 45
    .line 46
    return-wide v6

    .line 47
    :catch_0
    move-exception v0

    .line 48
    move-object p1, v0

    .line 49
    iget-boolean p3, p0, LZ9/a;->s:Z

    .line 50
    .line 51
    if-nez p3, :cond_2

    .line 52
    .line 53
    iput-boolean p2, p0, LZ9/a;->s:Z

    .line 54
    .line 55
    iget-object p2, p0, LZ9/a;->u:Lv1/f;

    .line 56
    .line 57
    invoke-virtual {p2}, Lv1/f;->a()V

    .line 58
    .line 59
    .line 60
    :cond_2
    throw p1
.end method
