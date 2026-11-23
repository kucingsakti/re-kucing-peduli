.class public final LA0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq0/I;


# instance fields
.field public final synthetic a:Ly0/l;

.field public final synthetic b:LA0/g;


# direct methods
.method public constructor <init>(Ly0/l;LA0/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LA0/n;->a:Ly0/l;

    .line 5
    .line 6
    iput-object p2, p0, LA0/n;->b:LA0/g;

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
.method public final a(Landroidx/fragment/app/b;Z)V
    .locals 11

    .line 1
    const-string v0, "fragment"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA0/n;->a:Ly0/l;

    .line 7
    .line 8
    iget-object v1, v0, Ly0/l;->e:LP0/d;

    .line 9
    .line 10
    iget-object v1, v1, LP0/d;->t:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, LQ9/m;

    .line 13
    .line 14
    check-cast v1, LQ9/t;

    .line 15
    .line 16
    invoke-virtual {v1}, LQ9/t;->f()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ljava/util/Collection;

    .line 21
    .line 22
    iget-object v2, v0, Ly0/l;->f:LP0/d;

    .line 23
    .line 24
    iget-object v2, v2, LP0/d;->t:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, LQ9/m;

    .line 27
    .line 28
    check-cast v2, LQ9/t;

    .line 29
    .line 30
    invoke-virtual {v2}, LQ9/t;->f()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Ljava/lang/Iterable;

    .line 35
    .line 36
    invoke-static {v1, v2}, Li8/k;->g0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    :cond_0
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    const/4 v3, 0x0

    .line 53
    if-eqz v2, :cond_1

    .line 54
    .line 55
    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    move-object v4, v2

    .line 60
    check-cast v4, Ly0/j;

    .line 61
    .line 62
    iget-object v4, v4, Ly0/j;->x:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v5, p1, Landroidx/fragment/app/b;->T:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v4, v5}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-eqz v4, :cond_0

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    move-object v2, v3

    .line 74
    :goto_0
    check-cast v2, Ly0/j;

    .line 75
    .line 76
    const/4 v1, 0x1

    .line 77
    const/4 v4, 0x0

    .line 78
    iget-object v5, p0, LA0/n;->b:LA0/g;

    .line 79
    .line 80
    if-eqz p2, :cond_2

    .line 81
    .line 82
    iget-object v6, v5, LA0/g;->g:Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    if-eqz v6, :cond_2

    .line 89
    .line 90
    iget-boolean v6, p1, Landroidx/fragment/app/b;->E:Z

    .line 91
    .line 92
    if-eqz v6, :cond_2

    .line 93
    .line 94
    move v6, v1

    .line 95
    goto :goto_1

    .line 96
    :cond_2
    move v6, v4

    .line 97
    :goto_1
    iget-object v7, v5, LA0/g;->g:Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    :cond_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    if-eqz v8, :cond_4

    .line 108
    .line 109
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    move-object v9, v8

    .line 114
    check-cast v9, Lh8/f;

    .line 115
    .line 116
    iget-object v9, v9, Lh8/f;->s:Ljava/lang/Object;

    .line 117
    .line 118
    iget-object v10, p1, Landroidx/fragment/app/b;->T:Ljava/lang/String;

    .line 119
    .line 120
    invoke-static {v9, v10}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v9

    .line 124
    if-eqz v9, :cond_3

    .line 125
    .line 126
    move-object v3, v8

    .line 127
    :cond_4
    check-cast v3, Lh8/f;

    .line 128
    .line 129
    if-eqz v3, :cond_5

    .line 130
    .line 131
    iget-object v7, v5, LA0/g;->g:Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    :cond_5
    if-nez v6, :cond_6

    .line 137
    .line 138
    invoke-static {}, LA0/g;->n()Z

    .line 139
    .line 140
    .line 141
    move-result v7

    .line 142
    if-eqz v7, :cond_6

    .line 143
    .line 144
    invoke-virtual {p1}, Landroidx/fragment/app/b;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    :cond_6
    if-eqz v3, :cond_7

    .line 151
    .line 152
    iget-object v3, v3, Lh8/f;->t:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v3, Ljava/lang/Boolean;

    .line 155
    .line 156
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    if-ne v3, v1, :cond_7

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_7
    move v1, v4

    .line 164
    :goto_2
    if-nez p2, :cond_9

    .line 165
    .line 166
    if-nez v1, :cond_9

    .line 167
    .line 168
    if-eqz v2, :cond_8

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_8
    const-string p2, "The fragment "

    .line 172
    .line 173
    const-string v0, " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager."

    .line 174
    .line 175
    invoke-static {p2, p1, v0}, Landroidx/datastore/preferences/protobuf/g;->i(Ljava/lang/String;Landroidx/fragment/app/b;Ljava/lang/String;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 180
    .line 181
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    throw p2

    .line 189
    :cond_9
    :goto_3
    if-eqz v2, :cond_b

    .line 190
    .line 191
    invoke-virtual {v5, p1, v2, v0}, LA0/g;->l(Landroidx/fragment/app/b;Ly0/j;Ly0/l;)V

    .line 192
    .line 193
    .line 194
    if-eqz v6, :cond_b

    .line 195
    .line 196
    invoke-static {}, LA0/g;->n()Z

    .line 197
    .line 198
    .line 199
    move-result p2

    .line 200
    if-eqz p2, :cond_a

    .line 201
    .line 202
    invoke-virtual {p1}, Landroidx/fragment/app/b;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2}, Ly0/j;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    :cond_a
    invoke-virtual {v0, v2, v4}, Ly0/l;->f(Ly0/j;Z)V

    .line 209
    .line 210
    .line 211
    :cond_b
    return-void
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

.method public final b()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public final c(Landroidx/fragment/app/b;Z)V
    .locals 5

    .line 1
    const-string v0, "fragment"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_4

    .line 7
    .line 8
    iget-object p2, p0, LA0/n;->a:Ly0/l;

    .line 9
    .line 10
    iget-object v0, p2, Ly0/l;->e:LP0/d;

    .line 11
    .line 12
    iget-object v0, v0, LP0/d;->t:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, LQ9/m;

    .line 15
    .line 16
    check-cast v0, LQ9/t;

    .line 17
    .line 18
    invoke-virtual {v0}, LQ9/t;->f()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    const/4 v2, 0x0

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    move-object v3, v1

    .line 44
    check-cast v3, Ly0/j;

    .line 45
    .line 46
    iget-object v3, v3, Ly0/j;->x:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v4, p1, Landroidx/fragment/app/b;->T:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v3, v4}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_0

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    move-object v1, v2

    .line 58
    :goto_0
    check-cast v1, Ly0/j;

    .line 59
    .line 60
    iget-object v0, p0, LA0/n;->b:LA0/g;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-static {}, LA0/g;->n()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_2

    .line 70
    .line 71
    invoke-virtual {p1}, Landroidx/fragment/app/b;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    :cond_2
    if-eqz v1, :cond_4

    .line 78
    .line 79
    iget-object p1, p2, Ly0/l;->c:LQ9/t;

    .line 80
    .line 81
    invoke-virtual {p1}, LQ9/t;->f()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, Ljava/util/Set;

    .line 86
    .line 87
    invoke-static {v0, v1}, Li8/C;->v(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {p1, v2, v0}, LQ9/t;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    iget-object p1, p2, Ly0/l;->h:Ly0/B;

    .line 95
    .line 96
    iget-object p1, p1, Ly0/B;->g:Li8/h;

    .line 97
    .line 98
    invoke-virtual {p1, v1}, Li8/h;->contains(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-eqz p1, :cond_3

    .line 103
    .line 104
    sget-object p1, Landroidx/lifecycle/n;->v:Landroidx/lifecycle/n;

    .line 105
    .line 106
    invoke-virtual {v1, p1}, Ly0/j;->c(Landroidx/lifecycle/n;)V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 111
    .line 112
    const-string p2, "Cannot transition entry that is not in the back stack"

    .line 113
    .line 114
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw p1

    .line 118
    :cond_4
    return-void
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
