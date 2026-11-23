.class public final Lea/i;
.super Laa/a;
.source "SourceFile"


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lea/i;->e:I

    iput-object p2, p0, Lea/i;->f:Ljava/lang/Object;

    iput-object p3, p0, Lea/i;->g:Ljava/lang/Object;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Laa/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 15

    .line 1
    const/4 v0, 0x0

    .line 2
    const-wide/16 v1, -0x1

    .line 3
    .line 4
    iget v3, p0, Lea/i;->e:I

    .line 5
    .line 6
    packed-switch v3, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v3, p0, Lea/i;->f:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, LO8/h;

    .line 12
    .line 13
    iget-object v4, p0, Lea/i;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v4, Lea/z;

    .line 16
    .line 17
    new-instance v5, Lv8/t;

    .line 18
    .line 19
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iget-object v3, v3, LO8/h;->u:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v3, Lea/o;

    .line 25
    .line 26
    iget-object v6, v3, Lea/o;->O:Lea/w;

    .line 27
    .line 28
    monitor-enter v6

    .line 29
    :try_start_0
    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 30
    :try_start_1
    iget-object v7, v3, Lea/o;->I:Lea/z;

    .line 31
    .line 32
    new-instance v8, Lea/z;

    .line 33
    .line 34
    invoke-direct {v8}, Lea/z;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v8, v7}, Lea/z;->b(Lea/z;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v8, v4}, Lea/z;->b(Lea/z;)V

    .line 41
    .line 42
    .line 43
    iput-object v8, v5, Lv8/t;->s:Ljava/lang/Object;

    .line 44
    .line 45
    invoke-virtual {v8}, Lea/z;->a()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    int-to-long v8, v4

    .line 50
    invoke-virtual {v7}, Lea/z;->a()I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    int-to-long v10, v4

    .line 55
    sub-long/2addr v8, v10

    .line 56
    const-wide/16 v10, 0x0

    .line 57
    .line 58
    cmp-long v4, v8, v10

    .line 59
    .line 60
    if-eqz v4, :cond_2

    .line 61
    .line 62
    iget-object v7, v3, Lea/o;->t:Ljava/util/LinkedHashMap;

    .line 63
    .line 64
    invoke-interface {v7}, Ljava/util/Map;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    if-eqz v7, :cond_0

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    iget-object v7, v3, Lea/o;->t:Ljava/util/LinkedHashMap;

    .line 72
    .line 73
    invoke-virtual {v7}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    new-array v12, v0, [Lea/v;

    .line 78
    .line 79
    invoke-interface {v7, v12}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    if-eqz v7, :cond_1

    .line 84
    .line 85
    check-cast v7, [Lea/v;

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :catchall_0
    move-exception v0

    .line 89
    goto :goto_4

    .line 90
    :cond_1
    new-instance v0, Ljava/lang/NullPointerException;

    .line 91
    .line 92
    const-string v1, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    .line 93
    .line 94
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw v0

    .line 98
    :cond_2
    :goto_0
    const/4 v7, 0x0

    .line 99
    :goto_1
    iget-object v12, v5, Lv8/t;->s:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v12, Lea/z;

    .line 102
    .line 103
    const-string v13, "<set-?>"

    .line 104
    .line 105
    invoke-static {v12, v13}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    iput-object v12, v3, Lea/o;->I:Lea/z;

    .line 109
    .line 110
    iget-object v12, v3, Lea/o;->B:Laa/b;

    .line 111
    .line 112
    iget-object v13, v3, Lea/o;->u:Ljava/lang/String;

    .line 113
    .line 114
    const-string v14, " onSettings"

    .line 115
    .line 116
    invoke-static {v14, v13}, Lv8/i;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v13

    .line 120
    new-instance v14, Lea/i;

    .line 121
    .line 122
    invoke-direct {v14, v13, v3, v5, v0}, Lea/i;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v12, v14, v10, v11}, Laa/b;->c(Laa/a;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 126
    .line 127
    .line 128
    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 129
    :try_start_3
    iget-object v10, v3, Lea/o;->O:Lea/w;

    .line 130
    .line 131
    iget-object v5, v5, Lv8/t;->s:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v5, Lea/z;

    .line 134
    .line 135
    invoke-virtual {v10, v5}, Lea/w;->a(Lea/z;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :catchall_1
    move-exception v0

    .line 140
    goto :goto_5

    .line 141
    :catch_0
    move-exception v5

    .line 142
    :try_start_4
    invoke-virtual {v3, v5}, Lea/o;->b(Ljava/io/IOException;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 143
    .line 144
    .line 145
    :goto_2
    monitor-exit v6

    .line 146
    if-eqz v7, :cond_4

    .line 147
    .line 148
    array-length v3, v7

    .line 149
    :goto_3
    if-ge v0, v3, :cond_4

    .line 150
    .line 151
    aget-object v5, v7, v0

    .line 152
    .line 153
    add-int/lit8 v0, v0, 0x1

    .line 154
    .line 155
    monitor-enter v5

    .line 156
    :try_start_5
    iget-wide v10, v5, Lea/v;->f:J

    .line 157
    .line 158
    add-long/2addr v10, v8

    .line 159
    iput-wide v10, v5, Lea/v;->f:J

    .line 160
    .line 161
    if-lez v4, :cond_3

    .line 162
    .line 163
    invoke-virtual {v5}, Ljava/lang/Object;->notifyAll()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 164
    .line 165
    .line 166
    :cond_3
    monitor-exit v5

    .line 167
    goto :goto_3

    .line 168
    :catchall_2
    move-exception v0

    .line 169
    monitor-exit v5

    .line 170
    throw v0

    .line 171
    :cond_4
    return-wide v1

    .line 172
    :goto_4
    :try_start_6
    monitor-exit v3

    .line 173
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 174
    :goto_5
    monitor-exit v6

    .line 175
    throw v0

    .line 176
    :pswitch_0
    :try_start_7
    iget-object v0, p0, Lea/i;->f:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v0, Lea/o;

    .line 179
    .line 180
    iget-object v0, v0, Lea/o;->s:Lea/h;

    .line 181
    .line 182
    iget-object v3, p0, Lea/i;->g:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v3, Lea/v;

    .line 185
    .line 186
    invoke-virtual {v0, v3}, Lea/h;->b(Lea/v;)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1

    .line 187
    .line 188
    .line 189
    goto :goto_6

    .line 190
    :catch_1
    move-exception v0

    .line 191
    sget-object v3, Lga/n;->a:Lga/n;

    .line 192
    .line 193
    sget-object v3, Lga/n;->a:Lga/n;

    .line 194
    .line 195
    iget-object v4, p0, Lea/i;->f:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v4, Lea/o;

    .line 198
    .line 199
    iget-object v4, v4, Lea/o;->u:Ljava/lang/String;

    .line 200
    .line 201
    const-string v5, "Http2Connection.Listener failure for "

    .line 202
    .line 203
    invoke-static {v4, v5}, Lv8/i;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    const/4 v3, 0x4

    .line 211
    invoke-static {v4, v3, v0}, Lga/n;->i(Ljava/lang/String;ILjava/lang/Throwable;)V

    .line 212
    .line 213
    .line 214
    :try_start_8
    iget-object v3, p0, Lea/i;->g:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v3, Lea/v;

    .line 217
    .line 218
    sget-object v4, Lea/a;->u:Lea/a;

    .line 219
    .line 220
    invoke-virtual {v3, v4, v0}, Lea/v;->c(Lea/a;Ljava/io/IOException;)V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2

    .line 221
    .line 222
    .line 223
    :catch_2
    :goto_6
    return-wide v1

    .line 224
    :pswitch_1
    iget-object v0, p0, Lea/i;->f:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast v0, Lea/o;

    .line 227
    .line 228
    iget-object v3, v0, Lea/o;->s:Lea/h;

    .line 229
    .line 230
    iget-object v4, p0, Lea/i;->g:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v4, Lv8/t;

    .line 233
    .line 234
    iget-object v4, v4, Lv8/t;->s:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v4, Lea/z;

    .line 237
    .line 238
    invoke-virtual {v3, v0, v4}, Lea/h;->a(Lea/o;Lea/z;)V

    .line 239
    .line 240
    .line 241
    return-wide v1

    .line 242
    nop

    .line 243
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
.end method
