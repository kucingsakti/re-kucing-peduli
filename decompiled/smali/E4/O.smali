.class public final LE4/O;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/a;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Lcom/kcstream/cing/activity/SeriesActivity;

.field public final synthetic u:LX2/h;


# direct methods
.method public synthetic constructor <init>(Lcom/kcstream/cing/activity/SeriesActivity;LX2/h;I)V
    .locals 0

    .line 1
    iput p3, p0, LE4/O;->s:I

    iput-object p1, p0, LE4/O;->t:Lcom/kcstream/cing/activity/SeriesActivity;

    iput-object p2, p0, LE4/O;->u:LX2/h;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lv8/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, LE4/O;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LE4/O;->t:Lcom/kcstream/cing/activity/SeriesActivity;

    .line 7
    .line 8
    invoke-virtual {v0}, LK4/f;->w()LK4/h;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget v2, v0, Lcom/kcstream/cing/activity/SeriesActivity;->Z:I

    .line 13
    .line 14
    const-string v3, "series"

    .line 15
    .line 16
    invoke-virtual {v1, v2, v3}, LK4/h;->a(ILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, LE4/O;->u:LX2/h;

    .line 20
    .line 21
    invoke-virtual {v1}, Li/F;->dismiss()V

    .line 22
    .line 23
    .line 24
    const-string v1, "Seri dihapus dari bookmark"

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 32
    .line 33
    .line 34
    iget-object v0, v0, Lcom/kcstream/cing/activity/SeriesActivity;->Y:Landroid/view/MenuItem;

    .line 35
    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    const v1, 0x7f0800e6

    .line 39
    .line 40
    .line 41
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 42
    .line 43
    .line 44
    :cond_0
    sget-object v0, Lh8/m;->a:Lh8/m;

    .line 45
    .line 46
    return-object v0

    .line 47
    :pswitch_0
    iget-object v0, p0, LE4/O;->t:Lcom/kcstream/cing/activity/SeriesActivity;

    .line 48
    .line 49
    iget-object v1, v0, Lcom/kcstream/cing/activity/SeriesActivity;->Y:Landroid/view/MenuItem;

    .line 50
    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    const v2, 0x7f0800e7

    .line 54
    .line 55
    .line 56
    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 57
    .line 58
    .line 59
    :cond_1
    invoke-virtual {v0}, LK4/f;->w()LK4/h;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    iget v6, v0, Lcom/kcstream/cing/activity/SeriesActivity;->Z:I

    .line 64
    .line 65
    iget-object v8, v0, Lcom/kcstream/cing/activity/SeriesActivity;->b0:Ljava/lang/String;

    .line 66
    .line 67
    iget-object v7, v0, Lcom/kcstream/cing/activity/SeriesActivity;->a0:Ljava/lang/String;

    .line 68
    .line 69
    const/4 v4, 0x3

    .line 70
    const-string v5, "series"

    .line 71
    .line 72
    invoke-virtual/range {v3 .. v8}, LK4/h;->c(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    iget-object v1, p0, LE4/O;->u:LX2/h;

    .line 76
    .line 77
    invoke-virtual {v1}, Li/F;->dismiss()V

    .line 78
    .line 79
    .line 80
    const-string v1, "Seri ditambahkan ke bookmark"

    .line 81
    .line 82
    const/4 v2, 0x0

    .line 83
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 88
    .line 89
    .line 90
    sget-object v0, Lh8/m;->a:Lh8/m;

    .line 91
    .line 92
    return-object v0

    .line 93
    :pswitch_1
    iget-object v0, p0, LE4/O;->t:Lcom/kcstream/cing/activity/SeriesActivity;

    .line 94
    .line 95
    iget-object v1, v0, Lcom/kcstream/cing/activity/SeriesActivity;->Y:Landroid/view/MenuItem;

    .line 96
    .line 97
    if-eqz v1, :cond_2

    .line 98
    .line 99
    const v2, 0x7f0800e7

    .line 100
    .line 101
    .line 102
    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 103
    .line 104
    .line 105
    :cond_2
    invoke-virtual {v0}, LK4/f;->w()LK4/h;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    iget v6, v0, Lcom/kcstream/cing/activity/SeriesActivity;->Z:I

    .line 110
    .line 111
    iget-object v8, v0, Lcom/kcstream/cing/activity/SeriesActivity;->b0:Ljava/lang/String;

    .line 112
    .line 113
    iget-object v7, v0, Lcom/kcstream/cing/activity/SeriesActivity;->a0:Ljava/lang/String;

    .line 114
    .line 115
    const/4 v4, 0x2

    .line 116
    const-string v5, "series"

    .line 117
    .line 118
    invoke-virtual/range {v3 .. v8}, LK4/h;->c(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    iget-object v1, p0, LE4/O;->u:LX2/h;

    .line 122
    .line 123
    invoke-virtual {v1}, Li/F;->dismiss()V

    .line 124
    .line 125
    .line 126
    const-string v1, "Seri ditambahkan ke bookmark"

    .line 127
    .line 128
    const/4 v2, 0x0

    .line 129
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 134
    .line 135
    .line 136
    sget-object v0, Lh8/m;->a:Lh8/m;

    .line 137
    .line 138
    return-object v0

    .line 139
    :pswitch_2
    iget-object v0, p0, LE4/O;->t:Lcom/kcstream/cing/activity/SeriesActivity;

    .line 140
    .line 141
    iget-object v1, v0, Lcom/kcstream/cing/activity/SeriesActivity;->Y:Landroid/view/MenuItem;

    .line 142
    .line 143
    if-eqz v1, :cond_3

    .line 144
    .line 145
    const v2, 0x7f0800e7

    .line 146
    .line 147
    .line 148
    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 149
    .line 150
    .line 151
    :cond_3
    invoke-virtual {v0}, LK4/f;->w()LK4/h;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    iget v6, v0, Lcom/kcstream/cing/activity/SeriesActivity;->Z:I

    .line 156
    .line 157
    iget-object v8, v0, Lcom/kcstream/cing/activity/SeriesActivity;->b0:Ljava/lang/String;

    .line 158
    .line 159
    iget-object v7, v0, Lcom/kcstream/cing/activity/SeriesActivity;->a0:Ljava/lang/String;

    .line 160
    .line 161
    const/4 v4, 0x1

    .line 162
    const-string v5, "series"

    .line 163
    .line 164
    invoke-virtual/range {v3 .. v8}, LK4/h;->c(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    iget-object v1, p0, LE4/O;->u:LX2/h;

    .line 168
    .line 169
    invoke-virtual {v1}, Li/F;->dismiss()V

    .line 170
    .line 171
    .line 172
    const-string v1, "Seri ditambahkan ke bookmark"

    .line 173
    .line 174
    const/4 v2, 0x0

    .line 175
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 180
    .line 181
    .line 182
    sget-object v0, Lh8/m;->a:Lh8/m;

    .line 183
    .line 184
    return-object v0

    .line 185
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
