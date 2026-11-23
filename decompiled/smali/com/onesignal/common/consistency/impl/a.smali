.class public final Lcom/onesignal/common/consistency/impl/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LS4/c;


# instance fields
.field private final conditions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lh8/f;",
            ">;"
        }
    .end annotation
.end field

.field private final indexedTokens:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "LS4/b;",
            "LQ4/b;",
            ">;>;"
        }
    .end annotation
.end field

.field private final mutex:LV9/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, LV9/e;->a()LV9/d;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lcom/onesignal/common/consistency/impl/a;->mutex:LV9/a;

    .line 9
    .line 10
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/onesignal/common/consistency/impl/a;->indexedTokens:Ljava/util/Map;

    .line 16
    .line 17
    new-instance v0, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/onesignal/common/consistency/impl/a;->conditions:Ljava/util/List;

    .line 23
    .line 24
    return-void
    .line 25
    .line 26
.end method

.method private final checkConditionsAndComplete()V
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/onesignal/common/consistency/impl/a;->conditions:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_2

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lh8/f;

    .line 23
    .line 24
    iget-object v3, v2, Lh8/f;->s:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v3, LS4/a;

    .line 27
    .line 28
    iget-object v2, v2, Lh8/f;->t:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, LN9/l;

    .line 31
    .line 32
    iget-object v4, p0, Lcom/onesignal/common/consistency/impl/a;->indexedTokens:Ljava/util/Map;

    .line 33
    .line 34
    invoke-interface {v3, v4}, LS4/a;->isMet(Ljava/util/Map;)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_0

    .line 39
    .line 40
    iget-object v4, p0, Lcom/onesignal/common/consistency/impl/a;->indexedTokens:Ljava/util/Map;

    .line 41
    .line 42
    invoke-interface {v3, v4}, LS4/a;->getRywData(Ljava/util/Map;)LQ4/b;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    move-object v5, v2

    .line 47
    check-cast v5, LN9/k0;

    .line 48
    .line 49
    invoke-virtual {v5}, LN9/k0;->y()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    instance-of v5, v5, LN9/Y;

    .line 54
    .line 55
    if-eqz v5, :cond_1

    .line 56
    .line 57
    move-object v5, v2

    .line 58
    check-cast v5, LN9/m;

    .line 59
    .line 60
    invoke-virtual {v5, v4}, LN9/k0;->F(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    :cond_1
    new-instance v4, Lh8/f;

    .line 64
    .line 65
    invoke-direct {v4, v3, v2}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    iget-object v1, p0, Lcom/onesignal/common/consistency/impl/a;->conditions:Ljava/util/List;

    .line 73
    .line 74
    invoke-interface {v1, v0}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 75
    .line 76
    .line 77
    return-void
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


# virtual methods
.method public getRywDataFromAwaitableCondition(LS4/a;Lm8/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LS4/a;",
            "Lm8/d<",
            "-",
            "LN9/l;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Lcom/onesignal/common/consistency/impl/a$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/onesignal/common/consistency/impl/a$a;

    .line 7
    .line 8
    iget v1, v0, Lcom/onesignal/common/consistency/impl/a$a;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/onesignal/common/consistency/impl/a$a;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/onesignal/common/consistency/impl/a$a;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/onesignal/common/consistency/impl/a$a;-><init>(Lcom/onesignal/common/consistency/impl/a;Lm8/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/onesignal/common/consistency/impl/a$a;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Ln8/a;->s:Ln8/a;

    .line 28
    .line 29
    iget v2, v0, Lcom/onesignal/common/consistency/impl/a$a;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p1, v0, Lcom/onesignal/common/consistency/impl/a$a;->L$2:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, LV9/a;

    .line 39
    .line 40
    iget-object v1, v0, Lcom/onesignal/common/consistency/impl/a$a;->L$1:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, LS4/a;

    .line 43
    .line 44
    iget-object v0, v0, Lcom/onesignal/common/consistency/impl/a$a;->L$0:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Lcom/onesignal/common/consistency/impl/a;

    .line 47
    .line 48
    invoke-static {p2}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    move-object p2, p1

    .line 52
    move-object p1, v1

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1

    .line 62
    :cond_2
    invoke-static {p2}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object p2, p0, Lcom/onesignal/common/consistency/impl/a;->mutex:LV9/a;

    .line 66
    .line 67
    iput-object p0, v0, Lcom/onesignal/common/consistency/impl/a$a;->L$0:Ljava/lang/Object;

    .line 68
    .line 69
    iput-object p1, v0, Lcom/onesignal/common/consistency/impl/a$a;->L$1:Ljava/lang/Object;

    .line 70
    .line 71
    iput-object p2, v0, Lcom/onesignal/common/consistency/impl/a$a;->L$2:Ljava/lang/Object;

    .line 72
    .line 73
    iput v3, v0, Lcom/onesignal/common/consistency/impl/a$a;->label:I

    .line 74
    .line 75
    check-cast p2, LV9/d;

    .line 76
    .line 77
    invoke-virtual {p2, v0}, LV9/d;->d(Lo8/c;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    if-ne v0, v1, :cond_3

    .line 82
    .line 83
    return-object v1

    .line 84
    :cond_3
    move-object v0, p0

    .line 85
    :goto_1
    const/4 v1, 0x0

    .line 86
    :try_start_0
    invoke-static {}, LN9/z;->a()LN9/m;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    new-instance v3, Lh8/f;

    .line 91
    .line 92
    invoke-direct {v3, p1, v2}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    iget-object p1, v0, Lcom/onesignal/common/consistency/impl/a;->conditions:Ljava/util/List;

    .line 96
    .line 97
    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    invoke-direct {v0}, Lcom/onesignal/common/consistency/impl/a;->checkConditionsAndComplete()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    .line 102
    .line 103
    check-cast p2, LV9/d;

    .line 104
    .line 105
    invoke-virtual {p2, v1}, LV9/d;->e(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    return-object v2

    .line 109
    :catchall_0
    move-exception p1

    .line 110
    check-cast p2, LV9/d;

    .line 111
    .line 112
    invoke-virtual {p2, v1}, LV9/d;->e(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    throw p1
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

.method public resolveConditionsWithID(Ljava/lang/String;Lm8/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lm8/d<",
            "-",
            "Lh8/m;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance p2, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/onesignal/common/consistency/impl/a;->conditions:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lh8/f;

    .line 23
    .line 24
    iget-object v2, v1, Lh8/f;->s:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, LS4/a;

    .line 27
    .line 28
    iget-object v1, v1, Lh8/f;->t:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, LN9/l;

    .line 31
    .line 32
    invoke-interface {v2}, LS4/a;->getId()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-static {v3, p1}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_0

    .line 41
    .line 42
    move-object v3, v1

    .line 43
    check-cast v3, LN9/k0;

    .line 44
    .line 45
    invoke-virtual {v3}, LN9/k0;->y()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    instance-of v3, v3, LN9/Y;

    .line 50
    .line 51
    if-eqz v3, :cond_0

    .line 52
    .line 53
    move-object v3, v1

    .line 54
    check-cast v3, LN9/m;

    .line 55
    .line 56
    const/4 v4, 0x0

    .line 57
    invoke-virtual {v3, v4}, LN9/k0;->F(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    :cond_0
    new-instance v3, Lh8/f;

    .line 61
    .line 62
    invoke-direct {v3, v2, v1}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    iget-object p1, p0, Lcom/onesignal/common/consistency/impl/a;->conditions:Ljava/util/List;

    .line 70
    .line 71
    invoke-interface {p1, p2}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 72
    .line 73
    .line 74
    sget-object p1, Lh8/m;->a:Lh8/m;

    .line 75
    .line 76
    return-object p1
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

.method public setRywData(Ljava/lang/String;LS4/b;LQ4/b;Lm8/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "LS4/b;",
            "LQ4/b;",
            "Lm8/d<",
            "-",
            "Lh8/m;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p4, Lcom/onesignal/common/consistency/impl/a$b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lcom/onesignal/common/consistency/impl/a$b;

    .line 7
    .line 8
    iget v1, v0, Lcom/onesignal/common/consistency/impl/a$b;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/onesignal/common/consistency/impl/a$b;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/onesignal/common/consistency/impl/a$b;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lcom/onesignal/common/consistency/impl/a$b;-><init>(Lcom/onesignal/common/consistency/impl/a;Lm8/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lcom/onesignal/common/consistency/impl/a$b;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Ln8/a;->s:Ln8/a;

    .line 28
    .line 29
    iget v2, v0, Lcom/onesignal/common/consistency/impl/a$b;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p1, v0, Lcom/onesignal/common/consistency/impl/a$b;->L$4:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, LV9/a;

    .line 39
    .line 40
    iget-object p2, v0, Lcom/onesignal/common/consistency/impl/a$b;->L$3:Ljava/lang/Object;

    .line 41
    .line 42
    move-object p3, p2

    .line 43
    check-cast p3, LQ4/b;

    .line 44
    .line 45
    iget-object p2, v0, Lcom/onesignal/common/consistency/impl/a$b;->L$2:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p2, LS4/b;

    .line 48
    .line 49
    iget-object v1, v0, Lcom/onesignal/common/consistency/impl/a$b;->L$1:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Ljava/lang/String;

    .line 52
    .line 53
    iget-object v0, v0, Lcom/onesignal/common/consistency/impl/a$b;->L$0:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Lcom/onesignal/common/consistency/impl/a;

    .line 56
    .line 57
    invoke-static {p4}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    move-object p4, p1

    .line 61
    move-object p1, v1

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 64
    .line 65
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 66
    .line 67
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p1

    .line 71
    :cond_2
    invoke-static {p4}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object p4, p0, Lcom/onesignal/common/consistency/impl/a;->mutex:LV9/a;

    .line 75
    .line 76
    iput-object p0, v0, Lcom/onesignal/common/consistency/impl/a$b;->L$0:Ljava/lang/Object;

    .line 77
    .line 78
    iput-object p1, v0, Lcom/onesignal/common/consistency/impl/a$b;->L$1:Ljava/lang/Object;

    .line 79
    .line 80
    iput-object p2, v0, Lcom/onesignal/common/consistency/impl/a$b;->L$2:Ljava/lang/Object;

    .line 81
    .line 82
    iput-object p3, v0, Lcom/onesignal/common/consistency/impl/a$b;->L$3:Ljava/lang/Object;

    .line 83
    .line 84
    iput-object p4, v0, Lcom/onesignal/common/consistency/impl/a$b;->L$4:Ljava/lang/Object;

    .line 85
    .line 86
    iput v3, v0, Lcom/onesignal/common/consistency/impl/a$b;->label:I

    .line 87
    .line 88
    check-cast p4, LV9/d;

    .line 89
    .line 90
    invoke-virtual {p4, v0}, LV9/d;->d(Lo8/c;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    if-ne v0, v1, :cond_3

    .line 95
    .line 96
    return-object v1

    .line 97
    :cond_3
    move-object v0, p0

    .line 98
    :goto_1
    const/4 v1, 0x0

    .line 99
    :try_start_0
    iget-object v2, v0, Lcom/onesignal/common/consistency/impl/a;->indexedTokens:Ljava/util/Map;

    .line 100
    .line 101
    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    if-nez v3, :cond_4

    .line 106
    .line 107
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 108
    .line 109
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-interface {v2, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :catchall_0
    move-exception p1

    .line 117
    goto :goto_3

    .line 118
    :cond_4
    :goto_2
    check-cast v3, Ljava/util/Map;

    .line 119
    .line 120
    invoke-interface {v3, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    invoke-direct {v0}, Lcom/onesignal/common/consistency/impl/a;->checkConditionsAndComplete()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    .line 125
    .line 126
    check-cast p4, LV9/d;

    .line 127
    .line 128
    invoke-virtual {p4, v1}, LV9/d;->e(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    sget-object p1, Lh8/m;->a:Lh8/m;

    .line 132
    .line 133
    return-object p1

    .line 134
    :goto_3
    check-cast p4, LV9/d;

    .line 135
    .line 136
    invoke-virtual {p4, v1}, LV9/d;->e(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    throw p1
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
