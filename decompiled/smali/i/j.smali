.class public final Li/j;
.super Li/F;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface;


# instance fields
.field public final x:Li/i;


# direct methods
.method public constructor <init>(Landroid/view/ContextThemeWrapper;I)V
    .locals 1

    .line 1
    invoke-static {p1, p2}, Li/j;->h(Landroid/content/Context;I)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    invoke-direct {p0, p1, p2}, Li/F;-><init>(Landroid/content/Context;I)V

    .line 6
    .line 7
    .line 8
    new-instance p1, Li/i;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-direct {p1, p2, p0, v0}, Li/i;-><init>(Landroid/content/Context;Li/j;Landroid/view/Window;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Li/j;->x:Li/i;

    .line 22
    .line 23
    return-void
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

.method public static h(Landroid/content/Context;I)I
    .locals 2

    .line 1
    ushr-int/lit8 v0, p1, 0x18

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0xff

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    return p1

    .line 9
    :cond_0
    new-instance p1, Landroid/util/TypedValue;

    .line 10
    .line 11
    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const v0, 0x7f04003e

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0, p1, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 22
    .line 23
    .line 24
    iget p0, p1, Landroid/util/TypedValue;->resourceId:I

    .line 25
    .line 26
    return p0
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
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 19

    .line 1
    invoke-super/range {p0 .. p1}, Li/F;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    move-object/from16 v2, p0

    .line 5
    .line 6
    iget-object v3, v2, Li/j;->x:Li/i;

    .line 7
    .line 8
    iget-object v4, v3, Li/i;->b:Li/j;

    .line 9
    .line 10
    iget v5, v3, Li/i;->A:I

    .line 11
    .line 12
    invoke-virtual {v4, v5}, Li/F;->setContentView(I)V

    .line 13
    .line 14
    .line 15
    iget-object v4, v3, Li/i;->c:Landroid/view/Window;

    .line 16
    .line 17
    const v5, 0x7f0a023f

    .line 18
    .line 19
    .line 20
    invoke-virtual {v4, v5}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    const v6, 0x7f0a0309

    .line 25
    .line 26
    .line 27
    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    const v8, 0x7f0a00c6

    .line 32
    .line 33
    .line 34
    invoke-virtual {v5, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v9

    .line 38
    const v10, 0x7f0a0091

    .line 39
    .line 40
    .line 41
    invoke-virtual {v5, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v11

    .line 45
    const v12, 0x7f0a00d2

    .line 46
    .line 47
    .line 48
    invoke-virtual {v5, v12}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    check-cast v5, Landroid/view/ViewGroup;

    .line 53
    .line 54
    iget-object v12, v3, Li/i;->g:Landroid/view/View;

    .line 55
    .line 56
    const/4 v13, 0x0

    .line 57
    iget-object v14, v3, Li/i;->a:Landroid/content/Context;

    .line 58
    .line 59
    if-eqz v12, :cond_0

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    iget v12, v3, Li/i;->h:I

    .line 63
    .line 64
    if-eqz v12, :cond_1

    .line 65
    .line 66
    invoke-static {v14}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 67
    .line 68
    .line 69
    move-result-object v12

    .line 70
    iget v15, v3, Li/i;->h:I

    .line 71
    .line 72
    invoke-virtual {v12, v15, v5, v13}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 73
    .line 74
    .line 75
    move-result-object v12

    .line 76
    goto :goto_0

    .line 77
    :cond_1
    const/4 v12, 0x0

    .line 78
    :goto_0
    if-eqz v12, :cond_2

    .line 79
    .line 80
    const/16 v16, 0x1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    move/from16 v16, v13

    .line 84
    .line 85
    :goto_1
    if-eqz v16, :cond_3

    .line 86
    .line 87
    invoke-static {v12}, Li/i;->a(Landroid/view/View;)Z

    .line 88
    .line 89
    .line 90
    move-result v17

    .line 91
    if-nez v17, :cond_4

    .line 92
    .line 93
    :cond_3
    const/16 v17, 0x4

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_4
    const/16 v17, 0x4

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :goto_2
    const/high16 v0, 0x20000

    .line 100
    .line 101
    invoke-virtual {v4, v0, v0}, Landroid/view/Window;->setFlags(II)V

    .line 102
    .line 103
    .line 104
    :goto_3
    const/4 v0, -0x1

    .line 105
    const/16 v18, 0x2

    .line 106
    .line 107
    const/16 v1, 0x8

    .line 108
    .line 109
    if-eqz v16, :cond_6

    .line 110
    .line 111
    const v15, 0x7f0a00d1

    .line 112
    .line 113
    .line 114
    invoke-virtual {v4, v15}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 115
    .line 116
    .line 117
    move-result-object v15

    .line 118
    check-cast v15, Landroid/widget/FrameLayout;

    .line 119
    .line 120
    new-instance v10, Landroid/view/ViewGroup$LayoutParams;

    .line 121
    .line 122
    invoke-direct {v10, v0, v0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v15, v12, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 126
    .line 127
    .line 128
    iget-boolean v10, v3, Li/i;->i:Z

    .line 129
    .line 130
    if-eqz v10, :cond_5

    .line 131
    .line 132
    invoke-virtual {v15, v13, v13, v13, v13}, Landroid/view/View;->setPadding(IIII)V

    .line 133
    .line 134
    .line 135
    :cond_5
    iget-object v10, v3, Li/i;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 136
    .line 137
    if-eqz v10, :cond_7

    .line 138
    .line 139
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 140
    .line 141
    .line 142
    move-result-object v10

    .line 143
    check-cast v10, Lp/t0;

    .line 144
    .line 145
    const/4 v12, 0x0

    .line 146
    iput v12, v10, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_6
    invoke-virtual {v5, v1}, Landroid/view/View;->setVisibility(I)V

    .line 150
    .line 151
    .line 152
    :cond_7
    :goto_4
    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    invoke-virtual {v5, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 157
    .line 158
    .line 159
    move-result-object v8

    .line 160
    const v10, 0x7f0a0091

    .line 161
    .line 162
    .line 163
    invoke-virtual {v5, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 164
    .line 165
    .line 166
    move-result-object v10

    .line 167
    invoke-static {v6, v7}, Li/i;->b(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    invoke-static {v8, v9}, Li/i;->b(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;

    .line 172
    .line 173
    .line 174
    move-result-object v7

    .line 175
    invoke-static {v10, v11}, Li/i;->b(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;

    .line 176
    .line 177
    .line 178
    move-result-object v8

    .line 179
    const v9, 0x7f0a0288

    .line 180
    .line 181
    .line 182
    invoke-virtual {v4, v9}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 183
    .line 184
    .line 185
    move-result-object v9

    .line 186
    check-cast v9, Landroidx/core/widget/NestedScrollView;

    .line 187
    .line 188
    iput-object v9, v3, Li/i;->s:Landroidx/core/widget/NestedScrollView;

    .line 189
    .line 190
    invoke-virtual {v9, v13}, Landroid/view/View;->setFocusable(Z)V

    .line 191
    .line 192
    .line 193
    iget-object v9, v3, Li/i;->s:Landroidx/core/widget/NestedScrollView;

    .line 194
    .line 195
    invoke-virtual {v9, v13}, Landroidx/core/widget/NestedScrollView;->setNestedScrollingEnabled(Z)V

    .line 196
    .line 197
    .line 198
    const v9, 0x102000b

    .line 199
    .line 200
    .line 201
    invoke-virtual {v7, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 202
    .line 203
    .line 204
    move-result-object v9

    .line 205
    check-cast v9, Landroid/widget/TextView;

    .line 206
    .line 207
    iput-object v9, v3, Li/i;->w:Landroid/widget/TextView;

    .line 208
    .line 209
    if-nez v9, :cond_8

    .line 210
    .line 211
    goto :goto_5

    .line 212
    :cond_8
    iget-object v10, v3, Li/i;->e:Ljava/lang/CharSequence;

    .line 213
    .line 214
    if-eqz v10, :cond_9

    .line 215
    .line 216
    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 217
    .line 218
    .line 219
    goto :goto_5

    .line 220
    :cond_9
    invoke-virtual {v9, v1}, Landroid/view/View;->setVisibility(I)V

    .line 221
    .line 222
    .line 223
    iget-object v9, v3, Li/i;->s:Landroidx/core/widget/NestedScrollView;

    .line 224
    .line 225
    iget-object v10, v3, Li/i;->w:Landroid/widget/TextView;

    .line 226
    .line 227
    invoke-virtual {v9, v10}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 228
    .line 229
    .line 230
    iget-object v9, v3, Li/i;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 231
    .line 232
    if-eqz v9, :cond_a

    .line 233
    .line 234
    iget-object v9, v3, Li/i;->s:Landroidx/core/widget/NestedScrollView;

    .line 235
    .line 236
    invoke-virtual {v9}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 237
    .line 238
    .line 239
    move-result-object v9

    .line 240
    check-cast v9, Landroid/view/ViewGroup;

    .line 241
    .line 242
    iget-object v10, v3, Li/i;->s:Landroidx/core/widget/NestedScrollView;

    .line 243
    .line 244
    invoke-virtual {v9, v10}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 245
    .line 246
    .line 247
    move-result v10

    .line 248
    invoke-virtual {v9, v10}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 249
    .line 250
    .line 251
    iget-object v11, v3, Li/i;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 252
    .line 253
    new-instance v12, Landroid/view/ViewGroup$LayoutParams;

    .line 254
    .line 255
    invoke-direct {v12, v0, v0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v9, v11, v10, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 259
    .line 260
    .line 261
    goto :goto_5

    .line 262
    :cond_a
    invoke-virtual {v7, v1}, Landroid/view/View;->setVisibility(I)V

    .line 263
    .line 264
    .line 265
    :goto_5
    const v9, 0x1020019

    .line 266
    .line 267
    .line 268
    invoke-virtual {v8, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 269
    .line 270
    .line 271
    move-result-object v9

    .line 272
    check-cast v9, Landroid/widget/Button;

    .line 273
    .line 274
    iput-object v9, v3, Li/i;->j:Landroid/widget/Button;

    .line 275
    .line 276
    iget-object v10, v3, Li/i;->H:Li/c;

    .line 277
    .line 278
    invoke-virtual {v9, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 279
    .line 280
    .line 281
    iget-object v9, v3, Li/i;->k:Ljava/lang/CharSequence;

    .line 282
    .line 283
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 284
    .line 285
    .line 286
    move-result v9

    .line 287
    if-eqz v9, :cond_b

    .line 288
    .line 289
    iget-object v9, v3, Li/i;->j:Landroid/widget/Button;

    .line 290
    .line 291
    invoke-virtual {v9, v1}, Landroid/view/View;->setVisibility(I)V

    .line 292
    .line 293
    .line 294
    move v9, v13

    .line 295
    goto :goto_6

    .line 296
    :cond_b
    iget-object v9, v3, Li/i;->j:Landroid/widget/Button;

    .line 297
    .line 298
    iget-object v11, v3, Li/i;->k:Ljava/lang/CharSequence;

    .line 299
    .line 300
    invoke-virtual {v9, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 301
    .line 302
    .line 303
    iget-object v9, v3, Li/i;->j:Landroid/widget/Button;

    .line 304
    .line 305
    invoke-virtual {v9, v13}, Landroid/view/View;->setVisibility(I)V

    .line 306
    .line 307
    .line 308
    const/4 v9, 0x1

    .line 309
    :goto_6
    const v11, 0x102001a

    .line 310
    .line 311
    .line 312
    invoke-virtual {v8, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 313
    .line 314
    .line 315
    move-result-object v11

    .line 316
    check-cast v11, Landroid/widget/Button;

    .line 317
    .line 318
    iput-object v11, v3, Li/i;->m:Landroid/widget/Button;

    .line 319
    .line 320
    invoke-virtual {v11, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 321
    .line 322
    .line 323
    iget-object v11, v3, Li/i;->n:Ljava/lang/CharSequence;

    .line 324
    .line 325
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 326
    .line 327
    .line 328
    move-result v11

    .line 329
    if-eqz v11, :cond_c

    .line 330
    .line 331
    iget-object v11, v3, Li/i;->m:Landroid/widget/Button;

    .line 332
    .line 333
    invoke-virtual {v11, v1}, Landroid/view/View;->setVisibility(I)V

    .line 334
    .line 335
    .line 336
    goto :goto_7

    .line 337
    :cond_c
    iget-object v11, v3, Li/i;->m:Landroid/widget/Button;

    .line 338
    .line 339
    iget-object v12, v3, Li/i;->n:Ljava/lang/CharSequence;

    .line 340
    .line 341
    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 342
    .line 343
    .line 344
    iget-object v11, v3, Li/i;->m:Landroid/widget/Button;

    .line 345
    .line 346
    invoke-virtual {v11, v13}, Landroid/view/View;->setVisibility(I)V

    .line 347
    .line 348
    .line 349
    or-int/lit8 v9, v9, 0x2

    .line 350
    .line 351
    :goto_7
    const v11, 0x102001b

    .line 352
    .line 353
    .line 354
    invoke-virtual {v8, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 355
    .line 356
    .line 357
    move-result-object v11

    .line 358
    check-cast v11, Landroid/widget/Button;

    .line 359
    .line 360
    iput-object v11, v3, Li/i;->p:Landroid/widget/Button;

    .line 361
    .line 362
    invoke-virtual {v11, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 363
    .line 364
    .line 365
    iget-object v10, v3, Li/i;->q:Ljava/lang/CharSequence;

    .line 366
    .line 367
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 368
    .line 369
    .line 370
    move-result v10

    .line 371
    if-eqz v10, :cond_d

    .line 372
    .line 373
    iget-object v10, v3, Li/i;->p:Landroid/widget/Button;

    .line 374
    .line 375
    invoke-virtual {v10, v1}, Landroid/view/View;->setVisibility(I)V

    .line 376
    .line 377
    .line 378
    goto :goto_8

    .line 379
    :cond_d
    iget-object v10, v3, Li/i;->p:Landroid/widget/Button;

    .line 380
    .line 381
    iget-object v11, v3, Li/i;->q:Ljava/lang/CharSequence;

    .line 382
    .line 383
    invoke-virtual {v10, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 384
    .line 385
    .line 386
    iget-object v10, v3, Li/i;->p:Landroid/widget/Button;

    .line 387
    .line 388
    invoke-virtual {v10, v13}, Landroid/view/View;->setVisibility(I)V

    .line 389
    .line 390
    .line 391
    or-int/lit8 v9, v9, 0x4

    .line 392
    .line 393
    :goto_8
    new-instance v10, Landroid/util/TypedValue;

    .line 394
    .line 395
    invoke-direct {v10}, Landroid/util/TypedValue;-><init>()V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v14}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 399
    .line 400
    .line 401
    move-result-object v11

    .line 402
    const v12, 0x7f04003c

    .line 403
    .line 404
    .line 405
    const/4 v14, 0x1

    .line 406
    invoke-virtual {v11, v12, v10, v14}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 407
    .line 408
    .line 409
    iget v10, v10, Landroid/util/TypedValue;->data:I

    .line 410
    .line 411
    if-eqz v10, :cond_e

    .line 412
    .line 413
    const/high16 v10, 0x3f000000    # 0.5f

    .line 414
    .line 415
    if-ne v9, v14, :cond_f

    .line 416
    .line 417
    iget-object v11, v3, Li/i;->j:Landroid/widget/Button;

    .line 418
    .line 419
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 420
    .line 421
    .line 422
    move-result-object v12

    .line 423
    check-cast v12, Landroid/widget/LinearLayout$LayoutParams;

    .line 424
    .line 425
    iput v14, v12, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 426
    .line 427
    iput v10, v12, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 428
    .line 429
    invoke-virtual {v11, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 430
    .line 431
    .line 432
    :cond_e
    move/from16 v11, v18

    .line 433
    .line 434
    goto :goto_9

    .line 435
    :cond_f
    move/from16 v11, v18

    .line 436
    .line 437
    if-ne v9, v11, :cond_10

    .line 438
    .line 439
    iget-object v12, v3, Li/i;->m:Landroid/widget/Button;

    .line 440
    .line 441
    invoke-virtual {v12}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 442
    .line 443
    .line 444
    move-result-object v15

    .line 445
    check-cast v15, Landroid/widget/LinearLayout$LayoutParams;

    .line 446
    .line 447
    iput v14, v15, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 448
    .line 449
    iput v10, v15, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 450
    .line 451
    invoke-virtual {v12, v15}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 452
    .line 453
    .line 454
    goto :goto_9

    .line 455
    :cond_10
    move/from16 v12, v17

    .line 456
    .line 457
    if-ne v9, v12, :cond_11

    .line 458
    .line 459
    iget-object v12, v3, Li/i;->p:Landroid/widget/Button;

    .line 460
    .line 461
    invoke-virtual {v12}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 462
    .line 463
    .line 464
    move-result-object v15

    .line 465
    check-cast v15, Landroid/widget/LinearLayout$LayoutParams;

    .line 466
    .line 467
    iput v14, v15, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 468
    .line 469
    iput v10, v15, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 470
    .line 471
    invoke-virtual {v12, v15}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 472
    .line 473
    .line 474
    :cond_11
    :goto_9
    if-eqz v9, :cond_12

    .line 475
    .line 476
    goto :goto_a

    .line 477
    :cond_12
    invoke-virtual {v8, v1}, Landroid/view/View;->setVisibility(I)V

    .line 478
    .line 479
    .line 480
    :goto_a
    iget-object v9, v3, Li/i;->x:Landroid/view/View;

    .line 481
    .line 482
    const v10, 0x7f0a0304

    .line 483
    .line 484
    .line 485
    if-eqz v9, :cond_13

    .line 486
    .line 487
    new-instance v9, Landroid/view/ViewGroup$LayoutParams;

    .line 488
    .line 489
    const/4 v12, -0x2

    .line 490
    invoke-direct {v9, v0, v12}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 491
    .line 492
    .line 493
    iget-object v12, v3, Li/i;->x:Landroid/view/View;

    .line 494
    .line 495
    invoke-virtual {v6, v12, v13, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 496
    .line 497
    .line 498
    invoke-virtual {v4, v10}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 499
    .line 500
    .line 501
    move-result-object v9

    .line 502
    invoke-virtual {v9, v1}, Landroid/view/View;->setVisibility(I)V

    .line 503
    .line 504
    .line 505
    goto :goto_b

    .line 506
    :cond_13
    const v9, 0x1020006

    .line 507
    .line 508
    .line 509
    invoke-virtual {v4, v9}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 510
    .line 511
    .line 512
    move-result-object v9

    .line 513
    check-cast v9, Landroid/widget/ImageView;

    .line 514
    .line 515
    iput-object v9, v3, Li/i;->u:Landroid/widget/ImageView;

    .line 516
    .line 517
    iget-object v9, v3, Li/i;->d:Ljava/lang/CharSequence;

    .line 518
    .line 519
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 520
    .line 521
    .line 522
    move-result v9

    .line 523
    if-nez v9, :cond_15

    .line 524
    .line 525
    iget-boolean v9, v3, Li/i;->F:Z

    .line 526
    .line 527
    if-eqz v9, :cond_15

    .line 528
    .line 529
    const v9, 0x7f0a0054

    .line 530
    .line 531
    .line 532
    invoke-virtual {v4, v9}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 533
    .line 534
    .line 535
    move-result-object v9

    .line 536
    check-cast v9, Landroid/widget/TextView;

    .line 537
    .line 538
    iput-object v9, v3, Li/i;->v:Landroid/widget/TextView;

    .line 539
    .line 540
    iget-object v10, v3, Li/i;->d:Ljava/lang/CharSequence;

    .line 541
    .line 542
    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 543
    .line 544
    .line 545
    iget-object v9, v3, Li/i;->t:Landroid/graphics/drawable/Drawable;

    .line 546
    .line 547
    if-eqz v9, :cond_14

    .line 548
    .line 549
    iget-object v10, v3, Li/i;->u:Landroid/widget/ImageView;

    .line 550
    .line 551
    invoke-virtual {v10, v9}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 552
    .line 553
    .line 554
    goto :goto_b

    .line 555
    :cond_14
    iget-object v9, v3, Li/i;->v:Landroid/widget/TextView;

    .line 556
    .line 557
    iget-object v10, v3, Li/i;->u:Landroid/widget/ImageView;

    .line 558
    .line 559
    invoke-virtual {v10}, Landroid/view/View;->getPaddingLeft()I

    .line 560
    .line 561
    .line 562
    move-result v10

    .line 563
    iget-object v12, v3, Li/i;->u:Landroid/widget/ImageView;

    .line 564
    .line 565
    invoke-virtual {v12}, Landroid/view/View;->getPaddingTop()I

    .line 566
    .line 567
    .line 568
    move-result v12

    .line 569
    iget-object v14, v3, Li/i;->u:Landroid/widget/ImageView;

    .line 570
    .line 571
    invoke-virtual {v14}, Landroid/view/View;->getPaddingRight()I

    .line 572
    .line 573
    .line 574
    move-result v14

    .line 575
    iget-object v15, v3, Li/i;->u:Landroid/widget/ImageView;

    .line 576
    .line 577
    invoke-virtual {v15}, Landroid/view/View;->getPaddingBottom()I

    .line 578
    .line 579
    .line 580
    move-result v15

    .line 581
    invoke-virtual {v9, v10, v12, v14, v15}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 582
    .line 583
    .line 584
    iget-object v9, v3, Li/i;->u:Landroid/widget/ImageView;

    .line 585
    .line 586
    invoke-virtual {v9, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 587
    .line 588
    .line 589
    goto :goto_b

    .line 590
    :cond_15
    invoke-virtual {v4, v10}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 591
    .line 592
    .line 593
    move-result-object v9

    .line 594
    invoke-virtual {v9, v1}, Landroid/view/View;->setVisibility(I)V

    .line 595
    .line 596
    .line 597
    iget-object v9, v3, Li/i;->u:Landroid/widget/ImageView;

    .line 598
    .line 599
    invoke-virtual {v9, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 600
    .line 601
    .line 602
    invoke-virtual {v6, v1}, Landroid/view/View;->setVisibility(I)V

    .line 603
    .line 604
    .line 605
    :goto_b
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    .line 606
    .line 607
    .line 608
    move-result v5

    .line 609
    if-eq v5, v1, :cond_16

    .line 610
    .line 611
    const/4 v14, 0x1

    .line 612
    goto :goto_c

    .line 613
    :cond_16
    move v14, v13

    .line 614
    :goto_c
    if-eqz v6, :cond_17

    .line 615
    .line 616
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    .line 617
    .line 618
    .line 619
    move-result v5

    .line 620
    if-eq v5, v1, :cond_17

    .line 621
    .line 622
    const/4 v5, 0x1

    .line 623
    goto :goto_d

    .line 624
    :cond_17
    move v5, v13

    .line 625
    :goto_d
    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    .line 626
    .line 627
    .line 628
    move-result v8

    .line 629
    if-eq v8, v1, :cond_18

    .line 630
    .line 631
    const/4 v1, 0x1

    .line 632
    goto :goto_e

    .line 633
    :cond_18
    move v1, v13

    .line 634
    :goto_e
    if-nez v1, :cond_19

    .line 635
    .line 636
    const v8, 0x7f0a02f3

    .line 637
    .line 638
    .line 639
    invoke-virtual {v7, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 640
    .line 641
    .line 642
    move-result-object v8

    .line 643
    if-eqz v8, :cond_19

    .line 644
    .line 645
    invoke-virtual {v8, v13}, Landroid/view/View;->setVisibility(I)V

    .line 646
    .line 647
    .line 648
    :cond_19
    if-eqz v5, :cond_1d

    .line 649
    .line 650
    iget-object v8, v3, Li/i;->s:Landroidx/core/widget/NestedScrollView;

    .line 651
    .line 652
    if-eqz v8, :cond_1a

    .line 653
    .line 654
    const/4 v9, 0x1

    .line 655
    invoke-virtual {v8, v9}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 656
    .line 657
    .line 658
    :cond_1a
    iget-object v8, v3, Li/i;->e:Ljava/lang/CharSequence;

    .line 659
    .line 660
    if-nez v8, :cond_1c

    .line 661
    .line 662
    iget-object v8, v3, Li/i;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 663
    .line 664
    if-eqz v8, :cond_1b

    .line 665
    .line 666
    goto :goto_f

    .line 667
    :cond_1b
    const/4 v15, 0x0

    .line 668
    goto :goto_10

    .line 669
    :cond_1c
    :goto_f
    const v8, 0x7f0a0303

    .line 670
    .line 671
    .line 672
    invoke-virtual {v6, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 673
    .line 674
    .line 675
    move-result-object v15

    .line 676
    :goto_10
    if-eqz v15, :cond_1e

    .line 677
    .line 678
    invoke-virtual {v15, v13}, Landroid/view/View;->setVisibility(I)V

    .line 679
    .line 680
    .line 681
    goto :goto_11

    .line 682
    :cond_1d
    const v6, 0x7f0a02f4

    .line 683
    .line 684
    .line 685
    invoke-virtual {v7, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 686
    .line 687
    .line 688
    move-result-object v6

    .line 689
    if-eqz v6, :cond_1e

    .line 690
    .line 691
    invoke-virtual {v6, v13}, Landroid/view/View;->setVisibility(I)V

    .line 692
    .line 693
    .line 694
    :cond_1e
    :goto_11
    iget-object v6, v3, Li/i;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 695
    .line 696
    instance-of v8, v6, Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 697
    .line 698
    if-eqz v8, :cond_22

    .line 699
    .line 700
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 701
    .line 702
    .line 703
    if-eqz v1, :cond_1f

    .line 704
    .line 705
    if-nez v5, :cond_22

    .line 706
    .line 707
    :cond_1f
    invoke-virtual {v6}, Landroid/view/View;->getPaddingLeft()I

    .line 708
    .line 709
    .line 710
    move-result v8

    .line 711
    if-eqz v5, :cond_20

    .line 712
    .line 713
    invoke-virtual {v6}, Landroid/view/View;->getPaddingTop()I

    .line 714
    .line 715
    .line 716
    move-result v9

    .line 717
    goto :goto_12

    .line 718
    :cond_20
    iget v9, v6, Landroidx/appcompat/app/AlertController$RecycleListView;->s:I

    .line 719
    .line 720
    :goto_12
    invoke-virtual {v6}, Landroid/view/View;->getPaddingRight()I

    .line 721
    .line 722
    .line 723
    move-result v10

    .line 724
    if-eqz v1, :cond_21

    .line 725
    .line 726
    invoke-virtual {v6}, Landroid/view/View;->getPaddingBottom()I

    .line 727
    .line 728
    .line 729
    move-result v12

    .line 730
    goto :goto_13

    .line 731
    :cond_21
    iget v12, v6, Landroidx/appcompat/app/AlertController$RecycleListView;->t:I

    .line 732
    .line 733
    :goto_13
    invoke-virtual {v6, v8, v9, v10, v12}, Landroid/view/View;->setPadding(IIII)V

    .line 734
    .line 735
    .line 736
    :cond_22
    if-nez v14, :cond_26

    .line 737
    .line 738
    iget-object v6, v3, Li/i;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 739
    .line 740
    if-eqz v6, :cond_23

    .line 741
    .line 742
    goto :goto_14

    .line 743
    :cond_23
    iget-object v6, v3, Li/i;->s:Landroidx/core/widget/NestedScrollView;

    .line 744
    .line 745
    :goto_14
    if-eqz v6, :cond_26

    .line 746
    .line 747
    if-eqz v1, :cond_24

    .line 748
    .line 749
    move v1, v11

    .line 750
    goto :goto_15

    .line 751
    :cond_24
    move v1, v13

    .line 752
    :goto_15
    or-int/2addr v1, v5

    .line 753
    const v5, 0x7f0a0287

    .line 754
    .line 755
    .line 756
    invoke-virtual {v4, v5}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 757
    .line 758
    .line 759
    move-result-object v5

    .line 760
    const v8, 0x7f0a0286

    .line 761
    .line 762
    .line 763
    invoke-virtual {v4, v8}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 764
    .line 765
    .line 766
    move-result-object v4

    .line 767
    sget-object v8, LU/U;->a:Ljava/util/WeakHashMap;

    .line 768
    .line 769
    const/4 v8, 0x3

    .line 770
    invoke-static {v6, v1, v8}, LU/I;->d(Landroid/view/View;II)V

    .line 771
    .line 772
    .line 773
    if-eqz v5, :cond_25

    .line 774
    .line 775
    invoke-virtual {v7, v5}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 776
    .line 777
    .line 778
    :cond_25
    if-eqz v4, :cond_26

    .line 779
    .line 780
    invoke-virtual {v7, v4}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 781
    .line 782
    .line 783
    :cond_26
    iget-object v1, v3, Li/i;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 784
    .line 785
    if-eqz v1, :cond_27

    .line 786
    .line 787
    iget-object v4, v3, Li/i;->y:Landroid/widget/ListAdapter;

    .line 788
    .line 789
    if-eqz v4, :cond_27

    .line 790
    .line 791
    invoke-virtual {v1, v4}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 792
    .line 793
    .line 794
    iget v3, v3, Li/i;->z:I

    .line 795
    .line 796
    if-le v3, v0, :cond_27

    .line 797
    .line 798
    const/4 v14, 0x1

    .line 799
    invoke-virtual {v1, v3, v14}, Landroid/widget/AbsListView;->setItemChecked(IZ)V

    .line 800
    .line 801
    .line 802
    invoke-virtual {v1, v3}, Landroid/widget/ListView;->setSelection(I)V

    .line 803
    .line 804
    .line 805
    :cond_27
    return-void
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

.method public final onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Li/j;->x:Li/i;

    .line 2
    .line 3
    iget-object v0, v0, Li/i;->s:Landroidx/core/widget/NestedScrollView;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p2}, Landroidx/core/widget/NestedScrollView;->i(Landroid/view/KeyEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1
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

.method public final onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Li/j;->x:Li/i;

    .line 2
    .line 3
    iget-object v0, v0, Li/i;->s:Landroidx/core/widget/NestedScrollView;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p2}, Landroidx/core/widget/NestedScrollView;->i(Landroid/view/KeyEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyUp(ILandroid/view/KeyEvent;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1
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

.method public final setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Li/F;->setTitle(Ljava/lang/CharSequence;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Li/j;->x:Li/i;

    .line 5
    .line 6
    iput-object p1, v0, Li/i;->d:Ljava/lang/CharSequence;

    .line 7
    .line 8
    iget-object v0, v0, Li/i;->v:Landroid/widget/TextView;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
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
