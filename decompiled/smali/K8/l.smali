.class public final LK8/l;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/a;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:LK8/n;


# direct methods
.method public synthetic constructor <init>(LK8/n;I)V
    .locals 0

    .line 1
    iput p2, p0, LK8/l;->s:I

    iput-object p1, p0, LK8/l;->t:LK8/n;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lv8/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x2

    .line 3
    iget-object v2, p0, LK8/l;->t:LK8/n;

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    iget v4, p0, LK8/l;->s:I

    .line 7
    .line 8
    packed-switch v4, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v2, v2, LK8/n;->a:LO8/C;

    .line 12
    .line 13
    sget-object v4, LM8/e;->a:Lj9/f;

    .line 14
    .line 15
    const-string v4, "<this>"

    .line 16
    .line 17
    iget-object v2, v2, LO8/C;->v:LI8/i;

    .line 18
    .line 19
    invoke-static {v2, v4}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance v4, LM8/j;

    .line 23
    .line 24
    sget-object v5, LI8/n;->o:Lj9/c;

    .line 25
    .line 26
    new-instance v6, Lo9/v;

    .line 27
    .line 28
    const-string v7, ""

    .line 29
    .line 30
    invoke-direct {v6, v7}, Lo9/g;-><init>(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    new-instance v7, Lh8/f;

    .line 34
    .line 35
    sget-object v8, LM8/e;->d:Lj9/f;

    .line 36
    .line 37
    invoke-direct {v7, v8, v6}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    new-instance v6, Lo9/b;

    .line 41
    .line 42
    sget-object v8, Li8/s;->s:Li8/s;

    .line 43
    .line 44
    new-instance v9, LA0/m;

    .line 45
    .line 46
    const/16 v10, 0xc

    .line 47
    .line 48
    invoke-direct {v9, v2, v10}, LA0/m;-><init>(Ljava/lang/Object;I)V

    .line 49
    .line 50
    .line 51
    invoke-direct {v6, v8, v9}, Lo9/b;-><init>(Ljava/util/List;Lu8/b;)V

    .line 52
    .line 53
    .line 54
    new-instance v8, Lh8/f;

    .line 55
    .line 56
    sget-object v9, LM8/e;->e:Lj9/f;

    .line 57
    .line 58
    invoke-direct {v8, v9, v6}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    new-array v6, v1, [Lh8/f;

    .line 62
    .line 63
    aput-object v7, v6, v3

    .line 64
    .line 65
    aput-object v8, v6, v0

    .line 66
    .line 67
    invoke-static {v6}, Li8/y;->w([Lh8/f;)Ljava/util/Map;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    invoke-direct {v4, v2, v5, v6}, LM8/j;-><init>(LI8/i;Lj9/c;Ljava/util/Map;)V

    .line 72
    .line 73
    .line 74
    new-instance v5, LM8/j;

    .line 75
    .line 76
    sget-object v6, LI8/n;->m:Lj9/c;

    .line 77
    .line 78
    new-instance v7, Lo9/v;

    .line 79
    .line 80
    const-string v8, "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version"

    .line 81
    .line 82
    invoke-direct {v7, v8}, Lo9/g;-><init>(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    new-instance v8, Lh8/f;

    .line 86
    .line 87
    sget-object v9, LM8/e;->a:Lj9/f;

    .line 88
    .line 89
    invoke-direct {v8, v9, v7}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    new-instance v7, Lo9/a;

    .line 93
    .line 94
    invoke-direct {v7, v4}, Lo9/g;-><init>(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    new-instance v4, Lh8/f;

    .line 98
    .line 99
    sget-object v9, LM8/e;->b:Lj9/f;

    .line 100
    .line 101
    invoke-direct {v4, v9, v7}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    new-instance v7, Lo9/i;

    .line 105
    .line 106
    sget-object v9, LI8/n;->n:Lj9/c;

    .line 107
    .line 108
    invoke-static {v9}, Lj9/b;->j(Lj9/c;)Lj9/b;

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    const-string v10, "WARNING"

    .line 113
    .line 114
    invoke-static {v10}, Lj9/f;->j(Ljava/lang/String;)Lj9/f;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    invoke-direct {v7, v9, v10}, Lo9/i;-><init>(Lj9/b;Lj9/f;)V

    .line 119
    .line 120
    .line 121
    new-instance v9, Lh8/f;

    .line 122
    .line 123
    sget-object v10, LM8/e;->c:Lj9/f;

    .line 124
    .line 125
    invoke-direct {v9, v10, v7}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    const/4 v7, 0x3

    .line 129
    new-array v7, v7, [Lh8/f;

    .line 130
    .line 131
    aput-object v8, v7, v3

    .line 132
    .line 133
    aput-object v4, v7, v0

    .line 134
    .line 135
    aput-object v9, v7, v1

    .line 136
    .line 137
    invoke-static {v7}, Li8/y;->w([Lh8/f;)Ljava/util/Map;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-direct {v5, v2, v6, v0}, LM8/j;-><init>(LI8/i;Lj9/c;Ljava/util/Map;)V

    .line 142
    .line 143
    .line 144
    invoke-static {v5}, Lcom/bumptech/glide/d;->u(Ljava/lang/Object;)Ljava/util/List;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-eqz v1, :cond_0

    .line 153
    .line 154
    sget-object v0, LM8/g;->a:LM8/f;

    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_0
    new-instance v1, LM8/i;

    .line 158
    .line 159
    invoke-direct {v1, v0, v3}, LM8/i;-><init>(Ljava/util/List;I)V

    .line 160
    .line 161
    .line 162
    move-object v0, v1

    .line 163
    :goto_0
    return-object v0

    .line 164
    :pswitch_0
    iget-object v0, v2, LK8/n;->a:LO8/C;

    .line 165
    .line 166
    iget-object v0, v0, LO8/C;->v:LI8/i;

    .line 167
    .line 168
    invoke-virtual {v0}, LI8/i;->e()LA9/D;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    return-object v0

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
