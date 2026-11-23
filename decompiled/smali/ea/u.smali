.class public final Lea/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lma/w;


# instance fields
.field public final s:J

.field public t:Z

.field public final u:Lma/f;

.field public final v:Lma/f;

.field public w:Z

.field public final synthetic x:Lea/v;


# direct methods
.method public constructor <init>(Lea/v;JZ)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "this$0"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lea/u;->x:Lea/v;

    .line 10
    .line 11
    iput-wide p2, p0, Lea/u;->s:J

    .line 12
    .line 13
    iput-boolean p4, p0, Lea/u;->t:Z

    .line 14
    .line 15
    new-instance p1, Lma/f;

    .line 16
    .line 17
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lea/u;->u:Lma/f;

    .line 21
    .line 22
    new-instance p1, Lma/f;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lea/u;->v:Lma/f;

    .line 28
    .line 29
    return-void
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
.method public final a(J)V
    .locals 1

    .line 1
    sget-object v0, LY9/c;->a:[B

    .line 2
    .line 3
    iget-object v0, p0, Lea/u;->x:Lea/v;

    .line 4
    .line 5
    iget-object v0, v0, Lea/v;->b:Lea/o;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Lea/o;->j(J)V

    .line 8
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
.end method

.method public final close()V
    .locals 4

    .line 1
    iget-object v0, p0, Lea/u;->x:Lea/v;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, Lea/u;->w:Z

    .line 6
    .line 7
    iget-object v1, p0, Lea/u;->v:Lma/f;

    .line 8
    .line 9
    iget-wide v2, v1, Lma/f;->t:J

    .line 10
    .line 11
    invoke-virtual {v1}, Lma/f;->a()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    monitor-exit v0

    .line 18
    const-wide/16 v0, 0x0

    .line 19
    .line 20
    cmp-long v0, v2, v0

    .line 21
    .line 22
    if-lez v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0, v2, v3}, Lea/u;->a(J)V

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lea/u;->x:Lea/v;

    .line 28
    .line 29
    invoke-virtual {v0}, Lea/v;->a()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception v1

    .line 34
    monitor-exit v0

    .line 35
    throw v1
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
.end method

.method public final e()Lma/y;
    .locals 1

    .line 1
    iget-object v0, p0, Lea/u;->x:Lea/v;

    .line 2
    .line 3
    iget-object v0, v0, Lea/v;->k:Lba/h;

    .line 4
    .line 5
    return-object v0
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
    :goto_0
    iget-object p2, p0, Lea/u;->x:Lea/v;

    .line 7
    .line 8
    monitor-enter p2

    .line 9
    :try_start_0
    iget-object p3, p2, Lea/v;->k:Lba/h;

    .line 10
    .line 11
    invoke-virtual {p3}, Lma/c;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 12
    .line 13
    .line 14
    :try_start_1
    invoke-virtual {p2}, Lea/v;->f()Lea/a;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    if-eqz p3, :cond_0

    .line 19
    .line 20
    iget-object p3, p2, Lea/v;->n:Ljava/io/IOException;

    .line 21
    .line 22
    if-nez p3, :cond_1

    .line 23
    .line 24
    new-instance p3, Lokhttp3/internal/http2/StreamResetException;

    .line 25
    .line 26
    invoke-virtual {p2}, Lea/v;->f()Lea/a;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {p3, v0}, Lokhttp3/internal/http2/StreamResetException;-><init>(Lea/a;)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto :goto_3

    .line 39
    :cond_0
    const/4 p3, 0x0

    .line 40
    :cond_1
    :goto_1
    iget-boolean v0, p0, Lea/u;->w:Z

    .line 41
    .line 42
    if-nez v0, :cond_8

    .line 43
    .line 44
    iget-object v0, p0, Lea/u;->v:Lma/f;

    .line 45
    .line 46
    iget-wide v1, v0, Lma/f;->t:J

    .line 47
    .line 48
    const-wide/16 v3, 0x0

    .line 49
    .line 50
    cmp-long v3, v1, v3

    .line 51
    .line 52
    const-wide/16 v4, -0x1

    .line 53
    .line 54
    const/4 v6, 0x0

    .line 55
    if-lez v3, :cond_2

    .line 56
    .line 57
    const-wide/16 v7, 0x2000

    .line 58
    .line 59
    invoke-static {v7, v8, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 60
    .line 61
    .line 62
    move-result-wide v1

    .line 63
    invoke-virtual {v0, p1, v1, v2}, Lma/f;->u(Lma/f;J)J

    .line 64
    .line 65
    .line 66
    move-result-wide v0

    .line 67
    iget-wide v2, p2, Lea/v;->c:J

    .line 68
    .line 69
    add-long/2addr v2, v0

    .line 70
    iput-wide v2, p2, Lea/v;->c:J

    .line 71
    .line 72
    iget-wide v7, p2, Lea/v;->d:J

    .line 73
    .line 74
    sub-long/2addr v2, v7

    .line 75
    if-nez p3, :cond_4

    .line 76
    .line 77
    iget-object v7, p2, Lea/v;->b:Lea/o;

    .line 78
    .line 79
    iget-object v7, v7, Lea/o;->H:Lea/z;

    .line 80
    .line 81
    invoke-virtual {v7}, Lea/z;->a()I

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    div-int/lit8 v7, v7, 0x2

    .line 86
    .line 87
    int-to-long v7, v7

    .line 88
    cmp-long v7, v2, v7

    .line 89
    .line 90
    if-ltz v7, :cond_4

    .line 91
    .line 92
    iget-object v7, p2, Lea/v;->b:Lea/o;

    .line 93
    .line 94
    iget v8, p2, Lea/v;->a:I

    .line 95
    .line 96
    invoke-virtual {v7, v8, v2, v3}, Lea/o;->o(IJ)V

    .line 97
    .line 98
    .line 99
    iget-wide v2, p2, Lea/v;->c:J

    .line 100
    .line 101
    iput-wide v2, p2, Lea/v;->d:J

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_2
    iget-boolean v0, p0, Lea/u;->t:Z

    .line 105
    .line 106
    if-nez v0, :cond_3

    .line 107
    .line 108
    if-nez p3, :cond_3

    .line 109
    .line 110
    invoke-virtual {p2}, Lea/v;->l()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 111
    .line 112
    .line 113
    const/4 v6, 0x1

    .line 114
    :cond_3
    move-wide v0, v4

    .line 115
    :cond_4
    :goto_2
    :try_start_2
    iget-object v2, p2, Lea/v;->k:Lba/h;

    .line 116
    .line 117
    invoke-virtual {v2}, Lba/h;->k()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 118
    .line 119
    .line 120
    monitor-exit p2

    .line 121
    if-eqz v6, :cond_5

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_5
    cmp-long p1, v0, v4

    .line 125
    .line 126
    if-eqz p1, :cond_6

    .line 127
    .line 128
    invoke-virtual {p0, v0, v1}, Lea/u;->a(J)V

    .line 129
    .line 130
    .line 131
    return-wide v0

    .line 132
    :cond_6
    if-nez p3, :cond_7

    .line 133
    .line 134
    return-wide v4

    .line 135
    :cond_7
    throw p3

    .line 136
    :catchall_1
    move-exception p1

    .line 137
    goto :goto_4

    .line 138
    :cond_8
    :try_start_3
    new-instance p1, Ljava/io/IOException;

    .line 139
    .line 140
    const-string p3, "stream closed"

    .line 141
    .line 142
    invoke-direct {p1, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 146
    :goto_3
    :try_start_4
    iget-object p3, p2, Lea/v;->k:Lba/h;

    .line 147
    .line 148
    invoke-virtual {p3}, Lba/h;->k()V

    .line 149
    .line 150
    .line 151
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 152
    :goto_4
    monitor-exit p2

    .line 153
    throw p1
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
.end method
