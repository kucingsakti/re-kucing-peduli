.class public final LJ4/d;
.super LX2/i;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "LJ4/d;",
        "LX2/i;",
        "<init>",
        "()V",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public J0:LA1/r;

.field public final K0:Ljava/util/ArrayList;

.field public L0:LCa/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LX2/i;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LJ4/d;->K0:Ljava/util/ArrayList;

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
.end method

.method public static final o0(LJ4/d;Lcom/tonyodev/fetch2/Download;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object v2, p0, LJ4/d;->K0:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    move v4, v0

    .line 10
    :goto_0
    if-ge v4, v3, :cond_4

    .line 11
    .line 12
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v5

    .line 16
    const-string v6, "get(...)"

    .line 17
    .line 18
    invoke-static {v5, v6}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    check-cast v5, LJ4/a;

    .line 22
    .line 23
    iget v5, v5, LJ4/a;->a:I

    .line 24
    .line 25
    move-object v6, p1

    .line 26
    check-cast v6, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 27
    .line 28
    iget v7, v6, Lcom/tonyodev/fetch2/database/DownloadInfo;->s:I

    .line 29
    .line 30
    if-ne v5, v7, :cond_3

    .line 31
    .line 32
    iget-object v5, v6, Lcom/tonyodev/fetch2/database/DownloadInfo;->B:Lh7/f;

    .line 33
    .line 34
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    const/4 v6, 0x4

    .line 39
    if-eq v5, v6, :cond_2

    .line 40
    .line 41
    const/4 v6, 0x5

    .line 42
    if-eq v5, v6, :cond_1

    .line 43
    .line 44
    const/16 v6, 0x8

    .line 45
    .line 46
    if-eq v5, v6, :cond_0

    .line 47
    .line 48
    sget-object v5, LHa/a;->a:Lza/c;

    .line 49
    .line 50
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    new-array v7, v1, [Ljava/lang/Object;

    .line 55
    .line 56
    aput-object v6, v7, v0

    .line 57
    .line 58
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-static {v7}, Lza/c;->h([Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object v5, p0, LJ4/d;->L0:LCa/c;

    .line 65
    .line 66
    if-eqz v5, :cond_3

    .line 67
    .line 68
    iget-object v6, v5, LCa/c;->i:Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {v6, v4, p1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    iget-object v6, v5, LCa/c;->i:Ljava/util/List;

    .line 74
    .line 75
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    iput v6, v5, LCa/c;->d:I

    .line 80
    .line 81
    const/4 v6, 0x0

    .line 82
    iget-object v5, v5, Landroidx/recyclerview/widget/s;->a:LJ0/t;

    .line 83
    .line 84
    invoke-virtual {v5, v4, v1, v6}, LJ0/t;->c(IILandroidx/preference/Preference;)V

    .line 85
    .line 86
    .line 87
    goto/16 :goto_1

    .line 88
    .line 89
    :cond_0
    sget-object v5, LHa/a;->a:Lza/c;

    .line 90
    .line 91
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    new-array v7, v1, [Ljava/lang/Object;

    .line 96
    .line 97
    aput-object v6, v7, v0

    .line 98
    .line 99
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-static {v7}, Lza/c;->h([Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    iget-object v5, p0, LJ4/d;->L0:LCa/c;

    .line 109
    .line 110
    if-eqz v5, :cond_3

    .line 111
    .line 112
    iget-object v6, v5, LCa/c;->i:Ljava/util/List;

    .line 113
    .line 114
    check-cast v6, Ljava/util/Collection;

    .line 115
    .line 116
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 117
    .line 118
    .line 119
    move-result v6

    .line 120
    if-nez v6, :cond_3

    .line 121
    .line 122
    iget-object v6, v5, LCa/c;->i:Ljava/util/List;

    .line 123
    .line 124
    invoke-interface {v6, v4}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    iget-object v6, v5, LCa/c;->i:Ljava/util/List;

    .line 128
    .line 129
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    iput v6, v5, LCa/c;->d:I

    .line 134
    .line 135
    iget-object v5, v5, Landroidx/recyclerview/widget/s;->a:LJ0/t;

    .line 136
    .line 137
    invoke-virtual {v5, v4, v1}, LJ0/t;->e(II)V

    .line 138
    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_1
    sget-object v5, LHa/a;->a:Lza/c;

    .line 142
    .line 143
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v6

    .line 147
    new-array v7, v1, [Ljava/lang/Object;

    .line 148
    .line 149
    aput-object v6, v7, v0

    .line 150
    .line 151
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-static {v7}, Lza/c;->h([Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    iget-object v5, p0, LJ4/d;->L0:LCa/c;

    .line 161
    .line 162
    if-eqz v5, :cond_3

    .line 163
    .line 164
    iget-object v6, v5, LCa/c;->i:Ljava/util/List;

    .line 165
    .line 166
    check-cast v6, Ljava/util/Collection;

    .line 167
    .line 168
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 169
    .line 170
    .line 171
    move-result v6

    .line 172
    if-nez v6, :cond_3

    .line 173
    .line 174
    iget-object v6, v5, LCa/c;->i:Ljava/util/List;

    .line 175
    .line 176
    invoke-interface {v6, v4}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    iget-object v6, v5, LCa/c;->i:Ljava/util/List;

    .line 180
    .line 181
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 182
    .line 183
    .line 184
    move-result v6

    .line 185
    iput v6, v5, LCa/c;->d:I

    .line 186
    .line 187
    iget-object v5, v5, Landroidx/recyclerview/widget/s;->a:LJ0/t;

    .line 188
    .line 189
    invoke-virtual {v5, v4, v1}, LJ0/t;->e(II)V

    .line 190
    .line 191
    .line 192
    goto :goto_1

    .line 193
    :cond_2
    sget-object v5, LHa/a;->a:Lza/c;

    .line 194
    .line 195
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v6

    .line 199
    new-array v7, v1, [Ljava/lang/Object;

    .line 200
    .line 201
    aput-object v6, v7, v0

    .line 202
    .line 203
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    invoke-static {v7}, Lza/c;->h([Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    :cond_3
    :goto_1
    add-int/2addr v4, v1

    .line 210
    goto/16 :goto_0

    .line 211
    .line 212
    :cond_4
    return-void
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
.end method


# virtual methods
.method public final E(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 1
    const-string p3, "inflater"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const p3, 0x7f0d0022

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const p2, 0x7f0a027b

    .line 15
    .line 16
    .line 17
    invoke-static {p1, p2}, Loa/b;->c(Landroid/view/View;I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    check-cast p3, Landroidx/recyclerview/widget/RecyclerView;

    .line 22
    .line 23
    if-eqz p3, :cond_0

    .line 24
    .line 25
    new-instance p2, LA1/r;

    .line 26
    .line 27
    check-cast p1, Landroid/widget/RelativeLayout;

    .line 28
    .line 29
    invoke-direct {p2, p1, p3}, LA1/r;-><init>(Landroid/widget/RelativeLayout;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 30
    .line 31
    .line 32
    iput-object p2, p0, LJ4/d;->J0:LA1/r;

    .line 33
    .line 34
    const-string p2, "getRoot(...)"

    .line 35
    .line 36
    invoke-static {p1, p2}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    new-instance p2, Ljava/lang/NullPointerException;

    .line 49
    .line 50
    const-string p3, "Missing required view with ID: "

    .line 51
    .line 52
    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p2
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
.end method

.method public final L()V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/b;->a0:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/b;->X()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, LD3/b;->i(Landroid/content/Context;)LO3/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, LJ4/c;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-direct {v1, p0, v2}, LJ4/c;-><init>(Ljava/lang/Object;I)V

    .line 16
    .line 17
    .line 18
    iget-object v2, v0, LO3/a;->a:Ljava/lang/Object;

    .line 19
    .line 20
    monitor-enter v2

    .line 21
    :try_start_0
    iget-object v3, v0, LO3/a;->d:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v3, Lq7/i;

    .line 24
    .line 25
    new-instance v4, Ll7/b;

    .line 26
    .line 27
    const/4 v5, 0x1

    .line 28
    invoke-direct {v4, v0, v1, v5}, Ll7/b;-><init>(LO3/a;LJ4/c;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3, v4}, Lq7/i;->d(Lu8/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    monitor-exit v2

    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    monitor-exit v2

    .line 38
    throw v0
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

.method public final N()V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iput-boolean v1, p0, Landroidx/fragment/app/b;->a0:Z

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/b;->X()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-static {v2}, LD3/b;->i(Landroid/content/Context;)LO3/a;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v3, 0x4

    .line 14
    new-array v3, v3, [Lh7/f;

    .line 15
    .line 16
    sget-object v4, Lh7/f;->v:Lh7/f;

    .line 17
    .line 18
    aput-object v4, v3, v0

    .line 19
    .line 20
    sget-object v4, Lh7/f;->C:Lh7/f;

    .line 21
    .line 22
    aput-object v4, v3, v1

    .line 23
    .line 24
    sget-object v1, Lh7/f;->w:Lh7/f;

    .line 25
    .line 26
    const/4 v4, 0x2

    .line 27
    aput-object v1, v3, v4

    .line 28
    .line 29
    sget-object v1, Lh7/f;->u:Lh7/f;

    .line 30
    .line 31
    const/4 v4, 0x3

    .line 32
    aput-object v1, v3, v4

    .line 33
    .line 34
    invoke-static {v3}, Li8/l;->C([Ljava/lang/Object;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    new-instance v3, LE4/a;

    .line 39
    .line 40
    const/4 v4, 0x6

    .line 41
    invoke-direct {v3, p0, v4}, LE4/a;-><init>(Ljava/lang/Object;I)V

    .line 42
    .line 43
    .line 44
    iget-object v4, v2, LO3/a;->a:Ljava/lang/Object;

    .line 45
    .line 46
    monitor-enter v4

    .line 47
    :try_start_0
    iget-object v5, v2, LO3/a;->d:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v5, Lq7/i;

    .line 50
    .line 51
    new-instance v6, LA0/j;

    .line 52
    .line 53
    const/16 v7, 0xa

    .line 54
    .line 55
    invoke-direct {v6, v2, v1, v3, v7}, LA0/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v5, v6}, Lq7/i;->d(Lu8/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    monitor-exit v4

    .line 62
    new-instance v1, LJ4/c;

    .line 63
    .line 64
    invoke-direct {v1, p0, v0}, LJ4/c;-><init>(Ljava/lang/Object;I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, v1}, LO3/a;->a(LJ4/c;)LO3/a;

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :catchall_0
    move-exception v0

    .line 72
    monitor-exit v4

    .line 73
    throw v0
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

.method public final R(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 4

    .line 1
    const-string p2, "view"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LJ4/d;->J0:LA1/r;

    .line 7
    .line 8
    const/4 p2, 0x0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v1, LCa/c;

    .line 17
    .line 18
    invoke-direct {v1, v0}, LCa/c;-><init>(Ljava/util/List;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lt1/G;

    .line 22
    .line 23
    invoke-direct {v0, v1}, Lt1/G;-><init>(LCa/c;)V

    .line 24
    .line 25
    .line 26
    sget-object v1, Lv8/u;->a:Lv8/v;

    .line 27
    .line 28
    const-class v2, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const-class v3, LJ4/b;

    .line 35
    .line 36
    invoke-virtual {v1, v3}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0, v2, v1}, Lt1/G;->x(LC8/c;LC8/c;)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p1, LA1/r;->t:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 46
    .line 47
    invoke-virtual {v0, p1}, Lt1/G;->r(Landroidx/recyclerview/widget/RecyclerView;)LCa/c;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-object v0, p0, LJ4/d;->L0:LCa/c;

    .line 52
    .line 53
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/u;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_0
    const-string p1, "binding"

    .line 58
    .line 59
    invoke-static {p1}, Lv8/i;->n(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p2
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
.end method

.method public final j0()I
    .locals 1

    .line 1
    const v0, 0x7f15012b

    .line 2
    .line 3
    .line 4
    return v0
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
