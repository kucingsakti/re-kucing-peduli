.class public final LJ4/l;
.super Lo8/g;
.source "SourceFile"

# interfaces
.implements Lu8/c;


# instance fields
.field public s:Lcom/kcstream/cing/fragment/TabsIndexFragment;

.field public t:I

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lcom/kcstream/cing/fragment/TabsIndexFragment;


# direct methods
.method public constructor <init>(Lcom/kcstream/cing/fragment/TabsIndexFragment;Lm8/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LJ4/l;->v:Lcom/kcstream/cing/fragment/TabsIndexFragment;

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
    new-instance v0, LJ4/l;

    .line 2
    .line 3
    iget-object v1, p0, LJ4/l;->v:Lcom/kcstream/cing/fragment/TabsIndexFragment;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, LJ4/l;-><init>(Lcom/kcstream/cing/fragment/TabsIndexFragment;Lm8/d;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, LJ4/l;->u:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, LJ4/l;->create(Ljava/lang/Object;Lm8/d;)Lm8/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LJ4/l;

    .line 10
    .line 11
    sget-object p2, Lh8/m;->a:Lh8/m;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LJ4/l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, LJ4/l;->t:I

    .line 4
    .line 5
    sget-object v2, Lh8/m;->a:Lh8/m;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v5, p0, LJ4/l;->v:Lcom/kcstream/cing/fragment/TabsIndexFragment;

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    if-ne v1, v4, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, LJ4/l;->s:Lcom/kcstream/cing/fragment/TabsIndexFragment;

    .line 16
    .line 17
    iget-object v1, p0, LJ4/l;->u:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, LN9/y;

    .line 20
    .line 21
    :try_start_0
    invoke-static {p1}, LJ7/a;->v(Ljava/lang/Object;)V
    :try_end_0
    .catch Lretrofit2/HttpException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_1
    invoke-static {p1}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, LJ4/l;->u:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, LN9/y;

    .line 39
    .line 40
    :try_start_1
    sget-object v1, LN9/I;->c:LU9/c;

    .line 41
    .line 42
    new-instance v6, LJ4/k;

    .line 43
    .line 44
    invoke-direct {v6, v5, v3}, LJ4/k;-><init>(Lcom/kcstream/cing/fragment/TabsIndexFragment;Lm8/d;)V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, LJ4/l;->u:Ljava/lang/Object;

    .line 48
    .line 49
    iput-object v5, p0, LJ4/l;->s:Lcom/kcstream/cing/fragment/TabsIndexFragment;

    .line 50
    .line 51
    iput v4, p0, LJ4/l;->t:I

    .line 52
    .line 53
    invoke-static {v1, v6, p0}, LN9/z;->w(Lm8/i;Lu8/c;Lm8/d;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-ne p1, v0, :cond_2

    .line 58
    .line 59
    return-object v0

    .line 60
    :cond_2
    move-object v0, v5

    .line 61
    :goto_0
    check-cast p1, Lcom/kcstream/cing/model/GetList;

    .line 62
    .line 63
    iput-object p1, v0, Lcom/kcstream/cing/fragment/TabsIndexFragment;->w0:Lcom/kcstream/cing/model/GetList;

    .line 64
    .line 65
    iget-object p1, v5, Lcom/kcstream/cing/fragment/TabsIndexFragment;->w0:Lcom/kcstream/cing/model/GetList;

    .line 66
    .line 67
    const/4 v0, 0x0

    .line 68
    const/16 v1, 0x8

    .line 69
    .line 70
    if-eqz p1, :cond_4

    .line 71
    .line 72
    invoke-virtual {p1}, Lcom/kcstream/cing/model/GetList;->a()Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    if-eqz p1, :cond_4

    .line 77
    .line 78
    iget-object v3, v5, Lcom/kcstream/cing/fragment/TabsIndexFragment;->v0:LFa/e;

    .line 79
    .line 80
    invoke-static {v3}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iget-object v3, v3, LFa/e;->v:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v3, Landroidx/recyclerview/widget/RecyclerView;

    .line 86
    .line 87
    invoke-static {p1}, Li8/C;->q(Ljava/util/List;)Z

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    if-eqz v4, :cond_3

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    check-cast p1, Ljava/util/Collection;

    .line 95
    .line 96
    invoke-static {p1}, Li8/k;->t0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    :goto_1
    invoke-static {p1}, Lv8/x;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    new-instance v4, LCa/c;

    .line 105
    .line 106
    invoke-direct {v4, p1}, LCa/c;-><init>(Ljava/util/List;)V

    .line 107
    .line 108
    .line 109
    new-instance p1, Lt1/G;

    .line 110
    .line 111
    invoke-direct {p1, v4}, Lt1/G;-><init>(LCa/c;)V

    .line 112
    .line 113
    .line 114
    const-class v4, Lcom/kcstream/cing/model/GetListResult;

    .line 115
    .line 116
    sget-object v6, Lv8/u;->a:Lv8/v;

    .line 117
    .line 118
    invoke-virtual {v6, v4}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    const-class v7, LG4/k;

    .line 123
    .line 124
    invoke-virtual {v6, v7}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    invoke-virtual {p1, v4, v6}, Lt1/G;->x(LC8/c;LC8/c;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v5}, Landroidx/fragment/app/b;->X()Landroid/content/Context;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    invoke-static {v3, v4}, LC3/b;->B(Landroidx/recyclerview/widget/RecyclerView;Landroid/content/Context;)Lcom/kcstream/cing/utils/GridAutoLayoutManager;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    iput-object v4, p1, Lt1/G;->s:Ljava/lang/Object;

    .line 140
    .line 141
    invoke-virtual {p1, v3}, Lt1/G;->r(Landroidx/recyclerview/widget/RecyclerView;)LCa/c;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 145
    .line 146
    .line 147
    iget-object p1, v5, Lcom/kcstream/cing/fragment/TabsIndexFragment;->v0:LFa/e;

    .line 148
    .line 149
    invoke-static {p1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    iget-object p1, p1, LFa/e;->u:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast p1, Landroid/widget/ProgressBar;

    .line 155
    .line 156
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 157
    .line 158
    .line 159
    iget-object p1, v5, Lcom/kcstream/cing/fragment/TabsIndexFragment;->v0:LFa/e;

    .line 160
    .line 161
    invoke-static {p1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    iget-object p1, p1, LFa/e;->w:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast p1, Landroid/widget/RelativeLayout;

    .line 167
    .line 168
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 169
    .line 170
    .line 171
    move-object v3, v2

    .line 172
    :cond_4
    if-nez v3, :cond_5

    .line 173
    .line 174
    iget-object p1, v5, Lcom/kcstream/cing/fragment/TabsIndexFragment;->v0:LFa/e;

    .line 175
    .line 176
    invoke-static {p1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    iget-object p1, p1, LFa/e;->v:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 182
    .line 183
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 184
    .line 185
    .line 186
    iget-object p1, v5, Lcom/kcstream/cing/fragment/TabsIndexFragment;->v0:LFa/e;

    .line 187
    .line 188
    invoke-static {p1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    iget-object p1, p1, LFa/e;->u:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast p1, Landroid/widget/ProgressBar;

    .line 194
    .line 195
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 196
    .line 197
    .line 198
    iget-object p1, v5, Lcom/kcstream/cing/fragment/TabsIndexFragment;->v0:LFa/e;

    .line 199
    .line 200
    invoke-static {p1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    iget-object p1, p1, LFa/e;->w:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast p1, Landroid/widget/RelativeLayout;

    .line 206
    .line 207
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V
    :try_end_1
    .catch Lretrofit2/HttpException; {:try_start_1 .. :try_end_1} :catch_0

    .line 208
    .line 209
    .line 210
    :catch_0
    :cond_5
    return-object v2
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
