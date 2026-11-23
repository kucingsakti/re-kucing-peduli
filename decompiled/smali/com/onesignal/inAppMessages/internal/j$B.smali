.class public final Lcom/onesignal/inAppMessages/internal/j$B;
.super Lo8/g;
.source "SourceFile"

# interfaces
.implements Lu8/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/onesignal/inAppMessages/internal/j;->start()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/onesignal/inAppMessages/internal/j;


# direct methods
.method public constructor <init>(Lcom/onesignal/inAppMessages/internal/j;Lm8/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/onesignal/inAppMessages/internal/j;",
            "Lm8/d<",
            "-",
            "Lcom/onesignal/inAppMessages/internal/j$B;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/onesignal/inAppMessages/internal/j$B;->this$0:Lcom/onesignal/inAppMessages/internal/j;

    .line 2
    .line 3
    const/4 p1, 0x1

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
.method public final create(Lm8/d;)Lm8/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm8/d<",
            "*>;)",
            "Lm8/d<",
            "Lh8/m;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/onesignal/inAppMessages/internal/j$B;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/onesignal/inAppMessages/internal/j$B;->this$0:Lcom/onesignal/inAppMessages/internal/j;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, Lcom/onesignal/inAppMessages/internal/j$B;-><init>(Lcom/onesignal/inAppMessages/internal/j;Lm8/d;)V

    .line 6
    .line 7
    .line 8
    return-object v0
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
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lm8/d;

    invoke-virtual {p0, p1}, Lcom/onesignal/inAppMessages/internal/j$B;->invoke(Lm8/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lm8/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm8/d<",
            "-",
            "Lh8/m;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lcom/onesignal/inAppMessages/internal/j$B;->create(Lm8/d;)Lm8/d;

    move-result-object p1

    check-cast p1, Lcom/onesignal/inAppMessages/internal/j$B;

    sget-object v0, Lh8/m;->a:Lh8/m;

    invoke-virtual {p1, v0}, Lcom/onesignal/inAppMessages/internal/j$B;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v0, Ln8/a;->s:Ln8/a;

    .line 2
    .line 3
    iget v1, p0, Lcom/onesignal/inAppMessages/internal/j$B;->label:I

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    const/4 v3, 0x4

    .line 7
    const/4 v4, 0x3

    .line 8
    const/4 v5, 0x2

    .line 9
    const/4 v6, 0x1

    .line 10
    if-eqz v1, :cond_5

    .line 11
    .line 12
    if-eq v1, v6, :cond_4

    .line 13
    .line 14
    if-eq v1, v5, :cond_3

    .line 15
    .line 16
    if-eq v1, v4, :cond_2

    .line 17
    .line 18
    if-eq v1, v3, :cond_1

    .line 19
    .line 20
    if-ne v1, v2, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto/16 :goto_6

    .line 26
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
    goto/16 :goto_4

    .line 39
    .line 40
    :cond_2
    invoke-static {p1}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto/16 :goto_3

    .line 44
    .line 45
    :cond_3
    iget-object v1, p0, Lcom/onesignal/inAppMessages/internal/j$B;->L$0:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, Ljava/util/List;

    .line 48
    .line 49
    invoke-static {p1}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_4
    invoke-static {p1}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_5
    invoke-static {p1}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Lcom/onesignal/inAppMessages/internal/j$B;->this$0:Lcom/onesignal/inAppMessages/internal/j;

    .line 61
    .line 62
    invoke-static {p1}, Lcom/onesignal/inAppMessages/internal/j;->access$get_repository$p(Lcom/onesignal/inAppMessages/internal/j;)Ly5/a;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iput v6, p0, Lcom/onesignal/inAppMessages/internal/j$B;->label:I

    .line 67
    .line 68
    invoke-interface {p1, p0}, Ly5/a;->cleanCachedInAppMessages(Lm8/d;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    if-ne p1, v0, :cond_6

    .line 73
    .line 74
    goto/16 :goto_5

    .line 75
    .line 76
    :cond_6
    :goto_0
    iget-object p1, p0, Lcom/onesignal/inAppMessages/internal/j$B;->this$0:Lcom/onesignal/inAppMessages/internal/j;

    .line 77
    .line 78
    invoke-static {p1}, Lcom/onesignal/inAppMessages/internal/j;->access$getRedisplayedInAppMessages$p(Lcom/onesignal/inAppMessages/internal/j;)Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    iget-object p1, p0, Lcom/onesignal/inAppMessages/internal/j$B;->this$0:Lcom/onesignal/inAppMessages/internal/j;

    .line 83
    .line 84
    invoke-static {p1}, Lcom/onesignal/inAppMessages/internal/j;->access$get_repository$p(Lcom/onesignal/inAppMessages/internal/j;)Ly5/a;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    iput-object v1, p0, Lcom/onesignal/inAppMessages/internal/j$B;->L$0:Ljava/lang/Object;

    .line 89
    .line 90
    iput v5, p0, Lcom/onesignal/inAppMessages/internal/j$B;->label:I

    .line 91
    .line 92
    invoke-interface {p1, p0}, Ly5/a;->listInAppMessages(Lm8/d;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    if-ne p1, v0, :cond_7

    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_7
    :goto_1
    check-cast p1, Ljava/util/Collection;

    .line 100
    .line 101
    invoke-interface {v1, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 102
    .line 103
    .line 104
    iget-object p1, p0, Lcom/onesignal/inAppMessages/internal/j$B;->this$0:Lcom/onesignal/inAppMessages/internal/j;

    .line 105
    .line 106
    invoke-static {p1}, Lcom/onesignal/inAppMessages/internal/j;->access$getRedisplayedInAppMessages$p(Lcom/onesignal/inAppMessages/internal/j;)Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    if-eqz v1, :cond_8

    .line 119
    .line 120
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    check-cast v1, Lcom/onesignal/inAppMessages/internal/a;

    .line 125
    .line 126
    const/4 v5, 0x0

    .line 127
    invoke-virtual {v1, v5}, Lcom/onesignal/inAppMessages/internal/a;->setDisplayedInSession(Z)V

    .line 128
    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_8
    iget-object p1, p0, Lcom/onesignal/inAppMessages/internal/j$B;->this$0:Lcom/onesignal/inAppMessages/internal/j;

    .line 132
    .line 133
    invoke-static {p1}, Lcom/onesignal/inAppMessages/internal/j;->access$get_userManager$p(Lcom/onesignal/inAppMessages/internal/j;)Lm6/a;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-interface {p1}, Lm6/a;->getOnesignalId()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    iget-object v1, p0, Lcom/onesignal/inAppMessages/internal/j$B;->this$0:Lcom/onesignal/inAppMessages/internal/j;

    .line 142
    .line 143
    invoke-static {v1}, Lcom/onesignal/inAppMessages/internal/j;->access$get_consistencyManager$p(Lcom/onesignal/inAppMessages/internal/j;)LS4/c;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    new-instance v5, LQ4/a;

    .line 148
    .line 149
    invoke-direct {v5, p1}, LQ4/a;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    const/4 p1, 0x0

    .line 153
    iput-object p1, p0, Lcom/onesignal/inAppMessages/internal/j$B;->L$0:Ljava/lang/Object;

    .line 154
    .line 155
    iput v4, p0, Lcom/onesignal/inAppMessages/internal/j$B;->label:I

    .line 156
    .line 157
    invoke-interface {v1, v5, p0}, LS4/c;->getRywDataFromAwaitableCondition(LS4/a;Lm8/d;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    if-ne p1, v0, :cond_9

    .line 162
    .line 163
    goto :goto_5

    .line 164
    :cond_9
    :goto_3
    check-cast p1, LN9/l;

    .line 165
    .line 166
    iput v3, p0, Lcom/onesignal/inAppMessages/internal/j$B;->label:I

    .line 167
    .line 168
    check-cast p1, LN9/m;

    .line 169
    .line 170
    invoke-virtual {p1, p0}, LN9/m;->Q(Lm8/d;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    if-ne p1, v0, :cond_a

    .line 175
    .line 176
    goto :goto_5

    .line 177
    :cond_a
    :goto_4
    check-cast p1, LQ4/b;

    .line 178
    .line 179
    if-eqz p1, :cond_b

    .line 180
    .line 181
    iget-object v1, p0, Lcom/onesignal/inAppMessages/internal/j$B;->this$0:Lcom/onesignal/inAppMessages/internal/j;

    .line 182
    .line 183
    iput v2, p0, Lcom/onesignal/inAppMessages/internal/j$B;->label:I

    .line 184
    .line 185
    invoke-static {v1, p1, p0}, Lcom/onesignal/inAppMessages/internal/j;->access$fetchMessages(Lcom/onesignal/inAppMessages/internal/j;LQ4/b;Lm8/d;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    if-ne p1, v0, :cond_b

    .line 190
    .line 191
    :goto_5
    return-object v0

    .line 192
    :cond_b
    :goto_6
    sget-object p1, Lh8/m;->a:Lh8/m;

    .line 193
    .line 194
    return-object p1
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
