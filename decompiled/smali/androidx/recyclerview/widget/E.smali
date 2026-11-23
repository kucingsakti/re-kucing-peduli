.class public abstract Landroidx/recyclerview/widget/E;
.super Landroidx/recyclerview/widget/u;
.source "SourceFile"


# instance fields
.field public g:Z


# virtual methods
.method public final a(Landroidx/recyclerview/widget/RecyclerView$a;Landroidx/recyclerview/widget/RecyclerView$a;Landroidx/recyclerview/widget/t;Landroidx/recyclerview/widget/t;)Z
    .locals 9

    .line 1
    iget v2, p3, Landroidx/recyclerview/widget/t;->a:I

    .line 2
    .line 3
    iget v3, p3, Landroidx/recyclerview/widget/t;->b:I

    .line 4
    .line 5
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$a;->q()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget p4, p3, Landroidx/recyclerview/widget/t;->a:I

    .line 12
    .line 13
    iget p3, p3, Landroidx/recyclerview/widget/t;->b:I

    .line 14
    .line 15
    move v5, p3

    .line 16
    move v4, p4

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget p3, p4, Landroidx/recyclerview/widget/t;->a:I

    .line 19
    .line 20
    iget p4, p4, Landroidx/recyclerview/widget/t;->b:I

    .line 21
    .line 22
    move v4, p3

    .line 23
    move v5, p4

    .line 24
    :goto_0
    move-object v0, p0

    .line 25
    check-cast v0, Landroidx/recyclerview/widget/l;

    .line 26
    .line 27
    if-ne p1, p2, :cond_1

    .line 28
    .line 29
    move-object v1, p1

    .line 30
    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/l;->g(Landroidx/recyclerview/widget/RecyclerView$a;IIII)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    return p1

    .line 35
    :cond_1
    move-object v1, p1

    .line 36
    iget-object p1, v1, Landroidx/recyclerview/widget/RecyclerView$a;->s:Landroid/view/View;

    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/view/View;->getTranslationX()F

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    invoke-virtual {p1}, Landroid/view/View;->getTranslationY()F

    .line 43
    .line 44
    .line 45
    move-result p4

    .line 46
    invoke-virtual {p1}, Landroid/view/View;->getAlpha()F

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/l;->l(Landroidx/recyclerview/widget/RecyclerView$a;)V

    .line 51
    .line 52
    .line 53
    sub-int v7, v4, v2

    .line 54
    .line 55
    int-to-float v7, v7

    .line 56
    sub-float/2addr v7, p3

    .line 57
    float-to-int v7, v7

    .line 58
    sub-int v8, v5, v3

    .line 59
    .line 60
    int-to-float v8, v8

    .line 61
    sub-float/2addr v8, p4

    .line 62
    float-to-int v8, v8

    .line 63
    invoke-virtual {p1, p3}, Landroid/view/View;->setTranslationX(F)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, p4}, Landroid/view/View;->setTranslationY(F)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v6}, Landroid/view/View;->setAlpha(F)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/l;->l(Landroidx/recyclerview/widget/RecyclerView$a;)V

    .line 73
    .line 74
    .line 75
    neg-int p1, v7

    .line 76
    int-to-float p1, p1

    .line 77
    iget-object p3, p2, Landroidx/recyclerview/widget/RecyclerView$a;->s:Landroid/view/View;

    .line 78
    .line 79
    invoke-virtual {p3, p1}, Landroid/view/View;->setTranslationX(F)V

    .line 80
    .line 81
    .line 82
    neg-int p1, v8

    .line 83
    int-to-float p1, p1

    .line 84
    invoke-virtual {p3, p1}, Landroid/view/View;->setTranslationY(F)V

    .line 85
    .line 86
    .line 87
    const/4 p1, 0x0

    .line 88
    invoke-virtual {p3, p1}, Landroid/view/View;->setAlpha(F)V

    .line 89
    .line 90
    .line 91
    iget-object p1, v0, Landroidx/recyclerview/widget/l;->k:Ljava/util/ArrayList;

    .line 92
    .line 93
    new-instance p3, Landroidx/recyclerview/widget/j;

    .line 94
    .line 95
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 96
    .line 97
    .line 98
    iput-object v1, p3, Landroidx/recyclerview/widget/j;->a:Landroidx/recyclerview/widget/RecyclerView$a;

    .line 99
    .line 100
    iput-object p2, p3, Landroidx/recyclerview/widget/j;->b:Landroidx/recyclerview/widget/RecyclerView$a;

    .line 101
    .line 102
    iput v2, p3, Landroidx/recyclerview/widget/j;->c:I

    .line 103
    .line 104
    iput v3, p3, Landroidx/recyclerview/widget/j;->d:I

    .line 105
    .line 106
    iput v4, p3, Landroidx/recyclerview/widget/j;->e:I

    .line 107
    .line 108
    iput v5, p3, Landroidx/recyclerview/widget/j;->f:I

    .line 109
    .line 110
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    const/4 p1, 0x1

    .line 114
    return p1
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
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
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
.end method

.method public abstract g(Landroidx/recyclerview/widget/RecyclerView$a;IIII)Z
.end method
