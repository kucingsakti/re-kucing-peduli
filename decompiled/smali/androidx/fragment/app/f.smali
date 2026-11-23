.class public final Landroidx/fragment/app/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lo1/e;

.field public final b:Lo4/r;

.field public final c:Landroidx/fragment/app/b;

.field public d:Z

.field public e:I


# direct methods
.method public constructor <init>(Lo1/e;Lo4/r;Landroidx/fragment/app/b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/f;->d:Z

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Landroidx/fragment/app/f;->e:I

    .line 4
    iput-object p1, p0, Landroidx/fragment/app/f;->a:Lo1/e;

    .line 5
    iput-object p2, p0, Landroidx/fragment/app/f;->b:Lo4/r;

    .line 6
    iput-object p3, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/b;

    return-void
.end method

.method public constructor <init>(Lo1/e;Lo4/r;Landroidx/fragment/app/b;Landroid/os/Bundle;)V
    .locals 2

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 21
    iput-boolean v0, p0, Landroidx/fragment/app/f;->d:Z

    const/4 v1, -0x1

    .line 22
    iput v1, p0, Landroidx/fragment/app/f;->e:I

    .line 23
    iput-object p1, p0, Landroidx/fragment/app/f;->a:Lo1/e;

    .line 24
    iput-object p2, p0, Landroidx/fragment/app/f;->b:Lo4/r;

    .line 25
    iput-object p3, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/b;

    const/4 p1, 0x0

    .line 26
    iput-object p1, p3, Landroidx/fragment/app/b;->u:Landroid/util/SparseArray;

    .line 27
    iput-object p1, p3, Landroidx/fragment/app/b;->v:Landroid/os/Bundle;

    .line 28
    iput v0, p3, Landroidx/fragment/app/b;->M:I

    .line 29
    iput-boolean v0, p3, Landroidx/fragment/app/b;->I:Z

    .line 30
    iput-boolean v0, p3, Landroidx/fragment/app/b;->D:Z

    .line 31
    iget-object p2, p3, Landroidx/fragment/app/b;->z:Landroidx/fragment/app/b;

    if-eqz p2, :cond_0

    iget-object p2, p2, Landroidx/fragment/app/b;->x:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object p2, p1

    :goto_0
    iput-object p2, p3, Landroidx/fragment/app/b;->A:Ljava/lang/String;

    .line 32
    iput-object p1, p3, Landroidx/fragment/app/b;->z:Landroidx/fragment/app/b;

    .line 33
    iput-object p4, p3, Landroidx/fragment/app/b;->t:Landroid/os/Bundle;

    .line 34
    const-string p1, "arguments"

    invoke-virtual {p4, p1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    iput-object p1, p3, Landroidx/fragment/app/b;->y:Landroid/os/Bundle;

    return-void
.end method

.method public constructor <init>(Lo1/e;Lo4/r;Ljava/lang/ClassLoader;Lq0/F;Landroid/os/Bundle;)V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Landroidx/fragment/app/f;->d:Z

    const/4 v0, -0x1

    .line 9
    iput v0, p0, Landroidx/fragment/app/f;->e:I

    .line 10
    iput-object p1, p0, Landroidx/fragment/app/f;->a:Lo1/e;

    .line 11
    iput-object p2, p0, Landroidx/fragment/app/f;->b:Lo4/r;

    .line 12
    const-string p1, "state"

    invoke-virtual {p5, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroidx/fragment/app/FragmentState;

    .line 13
    invoke-virtual {p1, p4}, Landroidx/fragment/app/FragmentState;->a(Lq0/F;)Landroidx/fragment/app/b;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/b;

    .line 14
    iput-object p5, p1, Landroidx/fragment/app/b;->t:Landroid/os/Bundle;

    .line 15
    const-string p2, "arguments"

    invoke-virtual {p5, p2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 16
    invoke-virtual {p2, p3}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 17
    :cond_0
    invoke-virtual {p1, p2}, Landroidx/fragment/app/b;->b0(Landroid/os/Bundle;)V

    const/4 p2, 0x2

    .line 18
    invoke-static {p2}, Landroidx/fragment/app/e;->K(I)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 19
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/e;->K(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    iget-object v2, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/b;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v1, v2, Landroidx/fragment/app/b;->t:Landroid/os/Bundle;

    .line 14
    .line 15
    const-string v3, "savedInstanceState"

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move-object v1, v4

    .line 26
    :goto_0
    iget-object v5, v2, Landroidx/fragment/app/b;->P:Lq0/M;

    .line 27
    .line 28
    invoke-virtual {v5}, Landroidx/fragment/app/e;->R()V

    .line 29
    .line 30
    .line 31
    iput v0, v2, Landroidx/fragment/app/b;->s:I

    .line 32
    .line 33
    const/4 v5, 0x0

    .line 34
    iput-boolean v5, v2, Landroidx/fragment/app/b;->a0:Z

    .line 35
    .line 36
    invoke-virtual {v2}, Landroidx/fragment/app/b;->z()V

    .line 37
    .line 38
    .line 39
    iget-boolean v6, v2, Landroidx/fragment/app/b;->a0:Z

    .line 40
    .line 41
    const-string v7, "Fragment "

    .line 42
    .line 43
    if-eqz v6, :cond_7

    .line 44
    .line 45
    invoke-static {v0}, Landroidx/fragment/app/e;->K(I)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    invoke-virtual {v2}, Landroidx/fragment/app/b;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    :cond_2
    iget-object v0, v2, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 55
    .line 56
    if-eqz v0, :cond_6

    .line 57
    .line 58
    iget-object v0, v2, Landroidx/fragment/app/b;->t:Landroid/os/Bundle;

    .line 59
    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    goto :goto_1

    .line 67
    :cond_3
    move-object v0, v4

    .line 68
    :goto_1
    iget-object v3, v2, Landroidx/fragment/app/b;->u:Landroid/util/SparseArray;

    .line 69
    .line 70
    if-eqz v3, :cond_4

    .line 71
    .line 72
    iget-object v6, v2, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 73
    .line 74
    invoke-virtual {v6, v3}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    .line 75
    .line 76
    .line 77
    iput-object v4, v2, Landroidx/fragment/app/b;->u:Landroid/util/SparseArray;

    .line 78
    .line 79
    :cond_4
    iput-boolean v5, v2, Landroidx/fragment/app/b;->a0:Z

    .line 80
    .line 81
    invoke-virtual {v2, v0}, Landroidx/fragment/app/b;->S(Landroid/os/Bundle;)V

    .line 82
    .line 83
    .line 84
    iget-boolean v0, v2, Landroidx/fragment/app/b;->a0:Z

    .line 85
    .line 86
    if-eqz v0, :cond_5

    .line 87
    .line 88
    iget-object v0, v2, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 89
    .line 90
    if-eqz v0, :cond_6

    .line 91
    .line 92
    iget-object v0, v2, Landroidx/fragment/app/b;->m0:Lq0/Q;

    .line 93
    .line 94
    sget-object v3, Landroidx/lifecycle/m;->ON_CREATE:Landroidx/lifecycle/m;

    .line 95
    .line 96
    invoke-virtual {v0, v3}, Lq0/Q;->b(Landroidx/lifecycle/m;)V

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_5
    new-instance v0, Lq0/W;

    .line 101
    .line 102
    const-string v1, " did not call through to super.onViewStateRestored()"

    .line 103
    .line 104
    invoke-static {v7, v2, v1}, Landroidx/datastore/preferences/protobuf/g;->i(Ljava/lang/String;Landroidx/fragment/app/b;Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw v0

    .line 112
    :cond_6
    :goto_2
    iput-object v4, v2, Landroidx/fragment/app/b;->t:Landroid/os/Bundle;

    .line 113
    .line 114
    iget-object v0, v2, Landroidx/fragment/app/b;->P:Lq0/M;

    .line 115
    .line 116
    iput-boolean v5, v0, Landroidx/fragment/app/e;->H:Z

    .line 117
    .line 118
    iput-boolean v5, v0, Landroidx/fragment/app/e;->I:Z

    .line 119
    .line 120
    iget-object v3, v0, Landroidx/fragment/app/e;->O:Lq0/N;

    .line 121
    .line 122
    iput-boolean v5, v3, Lq0/N;->g:Z

    .line 123
    .line 124
    const/4 v3, 0x4

    .line 125
    invoke-virtual {v0, v3}, Landroidx/fragment/app/e;->u(I)V

    .line 126
    .line 127
    .line 128
    iget-object v0, p0, Landroidx/fragment/app/f;->a:Lo1/e;

    .line 129
    .line 130
    invoke-virtual {v0, v2, v1, v5}, Lo1/e;->E0(Landroidx/fragment/app/b;Landroid/os/Bundle;Z)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :cond_7
    new-instance v0, Lq0/W;

    .line 135
    .line 136
    const-string v1, " did not call through to super.onActivityCreated()"

    .line 137
    .line 138
    invoke-static {v7, v2, v1}, Landroidx/datastore/preferences/protobuf/g;->i(Ljava/lang/String;Landroidx/fragment/app/b;Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw v0
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

.method public final b()V
    .locals 8

    .line 1
    const/4 v0, -0x1

    .line 2
    iget-object v1, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/b;

    .line 3
    .line 4
    iget-object v2, v1, Landroidx/fragment/app/b;->b0:Landroid/view/ViewGroup;

    .line 5
    .line 6
    :goto_0
    const/4 v3, 0x0

    .line 7
    if-eqz v2, :cond_3

    .line 8
    .line 9
    const v4, 0x7f0a0131

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    instance-of v5, v4, Landroidx/fragment/app/b;

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    check-cast v4, Landroidx/fragment/app/b;

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    move-object v4, v3

    .line 24
    :goto_1
    if-eqz v4, :cond_1

    .line 25
    .line 26
    move-object v3, v4

    .line 27
    goto :goto_2

    .line 28
    :cond_1
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    instance-of v4, v2, Landroid/view/View;

    .line 33
    .line 34
    if-eqz v4, :cond_2

    .line 35
    .line 36
    check-cast v2, Landroid/view/View;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    move-object v2, v3

    .line 40
    goto :goto_0

    .line 41
    :cond_3
    :goto_2
    iget-object v2, v1, Landroidx/fragment/app/b;->Q:Landroidx/fragment/app/b;

    .line 42
    .line 43
    if-eqz v3, :cond_4

    .line 44
    .line 45
    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-nez v2, :cond_4

    .line 50
    .line 51
    iget v2, v1, Landroidx/fragment/app/b;->S:I

    .line 52
    .line 53
    sget-object v4, Lr0/c;->a:Lr0/b;

    .line 54
    .line 55
    new-instance v4, Landroidx/fragment/app/strictmode/WrongNestedHierarchyViolation;

    .line 56
    .line 57
    new-instance v5, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    const-string v6, "Attempting to nest fragment "

    .line 60
    .line 61
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v6, " within the view of parent fragment "

    .line 68
    .line 69
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v3, " via container with ID "

    .line 76
    .line 77
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v3, " without using parent\'s childFragmentManager"

    .line 81
    .line 82
    invoke-static {v5, v2, v3}, LE0/a;->j(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-direct {v4, v1, v2}, Landroidx/fragment/app/strictmode/Violation;-><init>(Landroidx/fragment/app/b;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-static {v4}, Lr0/c;->b(Landroidx/fragment/app/strictmode/Violation;)V

    .line 90
    .line 91
    .line 92
    invoke-static {v1}, Lr0/c;->a(Landroidx/fragment/app/b;)Lr0/b;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    :cond_4
    iget-object v2, p0, Landroidx/fragment/app/f;->b:Lo4/r;

    .line 100
    .line 101
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    iget-object v3, v1, Landroidx/fragment/app/b;->b0:Landroid/view/ViewGroup;

    .line 105
    .line 106
    if-nez v3, :cond_5

    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_5
    iget-object v2, v2, Lo4/r;->t:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v2, Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    add-int/lit8 v5, v4, -0x1

    .line 118
    .line 119
    :goto_3
    if-ltz v5, :cond_7

    .line 120
    .line 121
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    check-cast v6, Landroidx/fragment/app/b;

    .line 126
    .line 127
    iget-object v7, v6, Landroidx/fragment/app/b;->b0:Landroid/view/ViewGroup;

    .line 128
    .line 129
    if-ne v7, v3, :cond_6

    .line 130
    .line 131
    iget-object v6, v6, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 132
    .line 133
    if-eqz v6, :cond_6

    .line 134
    .line 135
    invoke-virtual {v3, v6}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    add-int/lit8 v0, v0, 0x1

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_6
    add-int/2addr v5, v0

    .line 143
    goto :goto_3

    .line 144
    :cond_7
    add-int/lit8 v4, v4, 0x1

    .line 145
    .line 146
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    if-ge v4, v5, :cond_8

    .line 151
    .line 152
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    check-cast v5, Landroidx/fragment/app/b;

    .line 157
    .line 158
    iget-object v6, v5, Landroidx/fragment/app/b;->b0:Landroid/view/ViewGroup;

    .line 159
    .line 160
    if-ne v6, v3, :cond_7

    .line 161
    .line 162
    iget-object v5, v5, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 163
    .line 164
    if-eqz v5, :cond_7

    .line 165
    .line 166
    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    :cond_8
    :goto_4
    iget-object v2, v1, Landroidx/fragment/app/b;->b0:Landroid/view/ViewGroup;

    .line 171
    .line 172
    iget-object v1, v1, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 173
    .line 174
    invoke-virtual {v2, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 175
    .line 176
    .line 177
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

.method public final c()V
    .locals 7

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/e;->K(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/b;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, v1, Landroidx/fragment/app/b;->z:Landroidx/fragment/app/b;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const-string v3, " that does not belong to this FragmentManager!"

    .line 17
    .line 18
    const-string v4, " declared target fragment "

    .line 19
    .line 20
    iget-object v5, p0, Landroidx/fragment/app/f;->b:Lo4/r;

    .line 21
    .line 22
    const-string v6, "Fragment "

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    iget-object v0, v0, Landroidx/fragment/app/b;->x:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v5, v5, Lo4/r;->u:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v5, Ljava/util/HashMap;

    .line 31
    .line 32
    invoke-virtual {v5, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Landroidx/fragment/app/f;

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    iget-object v3, v1, Landroidx/fragment/app/b;->z:Landroidx/fragment/app/b;

    .line 41
    .line 42
    iget-object v3, v3, Landroidx/fragment/app/b;->x:Ljava/lang/String;

    .line 43
    .line 44
    iput-object v3, v1, Landroidx/fragment/app/b;->A:Ljava/lang/String;

    .line 45
    .line 46
    iput-object v2, v1, Landroidx/fragment/app/b;->z:Landroidx/fragment/app/b;

    .line 47
    .line 48
    move-object v2, v0

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    new-instance v2, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    iget-object v1, v1, Landroidx/fragment/app/b;->z:Landroidx/fragment/app/b;

    .line 64
    .line 65
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw v0

    .line 79
    :cond_2
    iget-object v0, v1, Landroidx/fragment/app/b;->A:Ljava/lang/String;

    .line 80
    .line 81
    if-eqz v0, :cond_4

    .line 82
    .line 83
    iget-object v2, v5, Lo4/r;->u:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v2, Ljava/util/HashMap;

    .line 86
    .line 87
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    move-object v2, v0

    .line 92
    check-cast v2, Landroidx/fragment/app/f;

    .line 93
    .line 94
    if-eqz v2, :cond_3

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 98
    .line 99
    new-instance v2, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    iget-object v1, v1, Landroidx/fragment/app/b;->A:Ljava/lang/String;

    .line 111
    .line 112
    invoke-static {v2, v1, v3}, LE0/a;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw v0

    .line 120
    :cond_4
    :goto_0
    if-eqz v2, :cond_5

    .line 121
    .line 122
    invoke-virtual {v2}, Landroidx/fragment/app/f;->k()V

    .line 123
    .line 124
    .line 125
    :cond_5
    iget-object v0, v1, Landroidx/fragment/app/b;->N:Landroidx/fragment/app/e;

    .line 126
    .line 127
    iget-object v2, v0, Landroidx/fragment/app/e;->w:Lq0/w;

    .line 128
    .line 129
    iput-object v2, v1, Landroidx/fragment/app/b;->O:Lq0/w;

    .line 130
    .line 131
    iget-object v0, v0, Landroidx/fragment/app/e;->y:Landroidx/fragment/app/b;

    .line 132
    .line 133
    iput-object v0, v1, Landroidx/fragment/app/b;->Q:Landroidx/fragment/app/b;

    .line 134
    .line 135
    iget-object v0, p0, Landroidx/fragment/app/f;->a:Lo1/e;

    .line 136
    .line 137
    const/4 v2, 0x0

    .line 138
    invoke-virtual {v0, v1, v2}, Lo1/e;->K0(Landroidx/fragment/app/b;Z)V

    .line 139
    .line 140
    .line 141
    iget-object v3, v1, Landroidx/fragment/app/b;->q0:Ljava/util/ArrayList;

    .line 142
    .line 143
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    if-eqz v5, :cond_6

    .line 152
    .line 153
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    check-cast v5, Lq0/u;

    .line 158
    .line 159
    invoke-virtual {v5}, Lq0/u;->a()V

    .line 160
    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_6
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 164
    .line 165
    .line 166
    iget-object v3, v1, Landroidx/fragment/app/b;->P:Lq0/M;

    .line 167
    .line 168
    iget-object v4, v1, Landroidx/fragment/app/b;->O:Lq0/w;

    .line 169
    .line 170
    invoke-virtual {v1}, Landroidx/fragment/app/b;->h()Lq0/y;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    invoke-virtual {v3, v4, v5, v1}, Landroidx/fragment/app/e;->b(Lq0/w;Lq0/y;Landroidx/fragment/app/b;)V

    .line 175
    .line 176
    .line 177
    iput v2, v1, Landroidx/fragment/app/b;->s:I

    .line 178
    .line 179
    iput-boolean v2, v1, Landroidx/fragment/app/b;->a0:Z

    .line 180
    .line 181
    iget-object v3, v1, Landroidx/fragment/app/b;->O:Lq0/w;

    .line 182
    .line 183
    iget-object v3, v3, Lq0/w;->t:Li/l;

    .line 184
    .line 185
    invoke-virtual {v1, v3}, Landroidx/fragment/app/b;->B(Li/l;)V

    .line 186
    .line 187
    .line 188
    iget-boolean v3, v1, Landroidx/fragment/app/b;->a0:Z

    .line 189
    .line 190
    if-eqz v3, :cond_8

    .line 191
    .line 192
    iget-object v3, v1, Landroidx/fragment/app/b;->N:Landroidx/fragment/app/e;

    .line 193
    .line 194
    iget-object v4, v3, Landroidx/fragment/app/e;->p:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 195
    .line 196
    invoke-virtual {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 201
    .line 202
    .line 203
    move-result v5

    .line 204
    if-eqz v5, :cond_7

    .line 205
    .line 206
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    check-cast v5, Lq0/O;

    .line 211
    .line 212
    invoke-interface {v5, v3, v1}, Lq0/O;->b(Landroidx/fragment/app/e;Landroidx/fragment/app/b;)V

    .line 213
    .line 214
    .line 215
    goto :goto_2

    .line 216
    :cond_7
    iget-object v3, v1, Landroidx/fragment/app/b;->P:Lq0/M;

    .line 217
    .line 218
    iput-boolean v2, v3, Landroidx/fragment/app/e;->H:Z

    .line 219
    .line 220
    iput-boolean v2, v3, Landroidx/fragment/app/e;->I:Z

    .line 221
    .line 222
    iget-object v4, v3, Landroidx/fragment/app/e;->O:Lq0/N;

    .line 223
    .line 224
    iput-boolean v2, v4, Lq0/N;->g:Z

    .line 225
    .line 226
    invoke-virtual {v3, v2}, Landroidx/fragment/app/e;->u(I)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0, v1, v2}, Lo1/e;->F0(Landroidx/fragment/app/b;Z)V

    .line 230
    .line 231
    .line 232
    return-void

    .line 233
    :cond_8
    new-instance v0, Lq0/W;

    .line 234
    .line 235
    const-string v2, " did not call through to super.onAttach()"

    .line 236
    .line 237
    invoke-static {v6, v1, v2}, Landroidx/datastore/preferences/protobuf/g;->i(Ljava/lang/String;Landroidx/fragment/app/b;Ljava/lang/String;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    throw v0
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

.method public final d()I
    .locals 12

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/b;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/fragment/app/b;->N:Landroidx/fragment/app/e;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget v0, v0, Landroidx/fragment/app/b;->s:I

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    iget v1, p0, Landroidx/fragment/app/f;->e:I

    .line 11
    .line 12
    iget-object v2, v0, Landroidx/fragment/app/b;->k0:Landroidx/lifecycle/n;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x2

    .line 19
    const/4 v4, 0x3

    .line 20
    const/4 v5, 0x0

    .line 21
    const/4 v6, 0x5

    .line 22
    const/4 v7, -0x1

    .line 23
    const/4 v8, 0x4

    .line 24
    const/4 v9, 0x1

    .line 25
    if-eq v2, v9, :cond_3

    .line 26
    .line 27
    if-eq v2, v3, :cond_2

    .line 28
    .line 29
    if-eq v2, v4, :cond_1

    .line 30
    .line 31
    if-eq v2, v8, :cond_4

    .line 32
    .line 33
    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-static {v1, v6}, Ljava/lang/Math;->min(II)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-static {v1, v9}, Ljava/lang/Math;->min(II)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    goto :goto_0

    .line 48
    :cond_3
    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    :cond_4
    :goto_0
    iget-boolean v2, v0, Landroidx/fragment/app/b;->H:Z

    .line 53
    .line 54
    if-eqz v2, :cond_7

    .line 55
    .line 56
    iget-boolean v2, v0, Landroidx/fragment/app/b;->I:Z

    .line 57
    .line 58
    if-eqz v2, :cond_5

    .line 59
    .line 60
    iget v1, p0, Landroidx/fragment/app/f;->e:I

    .line 61
    .line 62
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    iget-object v2, v0, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 67
    .line 68
    if-eqz v2, :cond_7

    .line 69
    .line 70
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    if-nez v2, :cond_7

    .line 75
    .line 76
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    goto :goto_1

    .line 81
    :cond_5
    iget v2, p0, Landroidx/fragment/app/f;->e:I

    .line 82
    .line 83
    if-ge v2, v8, :cond_6

    .line 84
    .line 85
    iget v2, v0, Landroidx/fragment/app/b;->s:I

    .line 86
    .line 87
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    goto :goto_1

    .line 92
    :cond_6
    invoke-static {v1, v9}, Ljava/lang/Math;->min(II)I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    :cond_7
    :goto_1
    iget-boolean v2, v0, Landroidx/fragment/app/b;->J:Z

    .line 97
    .line 98
    if-eqz v2, :cond_8

    .line 99
    .line 100
    iget-object v2, v0, Landroidx/fragment/app/b;->b0:Landroid/view/ViewGroup;

    .line 101
    .line 102
    if-nez v2, :cond_8

    .line 103
    .line 104
    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    :cond_8
    iget-boolean v2, v0, Landroidx/fragment/app/b;->D:Z

    .line 109
    .line 110
    if-nez v2, :cond_9

    .line 111
    .line 112
    invoke-static {v1, v9}, Ljava/lang/Math;->min(II)I

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    :cond_9
    iget-object v2, v0, Landroidx/fragment/app/b;->b0:Landroid/view/ViewGroup;

    .line 117
    .line 118
    if-eqz v2, :cond_d

    .line 119
    .line 120
    invoke-virtual {v0}, Landroidx/fragment/app/b;->p()Landroidx/fragment/app/e;

    .line 121
    .line 122
    .line 123
    move-result-object v10

    .line 124
    invoke-static {v2, v10}, Lq0/k;->i(Landroid/view/ViewGroup;Landroidx/fragment/app/e;)Lq0/k;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v0}, Lq0/k;->f(Landroidx/fragment/app/b;)Lq0/U;

    .line 132
    .line 133
    .line 134
    move-result-object v10

    .line 135
    if-eqz v10, :cond_a

    .line 136
    .line 137
    iget v10, v10, Lq0/U;->b:I

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_a
    move v10, v5

    .line 141
    :goto_2
    invoke-virtual {v2, v0}, Lq0/k;->g(Landroidx/fragment/app/b;)Lq0/U;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    if-eqz v2, :cond_b

    .line 146
    .line 147
    iget v5, v2, Lq0/U;->b:I

    .line 148
    .line 149
    :cond_b
    if-nez v10, :cond_c

    .line 150
    .line 151
    move v2, v7

    .line 152
    goto :goto_3

    .line 153
    :cond_c
    sget-object v2, Lq0/V;->a:[I

    .line 154
    .line 155
    invoke-static {v10}, Lz/e;->d(I)I

    .line 156
    .line 157
    .line 158
    move-result v11

    .line 159
    aget v2, v2, v11

    .line 160
    .line 161
    :goto_3
    if-eq v2, v7, :cond_d

    .line 162
    .line 163
    if-eq v2, v9, :cond_d

    .line 164
    .line 165
    move v5, v10

    .line 166
    :cond_d
    if-ne v5, v3, :cond_e

    .line 167
    .line 168
    const/4 v2, 0x6

    .line 169
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    goto :goto_4

    .line 174
    :cond_e
    if-ne v5, v4, :cond_f

    .line 175
    .line 176
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    goto :goto_4

    .line 181
    :cond_f
    iget-boolean v2, v0, Landroidx/fragment/app/b;->E:Z

    .line 182
    .line 183
    if-eqz v2, :cond_11

    .line 184
    .line 185
    invoke-virtual {v0}, Landroidx/fragment/app/b;->x()Z

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    if-eqz v2, :cond_10

    .line 190
    .line 191
    invoke-static {v1, v9}, Ljava/lang/Math;->min(II)I

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    goto :goto_4

    .line 196
    :cond_10
    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    :cond_11
    :goto_4
    iget-boolean v2, v0, Landroidx/fragment/app/b;->d0:Z

    .line 201
    .line 202
    if-eqz v2, :cond_12

    .line 203
    .line 204
    iget v2, v0, Landroidx/fragment/app/b;->s:I

    .line 205
    .line 206
    if-ge v2, v6, :cond_12

    .line 207
    .line 208
    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    :cond_12
    iget-boolean v2, v0, Landroidx/fragment/app/b;->F:Z

    .line 213
    .line 214
    if-eqz v2, :cond_13

    .line 215
    .line 216
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    :cond_13
    invoke-static {v3}, Landroidx/fragment/app/e;->K(I)Z

    .line 221
    .line 222
    .line 223
    move-result v2

    .line 224
    if-eqz v2, :cond_14

    .line 225
    .line 226
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    :cond_14
    return v1
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

.method public final e()V
    .locals 8

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/e;->K(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/b;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, v1, Landroidx/fragment/app/b;->t:Landroid/os/Bundle;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const-string v2, "savedInstanceState"

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/4 v0, 0x0

    .line 25
    :goto_0
    iget-boolean v2, v1, Landroidx/fragment/app/b;->i0:Z

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    if-nez v2, :cond_3

    .line 29
    .line 30
    iget-object v2, p0, Landroidx/fragment/app/f;->a:Lo1/e;

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-virtual {v2, v1, v0, v4}, Lo1/e;->L0(Landroidx/fragment/app/b;Landroid/os/Bundle;Z)V

    .line 34
    .line 35
    .line 36
    iget-object v5, v1, Landroidx/fragment/app/b;->P:Lq0/M;

    .line 37
    .line 38
    invoke-virtual {v5}, Landroidx/fragment/app/e;->R()V

    .line 39
    .line 40
    .line 41
    iput v3, v1, Landroidx/fragment/app/b;->s:I

    .line 42
    .line 43
    iput-boolean v4, v1, Landroidx/fragment/app/b;->a0:Z

    .line 44
    .line 45
    iget-object v5, v1, Landroidx/fragment/app/b;->l0:Landroidx/lifecycle/u;

    .line 46
    .line 47
    new-instance v6, LN0/b;

    .line 48
    .line 49
    const/4 v7, 0x5

    .line 50
    invoke-direct {v6, v1, v7}, LN0/b;-><init>(Ljava/lang/Object;I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v5, v6}, Landroidx/lifecycle/u;->a(Landroidx/lifecycle/r;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v0}, Landroidx/fragment/app/b;->C(Landroid/os/Bundle;)V

    .line 57
    .line 58
    .line 59
    iput-boolean v3, v1, Landroidx/fragment/app/b;->i0:Z

    .line 60
    .line 61
    iget-boolean v3, v1, Landroidx/fragment/app/b;->a0:Z

    .line 62
    .line 63
    if-eqz v3, :cond_2

    .line 64
    .line 65
    iget-object v3, v1, Landroidx/fragment/app/b;->l0:Landroidx/lifecycle/u;

    .line 66
    .line 67
    sget-object v5, Landroidx/lifecycle/m;->ON_CREATE:Landroidx/lifecycle/m;

    .line 68
    .line 69
    invoke-virtual {v3, v5}, Landroidx/lifecycle/u;->d(Landroidx/lifecycle/m;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, v1, v0, v4}, Lo1/e;->G0(Landroidx/fragment/app/b;Landroid/os/Bundle;Z)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_2
    new-instance v0, Lq0/W;

    .line 77
    .line 78
    const-string v2, "Fragment "

    .line 79
    .line 80
    const-string v3, " did not call through to super.onCreate()"

    .line 81
    .line 82
    invoke-static {v2, v1, v3}, Landroidx/datastore/preferences/protobuf/g;->i(Ljava/lang/String;Landroidx/fragment/app/b;Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw v0

    .line 90
    :cond_3
    iput v3, v1, Landroidx/fragment/app/b;->s:I

    .line 91
    .line 92
    invoke-virtual {v1}, Landroidx/fragment/app/b;->Z()V

    .line 93
    .line 94
    .line 95
    return-void
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
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

.method public final f()V
    .locals 11

    .line 1
    const/4 v0, 0x2

    .line 2
    iget-object v1, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/b;

    .line 3
    .line 4
    iget-boolean v2, v1, Landroidx/fragment/app/b;->H:Z

    .line 5
    .line 6
    if-eqz v2, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const/4 v2, 0x3

    .line 10
    invoke-static {v2}, Landroidx/fragment/app/e;->K(I)Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    :cond_1
    iget-object v3, v1, Landroidx/fragment/app/b;->t:Landroid/os/Bundle;

    .line 20
    .line 21
    const-string v4, "savedInstanceState"

    .line 22
    .line 23
    const/4 v5, 0x0

    .line 24
    if-eqz v3, :cond_2

    .line 25
    .line 26
    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    goto :goto_0

    .line 31
    :cond_2
    move-object v3, v5

    .line 32
    :goto_0
    invoke-virtual {v1, v3}, Landroidx/fragment/app/b;->I(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    iput-object v6, v1, Landroidx/fragment/app/b;->h0:Landroid/view/LayoutInflater;

    .line 37
    .line 38
    iget-object v7, v1, Landroidx/fragment/app/b;->b0:Landroid/view/ViewGroup;

    .line 39
    .line 40
    if-eqz v7, :cond_3

    .line 41
    .line 42
    goto/16 :goto_2

    .line 43
    .line 44
    :cond_3
    iget v7, v1, Landroidx/fragment/app/b;->S:I

    .line 45
    .line 46
    if-eqz v7, :cond_7

    .line 47
    .line 48
    const/4 v8, -0x1

    .line 49
    if-eq v7, v8, :cond_6

    .line 50
    .line 51
    iget-object v8, v1, Landroidx/fragment/app/b;->N:Landroidx/fragment/app/e;

    .line 52
    .line 53
    iget-object v8, v8, Landroidx/fragment/app/e;->x:Lq0/y;

    .line 54
    .line 55
    invoke-virtual {v8, v7}, Lq0/y;->c(I)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    check-cast v7, Landroid/view/ViewGroup;

    .line 60
    .line 61
    if-nez v7, :cond_5

    .line 62
    .line 63
    iget-boolean v8, v1, Landroidx/fragment/app/b;->K:Z

    .line 64
    .line 65
    if-nez v8, :cond_8

    .line 66
    .line 67
    iget-boolean v8, v1, Landroidx/fragment/app/b;->J:Z

    .line 68
    .line 69
    if-eqz v8, :cond_4

    .line 70
    .line 71
    goto/16 :goto_2

    .line 72
    .line 73
    :cond_4
    :try_start_0
    invoke-virtual {v1}, Landroidx/fragment/app/b;->q()Landroid/content/res/Resources;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iget v2, v1, Landroidx/fragment/app/b;->S:I

    .line 78
    .line 79
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    goto :goto_1

    .line 84
    :catch_0
    const-string v0, "unknown"

    .line 85
    .line 86
    :goto_1
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 87
    .line 88
    new-instance v3, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    const-string v4, "No view found for id 0x"

    .line 91
    .line 92
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    iget v4, v1, Landroidx/fragment/app/b;->S:I

    .line 96
    .line 97
    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v4, " ("

    .line 105
    .line 106
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v0, ") for fragment "

    .line 113
    .line 114
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw v2

    .line 128
    :cond_5
    instance-of v8, v7, Landroidx/fragment/app/FragmentContainerView;

    .line 129
    .line 130
    if-nez v8, :cond_8

    .line 131
    .line 132
    sget-object v8, Lr0/c;->a:Lr0/b;

    .line 133
    .line 134
    new-instance v8, Landroidx/fragment/app/strictmode/WrongFragmentContainerViolation;

    .line 135
    .line 136
    new-instance v9, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    const-string v10, "Attempting to add fragment "

    .line 139
    .line 140
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    const-string v10, " to container "

    .line 147
    .line 148
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const-string v10, " which is not a FragmentContainerView"

    .line 155
    .line 156
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v9

    .line 163
    invoke-direct {v8, v1, v9}, Landroidx/fragment/app/strictmode/Violation;-><init>(Landroidx/fragment/app/b;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    invoke-static {v8}, Lr0/c;->b(Landroidx/fragment/app/strictmode/Violation;)V

    .line 167
    .line 168
    .line 169
    invoke-static {v1}, Lr0/c;->a(Landroidx/fragment/app/b;)Lr0/b;

    .line 170
    .line 171
    .line 172
    move-result-object v8

    .line 173
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 178
    .line 179
    const-string v2, "Cannot create fragment "

    .line 180
    .line 181
    const-string v3, " for a container view with no id"

    .line 182
    .line 183
    invoke-static {v2, v1, v3}, Landroidx/datastore/preferences/protobuf/g;->i(Ljava/lang/String;Landroidx/fragment/app/b;Ljava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    throw v0

    .line 191
    :cond_7
    move-object v7, v5

    .line 192
    :cond_8
    :goto_2
    iput-object v7, v1, Landroidx/fragment/app/b;->b0:Landroid/view/ViewGroup;

    .line 193
    .line 194
    invoke-virtual {v1, v6, v7, v3}, Landroidx/fragment/app/b;->T(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    .line 195
    .line 196
    .line 197
    iget-object v6, v1, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 198
    .line 199
    if-eqz v6, :cond_f

    .line 200
    .line 201
    invoke-static {v2}, Landroidx/fragment/app/e;->K(I)Z

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    if-eqz v2, :cond_9

    .line 206
    .line 207
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    :cond_9
    iget-object v2, v1, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 211
    .line 212
    const/4 v6, 0x0

    .line 213
    invoke-virtual {v2, v6}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    .line 214
    .line 215
    .line 216
    iget-object v2, v1, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 217
    .line 218
    const v8, 0x7f0a0131

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2, v8, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    if-eqz v7, :cond_a

    .line 225
    .line 226
    invoke-virtual {p0}, Landroidx/fragment/app/f;->b()V

    .line 227
    .line 228
    .line 229
    :cond_a
    iget-boolean v2, v1, Landroidx/fragment/app/b;->U:Z

    .line 230
    .line 231
    if-eqz v2, :cond_b

    .line 232
    .line 233
    iget-object v2, v1, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 234
    .line 235
    const/16 v7, 0x8

    .line 236
    .line 237
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 238
    .line 239
    .line 240
    :cond_b
    iget-object v2, v1, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 241
    .line 242
    invoke-virtual {v2}, Landroid/view/View;->isAttachedToWindow()Z

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    if-eqz v2, :cond_c

    .line 247
    .line 248
    iget-object v2, v1, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 249
    .line 250
    sget-object v7, LU/U;->a:Ljava/util/WeakHashMap;

    .line 251
    .line 252
    invoke-static {v2}, LU/F;->c(Landroid/view/View;)V

    .line 253
    .line 254
    .line 255
    goto :goto_3

    .line 256
    :cond_c
    iget-object v2, v1, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 257
    .line 258
    new-instance v7, Lo/d;

    .line 259
    .line 260
    invoke-direct {v7, v2, v0}, Lo/d;-><init>(Ljava/lang/Object;I)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2, v7}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 264
    .line 265
    .line 266
    :goto_3
    iget-object v2, v1, Landroidx/fragment/app/b;->t:Landroid/os/Bundle;

    .line 267
    .line 268
    if-eqz v2, :cond_d

    .line 269
    .line 270
    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 271
    .line 272
    .line 273
    move-result-object v5

    .line 274
    :cond_d
    iget-object v2, v1, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 275
    .line 276
    invoke-virtual {v1, v2, v5}, Landroidx/fragment/app/b;->R(Landroid/view/View;Landroid/os/Bundle;)V

    .line 277
    .line 278
    .line 279
    iget-object v2, v1, Landroidx/fragment/app/b;->P:Lq0/M;

    .line 280
    .line 281
    invoke-virtual {v2, v0}, Landroidx/fragment/app/e;->u(I)V

    .line 282
    .line 283
    .line 284
    iget-object v2, p0, Landroidx/fragment/app/f;->a:Lo1/e;

    .line 285
    .line 286
    iget-object v4, v1, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 287
    .line 288
    invoke-virtual {v2, v1, v4, v3, v6}, Lo1/e;->Q0(Landroidx/fragment/app/b;Landroid/view/View;Landroid/os/Bundle;Z)V

    .line 289
    .line 290
    .line 291
    iget-object v2, v1, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 292
    .line 293
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 294
    .line 295
    .line 296
    move-result v2

    .line 297
    iget-object v3, v1, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 298
    .line 299
    invoke-virtual {v3}, Landroid/view/View;->getAlpha()F

    .line 300
    .line 301
    .line 302
    move-result v3

    .line 303
    invoke-virtual {v1}, Landroidx/fragment/app/b;->j()Lq0/t;

    .line 304
    .line 305
    .line 306
    move-result-object v4

    .line 307
    iput v3, v4, Lq0/t;->j:F

    .line 308
    .line 309
    iget-object v3, v1, Landroidx/fragment/app/b;->b0:Landroid/view/ViewGroup;

    .line 310
    .line 311
    if-eqz v3, :cond_f

    .line 312
    .line 313
    if-nez v2, :cond_f

    .line 314
    .line 315
    iget-object v2, v1, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 316
    .line 317
    invoke-virtual {v2}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    if-eqz v2, :cond_e

    .line 322
    .line 323
    invoke-virtual {v1}, Landroidx/fragment/app/b;->j()Lq0/t;

    .line 324
    .line 325
    .line 326
    move-result-object v3

    .line 327
    iput-object v2, v3, Lq0/t;->k:Landroid/view/View;

    .line 328
    .line 329
    invoke-static {v0}, Landroidx/fragment/app/e;->K(I)Z

    .line 330
    .line 331
    .line 332
    move-result v3

    .line 333
    if-eqz v3, :cond_e

    .line 334
    .line 335
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    :cond_e
    iget-object v2, v1, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 342
    .line 343
    const/4 v3, 0x0

    .line 344
    invoke-virtual {v2, v3}, Landroid/view/View;->setAlpha(F)V

    .line 345
    .line 346
    .line 347
    :cond_f
    iput v0, v1, Landroidx/fragment/app/b;->s:I

    .line 348
    .line 349
    return-void
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
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
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
.end method

.method public final g()V
    .locals 10

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/e;->K(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    iget-object v2, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/b;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-boolean v1, v2, Landroidx/fragment/app/b;->E:Z

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    const/4 v4, 0x0

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {v2}, Landroidx/fragment/app/b;->x()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    move v1, v3

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move v1, v4

    .line 28
    :goto_0
    const/4 v5, 0x0

    .line 29
    iget-object v6, p0, Landroidx/fragment/app/f;->b:Lo4/r;

    .line 30
    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    iget-boolean v7, v2, Landroidx/fragment/app/b;->G:Z

    .line 34
    .line 35
    if-nez v7, :cond_2

    .line 36
    .line 37
    iget-object v7, v2, Landroidx/fragment/app/b;->x:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v6, v7, v5}, Lo4/r;->A(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 40
    .line 41
    .line 42
    :cond_2
    if-nez v1, :cond_7

    .line 43
    .line 44
    iget-object v7, v6, Lo4/r;->w:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v7, Lq0/N;

    .line 47
    .line 48
    iget-object v8, v7, Lq0/N;->b:Ljava/util/HashMap;

    .line 49
    .line 50
    iget-object v9, v2, Landroidx/fragment/app/b;->x:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v8, v9}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    if-nez v8, :cond_3

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    iget-boolean v8, v7, Lq0/N;->e:Z

    .line 60
    .line 61
    if-eqz v8, :cond_4

    .line 62
    .line 63
    iget-boolean v7, v7, Lq0/N;->f:Z

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_4
    :goto_1
    move v7, v3

    .line 67
    :goto_2
    if-eqz v7, :cond_5

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_5
    iget-object v0, v2, Landroidx/fragment/app/b;->A:Ljava/lang/String;

    .line 71
    .line 72
    if-eqz v0, :cond_6

    .line 73
    .line 74
    invoke-virtual {v6, v0}, Lo4/r;->g(Ljava/lang/String;)Landroidx/fragment/app/b;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-eqz v0, :cond_6

    .line 79
    .line 80
    iget-boolean v1, v0, Landroidx/fragment/app/b;->W:Z

    .line 81
    .line 82
    if-eqz v1, :cond_6

    .line 83
    .line 84
    iput-object v0, v2, Landroidx/fragment/app/b;->z:Landroidx/fragment/app/b;

    .line 85
    .line 86
    :cond_6
    iput v4, v2, Landroidx/fragment/app/b;->s:I

    .line 87
    .line 88
    return-void

    .line 89
    :cond_7
    :goto_3
    iget-object v7, v2, Landroidx/fragment/app/b;->O:Lq0/w;

    .line 90
    .line 91
    instance-of v8, v7, Landroidx/lifecycle/W;

    .line 92
    .line 93
    if-eqz v8, :cond_8

    .line 94
    .line 95
    iget-object v3, v6, Lo4/r;->w:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v3, Lq0/N;

    .line 98
    .line 99
    iget-boolean v3, v3, Lq0/N;->f:Z

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_8
    iget-object v7, v7, Lq0/w;->t:Li/l;

    .line 103
    .line 104
    instance-of v8, v7, Landroid/app/Activity;

    .line 105
    .line 106
    if-eqz v8, :cond_9

    .line 107
    .line 108
    invoke-virtual {v7}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    xor-int/2addr v3, v7

    .line 113
    :cond_9
    :goto_4
    if-eqz v1, :cond_a

    .line 114
    .line 115
    iget-boolean v1, v2, Landroidx/fragment/app/b;->G:Z

    .line 116
    .line 117
    if-eqz v1, :cond_b

    .line 118
    .line 119
    :cond_a
    if-eqz v3, :cond_d

    .line 120
    .line 121
    :cond_b
    iget-object v1, v6, Lo4/r;->w:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v1, Lq0/N;

    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-static {v0}, Landroidx/fragment/app/e;->K(I)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_c

    .line 133
    .line 134
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    :cond_c
    iget-object v0, v2, Landroidx/fragment/app/b;->x:Ljava/lang/String;

    .line 138
    .line 139
    invoke-virtual {v1, v0, v4}, Lq0/N;->e(Ljava/lang/String;Z)V

    .line 140
    .line 141
    .line 142
    :cond_d
    iget-object v0, v2, Landroidx/fragment/app/b;->P:Lq0/M;

    .line 143
    .line 144
    invoke-virtual {v0}, Landroidx/fragment/app/e;->l()V

    .line 145
    .line 146
    .line 147
    iget-object v0, v2, Landroidx/fragment/app/b;->l0:Landroidx/lifecycle/u;

    .line 148
    .line 149
    sget-object v1, Landroidx/lifecycle/m;->ON_DESTROY:Landroidx/lifecycle/m;

    .line 150
    .line 151
    invoke-virtual {v0, v1}, Landroidx/lifecycle/u;->d(Landroidx/lifecycle/m;)V

    .line 152
    .line 153
    .line 154
    iput v4, v2, Landroidx/fragment/app/b;->s:I

    .line 155
    .line 156
    iput-boolean v4, v2, Landroidx/fragment/app/b;->a0:Z

    .line 157
    .line 158
    iput-boolean v4, v2, Landroidx/fragment/app/b;->i0:Z

    .line 159
    .line 160
    invoke-virtual {v2}, Landroidx/fragment/app/b;->F()V

    .line 161
    .line 162
    .line 163
    iget-boolean v0, v2, Landroidx/fragment/app/b;->a0:Z

    .line 164
    .line 165
    if-eqz v0, :cond_11

    .line 166
    .line 167
    iget-object v0, p0, Landroidx/fragment/app/f;->a:Lo1/e;

    .line 168
    .line 169
    invoke-virtual {v0, v2, v4}, Lo1/e;->H0(Landroidx/fragment/app/b;Z)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v6}, Lo4/r;->j()Ljava/util/ArrayList;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    :cond_e
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    if-eqz v1, :cond_f

    .line 185
    .line 186
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    check-cast v1, Landroidx/fragment/app/f;

    .line 191
    .line 192
    if-eqz v1, :cond_e

    .line 193
    .line 194
    iget-object v3, v2, Landroidx/fragment/app/b;->x:Ljava/lang/String;

    .line 195
    .line 196
    iget-object v1, v1, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/b;

    .line 197
    .line 198
    iget-object v4, v1, Landroidx/fragment/app/b;->A:Ljava/lang/String;

    .line 199
    .line 200
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    if-eqz v3, :cond_e

    .line 205
    .line 206
    iput-object v2, v1, Landroidx/fragment/app/b;->z:Landroidx/fragment/app/b;

    .line 207
    .line 208
    iput-object v5, v1, Landroidx/fragment/app/b;->A:Ljava/lang/String;

    .line 209
    .line 210
    goto :goto_5

    .line 211
    :cond_f
    iget-object v0, v2, Landroidx/fragment/app/b;->A:Ljava/lang/String;

    .line 212
    .line 213
    if-eqz v0, :cond_10

    .line 214
    .line 215
    invoke-virtual {v6, v0}, Lo4/r;->g(Ljava/lang/String;)Landroidx/fragment/app/b;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    iput-object v0, v2, Landroidx/fragment/app/b;->z:Landroidx/fragment/app/b;

    .line 220
    .line 221
    :cond_10
    invoke-virtual {v6, p0}, Lo4/r;->y(Landroidx/fragment/app/f;)V

    .line 222
    .line 223
    .line 224
    return-void

    .line 225
    :cond_11
    new-instance v0, Lq0/W;

    .line 226
    .line 227
    const-string v1, "Fragment "

    .line 228
    .line 229
    const-string v3, " did not call through to super.onDestroy()"

    .line 230
    .line 231
    invoke-static {v1, v2, v3}, Landroidx/datastore/preferences/protobuf/g;->i(Ljava/lang/String;Landroidx/fragment/app/b;Ljava/lang/String;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    throw v0
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

.method public final h()V
    .locals 6

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/e;->K(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/b;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, v1, Landroidx/fragment/app/b;->b0:Landroid/view/ViewGroup;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v2, v1, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    iget-object v0, v1, Landroidx/fragment/app/b;->P:Lq0/M;

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    invoke-virtual {v0, v2}, Landroidx/fragment/app/e;->u(I)V

    .line 28
    .line 29
    .line 30
    iget-object v0, v1, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    iget-object v0, v1, Landroidx/fragment/app/b;->m0:Lq0/Q;

    .line 35
    .line 36
    invoke-virtual {v0}, Lq0/Q;->c()V

    .line 37
    .line 38
    .line 39
    iget-object v0, v0, Lq0/Q;->v:Landroidx/lifecycle/u;

    .line 40
    .line 41
    iget-object v0, v0, Landroidx/lifecycle/u;->c:Landroidx/lifecycle/n;

    .line 42
    .line 43
    sget-object v3, Landroidx/lifecycle/n;->u:Landroidx/lifecycle/n;

    .line 44
    .line 45
    invoke-virtual {v0, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-ltz v0, :cond_2

    .line 50
    .line 51
    iget-object v0, v1, Landroidx/fragment/app/b;->m0:Lq0/Q;

    .line 52
    .line 53
    sget-object v3, Landroidx/lifecycle/m;->ON_DESTROY:Landroidx/lifecycle/m;

    .line 54
    .line 55
    invoke-virtual {v0, v3}, Lq0/Q;->b(Landroidx/lifecycle/m;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    iput v2, v1, Landroidx/fragment/app/b;->s:I

    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    iput-boolean v0, v1, Landroidx/fragment/app/b;->a0:Z

    .line 62
    .line 63
    invoke-virtual {v1}, Landroidx/fragment/app/b;->G()V

    .line 64
    .line 65
    .line 66
    iget-boolean v2, v1, Landroidx/fragment/app/b;->a0:Z

    .line 67
    .line 68
    if-eqz v2, :cond_5

    .line 69
    .line 70
    invoke-interface {v1}, Landroidx/lifecycle/W;->e()Landroidx/lifecycle/V;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    sget-object v3, Lw0/a;->c:Lv1/g;

    .line 75
    .line 76
    const-string v4, "store"

    .line 77
    .line 78
    invoke-static {v2, v4}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    sget-object v4, Lu0/a;->t:Lu0/a;

    .line 82
    .line 83
    const-string v5, "defaultCreationExtras"

    .line 84
    .line 85
    invoke-static {v4, v5}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    new-instance v5, LY1/c;

    .line 89
    .line 90
    invoke-direct {v5, v2, v3, v4}, LY1/c;-><init>(Landroidx/lifecycle/V;Landroidx/lifecycle/T;LB1/a;)V

    .line 91
    .line 92
    .line 93
    const-class v2, Lw0/a;

    .line 94
    .line 95
    invoke-static {v2}, Lga/d;->r(Ljava/lang/Class;)LC8/c;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-interface {v2}, LC8/c;->s()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    if-eqz v3, :cond_4

    .line 104
    .line 105
    const-string v4, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 106
    .line 107
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-virtual {v5, v3, v2}, LY1/c;->A(Ljava/lang/String;LC8/c;)Landroidx/lifecycle/Q;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    check-cast v2, Lw0/a;

    .line 116
    .line 117
    iget-object v2, v2, Lw0/a;->b:Lw/j;

    .line 118
    .line 119
    invoke-virtual {v2}, Lw/j;->h()I

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    if-gtz v3, :cond_3

    .line 124
    .line 125
    iput-boolean v0, v1, Landroidx/fragment/app/b;->L:Z

    .line 126
    .line 127
    iget-object v2, p0, Landroidx/fragment/app/f;->a:Lo1/e;

    .line 128
    .line 129
    invoke-virtual {v2, v1, v0}, Lo1/e;->R0(Landroidx/fragment/app/b;Z)V

    .line 130
    .line 131
    .line 132
    const/4 v2, 0x0

    .line 133
    iput-object v2, v1, Landroidx/fragment/app/b;->b0:Landroid/view/ViewGroup;

    .line 134
    .line 135
    iput-object v2, v1, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 136
    .line 137
    iput-object v2, v1, Landroidx/fragment/app/b;->m0:Lq0/Q;

    .line 138
    .line 139
    iget-object v3, v1, Landroidx/fragment/app/b;->n0:Landroidx/lifecycle/A;

    .line 140
    .line 141
    invoke-virtual {v3, v2}, Landroidx/lifecycle/A;->e(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    iput-boolean v0, v1, Landroidx/fragment/app/b;->I:Z

    .line 145
    .line 146
    return-void

    .line 147
    :cond_3
    invoke-virtual {v2, v0}, Lw/j;->i(I)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    new-instance v0, Ljava/lang/ClassCastException;

    .line 155
    .line 156
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 157
    .line 158
    .line 159
    throw v0

    .line 160
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 161
    .line 162
    const-string v1, "Local and anonymous classes can not be ViewModels"

    .line 163
    .line 164
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    throw v0

    .line 168
    :cond_5
    new-instance v0, Lq0/W;

    .line 169
    .line 170
    const-string v2, "Fragment "

    .line 171
    .line 172
    const-string v3, " did not call through to super.onDestroyView()"

    .line 173
    .line 174
    invoke-static {v2, v1, v3}, Landroidx/datastore/preferences/protobuf/g;->i(Ljava/lang/String;Landroidx/fragment/app/b;Ljava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    throw v0
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

.method public final i()V
    .locals 7

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/e;->K(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    iget-object v2, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/b;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    :cond_0
    const/4 v1, -0x1

    .line 14
    iput v1, v2, Landroidx/fragment/app/b;->s:I

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    iput-boolean v3, v2, Landroidx/fragment/app/b;->a0:Z

    .line 18
    .line 19
    invoke-virtual {v2}, Landroidx/fragment/app/b;->H()V

    .line 20
    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    iput-object v4, v2, Landroidx/fragment/app/b;->h0:Landroid/view/LayoutInflater;

    .line 24
    .line 25
    iget-boolean v5, v2, Landroidx/fragment/app/b;->a0:Z

    .line 26
    .line 27
    if-eqz v5, :cond_7

    .line 28
    .line 29
    iget-object v5, v2, Landroidx/fragment/app/b;->P:Lq0/M;

    .line 30
    .line 31
    iget-boolean v6, v5, Landroidx/fragment/app/e;->J:Z

    .line 32
    .line 33
    if-nez v6, :cond_1

    .line 34
    .line 35
    invoke-virtual {v5}, Landroidx/fragment/app/e;->l()V

    .line 36
    .line 37
    .line 38
    new-instance v5, Lq0/M;

    .line 39
    .line 40
    invoke-direct {v5}, Landroidx/fragment/app/e;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v5, v2, Landroidx/fragment/app/b;->P:Lq0/M;

    .line 44
    .line 45
    :cond_1
    iget-object v5, p0, Landroidx/fragment/app/f;->a:Lo1/e;

    .line 46
    .line 47
    invoke-virtual {v5, v2, v3}, Lo1/e;->I0(Landroidx/fragment/app/b;Z)V

    .line 48
    .line 49
    .line 50
    iput v1, v2, Landroidx/fragment/app/b;->s:I

    .line 51
    .line 52
    iput-object v4, v2, Landroidx/fragment/app/b;->O:Lq0/w;

    .line 53
    .line 54
    iput-object v4, v2, Landroidx/fragment/app/b;->Q:Landroidx/fragment/app/b;

    .line 55
    .line 56
    iput-object v4, v2, Landroidx/fragment/app/b;->N:Landroidx/fragment/app/e;

    .line 57
    .line 58
    iget-boolean v1, v2, Landroidx/fragment/app/b;->E:Z

    .line 59
    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    invoke-virtual {v2}, Landroidx/fragment/app/b;->x()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-nez v1, :cond_2

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_2
    iget-object v1, p0, Landroidx/fragment/app/f;->b:Lo4/r;

    .line 70
    .line 71
    iget-object v1, v1, Lo4/r;->w:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, Lq0/N;

    .line 74
    .line 75
    iget-object v3, v1, Lq0/N;->b:Ljava/util/HashMap;

    .line 76
    .line 77
    iget-object v4, v2, Landroidx/fragment/app/b;->x:Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-nez v3, :cond_3

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_3
    iget-boolean v3, v1, Lq0/N;->e:Z

    .line 87
    .line 88
    if-eqz v3, :cond_4

    .line 89
    .line 90
    iget-boolean v1, v1, Lq0/N;->f:Z

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_4
    :goto_0
    const/4 v1, 0x1

    .line 94
    :goto_1
    if-eqz v1, :cond_6

    .line 95
    .line 96
    :goto_2
    invoke-static {v0}, Landroidx/fragment/app/e;->K(I)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_5

    .line 101
    .line 102
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    :cond_5
    invoke-virtual {v2}, Landroidx/fragment/app/b;->u()V

    .line 106
    .line 107
    .line 108
    :cond_6
    return-void

    .line 109
    :cond_7
    new-instance v0, Lq0/W;

    .line 110
    .line 111
    const-string v1, "Fragment "

    .line 112
    .line 113
    const-string v3, " did not call through to super.onDetach()"

    .line 114
    .line 115
    invoke-static {v1, v2, v3}, Landroidx/datastore/preferences/protobuf/g;->i(Ljava/lang/String;Landroidx/fragment/app/b;Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    throw v0
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

.method public final j()V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/b;

    .line 2
    .line 3
    iget-boolean v1, v0, Landroidx/fragment/app/b;->H:Z

    .line 4
    .line 5
    if-eqz v1, :cond_4

    .line 6
    .line 7
    iget-boolean v1, v0, Landroidx/fragment/app/b;->I:Z

    .line 8
    .line 9
    if-eqz v1, :cond_4

    .line 10
    .line 11
    iget-boolean v1, v0, Landroidx/fragment/app/b;->L:Z

    .line 12
    .line 13
    if-nez v1, :cond_4

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    invoke-static {v1}, Landroidx/fragment/app/e;->K(I)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object v1, v0, Landroidx/fragment/app/b;->t:Landroid/os/Bundle;

    .line 26
    .line 27
    const-string v2, "savedInstanceState"

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move-object v1, v3

    .line 38
    :goto_0
    invoke-virtual {v0, v1}, Landroidx/fragment/app/b;->I(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    iput-object v4, v0, Landroidx/fragment/app/b;->h0:Landroid/view/LayoutInflater;

    .line 43
    .line 44
    invoke-virtual {v0, v4, v3, v1}, Landroidx/fragment/app/b;->T(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    .line 45
    .line 46
    .line 47
    iget-object v4, v0, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 48
    .line 49
    if-eqz v4, :cond_4

    .line 50
    .line 51
    const/4 v5, 0x0

    .line 52
    invoke-virtual {v4, v5}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    .line 53
    .line 54
    .line 55
    iget-object v4, v0, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 56
    .line 57
    const v6, 0x7f0a0131

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4, v6, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-boolean v4, v0, Landroidx/fragment/app/b;->U:Z

    .line 64
    .line 65
    if-eqz v4, :cond_2

    .line 66
    .line 67
    iget-object v4, v0, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 68
    .line 69
    const/16 v6, 0x8

    .line 70
    .line 71
    invoke-virtual {v4, v6}, Landroid/view/View;->setVisibility(I)V

    .line 72
    .line 73
    .line 74
    :cond_2
    iget-object v4, v0, Landroidx/fragment/app/b;->t:Landroid/os/Bundle;

    .line 75
    .line 76
    if-eqz v4, :cond_3

    .line 77
    .line 78
    invoke-virtual {v4, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    :cond_3
    iget-object v2, v0, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 83
    .line 84
    invoke-virtual {v0, v2, v3}, Landroidx/fragment/app/b;->R(Landroid/view/View;Landroid/os/Bundle;)V

    .line 85
    .line 86
    .line 87
    iget-object v2, v0, Landroidx/fragment/app/b;->P:Lq0/M;

    .line 88
    .line 89
    const/4 v3, 0x2

    .line 90
    invoke-virtual {v2, v3}, Landroidx/fragment/app/e;->u(I)V

    .line 91
    .line 92
    .line 93
    iget-object v2, p0, Landroidx/fragment/app/f;->a:Lo1/e;

    .line 94
    .line 95
    iget-object v4, v0, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 96
    .line 97
    invoke-virtual {v2, v0, v4, v1, v5}, Lo1/e;->Q0(Landroidx/fragment/app/b;Landroid/view/View;Landroid/os/Bundle;Z)V

    .line 98
    .line 99
    .line 100
    iput v3, v0, Landroidx/fragment/app/b;->s:I

    .line 101
    .line 102
    :cond_4
    return-void
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
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

.method public final k()V
    .locals 9

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/f;->d:Z

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    iget-object v2, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/b;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-static {v1}, Landroidx/fragment/app/e;->K(I)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void

    .line 18
    :cond_1
    const/4 v0, 0x1

    .line 19
    const/4 v3, 0x0

    .line 20
    :try_start_0
    iput-boolean v0, p0, Landroidx/fragment/app/f;->d:Z

    .line 21
    .line 22
    move v4, v3

    .line 23
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/f;->d()I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    iget v6, v2, Landroidx/fragment/app/b;->s:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    const/4 v7, 0x3

    .line 30
    iget-object v8, p0, Landroidx/fragment/app/f;->b:Lo4/r;

    .line 31
    .line 32
    if-eq v5, v6, :cond_e

    .line 33
    .line 34
    if-le v5, v6, :cond_7

    .line 35
    .line 36
    add-int/lit8 v6, v6, 0x1

    .line 37
    .line 38
    packed-switch v6, :pswitch_data_0

    .line 39
    .line 40
    .line 41
    goto/16 :goto_3

    .line 42
    .line 43
    :pswitch_0
    :try_start_1
    invoke-virtual {p0}, Landroidx/fragment/app/f;->n()V

    .line 44
    .line 45
    .line 46
    goto/16 :goto_3

    .line 47
    .line 48
    :catchall_0
    move-exception v0

    .line 49
    goto/16 :goto_5

    .line 50
    .line 51
    :pswitch_1
    const/4 v4, 0x6

    .line 52
    iput v4, v2, Landroidx/fragment/app/b;->s:I

    .line 53
    .line 54
    goto/16 :goto_3

    .line 55
    .line 56
    :pswitch_2
    invoke-virtual {p0}, Landroidx/fragment/app/f;->q()V

    .line 57
    .line 58
    .line 59
    goto/16 :goto_3

    .line 60
    .line 61
    :pswitch_3
    iget-object v4, v2, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 62
    .line 63
    const/4 v5, 0x4

    .line 64
    if-eqz v4, :cond_6

    .line 65
    .line 66
    iget-object v4, v2, Landroidx/fragment/app/b;->b0:Landroid/view/ViewGroup;

    .line 67
    .line 68
    if-eqz v4, :cond_6

    .line 69
    .line 70
    invoke-virtual {v2}, Landroidx/fragment/app/b;->p()Landroidx/fragment/app/e;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    invoke-static {v4, v6}, Lq0/k;->i(Landroid/view/ViewGroup;Landroidx/fragment/app/e;)Lq0/k;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    iget-object v6, v2, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 79
    .line 80
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    if-eqz v6, :cond_4

    .line 85
    .line 86
    if-eq v6, v5, :cond_3

    .line 87
    .line 88
    const/16 v8, 0x8

    .line 89
    .line 90
    if-ne v6, v8, :cond_2

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 94
    .line 95
    new-instance v1, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const-string v2, "Unknown visibility "

    .line 98
    .line 99
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw v0

    .line 113
    :cond_3
    move v7, v5

    .line 114
    goto :goto_1

    .line 115
    :cond_4
    move v7, v1

    .line 116
    :goto_1
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-static {v1}, Landroidx/fragment/app/e;->K(I)Z

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    if-eqz v6, :cond_5

    .line 124
    .line 125
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    :cond_5
    invoke-virtual {v4, v7, v1, p0}, Lq0/k;->d(IILandroidx/fragment/app/f;)V

    .line 129
    .line 130
    .line 131
    :cond_6
    iput v5, v2, Landroidx/fragment/app/b;->s:I

    .line 132
    .line 133
    goto/16 :goto_3

    .line 134
    .line 135
    :pswitch_4
    invoke-virtual {p0}, Landroidx/fragment/app/f;->a()V

    .line 136
    .line 137
    .line 138
    goto/16 :goto_3

    .line 139
    .line 140
    :pswitch_5
    invoke-virtual {p0}, Landroidx/fragment/app/f;->j()V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0}, Landroidx/fragment/app/f;->f()V

    .line 144
    .line 145
    .line 146
    goto/16 :goto_3

    .line 147
    .line 148
    :pswitch_6
    invoke-virtual {p0}, Landroidx/fragment/app/f;->e()V

    .line 149
    .line 150
    .line 151
    goto/16 :goto_3

    .line 152
    .line 153
    :pswitch_7
    invoke-virtual {p0}, Landroidx/fragment/app/f;->c()V

    .line 154
    .line 155
    .line 156
    goto/16 :goto_3

    .line 157
    .line 158
    :cond_7
    add-int/lit8 v6, v6, -0x1

    .line 159
    .line 160
    packed-switch v6, :pswitch_data_1

    .line 161
    .line 162
    .line 163
    goto/16 :goto_3

    .line 164
    .line 165
    :pswitch_8
    invoke-virtual {p0}, Landroidx/fragment/app/f;->l()V

    .line 166
    .line 167
    .line 168
    goto/16 :goto_3

    .line 169
    .line 170
    :pswitch_9
    const/4 v4, 0x5

    .line 171
    iput v4, v2, Landroidx/fragment/app/b;->s:I

    .line 172
    .line 173
    goto/16 :goto_3

    .line 174
    .line 175
    :pswitch_a
    invoke-virtual {p0}, Landroidx/fragment/app/f;->r()V

    .line 176
    .line 177
    .line 178
    goto/16 :goto_3

    .line 179
    .line 180
    :pswitch_b
    invoke-static {v7}, Landroidx/fragment/app/e;->K(I)Z

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    if-eqz v4, :cond_8

    .line 185
    .line 186
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    :cond_8
    iget-boolean v4, v2, Landroidx/fragment/app/b;->G:Z

    .line 190
    .line 191
    if-eqz v4, :cond_9

    .line 192
    .line 193
    iget-object v4, v2, Landroidx/fragment/app/b;->x:Ljava/lang/String;

    .line 194
    .line 195
    invoke-virtual {p0}, Landroidx/fragment/app/f;->o()Landroid/os/Bundle;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    invoke-virtual {v8, v4, v5}, Lo4/r;->A(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 200
    .line 201
    .line 202
    goto :goto_2

    .line 203
    :cond_9
    iget-object v4, v2, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 204
    .line 205
    if-eqz v4, :cond_a

    .line 206
    .line 207
    iget-object v4, v2, Landroidx/fragment/app/b;->u:Landroid/util/SparseArray;

    .line 208
    .line 209
    if-nez v4, :cond_a

    .line 210
    .line 211
    invoke-virtual {p0}, Landroidx/fragment/app/f;->p()V

    .line 212
    .line 213
    .line 214
    :cond_a
    :goto_2
    iget-object v4, v2, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 215
    .line 216
    if-eqz v4, :cond_c

    .line 217
    .line 218
    iget-object v4, v2, Landroidx/fragment/app/b;->b0:Landroid/view/ViewGroup;

    .line 219
    .line 220
    if-eqz v4, :cond_c

    .line 221
    .line 222
    invoke-virtual {v2}, Landroidx/fragment/app/b;->p()Landroidx/fragment/app/e;

    .line 223
    .line 224
    .line 225
    move-result-object v5

    .line 226
    invoke-static {v4, v5}, Lq0/k;->i(Landroid/view/ViewGroup;Landroidx/fragment/app/e;)Lq0/k;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    invoke-static {v1}, Landroidx/fragment/app/e;->K(I)Z

    .line 234
    .line 235
    .line 236
    move-result v5

    .line 237
    if-eqz v5, :cond_b

    .line 238
    .line 239
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    :cond_b
    invoke-virtual {v4, v0, v7, p0}, Lq0/k;->d(IILandroidx/fragment/app/f;)V

    .line 243
    .line 244
    .line 245
    :cond_c
    iput v7, v2, Landroidx/fragment/app/b;->s:I

    .line 246
    .line 247
    goto :goto_3

    .line 248
    :pswitch_c
    iput-boolean v3, v2, Landroidx/fragment/app/b;->I:Z

    .line 249
    .line 250
    iput v1, v2, Landroidx/fragment/app/b;->s:I

    .line 251
    .line 252
    goto :goto_3

    .line 253
    :pswitch_d
    invoke-virtual {p0}, Landroidx/fragment/app/f;->h()V

    .line 254
    .line 255
    .line 256
    iput v0, v2, Landroidx/fragment/app/b;->s:I

    .line 257
    .line 258
    goto :goto_3

    .line 259
    :pswitch_e
    iget-boolean v4, v2, Landroidx/fragment/app/b;->G:Z

    .line 260
    .line 261
    if-eqz v4, :cond_d

    .line 262
    .line 263
    iget-object v4, v2, Landroidx/fragment/app/b;->x:Ljava/lang/String;

    .line 264
    .line 265
    iget-object v5, v8, Lo4/r;->v:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v5, Ljava/util/HashMap;

    .line 268
    .line 269
    invoke-virtual {v5, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    check-cast v4, Landroid/os/Bundle;

    .line 274
    .line 275
    if-nez v4, :cond_d

    .line 276
    .line 277
    iget-object v4, v2, Landroidx/fragment/app/b;->x:Ljava/lang/String;

    .line 278
    .line 279
    invoke-virtual {p0}, Landroidx/fragment/app/f;->o()Landroid/os/Bundle;

    .line 280
    .line 281
    .line 282
    move-result-object v5

    .line 283
    invoke-virtual {v8, v4, v5}, Lo4/r;->A(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 284
    .line 285
    .line 286
    :cond_d
    invoke-virtual {p0}, Landroidx/fragment/app/f;->g()V

    .line 287
    .line 288
    .line 289
    goto :goto_3

    .line 290
    :pswitch_f
    invoke-virtual {p0}, Landroidx/fragment/app/f;->i()V

    .line 291
    .line 292
    .line 293
    :goto_3
    move v4, v0

    .line 294
    goto/16 :goto_0

    .line 295
    .line 296
    :cond_e
    if-nez v4, :cond_12

    .line 297
    .line 298
    const/4 v4, -0x1

    .line 299
    if-ne v6, v4, :cond_12

    .line 300
    .line 301
    iget-boolean v4, v2, Landroidx/fragment/app/b;->E:Z

    .line 302
    .line 303
    if-eqz v4, :cond_12

    .line 304
    .line 305
    invoke-virtual {v2}, Landroidx/fragment/app/b;->x()Z

    .line 306
    .line 307
    .line 308
    move-result v4

    .line 309
    if-nez v4, :cond_12

    .line 310
    .line 311
    iget-boolean v4, v2, Landroidx/fragment/app/b;->G:Z

    .line 312
    .line 313
    if-nez v4, :cond_12

    .line 314
    .line 315
    invoke-static {v7}, Landroidx/fragment/app/e;->K(I)Z

    .line 316
    .line 317
    .line 318
    move-result v4

    .line 319
    if-eqz v4, :cond_f

    .line 320
    .line 321
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    :cond_f
    iget-object v4, v8, Lo4/r;->w:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast v4, Lq0/N;

    .line 327
    .line 328
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    invoke-static {v7}, Landroidx/fragment/app/e;->K(I)Z

    .line 332
    .line 333
    .line 334
    move-result v5

    .line 335
    if-eqz v5, :cond_10

    .line 336
    .line 337
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    :cond_10
    iget-object v5, v2, Landroidx/fragment/app/b;->x:Ljava/lang/String;

    .line 341
    .line 342
    invoke-virtual {v4, v5, v0}, Lq0/N;->e(Ljava/lang/String;Z)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v8, p0}, Lo4/r;->y(Landroidx/fragment/app/f;)V

    .line 346
    .line 347
    .line 348
    invoke-static {v7}, Landroidx/fragment/app/e;->K(I)Z

    .line 349
    .line 350
    .line 351
    move-result v4

    .line 352
    if-eqz v4, :cond_11

    .line 353
    .line 354
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    :cond_11
    invoke-virtual {v2}, Landroidx/fragment/app/b;->u()V

    .line 358
    .line 359
    .line 360
    :cond_12
    iget-boolean v4, v2, Landroidx/fragment/app/b;->g0:Z

    .line 361
    .line 362
    if-eqz v4, :cond_18

    .line 363
    .line 364
    iget-object v4, v2, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 365
    .line 366
    if-eqz v4, :cond_16

    .line 367
    .line 368
    iget-object v4, v2, Landroidx/fragment/app/b;->b0:Landroid/view/ViewGroup;

    .line 369
    .line 370
    if-eqz v4, :cond_16

    .line 371
    .line 372
    invoke-virtual {v2}, Landroidx/fragment/app/b;->p()Landroidx/fragment/app/e;

    .line 373
    .line 374
    .line 375
    move-result-object v5

    .line 376
    invoke-static {v4, v5}, Lq0/k;->i(Landroid/view/ViewGroup;Landroidx/fragment/app/e;)Lq0/k;

    .line 377
    .line 378
    .line 379
    move-result-object v4

    .line 380
    iget-boolean v5, v2, Landroidx/fragment/app/b;->U:Z

    .line 381
    .line 382
    if-eqz v5, :cond_14

    .line 383
    .line 384
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 385
    .line 386
    .line 387
    invoke-static {v1}, Landroidx/fragment/app/e;->K(I)Z

    .line 388
    .line 389
    .line 390
    move-result v1

    .line 391
    if-eqz v1, :cond_13

    .line 392
    .line 393
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    :cond_13
    invoke-virtual {v4, v7, v0, p0}, Lq0/k;->d(IILandroidx/fragment/app/f;)V

    .line 397
    .line 398
    .line 399
    goto :goto_4

    .line 400
    :cond_14
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    invoke-static {v1}, Landroidx/fragment/app/e;->K(I)Z

    .line 404
    .line 405
    .line 406
    move-result v5

    .line 407
    if-eqz v5, :cond_15

    .line 408
    .line 409
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    :cond_15
    invoke-virtual {v4, v1, v0, p0}, Lq0/k;->d(IILandroidx/fragment/app/f;)V

    .line 413
    .line 414
    .line 415
    :cond_16
    :goto_4
    iget-object v1, v2, Landroidx/fragment/app/b;->N:Landroidx/fragment/app/e;

    .line 416
    .line 417
    if-eqz v1, :cond_17

    .line 418
    .line 419
    iget-boolean v4, v2, Landroidx/fragment/app/b;->D:Z

    .line 420
    .line 421
    if-eqz v4, :cond_17

    .line 422
    .line 423
    invoke-static {v2}, Landroidx/fragment/app/e;->L(Landroidx/fragment/app/b;)Z

    .line 424
    .line 425
    .line 426
    move-result v4

    .line 427
    if-eqz v4, :cond_17

    .line 428
    .line 429
    iput-boolean v0, v1, Landroidx/fragment/app/e;->G:Z

    .line 430
    .line 431
    :cond_17
    iput-boolean v3, v2, Landroidx/fragment/app/b;->g0:Z

    .line 432
    .line 433
    iget-object v0, v2, Landroidx/fragment/app/b;->P:Lq0/M;

    .line 434
    .line 435
    invoke-virtual {v0}, Landroidx/fragment/app/e;->o()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 436
    .line 437
    .line 438
    :cond_18
    iput-boolean v3, p0, Landroidx/fragment/app/f;->d:Z

    .line 439
    .line 440
    return-void

    .line 441
    :goto_5
    iput-boolean v3, p0, Landroidx/fragment/app/f;->d:Z

    .line 442
    .line 443
    throw v0

    .line 444
    nop

    .line 445
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    :pswitch_data_1
    .packed-switch -0x1
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
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
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
.end method

.method public final l()V
    .locals 4

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/e;->K(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/b;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, v1, Landroidx/fragment/app/b;->P:Lq0/M;

    .line 14
    .line 15
    const/4 v2, 0x5

    .line 16
    invoke-virtual {v0, v2}, Landroidx/fragment/app/e;->u(I)V

    .line 17
    .line 18
    .line 19
    iget-object v0, v1, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-object v0, v1, Landroidx/fragment/app/b;->m0:Lq0/Q;

    .line 24
    .line 25
    sget-object v2, Landroidx/lifecycle/m;->ON_PAUSE:Landroidx/lifecycle/m;

    .line 26
    .line 27
    invoke-virtual {v0, v2}, Lq0/Q;->b(Landroidx/lifecycle/m;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    iget-object v0, v1, Landroidx/fragment/app/b;->l0:Landroidx/lifecycle/u;

    .line 31
    .line 32
    sget-object v2, Landroidx/lifecycle/m;->ON_PAUSE:Landroidx/lifecycle/m;

    .line 33
    .line 34
    invoke-virtual {v0, v2}, Landroidx/lifecycle/u;->d(Landroidx/lifecycle/m;)V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x6

    .line 38
    iput v0, v1, Landroidx/fragment/app/b;->s:I

    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    iput-boolean v0, v1, Landroidx/fragment/app/b;->a0:Z

    .line 42
    .line 43
    invoke-virtual {v1}, Landroidx/fragment/app/b;->L()V

    .line 44
    .line 45
    .line 46
    iget-boolean v2, v1, Landroidx/fragment/app/b;->a0:Z

    .line 47
    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    iget-object v2, p0, Landroidx/fragment/app/f;->a:Lo1/e;

    .line 51
    .line 52
    invoke-virtual {v2, v1, v0}, Lo1/e;->J0(Landroidx/fragment/app/b;Z)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_2
    new-instance v0, Lq0/W;

    .line 57
    .line 58
    const-string v2, "Fragment "

    .line 59
    .line 60
    const-string v3, " did not call through to super.onPause()"

    .line 61
    .line 62
    invoke-static {v2, v1, v3}, Landroidx/datastore/preferences/protobuf/g;->i(Ljava/lang/String;Landroidx/fragment/app/b;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v0
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

.method public final m(Ljava/lang/ClassLoader;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/b;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/fragment/app/b;->t:Landroid/os/Bundle;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-virtual {v1, p1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, v0, Landroidx/fragment/app/b;->t:Landroid/os/Bundle;

    .line 12
    .line 13
    const-string v1, "savedInstanceState"

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-nez p1, :cond_1

    .line 20
    .line 21
    iget-object p1, v0, Landroidx/fragment/app/b;->t:Landroid/os/Bundle;

    .line 22
    .line 23
    new-instance v2, Landroid/os/Bundle;

    .line 24
    .line 25
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    :try_start_0
    iget-object p1, v0, Landroidx/fragment/app/b;->t:Landroid/os/Bundle;

    .line 32
    .line 33
    const-string v1, "viewState"

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, v0, Landroidx/fragment/app/b;->u:Landroid/util/SparseArray;
    :try_end_0
    .catch Landroid/os/BadParcelableException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    iget-object p1, v0, Landroidx/fragment/app/b;->t:Landroid/os/Bundle;

    .line 42
    .line 43
    const-string v1, "viewRegistryState"

    .line 44
    .line 45
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, v0, Landroidx/fragment/app/b;->v:Landroid/os/Bundle;

    .line 50
    .line 51
    iget-object p1, v0, Landroidx/fragment/app/b;->t:Landroid/os/Bundle;

    .line 52
    .line 53
    const-string v1, "state"

    .line 54
    .line 55
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, Landroidx/fragment/app/FragmentState;

    .line 60
    .line 61
    if-eqz p1, :cond_3

    .line 62
    .line 63
    iget-object v1, p1, Landroidx/fragment/app/FragmentState;->E:Ljava/lang/String;

    .line 64
    .line 65
    iput-object v1, v0, Landroidx/fragment/app/b;->A:Ljava/lang/String;

    .line 66
    .line 67
    iget v1, p1, Landroidx/fragment/app/FragmentState;->F:I

    .line 68
    .line 69
    iput v1, v0, Landroidx/fragment/app/b;->B:I

    .line 70
    .line 71
    iget-object v1, v0, Landroidx/fragment/app/b;->w:Ljava/lang/Boolean;

    .line 72
    .line 73
    if-eqz v1, :cond_2

    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    iput-boolean p1, v0, Landroidx/fragment/app/b;->e0:Z

    .line 80
    .line 81
    const/4 p1, 0x0

    .line 82
    iput-object p1, v0, Landroidx/fragment/app/b;->w:Ljava/lang/Boolean;

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_2
    iget-boolean p1, p1, Landroidx/fragment/app/FragmentState;->G:Z

    .line 86
    .line 87
    iput-boolean p1, v0, Landroidx/fragment/app/b;->e0:Z

    .line 88
    .line 89
    :cond_3
    :goto_0
    iget-boolean p1, v0, Landroidx/fragment/app/b;->e0:Z

    .line 90
    .line 91
    if-nez p1, :cond_4

    .line 92
    .line 93
    const/4 p1, 0x1

    .line 94
    iput-boolean p1, v0, Landroidx/fragment/app/b;->d0:Z

    .line 95
    .line 96
    :cond_4
    :goto_1
    return-void

    .line 97
    :catch_0
    move-exception p1

    .line 98
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 99
    .line 100
    new-instance v2, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    const-string v3, "Failed to restore view hierarchy state for fragment "

    .line 103
    .line 104
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-direct {v1, v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    throw v1
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
.end method

.method public final n()V
    .locals 6

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/e;->K(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/b;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, v1, Landroidx/fragment/app/b;->f0:Lq0/t;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    move-object v0, v2

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    iget-object v0, v0, Lq0/t;->k:Landroid/view/View;

    .line 21
    .line 22
    :goto_0
    if-eqz v0, :cond_4

    .line 23
    .line 24
    iget-object v3, v1, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 25
    .line 26
    if-ne v0, v3, :cond_2

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    :goto_1
    if-eqz v3, :cond_4

    .line 34
    .line 35
    iget-object v4, v1, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 36
    .line 37
    if-ne v3, v4, :cond_3

    .line 38
    .line 39
    :goto_2
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 40
    .line 41
    .line 42
    const/4 v3, 0x2

    .line 43
    invoke-static {v3}, Landroidx/fragment/app/e;->K(I)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_4

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    iget-object v0, v1, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_3
    invoke-interface {v3}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    goto :goto_1

    .line 70
    :cond_4
    :goto_3
    invoke-virtual {v1}, Landroidx/fragment/app/b;->j()Lq0/t;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iput-object v2, v0, Lq0/t;->k:Landroid/view/View;

    .line 75
    .line 76
    iget-object v0, v1, Landroidx/fragment/app/b;->P:Lq0/M;

    .line 77
    .line 78
    invoke-virtual {v0}, Landroidx/fragment/app/e;->R()V

    .line 79
    .line 80
    .line 81
    iget-object v0, v1, Landroidx/fragment/app/b;->P:Lq0/M;

    .line 82
    .line 83
    const/4 v3, 0x1

    .line 84
    invoke-virtual {v0, v3}, Landroidx/fragment/app/e;->z(Z)Z

    .line 85
    .line 86
    .line 87
    const/4 v0, 0x7

    .line 88
    iput v0, v1, Landroidx/fragment/app/b;->s:I

    .line 89
    .line 90
    const/4 v3, 0x0

    .line 91
    iput-boolean v3, v1, Landroidx/fragment/app/b;->a0:Z

    .line 92
    .line 93
    invoke-virtual {v1}, Landroidx/fragment/app/b;->N()V

    .line 94
    .line 95
    .line 96
    iget-boolean v4, v1, Landroidx/fragment/app/b;->a0:Z

    .line 97
    .line 98
    if-eqz v4, :cond_6

    .line 99
    .line 100
    iget-object v4, v1, Landroidx/fragment/app/b;->l0:Landroidx/lifecycle/u;

    .line 101
    .line 102
    sget-object v5, Landroidx/lifecycle/m;->ON_RESUME:Landroidx/lifecycle/m;

    .line 103
    .line 104
    invoke-virtual {v4, v5}, Landroidx/lifecycle/u;->d(Landroidx/lifecycle/m;)V

    .line 105
    .line 106
    .line 107
    iget-object v4, v1, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 108
    .line 109
    if-eqz v4, :cond_5

    .line 110
    .line 111
    iget-object v4, v1, Landroidx/fragment/app/b;->m0:Lq0/Q;

    .line 112
    .line 113
    iget-object v4, v4, Lq0/Q;->v:Landroidx/lifecycle/u;

    .line 114
    .line 115
    invoke-virtual {v4, v5}, Landroidx/lifecycle/u;->d(Landroidx/lifecycle/m;)V

    .line 116
    .line 117
    .line 118
    :cond_5
    iget-object v4, v1, Landroidx/fragment/app/b;->P:Lq0/M;

    .line 119
    .line 120
    iput-boolean v3, v4, Landroidx/fragment/app/e;->H:Z

    .line 121
    .line 122
    iput-boolean v3, v4, Landroidx/fragment/app/e;->I:Z

    .line 123
    .line 124
    iget-object v5, v4, Landroidx/fragment/app/e;->O:Lq0/N;

    .line 125
    .line 126
    iput-boolean v3, v5, Lq0/N;->g:Z

    .line 127
    .line 128
    invoke-virtual {v4, v0}, Landroidx/fragment/app/e;->u(I)V

    .line 129
    .line 130
    .line 131
    iget-object v0, p0, Landroidx/fragment/app/f;->a:Lo1/e;

    .line 132
    .line 133
    invoke-virtual {v0, v1, v3}, Lo1/e;->M0(Landroidx/fragment/app/b;Z)V

    .line 134
    .line 135
    .line 136
    iget-object v0, p0, Landroidx/fragment/app/f;->b:Lo4/r;

    .line 137
    .line 138
    iget-object v3, v1, Landroidx/fragment/app/b;->x:Ljava/lang/String;

    .line 139
    .line 140
    invoke-virtual {v0, v3, v2}, Lo4/r;->A(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 141
    .line 142
    .line 143
    iput-object v2, v1, Landroidx/fragment/app/b;->t:Landroid/os/Bundle;

    .line 144
    .line 145
    iput-object v2, v1, Landroidx/fragment/app/b;->u:Landroid/util/SparseArray;

    .line 146
    .line 147
    iput-object v2, v1, Landroidx/fragment/app/b;->v:Landroid/os/Bundle;

    .line 148
    .line 149
    return-void

    .line 150
    :cond_6
    new-instance v0, Lq0/W;

    .line 151
    .line 152
    const-string v2, "Fragment "

    .line 153
    .line 154
    const-string v3, " did not call through to super.onResume()"

    .line 155
    .line 156
    invoke-static {v2, v1, v3}, Landroidx/datastore/preferences/protobuf/g;->i(Ljava/lang/String;Landroidx/fragment/app/b;Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    throw v0
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

.method public final o()Landroid/os/Bundle;
    .locals 5

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/b;

    .line 7
    .line 8
    iget v2, v1, Landroidx/fragment/app/b;->s:I

    .line 9
    .line 10
    const/4 v3, -0x1

    .line 11
    if-ne v2, v3, :cond_0

    .line 12
    .line 13
    iget-object v2, v1, Landroidx/fragment/app/b;->t:Landroid/os/Bundle;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    new-instance v2, Landroidx/fragment/app/FragmentState;

    .line 21
    .line 22
    invoke-direct {v2, v1}, Landroidx/fragment/app/FragmentState;-><init>(Landroidx/fragment/app/b;)V

    .line 23
    .line 24
    .line 25
    const-string v4, "state"

    .line 26
    .line 27
    invoke-virtual {v0, v4, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 28
    .line 29
    .line 30
    iget v2, v1, Landroidx/fragment/app/b;->s:I

    .line 31
    .line 32
    if-le v2, v3, :cond_6

    .line 33
    .line 34
    new-instance v2, Landroid/os/Bundle;

    .line 35
    .line 36
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v2}, Landroidx/fragment/app/b;->O(Landroid/os/Bundle;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-nez v3, :cond_1

    .line 47
    .line 48
    const-string v3, "savedInstanceState"

    .line 49
    .line 50
    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    iget-object v3, p0, Landroidx/fragment/app/f;->a:Lo1/e;

    .line 54
    .line 55
    const/4 v4, 0x0

    .line 56
    invoke-virtual {v3, v1, v2, v4}, Lo1/e;->N0(Landroidx/fragment/app/b;Landroid/os/Bundle;Z)V

    .line 57
    .line 58
    .line 59
    new-instance v2, Landroid/os/Bundle;

    .line 60
    .line 61
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 62
    .line 63
    .line 64
    iget-object v3, v1, Landroidx/fragment/app/b;->o0:LN1/t;

    .line 65
    .line 66
    invoke-virtual {v3, v2}, LN1/t;->g(Landroid/os/Bundle;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-nez v3, :cond_2

    .line 74
    .line 75
    const-string v3, "registryState"

    .line 76
    .line 77
    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 78
    .line 79
    .line 80
    :cond_2
    iget-object v2, v1, Landroidx/fragment/app/b;->P:Lq0/M;

    .line 81
    .line 82
    invoke-virtual {v2}, Landroidx/fragment/app/e;->Y()Landroid/os/Bundle;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {v2}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-nez v3, :cond_3

    .line 91
    .line 92
    const-string v3, "childFragmentManager"

    .line 93
    .line 94
    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 95
    .line 96
    .line 97
    :cond_3
    iget-object v2, v1, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 98
    .line 99
    if-eqz v2, :cond_4

    .line 100
    .line 101
    invoke-virtual {p0}, Landroidx/fragment/app/f;->p()V

    .line 102
    .line 103
    .line 104
    :cond_4
    iget-object v2, v1, Landroidx/fragment/app/b;->u:Landroid/util/SparseArray;

    .line 105
    .line 106
    if-eqz v2, :cond_5

    .line 107
    .line 108
    const-string v3, "viewState"

    .line 109
    .line 110
    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    .line 111
    .line 112
    .line 113
    :cond_5
    iget-object v2, v1, Landroidx/fragment/app/b;->v:Landroid/os/Bundle;

    .line 114
    .line 115
    if-eqz v2, :cond_6

    .line 116
    .line 117
    const-string v3, "viewRegistryState"

    .line 118
    .line 119
    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 120
    .line 121
    .line 122
    :cond_6
    iget-object v1, v1, Landroidx/fragment/app/b;->y:Landroid/os/Bundle;

    .line 123
    .line 124
    if-eqz v1, :cond_7

    .line 125
    .line 126
    const-string v2, "arguments"

    .line 127
    .line 128
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 129
    .line 130
    .line 131
    :cond_7
    return-object v0
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

.method public final p()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/b;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v1, 0x2

    .line 9
    invoke-static {v1}, Landroidx/fragment/app/e;->K(I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    iget-object v1, v0, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 19
    .line 20
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    :cond_1
    new-instance v1, Landroid/util/SparseArray;

    .line 24
    .line 25
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 26
    .line 27
    .line 28
    iget-object v2, v0, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 29
    .line 30
    invoke-virtual {v2, v1}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-lez v2, :cond_2

    .line 38
    .line 39
    iput-object v1, v0, Landroidx/fragment/app/b;->u:Landroid/util/SparseArray;

    .line 40
    .line 41
    :cond_2
    new-instance v1, Landroid/os/Bundle;

    .line 42
    .line 43
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 44
    .line 45
    .line 46
    iget-object v2, v0, Landroidx/fragment/app/b;->m0:Lq0/Q;

    .line 47
    .line 48
    iget-object v2, v2, Lq0/Q;->w:LN1/t;

    .line 49
    .line 50
    invoke-virtual {v2, v1}, LN1/t;->g(Landroid/os/Bundle;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-nez v2, :cond_3

    .line 58
    .line 59
    iput-object v1, v0, Landroidx/fragment/app/b;->v:Landroid/os/Bundle;

    .line 60
    .line 61
    :cond_3
    :goto_0
    return-void
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

.method public final q()V
    .locals 5

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/e;->K(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/b;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, v1, Landroidx/fragment/app/b;->P:Lq0/M;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroidx/fragment/app/e;->R()V

    .line 16
    .line 17
    .line 18
    iget-object v0, v1, Landroidx/fragment/app/b;->P:Lq0/M;

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-virtual {v0, v2}, Landroidx/fragment/app/e;->z(Z)Z

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x5

    .line 25
    iput v0, v1, Landroidx/fragment/app/b;->s:I

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    iput-boolean v2, v1, Landroidx/fragment/app/b;->a0:Z

    .line 29
    .line 30
    invoke-virtual {v1}, Landroidx/fragment/app/b;->P()V

    .line 31
    .line 32
    .line 33
    iget-boolean v3, v1, Landroidx/fragment/app/b;->a0:Z

    .line 34
    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    iget-object v3, v1, Landroidx/fragment/app/b;->l0:Landroidx/lifecycle/u;

    .line 38
    .line 39
    sget-object v4, Landroidx/lifecycle/m;->ON_START:Landroidx/lifecycle/m;

    .line 40
    .line 41
    invoke-virtual {v3, v4}, Landroidx/lifecycle/u;->d(Landroidx/lifecycle/m;)V

    .line 42
    .line 43
    .line 44
    iget-object v3, v1, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 45
    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    iget-object v3, v1, Landroidx/fragment/app/b;->m0:Lq0/Q;

    .line 49
    .line 50
    iget-object v3, v3, Lq0/Q;->v:Landroidx/lifecycle/u;

    .line 51
    .line 52
    invoke-virtual {v3, v4}, Landroidx/lifecycle/u;->d(Landroidx/lifecycle/m;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    iget-object v3, v1, Landroidx/fragment/app/b;->P:Lq0/M;

    .line 56
    .line 57
    iput-boolean v2, v3, Landroidx/fragment/app/e;->H:Z

    .line 58
    .line 59
    iput-boolean v2, v3, Landroidx/fragment/app/e;->I:Z

    .line 60
    .line 61
    iget-object v4, v3, Landroidx/fragment/app/e;->O:Lq0/N;

    .line 62
    .line 63
    iput-boolean v2, v4, Lq0/N;->g:Z

    .line 64
    .line 65
    invoke-virtual {v3, v0}, Landroidx/fragment/app/e;->u(I)V

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Landroidx/fragment/app/f;->a:Lo1/e;

    .line 69
    .line 70
    invoke-virtual {v0, v1, v2}, Lo1/e;->O0(Landroidx/fragment/app/b;Z)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_2
    new-instance v0, Lq0/W;

    .line 75
    .line 76
    const-string v2, "Fragment "

    .line 77
    .line 78
    const-string v3, " did not call through to super.onStart()"

    .line 79
    .line 80
    invoke-static {v2, v1, v3}, Landroidx/datastore/preferences/protobuf/g;->i(Ljava/lang/String;Landroidx/fragment/app/b;Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw v0
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
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

.method public final r()V
    .locals 4

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/e;->K(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/b;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, v1, Landroidx/fragment/app/b;->P:Lq0/M;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    iput-boolean v2, v0, Landroidx/fragment/app/e;->I:Z

    .line 17
    .line 18
    iget-object v3, v0, Landroidx/fragment/app/e;->O:Lq0/N;

    .line 19
    .line 20
    iput-boolean v2, v3, Lq0/N;->g:Z

    .line 21
    .line 22
    const/4 v2, 0x4

    .line 23
    invoke-virtual {v0, v2}, Landroidx/fragment/app/e;->u(I)V

    .line 24
    .line 25
    .line 26
    iget-object v0, v1, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iget-object v0, v1, Landroidx/fragment/app/b;->m0:Lq0/Q;

    .line 31
    .line 32
    sget-object v3, Landroidx/lifecycle/m;->ON_STOP:Landroidx/lifecycle/m;

    .line 33
    .line 34
    invoke-virtual {v0, v3}, Lq0/Q;->b(Landroidx/lifecycle/m;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-object v0, v1, Landroidx/fragment/app/b;->l0:Landroidx/lifecycle/u;

    .line 38
    .line 39
    sget-object v3, Landroidx/lifecycle/m;->ON_STOP:Landroidx/lifecycle/m;

    .line 40
    .line 41
    invoke-virtual {v0, v3}, Landroidx/lifecycle/u;->d(Landroidx/lifecycle/m;)V

    .line 42
    .line 43
    .line 44
    iput v2, v1, Landroidx/fragment/app/b;->s:I

    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    iput-boolean v0, v1, Landroidx/fragment/app/b;->a0:Z

    .line 48
    .line 49
    invoke-virtual {v1}, Landroidx/fragment/app/b;->Q()V

    .line 50
    .line 51
    .line 52
    iget-boolean v2, v1, Landroidx/fragment/app/b;->a0:Z

    .line 53
    .line 54
    if-eqz v2, :cond_2

    .line 55
    .line 56
    iget-object v2, p0, Landroidx/fragment/app/f;->a:Lo1/e;

    .line 57
    .line 58
    invoke-virtual {v2, v1, v0}, Lo1/e;->P0(Landroidx/fragment/app/b;Z)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_2
    new-instance v0, Lq0/W;

    .line 63
    .line 64
    const-string v2, "Fragment "

    .line 65
    .line 66
    const-string v3, " did not call through to super.onStop()"

    .line 67
    .line 68
    invoke-static {v2, v1, v3}, Landroidx/datastore/preferences/protobuf/g;->i(Ljava/lang/String;Landroidx/fragment/app/b;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v0
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
