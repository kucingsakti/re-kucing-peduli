.class public final LE4/N;
.super Lo8/g;
.source "SourceFile"

# interfaces
.implements Lu8/c;


# instance fields
.field public s:Lcom/kcstream/cing/activity/SeriesActivity;

.field public t:I

.field public final synthetic u:Lcom/kcstream/cing/activity/SeriesActivity;


# direct methods
.method public constructor <init>(Lcom/kcstream/cing/activity/SeriesActivity;Lm8/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE4/N;->u:Lcom/kcstream/cing/activity/SeriesActivity;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lo8/g;-><init>(ILm8/d;)V

    .line 5
    .line 6
    .line 7
    return-void
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
.method public final create(Ljava/lang/Object;Lm8/d;)Lm8/d;
    .locals 1

    .line 1
    new-instance p1, LE4/N;

    .line 2
    .line 3
    iget-object v0, p0, LE4/N;->u:Lcom/kcstream/cing/activity/SeriesActivity;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, LE4/N;-><init>(Lcom/kcstream/cing/activity/SeriesActivity;Lm8/d;)V

    .line 6
    .line 7
    .line 8
    return-object p1
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

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LN9/y;

    .line 2
    .line 3
    check-cast p2, Lm8/d;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LE4/N;->create(Ljava/lang/Object;Lm8/d;)Lm8/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LE4/N;

    .line 10
    .line 11
    sget-object p2, Lh8/m;->a:Lh8/m;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LE4/N;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
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

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object v0, Ln8/a;->s:Ln8/a;

    .line 2
    .line 3
    iget v1, p0, LE4/N;->t:I

    .line 4
    .line 5
    iget-object v2, p0, LE4/N;->u:Lcom/kcstream/cing/activity/SeriesActivity;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v4, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, LE4/N;->s:Lcom/kcstream/cing/activity/SeriesActivity;

    .line 14
    .line 15
    :try_start_0
    invoke-static {p1}, LJ7/a;->v(Ljava/lang/Object;)V
    :try_end_0
    .catch Lretrofit2/HttpException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    invoke-static {p1}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :try_start_1
    sget-object p1, LN9/I;->c:LU9/c;

    .line 31
    .line 32
    new-instance v1, LE4/M;

    .line 33
    .line 34
    invoke-direct {v1, v2, v3}, LE4/M;-><init>(Lcom/kcstream/cing/activity/SeriesActivity;Lm8/d;)V

    .line 35
    .line 36
    .line 37
    iput-object v2, p0, LE4/N;->s:Lcom/kcstream/cing/activity/SeriesActivity;

    .line 38
    .line 39
    iput v4, p0, LE4/N;->t:I

    .line 40
    .line 41
    invoke-static {p1, v1, p0}, LN9/z;->w(Lm8/i;Lu8/c;Lm8/d;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-ne p1, v0, :cond_2

    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_2
    move-object v0, v2

    .line 49
    :goto_0
    check-cast p1, Lcom/kcstream/cing/model/Series;

    .line 50
    .line 51
    iput-object p1, v0, Lcom/kcstream/cing/activity/SeriesActivity;->W:Lcom/kcstream/cing/model/Series;

    .line 52
    .line 53
    iget-object p1, v2, Lcom/kcstream/cing/activity/SeriesActivity;->W:Lcom/kcstream/cing/model/Series;

    .line 54
    .line 55
    if-eqz p1, :cond_8

    .line 56
    .line 57
    invoke-virtual {p1}, Lcom/kcstream/cing/model/Series;->b()Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v0}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iput v0, v2, Lcom/kcstream/cing/activity/SeriesActivity;->Z:I

    .line 69
    .line 70
    invoke-virtual {p1}, Lcom/kcstream/cing/model/Series;->f()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-static {v0}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iput-object v0, v2, Lcom/kcstream/cing/activity/SeriesActivity;->b0:Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {p1}, Lcom/kcstream/cing/model/Series;->c()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-static {v0}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    iput-object v0, v2, Lcom/kcstream/cing/activity/SeriesActivity;->a0:Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {v2}, Lcom/kcstream/cing/activity/SeriesActivity;->z()LI4/c;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iget-object v0, v0, LI4/c;->k:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v0, Landroid/widget/ImageView;

    .line 95
    .line 96
    invoke-virtual {p1}, Lcom/kcstream/cing/model/Series;->c()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-static {v0, v1}, LD3/b;->t(Landroid/widget/ImageView;Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    invoke-static {v2}, Lcom/bumptech/glide/b;->b(Landroid/content/Context;)Lcom/bumptech/glide/b;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iget-object v0, v0, Lcom/bumptech/glide/b;->w:LN1/m;

    .line 108
    .line 109
    invoke-virtual {v0, v2}, LN1/m;->g(Li/l;)Lcom/bumptech/glide/l;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {p1}, Lcom/kcstream/cing/model/Series;->c()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    const-class v5, Landroid/graphics/drawable/Drawable;

    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    new-instance v6, Lcom/bumptech/glide/j;

    .line 123
    .line 124
    iget-object v7, v0, Lcom/bumptech/glide/l;->s:Lcom/bumptech/glide/b;

    .line 125
    .line 126
    iget-object v8, v0, Lcom/bumptech/glide/l;->t:Landroid/content/Context;

    .line 127
    .line 128
    invoke-direct {v6, v7, v0, v5, v8}, Lcom/bumptech/glide/j;-><init>(Lcom/bumptech/glide/b;Lcom/bumptech/glide/l;Ljava/lang/Class;Landroid/content/Context;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v6, v1}, Lcom/bumptech/glide/j;->A(Ljava/lang/Object;)Lcom/bumptech/glide/j;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    sget-object v1, LA1/p;->b:LA1/p;

    .line 136
    .line 137
    invoke-virtual {v0, v1}, LQ1/a;->e(LA1/p;)LQ1/a;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    check-cast v0, Lcom/bumptech/glide/j;

    .line 142
    .line 143
    new-instance v1, LJ1/b;

    .line 144
    .line 145
    invoke-direct {v1}, Lcom/bumptech/glide/m;-><init>()V

    .line 146
    .line 147
    .line 148
    new-instance v5, LP0/d;

    .line 149
    .line 150
    const/4 v6, 0x5

    .line 151
    const/4 v7, 0x0

    .line 152
    invoke-direct {v5, v6, v7}, LP0/d;-><init>(IZ)V

    .line 153
    .line 154
    .line 155
    iput-object v5, v1, Lcom/bumptech/glide/m;->s:LS1/d;

    .line 156
    .line 157
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/j;->B(LJ1/b;)Lcom/bumptech/glide/j;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    new-instance v1, Lf8/a;

    .line 162
    .line 163
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 164
    .line 165
    .line 166
    new-instance v5, LQ1/e;

    .line 167
    .line 168
    invoke-direct {v5}, LQ1/a;-><init>()V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v5, v1, v4}, LQ1/a;->r(Ly1/l;Z)LQ1/a;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    check-cast v1, LQ1/e;

    .line 176
    .line 177
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/j;->u(LQ1/a;)Lcom/bumptech/glide/j;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-virtual {v2}, Lcom/kcstream/cing/activity/SeriesActivity;->z()LI4/c;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    iget-object v1, v1, LI4/c;->j:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v1, Landroid/widget/ImageView;

    .line 188
    .line 189
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/j;->y(Landroid/widget/ImageView;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2}, Lcom/kcstream/cing/activity/SeriesActivity;->z()LI4/c;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    iget-object v0, v0, LI4/c;->r:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v0, Lcom/google/android/material/textview/MaterialTextView;

    .line 199
    .line 200
    invoke-virtual {p1}, Lcom/kcstream/cing/model/Series;->f()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v2}, Lcom/kcstream/cing/activity/SeriesActivity;->z()LI4/c;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    iget-object v0, v0, LI4/c;->l:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v0, Lcom/google/android/material/textview/MaterialTextView;

    .line 214
    .line 215
    invoke-virtual {p1}, Lcom/kcstream/cing/model/Series;->a()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2}, Lcom/kcstream/cing/activity/SeriesActivity;->z()LI4/c;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    iget-object v0, v0, LI4/c;->d:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v0, Landroid/widget/RelativeLayout;

    .line 229
    .line 230
    new-instance v1, LE4/L;

    .line 231
    .line 232
    const/4 v4, 0x0

    .line 233
    invoke-direct {v1, v2, v4}, LE4/L;-><init>(Ljava/lang/Object;I)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v2}, Lcom/kcstream/cing/activity/SeriesActivity;->z()LI4/c;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    iget-object v0, v0, LI4/c;->n:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v0, Lcom/google/android/material/textview/MaterialTextView;

    .line 246
    .line 247
    invoke-virtual {p1}, Lcom/kcstream/cing/model/Series;->d()Lcom/kcstream/cing/model/SeriesInfoMeta;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    invoke-virtual {v1}, Lcom/kcstream/cing/model/SeriesInfoMeta;->b()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2}, Lcom/kcstream/cing/activity/SeriesActivity;->z()LI4/c;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    iget-object v0, v0, LI4/c;->q:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v0, Lcom/google/android/material/textview/MaterialTextView;

    .line 265
    .line 266
    invoke-virtual {p1}, Lcom/kcstream/cing/model/Series;->d()Lcom/kcstream/cing/model/SeriesInfoMeta;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    invoke-virtual {v1}, Lcom/kcstream/cing/model/SeriesInfoMeta;->f()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v2}, Lcom/kcstream/cing/activity/SeriesActivity;->z()LI4/c;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    iget-object v0, v0, LI4/c;->o:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast v0, Lcom/google/android/material/textview/MaterialTextView;

    .line 284
    .line 285
    invoke-virtual {p1}, Lcom/kcstream/cing/model/Series;->d()Lcom/kcstream/cing/model/SeriesInfoMeta;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    invoke-virtual {v1}, Lcom/kcstream/cing/model/SeriesInfoMeta;->d()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v2}, Lcom/kcstream/cing/activity/SeriesActivity;->z()LI4/c;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    iget-object v0, v0, LI4/c;->m:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast v0, Lcom/google/android/material/textview/MaterialTextView;

    .line 303
    .line 304
    invoke-virtual {p1}, Lcom/kcstream/cing/model/Series;->d()Lcom/kcstream/cing/model/SeriesInfoMeta;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    invoke-virtual {v1}, Lcom/kcstream/cing/model/SeriesInfoMeta;->a()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v2}, Lcom/kcstream/cing/activity/SeriesActivity;->z()LI4/c;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    iget-object v0, v0, LI4/c;->p:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast v0, Lcom/google/android/material/textview/MaterialTextView;

    .line 322
    .line 323
    invoke-virtual {p1}, Lcom/kcstream/cing/model/Series;->d()Lcom/kcstream/cing/model/SeriesInfoMeta;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    invoke-virtual {v1}, Lcom/kcstream/cing/model/SeriesInfoMeta;->e()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {p1}, Lcom/kcstream/cing/model/Series;->d()Lcom/kcstream/cing/model/SeriesInfoMeta;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    invoke-virtual {v0}, Lcom/kcstream/cing/model/SeriesInfoMeta;->c()Ljava/util/List;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    check-cast v0, Ljava/util/Collection;

    .line 343
    .line 344
    if-eqz v0, :cond_4

    .line 345
    .line 346
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 347
    .line 348
    .line 349
    move-result v0

    .line 350
    if-eqz v0, :cond_3

    .line 351
    .line 352
    goto :goto_2

    .line 353
    :cond_3
    invoke-virtual {p1}, Lcom/kcstream/cing/model/Series;->d()Lcom/kcstream/cing/model/SeriesInfoMeta;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    invoke-virtual {v0}, Lcom/kcstream/cing/model/SeriesInfoMeta;->c()Ljava/util/List;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    check-cast v0, Ljava/lang/Iterable;

    .line 362
    .line 363
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 368
    .line 369
    .line 370
    move-result v1

    .line 371
    if-eqz v1, :cond_4

    .line 372
    .line 373
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v1

    .line 377
    check-cast v1, Lcom/kcstream/cing/model/SeriesInfoMetaGenre;

    .line 378
    .line 379
    new-instance v4, Lcom/google/android/material/chip/Chip;

    .line 380
    .line 381
    invoke-direct {v4, v2, v3}, Lcom/google/android/material/chip/Chip;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v1}, Lcom/kcstream/cing/model/SeriesInfoMetaGenre;->a()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v5

    .line 388
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 389
    .line 390
    .line 391
    new-instance v5, LA0/j;

    .line 392
    .line 393
    const/4 v6, 0x2

    .line 394
    invoke-direct {v5, v2, v4, v1, v6}, LA0/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 395
    .line 396
    .line 397
    invoke-static {v4, v5}, LD3/b;->e(Landroid/view/View;Lu8/a;)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v2}, Lcom/kcstream/cing/activity/SeriesActivity;->z()LI4/c;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    iget-object v1, v1, LI4/c;->f:Ljava/lang/Object;

    .line 405
    .line 406
    check-cast v1, Lcom/google/android/material/chip/ChipGroup;

    .line 407
    .line 408
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 409
    .line 410
    .line 411
    goto :goto_1

    .line 412
    :cond_4
    :goto_2
    invoke-virtual {p1}, Lcom/kcstream/cing/model/Series;->e()Ljava/util/List;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    check-cast v0, Ljava/util/Collection;

    .line 417
    .line 418
    const/4 v1, 0x0

    .line 419
    if-eqz v0, :cond_7

    .line 420
    .line 421
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 422
    .line 423
    .line 424
    move-result v0

    .line 425
    if-eqz v0, :cond_5

    .line 426
    .line 427
    goto :goto_4

    .line 428
    :cond_5
    invoke-virtual {p1}, Lcom/kcstream/cing/model/Series;->e()Ljava/util/List;

    .line 429
    .line 430
    .line 431
    move-result-object p1

    .line 432
    const-string v0, "items"

    .line 433
    .line 434
    invoke-static {p1, v0}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    invoke-static {p1}, Li8/C;->q(Ljava/util/List;)Z

    .line 438
    .line 439
    .line 440
    move-result v0

    .line 441
    if-eqz v0, :cond_6

    .line 442
    .line 443
    goto :goto_3

    .line 444
    :cond_6
    check-cast p1, Ljava/util/Collection;

    .line 445
    .line 446
    invoke-static {p1}, Li8/k;->t0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 447
    .line 448
    .line 449
    move-result-object p1

    .line 450
    :goto_3
    invoke-static {p1}, Lv8/x;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 451
    .line 452
    .line 453
    move-result-object p1

    .line 454
    new-instance v0, LCa/c;

    .line 455
    .line 456
    invoke-direct {v0, p1}, LCa/c;-><init>(Ljava/util/List;)V

    .line 457
    .line 458
    .line 459
    new-instance p1, Lt1/G;

    .line 460
    .line 461
    invoke-direct {p1, v0}, Lt1/G;-><init>(LCa/c;)V

    .line 462
    .line 463
    .line 464
    const-class v0, Lcom/kcstream/cing/model/SeriesEpisode;

    .line 465
    .line 466
    sget-object v3, Lv8/u;->a:Lv8/v;

    .line 467
    .line 468
    invoke-virtual {v3, v0}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    const-class v4, LG4/o;

    .line 473
    .line 474
    invoke-virtual {v3, v4}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    .line 475
    .line 476
    .line 477
    move-result-object v3

    .line 478
    invoke-virtual {p1, v0, v3}, Lt1/G;->x(LC8/c;LC8/c;)V

    .line 479
    .line 480
    .line 481
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 482
    .line 483
    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 484
    .line 485
    .line 486
    iput-object v0, p1, Lt1/G;->s:Ljava/lang/Object;

    .line 487
    .line 488
    invoke-virtual {v2}, Lcom/kcstream/cing/activity/SeriesActivity;->z()LI4/c;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    iget-object v0, v0, LI4/c;->s:Ljava/lang/Object;

    .line 493
    .line 494
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 495
    .line 496
    invoke-virtual {p1, v0}, Lt1/G;->r(Landroidx/recyclerview/widget/RecyclerView;)LCa/c;

    .line 497
    .line 498
    .line 499
    :cond_7
    :goto_4
    invoke-virtual {v2}, Lcom/kcstream/cing/activity/SeriesActivity;->z()LI4/c;

    .line 500
    .line 501
    .line 502
    move-result-object p1

    .line 503
    iget-object p1, p1, LI4/c;->i:Ljava/lang/Object;

    .line 504
    .line 505
    check-cast p1, Landroid/widget/ProgressBar;

    .line 506
    .line 507
    const/16 v0, 0x8

    .line 508
    .line 509
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v2}, Lcom/kcstream/cing/activity/SeriesActivity;->z()LI4/c;

    .line 513
    .line 514
    .line 515
    move-result-object p1

    .line 516
    iget-object p1, p1, LI4/c;->g:Ljava/lang/Object;

    .line 517
    .line 518
    check-cast p1, Landroid/widget/LinearLayout;

    .line 519
    .line 520
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V
    :try_end_1
    .catch Lretrofit2/HttpException; {:try_start_1 .. :try_end_1} :catch_0

    .line 521
    .line 522
    .line 523
    :catch_0
    :cond_8
    sget-object p1, Lh8/m;->a:Lh8/m;

    .line 524
    .line 525
    return-object p1
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
.end method
