.class public Lcom/ferfalk/simplesearchview/SimpleSearchView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ferfalk/simplesearchview/SimpleSearchView$SavedState;
    }
.end annotation


# static fields
.field public static final synthetic O:I


# instance fields
.field public A:Ljava/lang/String;

.field public B:I

.field public final C:Landroid/view/ViewGroup;

.field public final D:Landroid/widget/EditText;

.field public final E:Landroid/widget/ImageButton;

.field public final F:Landroid/widget/ImageButton;

.field public final G:Landroid/widget/ImageButton;

.field public final H:Landroid/view/View;

.field public I:Lcom/google/android/material/tabs/TabLayout;

.field public J:I

.field public K:LW1/h;

.field public L:LW1/i;

.field public M:Z

.field public N:Z

.field public final s:Landroid/content/Context;

.field public t:I

.field public u:Landroid/graphics/Point;

.field public v:Ljava/lang/CharSequence;

.field public w:Ljava/lang/String;

.field public final x:Z

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    .line 4
    .line 5
    const/16 v1, 0xfa

    .line 6
    .line 7
    iput v1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->t:I

    .line 8
    .line 9
    iput-boolean v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->x:Z

    .line 10
    .line 11
    iput-boolean v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->y:Z

    .line 12
    .line 13
    iput-boolean v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->z:Z

    .line 14
    .line 15
    const-string v1, ""

    .line 16
    .line 17
    iput-object v1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->A:Ljava/lang/String;

    .line 18
    .line 19
    iput v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->B:I

    .line 20
    .line 21
    iput-boolean v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->M:Z

    .line 22
    .line 23
    iput-boolean v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->N:Z

    .line 24
    .line 25
    iput-object p1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->s:Landroid/content/Context;

    .line 26
    .line 27
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const v2, 0x7f0d00bc

    .line 32
    .line 33
    .line 34
    const/4 v3, 0x1

    .line 35
    invoke-virtual {v1, v2, p0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    const v1, 0x7f0a028a

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Landroid/view/ViewGroup;

    .line 46
    .line 47
    iput-object v1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->C:Landroid/view/ViewGroup;

    .line 48
    .line 49
    const v1, 0x7f0a028b

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Landroid/widget/EditText;

    .line 57
    .line 58
    iput-object v1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->D:Landroid/widget/EditText;

    .line 59
    .line 60
    const v1, 0x7f0a008f

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Landroid/widget/ImageButton;

    .line 68
    .line 69
    iput-object v1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->E:Landroid/widget/ImageButton;

    .line 70
    .line 71
    const v1, 0x7f0a0090

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    check-cast v1, Landroid/widget/ImageButton;

    .line 79
    .line 80
    iput-object v1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->F:Landroid/widget/ImageButton;

    .line 81
    .line 82
    const v1, 0x7f0a0092

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    check-cast v1, Landroid/widget/ImageButton;

    .line 90
    .line 91
    iput-object v1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->G:Landroid/widget/ImageButton;

    .line 92
    .line 93
    const v1, 0x7f0a0074

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    iput-object v1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->H:Landroid/view/View;

    .line 101
    .line 102
    sget-object v1, LW1/a;->a:[I

    .line 103
    .line 104
    invoke-virtual {p1, p2, v1, v0, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    const/4 v1, 0x4

    .line 109
    if-nez p2, :cond_0

    .line 110
    .line 111
    iget p1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->B:I

    .line 112
    .line 113
    invoke-virtual {p0, p1}, Lcom/ferfalk/simplesearchview/SimpleSearchView;->setCardStyle(I)V

    .line 114
    .line 115
    .line 116
    goto/16 :goto_0

    .line 117
    .line 118
    :cond_0
    const/16 v2, 0xd

    .line 119
    .line 120
    invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    if-eqz v4, :cond_1

    .line 125
    .line 126
    iget v4, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->B:I

    .line 127
    .line 128
    invoke-virtual {p2, v2, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    invoke-virtual {p0, v2}, Lcom/ferfalk/simplesearchview/SimpleSearchView;->setCardStyle(I)V

    .line 133
    .line 134
    .line 135
    :cond_1
    const/4 v2, 0x3

    .line 136
    invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    if-eqz v4, :cond_2

    .line 141
    .line 142
    const v4, 0x3f5eb852    # 0.87f

    .line 143
    .line 144
    .line 145
    invoke-virtual {p2, v2, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    invoke-virtual {p0, v2}, Lcom/ferfalk/simplesearchview/SimpleSearchView;->setBackIconAlpha(F)V

    .line 150
    .line 151
    .line 152
    :cond_2
    const/4 v2, 0x7

    .line 153
    invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    if-eqz v4, :cond_3

    .line 158
    .line 159
    const v4, 0x3f0a3d71    # 0.54f

    .line 160
    .line 161
    .line 162
    invoke-virtual {p2, v2, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    invoke-virtual {p0, v2}, Lcom/ferfalk/simplesearchview/SimpleSearchView;->setIconsAlpha(F)V

    .line 167
    .line 168
    .line 169
    :cond_3
    invoke-virtual {p2, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    if-eqz v2, :cond_4

    .line 174
    .line 175
    new-instance v2, Landroid/util/TypedValue;

    .line 176
    .line 177
    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    const v5, 0x7f040132

    .line 185
    .line 186
    .line 187
    invoke-virtual {v4, v5, v2, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 188
    .line 189
    .line 190
    iget v2, v2, Landroid/util/TypedValue;->data:I

    .line 191
    .line 192
    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    invoke-virtual {p0, v2}, Lcom/ferfalk/simplesearchview/SimpleSearchView;->setBackIconColor(I)V

    .line 197
    .line 198
    .line 199
    :cond_4
    const/16 v2, 0x8

    .line 200
    .line 201
    invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    if-eqz v4, :cond_5

    .line 206
    .line 207
    const/high16 v4, -0x1000000

    .line 208
    .line 209
    invoke-virtual {p2, v2, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    invoke-virtual {p0, v2}, Lcom/ferfalk/simplesearchview/SimpleSearchView;->setIconsColor(I)V

    .line 214
    .line 215
    .line 216
    :cond_5
    const/4 v2, 0x5

    .line 217
    invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 218
    .line 219
    .line 220
    move-result v4

    .line 221
    if-eqz v4, :cond_6

    .line 222
    .line 223
    new-instance v4, Landroid/util/TypedValue;

    .line 224
    .line 225
    invoke-direct {v4}, Landroid/util/TypedValue;-><init>()V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    const v5, 0x7f040112

    .line 233
    .line 234
    .line 235
    invoke-virtual {p1, v5, v4, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 236
    .line 237
    .line 238
    iget p1, v4, Landroid/util/TypedValue;->data:I

    .line 239
    .line 240
    invoke-virtual {p2, v2, p1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 241
    .line 242
    .line 243
    move-result p1

    .line 244
    invoke-virtual {p0, p1}, Lcom/ferfalk/simplesearchview/SimpleSearchView;->setCursorColor(I)V

    .line 245
    .line 246
    .line 247
    :cond_6
    const/4 p1, 0x6

    .line 248
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 249
    .line 250
    .line 251
    move-result v2

    .line 252
    if-eqz v2, :cond_7

    .line 253
    .line 254
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    const v4, 0x7f0600e4

    .line 259
    .line 260
    .line 261
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getColor(I)I

    .line 262
    .line 263
    .line 264
    move-result v2

    .line 265
    invoke-virtual {p2, p1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 266
    .line 267
    .line 268
    move-result p1

    .line 269
    invoke-virtual {p0, p1}, Lcom/ferfalk/simplesearchview/SimpleSearchView;->setHintTextColor(I)V

    .line 270
    .line 271
    .line 272
    :cond_7
    const/16 p1, 0xa

    .line 273
    .line 274
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 275
    .line 276
    .line 277
    move-result v2

    .line 278
    if-eqz v2, :cond_8

    .line 279
    .line 280
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    invoke-virtual {p0, p1}, Lcom/ferfalk/simplesearchview/SimpleSearchView;->setSearchBackground(Landroid/graphics/drawable/Drawable;)V

    .line 285
    .line 286
    .line 287
    :cond_8
    const/16 p1, 0x9

    .line 288
    .line 289
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 290
    .line 291
    .line 292
    move-result v2

    .line 293
    if-eqz v2, :cond_9

    .line 294
    .line 295
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    invoke-virtual {p0, p1}, Lcom/ferfalk/simplesearchview/SimpleSearchView;->setBackIconDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 300
    .line 301
    .line 302
    :cond_9
    const/16 p1, 0xb

    .line 303
    .line 304
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 305
    .line 306
    .line 307
    move-result v2

    .line 308
    if-eqz v2, :cond_a

    .line 309
    .line 310
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 311
    .line 312
    .line 313
    move-result-object p1

    .line 314
    invoke-virtual {p0, p1}, Lcom/ferfalk/simplesearchview/SimpleSearchView;->setClearIconDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 315
    .line 316
    .line 317
    :cond_a
    const/16 p1, 0xc

    .line 318
    .line 319
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 320
    .line 321
    .line 322
    move-result v2

    .line 323
    if-eqz v2, :cond_b

    .line 324
    .line 325
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 326
    .line 327
    .line 328
    move-result-object p1

    .line 329
    invoke-virtual {p0, p1}, Lcom/ferfalk/simplesearchview/SimpleSearchView;->setVoiceIconDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 330
    .line 331
    .line 332
    :cond_b
    const/16 p1, 0xe

    .line 333
    .line 334
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 335
    .line 336
    .line 337
    move-result v2

    .line 338
    if-eqz v2, :cond_c

    .line 339
    .line 340
    iget-boolean v2, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->x:Z

    .line 341
    .line 342
    invoke-virtual {p2, p1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 343
    .line 344
    .line 345
    move-result p1

    .line 346
    iput-boolean p1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->x:Z

    .line 347
    .line 348
    :cond_c
    const/16 p1, 0xf

    .line 349
    .line 350
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 351
    .line 352
    .line 353
    move-result v2

    .line 354
    if-eqz v2, :cond_d

    .line 355
    .line 356
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object p1

    .line 360
    invoke-virtual {p0, p1}, Lcom/ferfalk/simplesearchview/SimpleSearchView;->setVoiceSearchPrompt(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    :cond_d
    invoke-virtual {p2, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 364
    .line 365
    .line 366
    move-result p1

    .line 367
    if-eqz p1, :cond_e

    .line 368
    .line 369
    invoke-virtual {p2, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object p1

    .line 373
    invoke-virtual {p0, p1}, Lcom/ferfalk/simplesearchview/SimpleSearchView;->setHint(Ljava/lang/CharSequence;)V

    .line 374
    .line 375
    .line 376
    :cond_e
    const/4 p1, 0x2

    .line 377
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 378
    .line 379
    .line 380
    move-result v2

    .line 381
    if-eqz v2, :cond_f

    .line 382
    .line 383
    const/high16 v2, 0x80000

    .line 384
    .line 385
    invoke-virtual {p2, p1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 386
    .line 387
    .line 388
    move-result p1

    .line 389
    invoke-virtual {p0, p1}, Lcom/ferfalk/simplesearchview/SimpleSearchView;->setInputType(I)V

    .line 390
    .line 391
    .line 392
    :cond_f
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 393
    .line 394
    .line 395
    move-result p1

    .line 396
    if-eqz p1, :cond_10

    .line 397
    .line 398
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 399
    .line 400
    .line 401
    move-result-object p1

    .line 402
    const v2, 0x7f0600e3

    .line 403
    .line 404
    .line 405
    invoke-virtual {p1, v2}, Landroid/content/res/Resources;->getColor(I)I

    .line 406
    .line 407
    .line 408
    move-result p1

    .line 409
    invoke-virtual {p2, v0, p1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 410
    .line 411
    .line 412
    move-result p1

    .line 413
    invoke-virtual {p0, p1}, Lcom/ferfalk/simplesearchview/SimpleSearchView;->setTextColor(I)V

    .line 414
    .line 415
    .line 416
    :cond_10
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 417
    .line 418
    .line 419
    :goto_0
    iget-object p1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->D:Landroid/widget/EditText;

    .line 420
    .line 421
    new-instance p2, LW1/b;

    .line 422
    .line 423
    invoke-direct {p2, p0}, LW1/b;-><init>(Lcom/ferfalk/simplesearchview/SimpleSearchView;)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 427
    .line 428
    .line 429
    iget-object p1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->D:Landroid/widget/EditText;

    .line 430
    .line 431
    new-instance p2, LK4/l;

    .line 432
    .line 433
    const/4 v0, 0x1

    .line 434
    invoke-direct {p2, p0, v0}, LK4/l;-><init>(Ljava/lang/Object;I)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 438
    .line 439
    .line 440
    iget-object p1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->D:Landroid/widget/EditText;

    .line 441
    .line 442
    new-instance p2, LW1/c;

    .line 443
    .line 444
    const/4 v0, 0x0

    .line 445
    invoke-direct {p2, p0, v0}, LW1/c;-><init>(Ljava/lang/Object;I)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 449
    .line 450
    .line 451
    iget-object p1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->E:Landroid/widget/ImageButton;

    .line 452
    .line 453
    new-instance p2, LW1/d;

    .line 454
    .line 455
    const/4 v0, 0x0

    .line 456
    invoke-direct {p2, p0, v0}, LW1/d;-><init>(Lcom/ferfalk/simplesearchview/SimpleSearchView;I)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 460
    .line 461
    .line 462
    iget-object p1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->F:Landroid/widget/ImageButton;

    .line 463
    .line 464
    new-instance p2, LW1/d;

    .line 465
    .line 466
    const/4 v0, 0x1

    .line 467
    invoke-direct {p2, p0, v0}, LW1/d;-><init>(Lcom/ferfalk/simplesearchview/SimpleSearchView;I)V

    .line 468
    .line 469
    .line 470
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 471
    .line 472
    .line 473
    iget-object p1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->G:Landroid/widget/ImageButton;

    .line 474
    .line 475
    new-instance p2, LW1/d;

    .line 476
    .line 477
    const/4 v0, 0x2

    .line 478
    invoke-direct {p2, p0, v0}, LW1/d;-><init>(Lcom/ferfalk/simplesearchview/SimpleSearchView;I)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 482
    .line 483
    .line 484
    invoke-virtual {p0, v3}, Lcom/ferfalk/simplesearchview/SimpleSearchView;->c(Z)V

    .line 485
    .line 486
    .line 487
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 488
    .line 489
    .line 490
    move-result p1

    .line 491
    if-nez p1, :cond_11

    .line 492
    .line 493
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 494
    .line 495
    .line 496
    :cond_11
    return-void
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
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
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
.end method

.method private getCardStyleBackground()Landroid/graphics/drawable/GradientDrawable;
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    iget-object v2, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->s:Landroid/content/Context;

    .line 12
    .line 13
    invoke-static {v2, v1}, LC4/a;->g(Landroid/content/Context;I)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    int-to-float v1, v1

    .line 18
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 19
    .line 20
    .line 21
    return-object v0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method


# virtual methods
.method public final a()V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->y:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_1

    .line 6
    .line 7
    :cond_0
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->M:Z

    .line 9
    .line 10
    iget-object v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->D:Landroid/widget/EditText;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput-boolean v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->M:Z

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/ferfalk/simplesearchview/SimpleSearchView;->clearFocus()V

    .line 20
    .line 21
    .line 22
    new-instance v1, LW1/f;

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    invoke-direct {v1, p0, v2}, LW1/f;-><init>(Lcom/ferfalk/simplesearchview/SimpleSearchView;I)V

    .line 26
    .line 27
    .line 28
    iget v2, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->t:I

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/ferfalk/simplesearchview/SimpleSearchView;->getRevealAnimationCenter()Landroid/graphics/Point;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    if-nez v3, :cond_1

    .line 35
    .line 36
    new-instance v3, Landroid/graphics/Point;

    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    div-int/lit8 v4, v4, 0x2

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    div-int/lit8 v5, v5, 0x2

    .line 49
    .line 50
    invoke-direct {v3, v4, v5}, Landroid/graphics/Point;-><init>(II)V

    .line 51
    .line 52
    .line 53
    :cond_1
    iget v4, v3, Landroid/graphics/Point;->x:I

    .line 54
    .line 55
    iget v5, v3, Landroid/graphics/Point;->y:I

    .line 56
    .line 57
    invoke-static {v3, p0}, LJ7/a;->j(Landroid/graphics/Point;Lcom/ferfalk/simplesearchview/SimpleSearchView;)I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    int-to-float v3, v3

    .line 62
    const/4 v6, 0x0

    .line 63
    invoke-static {p0, v4, v5, v3, v6}, Landroid/view/ViewAnimationUtils;->createCircularReveal(Landroid/view/View;IIFF)Landroid/animation/Animator;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    new-instance v4, LX1/b;

    .line 68
    .line 69
    const/4 v5, 0x1

    .line 70
    invoke-direct {v4, p0, v1, v5}, LX1/b;-><init>(Landroid/view/View;LD3/b;I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3, v4}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 74
    .line 75
    .line 76
    int-to-long v1, v2

    .line 77
    invoke-virtual {v3, v1, v2}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    .line 78
    .line 79
    .line 80
    new-instance v1, Ls0/a;

    .line 81
    .line 82
    const/4 v2, 0x1

    .line 83
    invoke-direct {v1, v2}, Ls0/a;-><init>(I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3, v1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3}, Landroid/animation/Animator;->start()V

    .line 90
    .line 91
    .line 92
    iget-object v1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->I:Lcom/google/android/material/tabs/TabLayout;

    .line 93
    .line 94
    if-nez v1, :cond_2

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_2
    iget v2, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->J:I

    .line 98
    .line 99
    iget v3, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->t:I

    .line 100
    .line 101
    invoke-static {v0, v2, v3, v1}, LJ7/a;->w(IIILandroid/view/View;)Landroid/animation/ValueAnimator;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {v1}, Landroid/animation/Animator;->start()V

    .line 106
    .line 107
    .line 108
    :goto_0
    iput-boolean v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->y:Z

    .line 109
    .line 110
    iget-object v1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->L:LW1/i;

    .line 111
    .line 112
    if-eqz v1, :cond_3

    .line 113
    .line 114
    check-cast v1, Le1/j;

    .line 115
    .line 116
    iget-object v1, v1, Le1/j;->t:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v1, Lcom/kcstream/cing/activity/SearchActivity;

    .line 119
    .line 120
    invoke-virtual {v1}, Lcom/kcstream/cing/activity/SearchActivity;->A()LI4/b;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    iget-object v2, v2, LI4/b;->j:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v2, Landroidx/recyclerview/widget/RecyclerView;

    .line 127
    .line 128
    const/16 v3, 0x8

    .line 129
    .line 130
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1}, Lcom/kcstream/cing/activity/SearchActivity;->A()LI4/b;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    iget-object v2, v2, LI4/b;->h:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v2, Landroid/widget/ProgressBar;

    .line 140
    .line 141
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1}, Lcom/kcstream/cing/activity/SearchActivity;->A()LI4/b;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    iget-object v2, v2, LI4/b;->g:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v2, Landroid/widget/LinearLayout;

    .line 151
    .line 152
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1}, Lcom/kcstream/cing/activity/SearchActivity;->A()LI4/b;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    iget-object v2, v2, LI4/b;->g:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v2, Landroid/widget/LinearLayout;

    .line 162
    .line 163
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1}, Lcom/kcstream/cing/activity/SearchActivity;->A()LI4/b;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    iget-object v0, v0, LI4/b;->c:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v0, Landroid/widget/RelativeLayout;

    .line 173
    .line 174
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 175
    .line 176
    .line 177
    :cond_3
    :goto_1
    return-void
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

.method public final b(Z)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->y:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_3

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->D:Landroid/widget/EditText;

    .line 8
    .line 9
    iget-boolean v1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->N:Z

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    iget-object v1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->v:Ljava/lang/CharSequence;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 v1, 0x0

    .line 17
    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->D:Landroid/widget/EditText;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    if-eqz p1, :cond_3

    .line 27
    .line 28
    new-instance v1, LW1/f;

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-direct {v1, p0, v2}, LW1/f;-><init>(Lcom/ferfalk/simplesearchview/SimpleSearchView;I)V

    .line 32
    .line 33
    .line 34
    iget v2, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->t:I

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/ferfalk/simplesearchview/SimpleSearchView;->getRevealAnimationCenter()Landroid/graphics/Point;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    if-nez v3, :cond_2

    .line 41
    .line 42
    new-instance v3, Landroid/graphics/Point;

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    div-int/lit8 v4, v4, 0x2

    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    div-int/lit8 v5, v5, 0x2

    .line 55
    .line 56
    invoke-direct {v3, v4, v5}, Landroid/graphics/Point;-><init>(II)V

    .line 57
    .line 58
    .line 59
    :cond_2
    iget v4, v3, Landroid/graphics/Point;->x:I

    .line 60
    .line 61
    iget v5, v3, Landroid/graphics/Point;->y:I

    .line 62
    .line 63
    invoke-static {v3, p0}, LJ7/a;->j(Landroid/graphics/Point;Lcom/ferfalk/simplesearchview/SimpleSearchView;)I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    int-to-float v3, v3

    .line 68
    const/4 v6, 0x0

    .line 69
    invoke-static {p0, v4, v5, v6, v3}, Landroid/view/ViewAnimationUtils;->createCircularReveal(Landroid/view/View;IIFF)Landroid/animation/Animator;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    new-instance v4, LX1/b;

    .line 74
    .line 75
    const/4 v5, 0x0

    .line 76
    invoke-direct {v4, p0, v1, v5}, LX1/b;-><init>(Landroid/view/View;LD3/b;I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3, v4}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 80
    .line 81
    .line 82
    int-to-long v1, v2

    .line 83
    invoke-virtual {v3, v1, v2}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    .line 84
    .line 85
    .line 86
    new-instance v1, Ls0/a;

    .line 87
    .line 88
    const/4 v2, 0x1

    .line 89
    invoke-direct {v1, v2}, Ls0/a;-><init>(I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3, v1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3}, Landroid/animation/Animator;->start()V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 100
    .line 101
    .line 102
    :goto_1
    iget-object v1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->I:Lcom/google/android/material/tabs/TabLayout;

    .line 103
    .line 104
    const/16 v2, 0x8

    .line 105
    .line 106
    if-nez v1, :cond_4

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_4
    if-eqz p1, :cond_5

    .line 110
    .line 111
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    iget v3, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->t:I

    .line 116
    .line 117
    invoke-static {p1, v0, v3, v1}, LJ7/a;->w(IIILandroid/view/View;)Landroid/animation/ValueAnimator;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-virtual {p1}, Landroid/animation/Animator;->start()V

    .line 122
    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_5
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 126
    .line 127
    .line 128
    :goto_2
    const/4 p1, 0x1

    .line 129
    iput-boolean p1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->y:Z

    .line 130
    .line 131
    iget-object p1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->L:LW1/i;

    .line 132
    .line 133
    if-eqz p1, :cond_6

    .line 134
    .line 135
    check-cast p1, Le1/j;

    .line 136
    .line 137
    iget-object p1, p1, Le1/j;->t:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast p1, Lcom/kcstream/cing/activity/SearchActivity;

    .line 140
    .line 141
    invoke-virtual {p1}, Lcom/kcstream/cing/activity/SearchActivity;->A()LI4/b;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    iget-object v1, v1, LI4/b;->g:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v1, Landroid/widget/LinearLayout;

    .line 148
    .line 149
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1}, Lcom/kcstream/cing/activity/SearchActivity;->A()LI4/b;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    iget-object p1, p1, LI4/b;->f:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast p1, Landroidx/core/widget/NestedScrollView;

    .line 159
    .line 160
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 161
    .line 162
    .line 163
    :cond_6
    :goto_3
    return-void
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

.method public final c(Z)V
    .locals 4

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    new-instance v2, Landroid/content/Intent;

    .line 21
    .line 22
    const-string v3, "android.speech.action.RECOGNIZE_SPEECH"

    .line 23
    .line 24
    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v2, v0}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    xor-int/2addr v1, p1

    .line 36
    :goto_0
    if-eqz v1, :cond_1

    .line 37
    .line 38
    iget-boolean p1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->x:Z

    .line 39
    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    iget-object p1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->G:Landroid/widget/ImageButton;

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    iget-object p1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->G:Landroid/widget/ImageButton;

    .line 49
    .line 50
    const/16 v0, 0x8

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 53
    .line 54
    .line 55
    return-void
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

.method public final clearFocus()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->z:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "input_method"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v0, v2, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-super {p0}, Landroid/widget/FrameLayout;->clearFocus()V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->D:Landroid/widget/EditText;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/view/View;->clearFocus()V

    .line 32
    .line 33
    .line 34
    iput-boolean v1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->z:Z

    .line 35
    .line 36
    return-void
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

.method public getAnimationDuration()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->t:I

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
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

.method public getCardStyle()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->B:I

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
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

.method public getRevealAnimationCenter()Landroid/graphics/Point;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->u:Landroid/graphics/Point;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/16 v1, 0x1a

    .line 11
    .line 12
    iget-object v2, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->s:Landroid/content/Context;

    .line 13
    .line 14
    invoke-static {v2, v1}, LC4/a;->g(Landroid/content/Context;I)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    sub-int/2addr v0, v1

    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    div-int/lit8 v1, v1, 0x2

    .line 24
    .line 25
    new-instance v2, Landroid/graphics/Point;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, Landroid/graphics/Point;-><init>(II)V

    .line 28
    .line 29
    .line 30
    iput-object v2, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->u:Landroid/graphics/Point;

    .line 31
    .line 32
    return-object v2
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
.end method

.method public getSearchEditText()Landroid/widget/EditText;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->D:Landroid/widget/EditText;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
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

.method public getTabLayout()Lcom/google/android/material/tabs/TabLayout;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->I:Lcom/google/android/material/tabs/TabLayout;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
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

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 3

    .line 1
    instance-of v0, p1, Lcom/ferfalk/simplesearchview/SimpleSearchView$SavedState;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    check-cast p1, Lcom/ferfalk/simplesearchview/SimpleSearchView$SavedState;

    .line 10
    .line 11
    iget-object v0, p1, Lcom/ferfalk/simplesearchview/SimpleSearchView$SavedState;->s:Ljava/lang/String;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->v:Ljava/lang/CharSequence;

    .line 14
    .line 15
    iget v0, p1, Lcom/ferfalk/simplesearchview/SimpleSearchView$SavedState;->u:I

    .line 16
    .line 17
    iput v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->t:I

    .line 18
    .line 19
    iget-object v0, p1, Lcom/ferfalk/simplesearchview/SimpleSearchView$SavedState;->v:Ljava/lang/String;

    .line 20
    .line 21
    iput-object v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->A:Ljava/lang/String;

    .line 22
    .line 23
    iget-boolean v0, p1, Lcom/ferfalk/simplesearchview/SimpleSearchView$SavedState;->w:Z

    .line 24
    .line 25
    iput-boolean v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->N:Z

    .line 26
    .line 27
    iget-boolean v0, p1, Lcom/ferfalk/simplesearchview/SimpleSearchView$SavedState;->t:Z

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-virtual {p0, v0}, Lcom/ferfalk/simplesearchview/SimpleSearchView;->b(Z)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p1, Lcom/ferfalk/simplesearchview/SimpleSearchView$SavedState;->s:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->D:Landroid/widget/EditText;

    .line 38
    .line 39
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 40
    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    iget-object v1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->D:Landroid/widget/EditText;

    .line 45
    .line 46
    invoke-virtual {v1}, Landroid/widget/TextView;->length()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setSelection(I)V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->v:Ljava/lang/CharSequence;

    .line 54
    .line 55
    :cond_1
    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 60
    .line 61
    .line 62
    return-void
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

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/ferfalk/simplesearchview/SimpleSearchView$SavedState;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->v:Ljava/lang/CharSequence;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    iput-object v0, v1, Lcom/ferfalk/simplesearchview/SimpleSearchView$SavedState;->s:Ljava/lang/String;

    .line 21
    .line 22
    iget-boolean v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->y:Z

    .line 23
    .line 24
    iput-boolean v0, v1, Lcom/ferfalk/simplesearchview/SimpleSearchView$SavedState;->t:Z

    .line 25
    .line 26
    iget v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->t:I

    .line 27
    .line 28
    iput v0, v1, Lcom/ferfalk/simplesearchview/SimpleSearchView$SavedState;->u:I

    .line 29
    .line 30
    iget-boolean v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->N:Z

    .line 31
    .line 32
    iput-boolean v0, v1, Lcom/ferfalk/simplesearchview/SimpleSearchView$SavedState;->w:Z

    .line 33
    .line 34
    return-object v1
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
.end method

.method public final requestFocus(ILandroid/graphics/Rect;)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->z:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isFocusable()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    :goto_0
    const/4 p1, 0x0

    .line 13
    return p1

    .line 14
    :cond_1
    iget-object v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->D:Landroid/widget/EditText;

    .line 15
    .line 16
    invoke-virtual {v0, p1, p2}, Landroid/view/View;->requestFocus(ILandroid/graphics/Rect;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1
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

.method public setAnimationDuration(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->t:I

    .line 2
    .line 3
    return-void
    .line 4
    .line 5
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public setBackIconAlpha(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->E:Landroid/widget/ImageButton;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 4
    .line 5
    .line 6
    return-void
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public setBackIconColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->E:Landroid/widget/ImageButton;

    .line 2
    .line 3
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {v0, p1}, La0/f;->c(Landroid/widget/ImageView;Landroid/content/res/ColorStateList;)V

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

.method public setBackIconDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->E:Landroid/widget/ImageButton;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    return-void
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public setCardStyle(I)V
    .locals 3

    .line 1
    iput p1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->B:I

    .line 2
    .line 3
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 4
    .line 5
    const/4 v1, -0x1

    .line 6
    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-eq p1, v2, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->C:Landroid/view/ViewGroup;

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->H:Landroid/view/View;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object p1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->C:Landroid/view/ViewGroup;

    .line 26
    .line 27
    invoke-direct {p0}, Lcom/ferfalk/simplesearchview/SimpleSearchView;->getCardStyleBackground()Landroid/graphics/drawable/GradientDrawable;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {p1, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->H:Landroid/view/View;

    .line 35
    .line 36
    const/16 v1, 0x8

    .line 37
    .line 38
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 39
    .line 40
    .line 41
    const/4 p1, 0x6

    .line 42
    iget-object v1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->s:Landroid/content/Context;

    .line 43
    .line 44
    invoke-static {v1, p1}, LC4/a;->g(Landroid/content/Context;I)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    invoke-virtual {v0, p1, p1, p1, p1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 49
    .line 50
    .line 51
    const/4 p1, 0x2

    .line 52
    invoke-static {v1, p1}, LC4/a;->g(Landroid/content/Context;I)I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    int-to-float p1, p1

    .line 57
    :goto_0
    iget-object v1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->C:Landroid/view/ViewGroup;

    .line 58
    .line 59
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->C:Landroid/view/ViewGroup;

    .line 63
    .line 64
    invoke-virtual {v0, p1}, Landroid/view/View;->setElevation(F)V

    .line 65
    .line 66
    .line 67
    return-void
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

.method public setClearIconDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->F:Landroid/widget/ImageButton;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    return-void
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public setCursorColor(I)V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->D:Landroid/widget/EditText;

    .line 3
    .line 4
    const-class v2, Landroid/widget/TextView;

    .line 5
    .line 6
    :try_start_0
    const-string v3, "mCursorDrawableRes"

    .line 7
    .line 8
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    invoke-virtual {v3, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v3, v1}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const-string v4, "mEditor"

    .line 20
    .line 21
    invoke-virtual {v2, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {v1, v3}, LJ/a;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    sget-object v3, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 41
    .line 42
    invoke-virtual {v1, p1, v3}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 43
    .line 44
    .line 45
    const/4 p1, 0x2

    .line 46
    new-array p1, p1, [Landroid/graphics/drawable/Drawable;

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    aput-object v1, p1, v3

    .line 50
    .line 51
    aput-object v1, p1, v0

    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    const-string v3, "mCursorDrawable"

    .line 58
    .line 59
    invoke-virtual {v1, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v2, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :catch_0
    move-exception p1

    .line 71
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    return-void
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

.method public setCursorDrawable(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->D:Landroid/widget/EditText;

    .line 2
    .line 3
    :try_start_0
    const-class v1, Landroid/widget/TextView;

    .line 4
    .line 5
    const-string v2, "mCursorDrawableRes"

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {v1, v0, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catch_0
    move-exception p1

    .line 24
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    return-void
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public setHint(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->D:Landroid/widget/EditText;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public setHintTextColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->D:Landroid/widget/EditText;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setHintTextColor(I)V

    .line 4
    .line 5
    .line 6
    return-void
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public setIconsAlpha(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->F:Landroid/widget/ImageButton;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->G:Landroid/widget/ImageButton;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 9
    .line 10
    .line 11
    return-void
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

.method public setIconsColor(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->F:Landroid/widget/ImageButton;

    .line 2
    .line 3
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v0, v1}, La0/f;->c(Landroid/widget/ImageView;Landroid/content/res/ColorStateList;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->G:Landroid/widget/ImageButton;

    .line 11
    .line 12
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {v0, p1}, La0/f;->c(Landroid/widget/ImageView;Landroid/content/res/ColorStateList;)V

    .line 17
    .line 18
    .line 19
    return-void
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

.method public setInputType(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->D:Landroid/widget/EditText;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setInputType(I)V

    .line 4
    .line 5
    .line 6
    return-void
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public setKeepQuery(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->N:Z

    .line 2
    .line 3
    return-void
    .line 4
    .line 5
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public setMenuItem(Landroid/view/MenuItem;)V
    .locals 1

    .line 1
    new-instance v0, LW1/e;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LW1/e;-><init>(Lcom/ferfalk/simplesearchview/SimpleSearchView;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    .line 7
    .line 8
    .line 9
    return-void
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
.end method

.method public setOnQueryTextListener(LW1/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->K:LW1/h;

    .line 2
    .line 3
    return-void
    .line 4
    .line 5
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public setOnSearchViewListener(LW1/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->L:LW1/i;

    .line 2
    .line 3
    return-void
    .line 4
    .line 5
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public setRevealAnimationCenter(Landroid/graphics/Point;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->u:Landroid/graphics/Point;

    .line 2
    .line 3
    return-void
    .line 4
    .line 5
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public setSearchBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->C:Landroid/view/ViewGroup;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    return-void
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public setTabLayout(Lcom/google/android/material/tabs/TabLayout;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->I:Lcom/google/android/material/tabs/TabLayout;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, LW1/g;

    .line 8
    .line 9
    invoke-direct {v1, p0, p1}, LW1/g;-><init>(Lcom/ferfalk/simplesearchview/SimpleSearchView;Lcom/google/android/material/tabs/TabLayout;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->I:Lcom/google/android/material/tabs/TabLayout;

    .line 16
    .line 17
    new-instance v0, LJ4/m;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, v1}, LJ4/m;-><init>(Ljava/lang/Object;I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lcom/google/android/material/tabs/TabLayout;->a(Lv3/b;)V

    .line 24
    .line 25
    .line 26
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public setTextColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->D:Landroid/widget/EditText;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 4
    .line 5
    .line 6
    return-void
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public setVoiceIconDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->G:Landroid/widget/ImageButton;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    return-void
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public setVoiceSearchPrompt(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ferfalk/simplesearchview/SimpleSearchView;->A:Ljava/lang/String;

    .line 2
    .line 3
    return-void
    .line 4
    .line 5
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method
