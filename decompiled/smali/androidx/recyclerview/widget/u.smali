.class public abstract Landroidx/recyclerview/widget/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroidx/recyclerview/widget/v;

.field public b:Ljava/util/ArrayList;

.field public c:J

.field public d:J

.field public e:J

.field public f:J


# direct methods
.method public static b(Landroidx/recyclerview/widget/RecyclerView$a;)V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$a;->B:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$a;->h()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    and-int/lit8 v0, v0, 0x4

    .line 11
    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$a;->J:Landroidx/recyclerview/widget/RecyclerView;

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->J(Landroidx/recyclerview/widget/RecyclerView$a;)I

    .line 20
    .line 21
    .line 22
    :cond_2
    :goto_0
    return-void
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


# virtual methods
.method public abstract a(Landroidx/recyclerview/widget/RecyclerView$a;Landroidx/recyclerview/widget/RecyclerView$a;Landroidx/recyclerview/widget/t;Landroidx/recyclerview/widget/t;)Z
.end method

.method public final c(Landroidx/recyclerview/widget/RecyclerView$a;)V
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/u;->a:Landroidx/recyclerview/widget/v;

    .line 2
    .line 3
    if-eqz v0, :cond_8

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView$a;->p(Z)V

    .line 7
    .line 8
    .line 9
    iget-object v2, p1, Landroidx/recyclerview/widget/RecyclerView$a;->z:Landroidx/recyclerview/widget/RecyclerView$a;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    iget-object v2, p1, Landroidx/recyclerview/widget/RecyclerView$a;->A:Landroidx/recyclerview/widget/RecyclerView$a;

    .line 15
    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    iput-object v3, p1, Landroidx/recyclerview/widget/RecyclerView$a;->z:Landroidx/recyclerview/widget/RecyclerView$a;

    .line 19
    .line 20
    :cond_0
    iput-object v3, p1, Landroidx/recyclerview/widget/RecyclerView$a;->A:Landroidx/recyclerview/widget/RecyclerView$a;

    .line 21
    .line 22
    iget v2, p1, Landroidx/recyclerview/widget/RecyclerView$a;->B:I

    .line 23
    .line 24
    and-int/lit8 v2, v2, 0x10

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    goto/16 :goto_4

    .line 29
    .line 30
    :cond_1
    iget-object v0, v0, Landroidx/recyclerview/widget/v;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 31
    .line 32
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->j0()V

    .line 33
    .line 34
    .line 35
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->x:Landroidx/recyclerview/widget/b;

    .line 36
    .line 37
    iget-object v3, v2, Landroidx/recyclerview/widget/b;->b:LJ0/b;

    .line 38
    .line 39
    iget-object v4, v2, Landroidx/recyclerview/widget/b;->a:Landroidx/recyclerview/widget/q;

    .line 40
    .line 41
    iget v5, v2, Landroidx/recyclerview/widget/b;->d:I

    .line 42
    .line 43
    iget-object v6, p1, Landroidx/recyclerview/widget/RecyclerView$a;->s:Landroid/view/View;

    .line 44
    .line 45
    const/4 v7, 0x0

    .line 46
    if-ne v5, v1, :cond_3

    .line 47
    .line 48
    iget-object v1, v2, Landroidx/recyclerview/widget/b;->e:Landroid/view/View;

    .line 49
    .line 50
    if-ne v1, v6, :cond_2

    .line 51
    .line 52
    :goto_0
    move v1, v7

    .line 53
    goto :goto_2

    .line 54
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string v0, "Cannot call removeViewIfHidden within removeView(At) for a different view"

    .line 57
    .line 58
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1

    .line 62
    :cond_3
    const/4 v8, 0x2

    .line 63
    if-eq v5, v8, :cond_7

    .line 64
    .line 65
    :try_start_0
    iput v8, v2, Landroidx/recyclerview/widget/b;->d:I

    .line 66
    .line 67
    iget-object v5, v4, Landroidx/recyclerview/widget/q;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 68
    .line 69
    invoke-virtual {v5, v6}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    const/4 v8, -0x1

    .line 74
    if-ne v5, v8, :cond_4

    .line 75
    .line 76
    invoke-virtual {v2, v6}, Landroidx/recyclerview/widget/b;->k(Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    .line 78
    .line 79
    :goto_1
    iput v7, v2, Landroidx/recyclerview/widget/b;->d:I

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :catchall_0
    move-exception p1

    .line 83
    goto :goto_3

    .line 84
    :cond_4
    :try_start_1
    invoke-virtual {v3, v5}, LJ0/b;->d(I)Z

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    if-eqz v8, :cond_5

    .line 89
    .line 90
    invoke-virtual {v3, v5}, LJ0/b;->f(I)Z

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v6}, Landroidx/recyclerview/widget/b;->k(Landroid/view/View;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v4, v5}, Landroidx/recyclerview/widget/q;->a(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_5
    iput v7, v2, Landroidx/recyclerview/widget/b;->d:I

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :goto_2
    if-eqz v1, :cond_6

    .line 104
    .line 105
    invoke-static {v6}, Landroidx/recyclerview/widget/RecyclerView;->M(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$a;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->u:Landroidx/recyclerview/widget/A;

    .line 110
    .line 111
    invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/A;->l(Landroidx/recyclerview/widget/RecyclerView$a;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/A;->i(Landroidx/recyclerview/widget/RecyclerView$a;)V

    .line 115
    .line 116
    .line 117
    sget-boolean v2, Landroidx/recyclerview/widget/RecyclerView;->T0:Z

    .line 118
    .line 119
    if-eqz v2, :cond_6

    .line 120
    .line 121
    invoke-static {v6}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    :cond_6
    xor-int/lit8 v2, v1, 0x1

    .line 128
    .line 129
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->k0(Z)V

    .line 130
    .line 131
    .line 132
    if-nez v1, :cond_8

    .line 133
    .line 134
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$a;->l()Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    if-eqz p1, :cond_8

    .line 139
    .line 140
    invoke-virtual {v0, v6, v7}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :goto_3
    iput v7, v2, Landroidx/recyclerview/widget/b;->d:I

    .line 145
    .line 146
    throw p1

    .line 147
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 148
    .line 149
    const-string v0, "Cannot call removeViewIfHidden within removeViewIfHidden"

    .line 150
    .line 151
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    throw p1

    .line 155
    :cond_8
    :goto_4
    return-void
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
.end method

.method public abstract d(Landroidx/recyclerview/widget/RecyclerView$a;)V
.end method

.method public abstract e()V
.end method

.method public abstract f()Z
.end method
