.class public final LO8/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu8/a;


# instance fields
.field public final synthetic s:I

.field public final t:Ljava/lang/Object;

.field public final synthetic u:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LO8/p;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, LO8/h;->s:I

    iput-object p1, p0, LO8/h;->u:Ljava/lang/Object;

    iput-object p2, p0, LO8/h;->t:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lea/o;Lea/s;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LO8/h;->s:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    const-string v0, "this$0"

    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    iput-object p1, p0, LO8/h;->u:Ljava/lang/Object;

    .line 5
    iput-object p2, p0, LO8/h;->t:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, LO8/h;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LO8/h;->u:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lea/o;

    .line 9
    .line 10
    iget-object v1, p0, LO8/h;->t:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lea/s;

    .line 13
    .line 14
    sget-object v2, Lea/a;->v:Lea/a;

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    const/4 v4, 0x0

    .line 18
    :try_start_0
    invoke-virtual {v1, v3, p0}, Lea/s;->a(ZLO8/h;)Z

    .line 19
    .line 20
    .line 21
    move-result v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    :goto_0
    const/4 v3, 0x0

    .line 25
    :try_start_1
    invoke-virtual {v1, v3, p0}, Lea/s;->a(ZLO8/h;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    sget-object v3, Lea/a;->t:Lea/a;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 33
    .line 34
    :try_start_2
    sget-object v2, Lea/a;->y:Lea/a;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 35
    .line 36
    invoke-virtual {v0, v3, v2, v4}, Lea/o;->a(Lea/a;Lea/a;Ljava/io/IOException;)V

    .line 37
    .line 38
    .line 39
    :goto_1
    invoke-static {v1}, LY9/c;->d(Ljava/io/Closeable;)V

    .line 40
    .line 41
    .line 42
    goto :goto_5

    .line 43
    :catchall_0
    move-exception v5

    .line 44
    goto :goto_6

    .line 45
    :catch_0
    move-exception v4

    .line 46
    goto :goto_4

    .line 47
    :catchall_1
    move-exception v5

    .line 48
    :goto_2
    move-object v3, v2

    .line 49
    goto :goto_6

    .line 50
    :catch_1
    move-exception v3

    .line 51
    move-object v4, v3

    .line 52
    move-object v3, v2

    .line 53
    goto :goto_4

    .line 54
    :cond_1
    :try_start_3
    new-instance v3, Ljava/io/IOException;

    .line 55
    .line 56
    const-string v5, "Required SETTINGS preface not received"

    .line 57
    .line 58
    invoke-direct {v3, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v3
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 62
    :goto_3
    move-object v5, v3

    .line 63
    goto :goto_2

    .line 64
    :catchall_2
    move-exception v3

    .line 65
    goto :goto_3

    .line 66
    :goto_4
    :try_start_4
    sget-object v2, Lea/a;->u:Lea/a;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 67
    .line 68
    invoke-virtual {v0, v2, v2, v4}, Lea/o;->a(Lea/a;Lea/a;Ljava/io/IOException;)V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :goto_5
    sget-object v0, Lh8/m;->a:Lh8/m;

    .line 73
    .line 74
    return-object v0

    .line 75
    :goto_6
    invoke-virtual {v0, v3, v2, v4}, Lea/o;->a(Lea/a;Lea/a;Ljava/io/IOException;)V

    .line 76
    .line 77
    .line 78
    invoke-static {v1}, LY9/c;->d(Ljava/io/Closeable;)V

    .line 79
    .line 80
    .line 81
    throw v5

    .line 82
    :pswitch_0
    new-instance v0, LJ9/g;

    .line 83
    .line 84
    invoke-direct {v0}, LJ9/g;-><init>()V

    .line 85
    .line 86
    .line 87
    iget-object v1, p0, LO8/h;->u:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v1, LO8/w;

    .line 90
    .line 91
    invoke-virtual {v1}, LO8/w;->x()Ljava/util/Collection;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-eqz v2, :cond_2

    .line 104
    .line 105
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    check-cast v2, LL8/t;

    .line 110
    .line 111
    iget-object v3, p0, LO8/h;->t:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v3, LA9/Z;

    .line 114
    .line 115
    invoke-interface {v2, v3}, LL8/t;->j(LA9/Z;)LL8/t;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-virtual {v0, v2}, LJ9/g;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    goto :goto_7

    .line 123
    :cond_2
    return-object v0

    .line 124
    :pswitch_1
    sget-object v0, LA9/K;->t:Lo1/c;

    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    sget-object v0, LA9/K;->u:LA9/K;

    .line 130
    .line 131
    iget-object v1, p0, LO8/h;->u:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v1, LO8/j;

    .line 134
    .line 135
    invoke-virtual {v1}, LO8/j;->I()LA9/O;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 140
    .line 141
    new-instance v3, Lt9/j;

    .line 142
    .line 143
    new-instance v4, LO8/g;

    .line 144
    .line 145
    const/4 v5, 0x0

    .line 146
    invoke-direct {v4, p0, v5}, LO8/g;-><init>(Ljava/lang/Object;I)V

    .line 147
    .line 148
    .line 149
    sget-object v5, Lz9/l;->e:Lz9/b;

    .line 150
    .line 151
    const-string v6, "NO_LOCKS"

    .line 152
    .line 153
    invoke-static {v5, v6}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-direct {v3, v5, v4}, Lt9/j;-><init>(Lz9/o;Lu8/a;)V

    .line 157
    .line 158
    .line 159
    const/4 v4, 0x0

    .line 160
    invoke-static {v0, v1, v2, v3, v4}, LA9/f;->s(LA9/K;LA9/O;Ljava/util/List;Lt9/n;Z)LA9/D;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    return-object v0

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
