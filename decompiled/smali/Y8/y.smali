.class public final LY8/y;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/a;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:LY8/A;


# direct methods
.method public synthetic constructor <init>(LY8/A;I)V
    .locals 0

    .line 1
    iput p2, p0, LY8/y;->s:I

    iput-object p1, p0, LY8/y;->t:LY8/A;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lv8/k;-><init>(I)V

    return-void
.end method

.method public constructor <init>(LY8/A;LR8/t;LW8/g;)V
    .locals 0

    const/4 p2, 0x5

    iput p2, p0, LY8/y;->s:I

    .line 2
    iput-object p1, p0, LY8/y;->t:LY8/A;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lv8/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, LY8/y;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LY8/y;->t:LY8/A;

    .line 7
    .line 8
    iget-object v0, v0, LY8/A;->b:LFa/e;

    .line 9
    .line 10
    iget-object v0, v0, LFa/e;->t:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, LI4/a;

    .line 13
    .line 14
    iget-object v0, v0, LI4/a;->h:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, LV8/h;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    return-object v0

    .line 23
    :pswitch_0
    sget-object v0, Lt9/f;->q:Lt9/f;

    .line 24
    .line 25
    iget-object v1, p0, LY8/y;->t:LY8/A;

    .line 26
    .line 27
    invoke-virtual {v1, v0}, LY8/A;->o(Lt9/f;)Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0

    .line 32
    :pswitch_1
    sget-object v0, Lt9/f;->p:Lt9/f;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    iget-object v2, p0, LY8/y;->t:LY8/A;

    .line 36
    .line 37
    invoke-virtual {v2, v0, v1}, LY8/A;->i(Lt9/f;Lt9/k;)Ljava/util/Set;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    return-object v0

    .line 42
    :pswitch_2
    iget-object v0, p0, LY8/y;->t:LY8/A;

    .line 43
    .line 44
    invoke-virtual {v0}, LY8/A;->k()LY8/c;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    return-object v0

    .line 49
    :pswitch_3
    sget-object v0, Lt9/f;->o:Lt9/f;

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    iget-object v2, p0, LY8/y;->t:LY8/A;

    .line 53
    .line 54
    invoke-virtual {v2, v0, v1}, LY8/A;->h(Lt9/f;Lt9/k;)Ljava/util/Set;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    return-object v0

    .line 59
    :pswitch_4
    sget-object v0, Lt9/f;->m:Lt9/f;

    .line 60
    .line 61
    sget-object v1, Lt9/n;->a:Lt9/l;

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    sget-object v1, Lt9/k;->t:Lt9/k;

    .line 67
    .line 68
    iget-object v2, p0, LY8/y;->t:LY8/A;

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    const-string v3, "kindFilter"

    .line 74
    .line 75
    invoke-static {v0, v3}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    sget-object v3, LT8/b;->v:LT8/b;

    .line 79
    .line 80
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 81
    .line 82
    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 83
    .line 84
    .line 85
    sget v5, Lt9/f;->l:I

    .line 86
    .line 87
    invoke-virtual {v0, v5}, Lt9/f;->a(I)Z

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    if-eqz v5, :cond_0

    .line 92
    .line 93
    invoke-virtual {v2, v0, v1}, LY8/A;->h(Lt9/f;Lt9/k;)Ljava/util/Set;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    if-eqz v6, :cond_0

    .line 106
    .line 107
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    check-cast v6, Lj9/f;

    .line 112
    .line 113
    invoke-virtual {v1, v6}, Lt9/k;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2, v6, v3}, Lt9/o;->a(Lj9/f;LT8/b;)LL8/g;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    invoke-static {v4, v6}, LJ9/l;->b(Ljava/util/AbstractCollection;Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_0
    sget v5, Lt9/f;->i:I

    .line 125
    .line 126
    invoke-virtual {v0, v5}, Lt9/f;->a(I)Z

    .line 127
    .line 128
    .line 129
    move-result v5

    .line 130
    iget-object v6, v0, Lt9/f;->a:Ljava/util/List;

    .line 131
    .line 132
    if-eqz v5, :cond_1

    .line 133
    .line 134
    sget-object v5, Lt9/b;->a:Lt9/b;

    .line 135
    .line 136
    invoke-interface {v6, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    if-nez v5, :cond_1

    .line 141
    .line 142
    invoke-virtual {v2, v0, v1}, LY8/A;->i(Lt9/f;Lt9/k;)Ljava/util/Set;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    if-eqz v7, :cond_1

    .line 155
    .line 156
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    check-cast v7, Lj9/f;

    .line 161
    .line 162
    invoke-virtual {v1, v7}, Lt9/k;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v7, v3}, LY8/A;->c(Lj9/f;LT8/b;)Ljava/util/Collection;

    .line 166
    .line 167
    .line 168
    move-result-object v7

    .line 169
    invoke-virtual {v4, v7}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 170
    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_1
    sget v5, Lt9/f;->j:I

    .line 174
    .line 175
    invoke-virtual {v0, v5}, Lt9/f;->a(I)Z

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    if-eqz v5, :cond_2

    .line 180
    .line 181
    sget-object v5, Lt9/b;->a:Lt9/b;

    .line 182
    .line 183
    invoke-interface {v6, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v5

    .line 187
    if-nez v5, :cond_2

    .line 188
    .line 189
    invoke-virtual {v2, v0}, LY8/A;->o(Lt9/f;)Ljava/util/Set;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 198
    .line 199
    .line 200
    move-result v5

    .line 201
    if-eqz v5, :cond_2

    .line 202
    .line 203
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    check-cast v5, Lj9/f;

    .line 208
    .line 209
    invoke-virtual {v1, v5}, Lt9/k;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v2, v5, v3}, LY8/A;->b(Lj9/f;LT8/b;)Ljava/util/Collection;

    .line 213
    .line 214
    .line 215
    move-result-object v5

    .line 216
    invoke-virtual {v4, v5}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 217
    .line 218
    .line 219
    goto :goto_2

    .line 220
    :cond_2
    invoke-static {v4}, Li8/k;->s0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    check-cast v0, Ljava/util/Collection;

    .line 225
    .line 226
    return-object v0

    .line 227
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
