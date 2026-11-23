.class public final LE4/I;
.super Lo8/g;
.source "SourceFile"

# interfaces
.implements Lu8/c;


# instance fields
.field public s:Lcom/kcstream/cing/activity/SearchByGenreActivity;

.field public t:I

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lcom/kcstream/cing/activity/SearchByGenreActivity;


# direct methods
.method public constructor <init>(Lcom/kcstream/cing/activity/SearchByGenreActivity;Lm8/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE4/I;->v:Lcom/kcstream/cing/activity/SearchByGenreActivity;

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
    .locals 2

    .line 1
    new-instance v0, LE4/I;

    .line 2
    .line 3
    iget-object v1, p0, LE4/I;->v:Lcom/kcstream/cing/activity/SearchByGenreActivity;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, LE4/I;-><init>(Lcom/kcstream/cing/activity/SearchByGenreActivity;Lm8/d;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, LE4/I;->u:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
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
    invoke-virtual {p0, p1, p2}, LE4/I;->create(Ljava/lang/Object;Lm8/d;)Lm8/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LE4/I;

    .line 10
    .line 11
    sget-object p2, Lh8/m;->a:Lh8/m;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LE4/I;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 8

    .line 1
    sget-object v0, Ln8/a;->s:Ln8/a;

    .line 2
    .line 3
    iget v1, p0, LE4/I;->t:I

    .line 4
    .line 5
    sget-object v2, Lh8/m;->a:Lh8/m;

    .line 6
    .line 7
    iget-object v3, p0, LE4/I;->v:Lcom/kcstream/cing/activity/SearchByGenreActivity;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    const/16 v6, 0x8

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    if-ne v1, v5, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, LE4/I;->s:Lcom/kcstream/cing/activity/SearchByGenreActivity;

    .line 18
    .line 19
    iget-object v1, p0, LE4/I;->u:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, LN9/y;

    .line 22
    .line 23
    :try_start_0
    invoke-static {p1}, LJ7/a;->v(Ljava/lang/Object;)V
    :try_end_0
    .catch Lretrofit2/HttpException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_1
    invoke-static {p1}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, LE4/I;->u:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, LN9/y;

    .line 41
    .line 42
    :try_start_1
    sget-object v1, LN9/I;->c:LU9/c;

    .line 43
    .line 44
    new-instance v7, LE4/H;

    .line 45
    .line 46
    invoke-direct {v7, v3, v4}, LE4/H;-><init>(Lcom/kcstream/cing/activity/SearchByGenreActivity;Lm8/d;)V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, LE4/I;->u:Ljava/lang/Object;

    .line 50
    .line 51
    iput-object v3, p0, LE4/I;->s:Lcom/kcstream/cing/activity/SearchByGenreActivity;

    .line 52
    .line 53
    iput v5, p0, LE4/I;->t:I

    .line 54
    .line 55
    invoke-static {v1, v7, p0}, LN9/z;->w(Lm8/i;Lu8/c;Lm8/d;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-ne p1, v0, :cond_2

    .line 60
    .line 61
    return-object v0

    .line 62
    :cond_2
    move-object v0, v3

    .line 63
    :goto_0
    check-cast p1, Lcom/kcstream/cing/model/SearchByGenre;

    .line 64
    .line 65
    iput-object p1, v0, Lcom/kcstream/cing/activity/SearchByGenreActivity;->W:Lcom/kcstream/cing/model/SearchByGenre;

    .line 66
    .line 67
    iget-object p1, v3, Lcom/kcstream/cing/activity/SearchByGenreActivity;->W:Lcom/kcstream/cing/model/SearchByGenre;

    .line 68
    .line 69
    const/4 v0, 0x0

    .line 70
    if-eqz p1, :cond_4

    .line 71
    .line 72
    invoke-virtual {p1}, Lcom/kcstream/cing/model/SearchByGenre;->a()Ljava/util/ArrayList;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    if-eqz p1, :cond_4

    .line 77
    .line 78
    invoke-static {p1}, Li8/C;->q(Ljava/util/List;)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_3

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    invoke-static {p1}, Li8/k;->t0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    :goto_1
    invoke-static {p1}, Lv8/x;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    new-instance v1, LCa/c;

    .line 94
    .line 95
    invoke-direct {v1, p1}, LCa/c;-><init>(Ljava/util/List;)V

    .line 96
    .line 97
    .line 98
    new-instance p1, Lt1/G;

    .line 99
    .line 100
    invoke-direct {p1, v1}, Lt1/G;-><init>(LCa/c;)V

    .line 101
    .line 102
    .line 103
    const-class v1, Lcom/kcstream/cing/model/SearchByGenreResult;

    .line 104
    .line 105
    sget-object v4, Lv8/u;->a:Lv8/v;

    .line 106
    .line 107
    invoke-virtual {v4, v1}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    const-class v5, LG4/n;

    .line 112
    .line 113
    invoke-virtual {v4, v5}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    invoke-virtual {p1, v1, v4}, Lt1/G;->x(LC8/c;LC8/c;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v3}, Lcom/kcstream/cing/activity/SearchByGenreActivity;->z()Lt1/G;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    iget-object v1, v1, Lt1/G;->w:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 127
    .line 128
    invoke-static {v1, v3}, LC3/b;->B(Landroidx/recyclerview/widget/RecyclerView;Landroid/content/Context;)Lcom/kcstream/cing/utils/GridAutoLayoutManager;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    iput-object v1, p1, Lt1/G;->s:Ljava/lang/Object;

    .line 133
    .line 134
    invoke-virtual {v3}, Lcom/kcstream/cing/activity/SearchByGenreActivity;->z()Lt1/G;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    iget-object v1, v1, Lt1/G;->w:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 141
    .line 142
    invoke-virtual {p1, v1}, Lt1/G;->r(Landroidx/recyclerview/widget/RecyclerView;)LCa/c;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v3}, Lcom/kcstream/cing/activity/SearchByGenreActivity;->z()Lt1/G;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    iget-object p1, p1, Lt1/G;->u:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast p1, Landroid/widget/ProgressBar;

    .line 152
    .line 153
    invoke-virtual {p1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v3}, Lcom/kcstream/cing/activity/SearchByGenreActivity;->z()Lt1/G;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    iget-object p1, p1, Lt1/G;->w:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 163
    .line 164
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v3}, Lcom/kcstream/cing/activity/SearchByGenreActivity;->z()Lt1/G;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    iget-object p1, p1, Lt1/G;->v:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast p1, Landroid/widget/RelativeLayout;

    .line 174
    .line 175
    invoke-virtual {p1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 176
    .line 177
    .line 178
    move-object v4, v2

    .line 179
    :cond_4
    if-nez v4, :cond_5

    .line 180
    .line 181
    invoke-virtual {v3}, Lcom/kcstream/cing/activity/SearchByGenreActivity;->z()Lt1/G;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    iget-object p1, p1, Lt1/G;->v:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast p1, Landroid/widget/RelativeLayout;

    .line 188
    .line 189
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v3}, Lcom/kcstream/cing/activity/SearchByGenreActivity;->z()Lt1/G;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    iget-object p1, p1, Lt1/G;->u:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast p1, Landroid/widget/ProgressBar;

    .line 199
    .line 200
    invoke-virtual {p1, v6}, Landroid/view/View;->setVisibility(I)V
    :try_end_1
    .catch Lretrofit2/HttpException; {:try_start_1 .. :try_end_1} :catch_0

    .line 201
    .line 202
    .line 203
    return-object v2

    .line 204
    :catch_0
    invoke-virtual {v3}, Lcom/kcstream/cing/activity/SearchByGenreActivity;->z()Lt1/G;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    iget-object p1, p1, Lt1/G;->u:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast p1, Landroid/widget/ProgressBar;

    .line 211
    .line 212
    invoke-virtual {p1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 213
    .line 214
    .line 215
    :cond_5
    return-object v2
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
