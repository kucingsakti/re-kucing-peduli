.class public LA1/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM1/a;
.implements LV/t;


# instance fields
.field public s:I

.field public t:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    packed-switch p1, :pswitch_data_0

    .line 2
    sget-object p1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, LA1/l;->t:Ljava/lang/Object;

    const/16 p1, 0x64

    .line 5
    iput p1, p0, LA1/l;->s:I

    return-void

    .line 6
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 7
    iput p1, p0, LA1/l;->s:I

    return-void

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(I[LR/h;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput p1, p0, LA1/l;->s:I

    .line 15
    iput-object p2, p0, LA1/l;->t:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 8
    invoke-static {p1, v0}, Li/j;->h(Landroid/content/Context;I)I

    move-result v0

    invoke-direct {p0, p1, v0}, LA1/l;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 3

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Li/g;

    new-instance v1, Landroid/view/ContextThemeWrapper;

    .line 11
    invoke-static {p1, p2}, Li/j;->h(Landroid/content/Context;I)I

    move-result v2

    invoke-direct {v1, p1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    invoke-direct {v0, v1}, Li/g;-><init>(Landroid/view/ContextThemeWrapper;)V

    iput-object v0, p0, LA1/l;->t:Ljava/lang/Object;

    .line 12
    iput p2, p0, LA1/l;->s:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput-object p1, p0, LA1/l;->t:Ljava/lang/Object;

    iput p2, p0, LA1/l;->s:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LA1/F;Ly1/h;)LA1/F;
    .locals 3

    .line 1
    new-instance p2, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {p2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, LA1/F;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Landroid/graphics/Bitmap;

    .line 11
    .line 12
    iget-object v1, p0, LA1/l;->t:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Landroid/graphics/Bitmap$CompressFormat;

    .line 15
    .line 16
    iget v2, p0, LA1/l;->s:I

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2, p2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 19
    .line 20
    .line 21
    invoke-interface {p1}, LA1/F;->c()V

    .line 22
    .line 23
    .line 24
    new-instance p1, LH1/z;

    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-direct {p1, p2}, LH1/z;-><init>([B)V

    .line 31
    .line 32
    .line 33
    return-object p1
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

.method public b(Landroid/view/View;)Z
    .locals 1

    .line 1
    iget-object p1, p0, LA1/l;->t:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 4
    .line 5
    iget v0, p0, LA1/l;->s:I

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->I(I)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    return p1
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

.method public c()Li/j;
    .locals 12

    .line 1
    new-instance v0, Li/j;

    .line 2
    .line 3
    iget-object v1, p0, LA1/l;->t:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v3, v1

    .line 6
    check-cast v3, Li/g;

    .line 7
    .line 8
    iget-object v1, v3, Li/g;->a:Landroid/view/ContextThemeWrapper;

    .line 9
    .line 10
    iget v2, p0, LA1/l;->s:I

    .line 11
    .line 12
    invoke-direct {v0, v1, v2}, Li/j;-><init>(Landroid/view/ContextThemeWrapper;I)V

    .line 13
    .line 14
    .line 15
    iget-object v1, v3, Li/g;->e:Landroid/view/View;

    .line 16
    .line 17
    iget-object v8, v0, Li/j;->x:Li/i;

    .line 18
    .line 19
    const/4 v9, 0x0

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    iput-object v1, v8, Li/i;->x:Landroid/view/View;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v1, v3, Li/g;->d:Ljava/lang/CharSequence;

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    iput-object v1, v8, Li/i;->d:Ljava/lang/CharSequence;

    .line 30
    .line 31
    iget-object v2, v8, Li/i;->v:Landroid/widget/TextView;

    .line 32
    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    iget-object v1, v3, Li/g;->c:Landroid/graphics/drawable/Drawable;

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    iput-object v1, v8, Li/i;->t:Landroid/graphics/drawable/Drawable;

    .line 43
    .line 44
    iget-object v2, v8, Li/i;->u:Landroid/widget/ImageView;

    .line 45
    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    invoke-virtual {v2, v9}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 49
    .line 50
    .line 51
    iget-object v2, v8, Li/i;->u:Landroid/widget/ImageView;

    .line 52
    .line 53
    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 54
    .line 55
    .line 56
    :cond_2
    :goto_0
    iget-object v1, v3, Li/g;->f:Ljava/lang/CharSequence;

    .line 57
    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    iput-object v1, v8, Li/i;->e:Ljava/lang/CharSequence;

    .line 61
    .line 62
    iget-object v2, v8, Li/i;->w:Landroid/widget/TextView;

    .line 63
    .line 64
    if-eqz v2, :cond_3

    .line 65
    .line 66
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    .line 68
    .line 69
    :cond_3
    iget-object v1, v3, Li/g;->g:Ljava/lang/CharSequence;

    .line 70
    .line 71
    if-nez v1, :cond_4

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_4
    iget-object v2, v3, Li/g;->h:Landroid/content/DialogInterface$OnClickListener;

    .line 75
    .line 76
    const/4 v4, -0x1

    .line 77
    invoke-virtual {v8, v4, v1, v2}, Li/i;->c(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 78
    .line 79
    .line 80
    :goto_1
    iget-object v1, v3, Li/g;->i:Ljava/lang/CharSequence;

    .line 81
    .line 82
    if-nez v1, :cond_5

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_5
    iget-object v2, v3, Li/g;->j:Landroid/content/DialogInterface$OnClickListener;

    .line 86
    .line 87
    const/4 v4, -0x2

    .line 88
    invoke-virtual {v8, v4, v1, v2}, Li/i;->c(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 89
    .line 90
    .line 91
    :goto_2
    iget-object v1, v3, Li/g;->k:Ljava/lang/String;

    .line 92
    .line 93
    if-nez v1, :cond_6

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_6
    iget-object v2, v3, Li/g;->l:LJ4/g;

    .line 97
    .line 98
    const/4 v4, -0x3

    .line 99
    invoke-virtual {v8, v4, v1, v2}, Li/i;->c(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 100
    .line 101
    .line 102
    :goto_3
    iget-object v1, v3, Li/g;->o:[Ljava/lang/CharSequence;

    .line 103
    .line 104
    const/4 v10, 0x0

    .line 105
    const/4 v11, 0x1

    .line 106
    if-nez v1, :cond_7

    .line 107
    .line 108
    iget-object v1, v3, Li/g;->p:Ljava/lang/Object;

    .line 109
    .line 110
    if-eqz v1, :cond_f

    .line 111
    .line 112
    :cond_7
    iget v1, v8, Li/i;->B:I

    .line 113
    .line 114
    iget-object v2, v3, Li/g;->b:Landroid/view/LayoutInflater;

    .line 115
    .line 116
    invoke-virtual {v2, v1, v10}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    move-object v7, v1

    .line 121
    check-cast v7, Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 122
    .line 123
    iget-boolean v1, v3, Li/g;->u:Z

    .line 124
    .line 125
    iget-object v4, v3, Li/g;->a:Landroid/view/ContextThemeWrapper;

    .line 126
    .line 127
    if-eqz v1, :cond_8

    .line 128
    .line 129
    new-instance v2, Li/d;

    .line 130
    .line 131
    iget-object v6, v3, Li/g;->o:[Ljava/lang/CharSequence;

    .line 132
    .line 133
    iget v5, v8, Li/i;->C:I

    .line 134
    .line 135
    invoke-direct/range {v2 .. v7}, Li/d;-><init>(Li/g;Landroid/view/ContextThemeWrapper;I[Ljava/lang/CharSequence;Landroidx/appcompat/app/AlertController$RecycleListView;)V

    .line 136
    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_8
    iget-boolean v1, v3, Li/g;->v:Z

    .line 140
    .line 141
    if-eqz v1, :cond_9

    .line 142
    .line 143
    iget v1, v8, Li/i;->D:I

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_9
    iget v1, v8, Li/i;->E:I

    .line 147
    .line 148
    :goto_4
    iget-object v2, v3, Li/g;->p:Ljava/lang/Object;

    .line 149
    .line 150
    if-eqz v2, :cond_a

    .line 151
    .line 152
    goto :goto_5

    .line 153
    :cond_a
    new-instance v2, Li/h;

    .line 154
    .line 155
    iget-object v5, v3, Li/g;->o:[Ljava/lang/CharSequence;

    .line 156
    .line 157
    const v6, 0x1020014

    .line 158
    .line 159
    .line 160
    invoke-direct {v2, v4, v1, v6, v5}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;II[Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    :goto_5
    iput-object v2, v8, Li/i;->y:Landroid/widget/ListAdapter;

    .line 164
    .line 165
    iget v1, v3, Li/g;->w:I

    .line 166
    .line 167
    iput v1, v8, Li/i;->z:I

    .line 168
    .line 169
    iget-object v1, v3, Li/g;->q:Landroid/content/DialogInterface$OnClickListener;

    .line 170
    .line 171
    if-eqz v1, :cond_b

    .line 172
    .line 173
    new-instance v1, Li/e;

    .line 174
    .line 175
    invoke-direct {v1, v3, v8}, Li/e;-><init>(Li/g;Li/i;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v7, v1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 179
    .line 180
    .line 181
    goto :goto_6

    .line 182
    :cond_b
    iget-object v1, v3, Li/g;->x:LC0/f;

    .line 183
    .line 184
    if-eqz v1, :cond_c

    .line 185
    .line 186
    new-instance v1, Li/f;

    .line 187
    .line 188
    invoke-direct {v1, v3, v7, v8}, Li/f;-><init>(Li/g;Landroidx/appcompat/app/AlertController$RecycleListView;Li/i;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v7, v1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 192
    .line 193
    .line 194
    :cond_c
    :goto_6
    iget-boolean v1, v3, Li/g;->v:Z

    .line 195
    .line 196
    if-eqz v1, :cond_d

    .line 197
    .line 198
    invoke-virtual {v7, v11}, Landroid/widget/AbsListView;->setChoiceMode(I)V

    .line 199
    .line 200
    .line 201
    goto :goto_7

    .line 202
    :cond_d
    iget-boolean v1, v3, Li/g;->u:Z

    .line 203
    .line 204
    if-eqz v1, :cond_e

    .line 205
    .line 206
    const/4 v1, 0x2

    .line 207
    invoke-virtual {v7, v1}, Landroid/widget/AbsListView;->setChoiceMode(I)V

    .line 208
    .line 209
    .line 210
    :cond_e
    :goto_7
    iput-object v7, v8, Li/i;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 211
    .line 212
    :cond_f
    iget-object v1, v3, Li/g;->s:Landroid/view/View;

    .line 213
    .line 214
    if-eqz v1, :cond_10

    .line 215
    .line 216
    iput-object v1, v8, Li/i;->g:Landroid/view/View;

    .line 217
    .line 218
    iput v9, v8, Li/i;->h:I

    .line 219
    .line 220
    iput-boolean v9, v8, Li/i;->i:Z

    .line 221
    .line 222
    goto :goto_8

    .line 223
    :cond_10
    iget v1, v3, Li/g;->r:I

    .line 224
    .line 225
    if-eqz v1, :cond_11

    .line 226
    .line 227
    iput-object v10, v8, Li/i;->g:Landroid/view/View;

    .line 228
    .line 229
    iput v1, v8, Li/i;->h:I

    .line 230
    .line 231
    iput-boolean v9, v8, Li/i;->i:Z

    .line 232
    .line 233
    :cond_11
    :goto_8
    invoke-virtual {v0, v11}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0, v11}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 237
    .line 238
    .line 239
    iget-object v1, v3, Li/g;->m:Landroid/content/DialogInterface$OnCancelListener;

    .line 240
    .line 241
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v0, v10}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 245
    .line 246
    .line 247
    iget-object v1, v3, Li/g;->n:Lo/m;

    .line 248
    .line 249
    if-eqz v1, :cond_12

    .line 250
    .line 251
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 252
    .line 253
    .line 254
    :cond_12
    return-object v0
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

.method public declared-synchronized d()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, LA1/l;->s:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x1

    .line 5
    .line 6
    iput v0, p0, LA1/l;->s:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    throw v0
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

.method public e(ILandroid/content/DialogInterface$OnClickListener;)LA1/l;
    .locals 2

    .line 1
    iget-object v0, p0, LA1/l;->t:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li/g;

    .line 4
    .line 5
    iget-object v1, v0, Li/g;->a:Landroid/view/ContextThemeWrapper;

    .line 6
    .line 7
    invoke-virtual {v1, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, v0, Li/g;->i:Ljava/lang/CharSequence;

    .line 12
    .line 13
    iput-object p2, v0, Li/g;->j:Landroid/content/DialogInterface$OnClickListener;

    .line 14
    .line 15
    return-object p0
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

.method public f(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, LA1/l;->t:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li/g;

    .line 4
    .line 5
    iput-object p1, v0, Li/g;->g:Ljava/lang/CharSequence;

    .line 6
    .line 7
    iput-object p2, v0, Li/g;->h:Landroid/content/DialogInterface$OnClickListener;

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

.method public g()V
    .locals 1

    .line 1
    invoke-virtual {p0}, LA1/l;->c()Li/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 6
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
