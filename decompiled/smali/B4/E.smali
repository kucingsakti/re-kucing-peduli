.class public final LB4/E;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroid/app/Activity;

.field public b:Z

.field public c:I

.field public d:I

.field public e:LB4/M;

.field public f:Landroid/webkit/WebView;

.field public g:Landroid/widget/FrameLayout;

.field public h:I


# virtual methods
.method public final a()LB4/P;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    new-instance v1, LB4/P;

    .line 3
    .line 4
    iget-object v2, p0, LB4/E;->a:Landroid/app/Activity;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, -0x1

    .line 8
    invoke-direct {v1, v2, v3, v4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 9
    .line 10
    .line 11
    iput-object v3, v1, LB4/P;->s:LB4/n;

    .line 12
    .line 13
    iput v4, v1, LB4/P;->u:I

    .line 14
    .line 15
    iput-object v3, v1, LB4/P;->x:Landroid/widget/FrameLayout;

    .line 16
    .line 17
    instance-of v5, v2, Landroid/app/Activity;

    .line 18
    .line 19
    if-eqz v5, :cond_5

    .line 20
    .line 21
    const v5, 0x7f0d002e

    .line 22
    .line 23
    .line 24
    iput v5, v1, LB4/P;->t:I

    .line 25
    .line 26
    sget-object v5, LB4/j;->a:Ljava/lang/String;

    .line 27
    .line 28
    const v5, 0x7f0a035a

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v5}, Landroid/view/View;->setId(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v4}, Landroid/view/View;->setBackgroundColor(I)V

    .line 35
    .line 36
    .line 37
    iget-object v5, p0, LB4/E;->f:Landroid/webkit/WebView;

    .line 38
    .line 39
    const/4 v6, 0x1

    .line 40
    const/4 v7, 0x3

    .line 41
    if-eqz v5, :cond_0

    .line 42
    .line 43
    iput v7, p0, LB4/E;->h:I

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    new-instance v5, LB4/F;

    .line 47
    .line 48
    iget-object v8, p0, LB4/E;->a:Landroid/app/Activity;

    .line 49
    .line 50
    invoke-direct {v5, v8}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 51
    .line 52
    .line 53
    iput v6, p0, LB4/E;->h:I

    .line 54
    .line 55
    :goto_0
    iput-object v5, p0, LB4/E;->f:Landroid/webkit/WebView;

    .line 56
    .line 57
    new-instance v8, Landroid/widget/FrameLayout$LayoutParams;

    .line 58
    .line 59
    invoke-direct {v8, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v5, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 63
    .line 64
    .line 65
    iget-object v5, p0, LB4/E;->f:Landroid/webkit/WebView;

    .line 66
    .line 67
    iget-object v8, v1, LB4/P;->w:Landroid/webkit/WebView;

    .line 68
    .line 69
    if-nez v8, :cond_1

    .line 70
    .line 71
    iput-object v5, v1, LB4/P;->w:Landroid/webkit/WebView;

    .line 72
    .line 73
    :cond_1
    new-instance v5, Landroid/view/ViewStub;

    .line 74
    .line 75
    invoke-direct {v5, v2}, Landroid/view/ViewStub;-><init>(Landroid/content/Context;)V

    .line 76
    .line 77
    .line 78
    const v8, 0x7f0a01a0

    .line 79
    .line 80
    .line 81
    invoke-virtual {v5, v8}, Landroid/view/View;->setId(I)V

    .line 82
    .line 83
    .line 84
    new-instance v8, Landroid/widget/FrameLayout$LayoutParams;

    .line 85
    .line 86
    invoke-direct {v8, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, v5, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 90
    .line 91
    .line 92
    iget-boolean v5, p0, LB4/E;->b:Z

    .line 93
    .line 94
    if-eqz v5, :cond_4

    .line 95
    .line 96
    new-instance v5, LB4/M;

    .line 97
    .line 98
    invoke-direct {v5, v2, v3, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 99
    .line 100
    .line 101
    iput v0, v5, LB4/M;->v:I

    .line 102
    .line 103
    const/16 v3, 0x1f40

    .line 104
    .line 105
    iput v3, v5, LB4/M;->w:I

    .line 106
    .line 107
    const/16 v3, 0x1c2

    .line 108
    .line 109
    iput v3, v5, LB4/M;->x:I

    .line 110
    .line 111
    const/16 v3, 0x258

    .line 112
    .line 113
    iput v3, v5, LB4/M;->y:I

    .line 114
    .line 115
    iput v0, v5, LB4/M;->z:I

    .line 116
    .line 117
    const/4 v3, 0x0

    .line 118
    iput v3, v5, LB4/M;->A:F

    .line 119
    .line 120
    iput v7, v5, LB4/M;->B:I

    .line 121
    .line 122
    new-instance v3, LB4/K;

    .line 123
    .line 124
    invoke-direct {v3, v5, v0}, LB4/K;-><init>(Ljava/lang/Object;I)V

    .line 125
    .line 126
    .line 127
    iput-object v3, v5, LB4/M;->C:LB4/K;

    .line 128
    .line 129
    new-instance v3, LB4/L;

    .line 130
    .line 131
    invoke-direct {v3, v5, v0}, LB4/L;-><init>(Ljava/lang/Object;I)V

    .line 132
    .line 133
    .line 134
    iput-object v3, v5, LB4/M;->D:LB4/L;

    .line 135
    .line 136
    new-instance v0, Landroid/graphics/Paint;

    .line 137
    .line 138
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 139
    .line 140
    .line 141
    iput-object v0, v5, LB4/M;->t:Landroid/graphics/Paint;

    .line 142
    .line 143
    const-string v0, "#1aad19"

    .line 144
    .line 145
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    iput v0, v5, LB4/M;->s:I

    .line 150
    .line 151
    iget-object v0, v5, LB4/M;->t:Landroid/graphics/Paint;

    .line 152
    .line 153
    invoke-virtual {v0, v6}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 154
    .line 155
    .line 156
    iget-object v0, v5, LB4/M;->t:Landroid/graphics/Paint;

    .line 157
    .line 158
    iget v3, v5, LB4/M;->s:I

    .line 159
    .line 160
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 161
    .line 162
    .line 163
    iget-object v0, v5, LB4/M;->t:Landroid/graphics/Paint;

    .line 164
    .line 165
    invoke-virtual {v0, v6}, Landroid/graphics/Paint;->setDither(Z)V

    .line 166
    .line 167
    .line 168
    iget-object v0, v5, LB4/M;->t:Landroid/graphics/Paint;

    .line 169
    .line 170
    sget-object v3, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    .line 171
    .line 172
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 184
    .line 185
    iput v0, v5, LB4/M;->v:I

    .line 186
    .line 187
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 196
    .line 197
    const/high16 v3, 0x40400000    # 3.0f

    .line 198
    .line 199
    mul-float/2addr v3, v0

    .line 200
    const/high16 v0, 0x3f000000    # 0.5f

    .line 201
    .line 202
    add-float/2addr v3, v0

    .line 203
    float-to-int v3, v3

    .line 204
    iput v3, v5, LB4/M;->B:I

    .line 205
    .line 206
    iget v3, p0, LB4/E;->d:I

    .line 207
    .line 208
    if-lez v3, :cond_2

    .line 209
    .line 210
    new-instance v6, Landroid/widget/FrameLayout$LayoutParams;

    .line 211
    .line 212
    int-to-float v3, v3

    .line 213
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 222
    .line 223
    mul-float/2addr v3, v2

    .line 224
    add-float/2addr v3, v0

    .line 225
    float-to-int v0, v3

    .line 226
    const/4 v2, -0x2

    .line 227
    invoke-direct {v6, v2, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 228
    .line 229
    .line 230
    goto :goto_1

    .line 231
    :cond_2
    new-instance v6, Landroid/widget/FrameLayout$LayoutParams;

    .line 232
    .line 233
    iget v0, v5, LB4/M;->B:I

    .line 234
    .line 235
    invoke-direct {v6, v4, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 236
    .line 237
    .line 238
    :goto_1
    iget v0, p0, LB4/E;->c:I

    .line 239
    .line 240
    if-eq v0, v4, :cond_3

    .line 241
    .line 242
    invoke-virtual {v5, v0}, LB4/M;->setColor(I)V

    .line 243
    .line 244
    .line 245
    :cond_3
    const/16 v0, 0x30

    .line 246
    .line 247
    iput v0, v6, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 248
    .line 249
    iput-object v5, p0, LB4/E;->e:LB4/M;

    .line 250
    .line 251
    invoke-virtual {v1, v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 252
    .line 253
    .line 254
    const/16 v0, 0x8

    .line 255
    .line 256
    invoke-virtual {v5, v0}, Landroid/view/View;->setVisibility(I)V

    .line 257
    .line 258
    .line 259
    :cond_4
    return-object v1

    .line 260
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 261
    .line 262
    const-string v1, "WebParentLayout context must be activity or activity sub class ."

    .line 263
    .line 264
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    throw v0
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
