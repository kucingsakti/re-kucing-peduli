.class public final Lba/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX9/z;


# static fields
.field public static final a:Lba/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lba/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lba/a;->a:Lba/a;

    .line 7
    .line 8
    return-void
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


# virtual methods
.method public final a(Lca/f;)LX9/L;
    .locals 9

    .line 1
    iget-object v1, p1, Lca/f;->a:Lba/i;

    .line 2
    .line 3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    monitor-enter v1

    .line 7
    :try_start_0
    iget-boolean v0, v1, Lba/i;->D:Z

    .line 8
    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    iget-boolean v0, v1, Lba/i;->C:Z

    .line 12
    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    iget-boolean v0, v1, Lba/i;->B:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    monitor-exit v1

    .line 20
    iget-object v2, v1, Lba/i;->y:Lba/e;

    .line 21
    .line 22
    invoke-static {v2}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, v1, Lba/i;->s:LX9/E;

    .line 26
    .line 27
    const-string v3, "client"

    .line 28
    .line 29
    invoke-static {v0, v3}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :try_start_1
    iget v3, p1, Lca/f;->f:I

    .line 33
    .line 34
    iget v4, p1, Lca/f;->g:I

    .line 35
    .line 36
    iget v5, p1, Lca/f;->h:I

    .line 37
    .line 38
    iget-boolean v6, v0, LX9/E;->x:Z

    .line 39
    .line 40
    iget-object v7, p1, Lca/f;->e:LX9/G;

    .line 41
    .line 42
    iget-object v7, v7, LX9/G;->b:Ljava/lang/String;

    .line 43
    .line 44
    const-string v8, "GET"

    .line 45
    .line 46
    invoke-static {v7, v8}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    const/4 v8, 0x1

    .line 51
    xor-int/2addr v7, v8

    .line 52
    invoke-virtual/range {v2 .. v7}, Lba/e;->a(IIIZZ)Lba/k;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {v3, v0, p1}, Lba/k;->k(LX9/E;Lca/f;)Lca/d;

    .line 57
    .line 58
    .line 59
    move-result-object v0
    :try_end_1
    .catch Lokhttp3/internal/connection/RouteException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 60
    new-instance v3, Lo4/r;

    .line 61
    .line 62
    invoke-direct {v3, v1, v2, v0}, Lo4/r;-><init>(Lba/i;Lba/e;Lca/d;)V

    .line 63
    .line 64
    .line 65
    iput-object v3, v1, Lba/i;->A:Lo4/r;

    .line 66
    .line 67
    iput-object v3, v1, Lba/i;->F:Lo4/r;

    .line 68
    .line 69
    monitor-enter v1

    .line 70
    :try_start_2
    iput-boolean v8, v1, Lba/i;->B:Z

    .line 71
    .line 72
    iput-boolean v8, v1, Lba/i;->C:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 73
    .line 74
    monitor-exit v1

    .line 75
    iget-boolean v0, v1, Lba/i;->E:Z

    .line 76
    .line 77
    if-nez v0, :cond_0

    .line 78
    .line 79
    const/4 v0, 0x0

    .line 80
    const/4 v1, 0x0

    .line 81
    const/16 v2, 0x3d

    .line 82
    .line 83
    invoke-static {p1, v0, v3, v1, v2}, Lca/f;->a(Lca/f;ILo4/r;LX9/G;I)Lca/f;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    iget-object p1, p1, Lca/f;->e:LX9/G;

    .line 88
    .line 89
    invoke-virtual {v0, p1}, Lca/f;->b(LX9/G;)LX9/L;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    return-object p1

    .line 94
    :cond_0
    new-instance p1, Ljava/io/IOException;

    .line 95
    .line 96
    const-string v0, "Canceled"

    .line 97
    .line 98
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw p1

    .line 102
    :catchall_0
    move-exception v0

    .line 103
    move-object p1, v0

    .line 104
    monitor-exit v1

    .line 105
    throw p1

    .line 106
    :catch_0
    move-exception v0

    .line 107
    move-object p1, v0

    .line 108
    goto :goto_0

    .line 109
    :catch_1
    move-exception v0

    .line 110
    move-object p1, v0

    .line 111
    goto :goto_1

    .line 112
    :goto_0
    invoke-virtual {v2, p1}, Lba/e;->c(Ljava/io/IOException;)V

    .line 113
    .line 114
    .line 115
    new-instance v0, Lokhttp3/internal/connection/RouteException;

    .line 116
    .line 117
    invoke-direct {v0, p1}, Lokhttp3/internal/connection/RouteException;-><init>(Ljava/io/IOException;)V

    .line 118
    .line 119
    .line 120
    throw v0

    .line 121
    :goto_1
    iget-object v0, p1, Lokhttp3/internal/connection/RouteException;->t:Ljava/io/IOException;

    .line 122
    .line 123
    invoke-virtual {v2, v0}, Lba/e;->c(Ljava/io/IOException;)V

    .line 124
    .line 125
    .line 126
    throw p1

    .line 127
    :cond_1
    :try_start_3
    const-string p1, "Check failed."

    .line 128
    .line 129
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 130
    .line 131
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    throw v0

    .line 135
    :catchall_1
    move-exception v0

    .line 136
    move-object p1, v0

    .line 137
    goto :goto_2

    .line 138
    :cond_2
    const-string p1, "Check failed."

    .line 139
    .line 140
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 141
    .line 142
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw v0

    .line 146
    :cond_3
    const-string p1, "released"

    .line 147
    .line 148
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 149
    .line 150
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 154
    :goto_2
    monitor-exit v1

    .line 155
    throw p1
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
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
.end method
