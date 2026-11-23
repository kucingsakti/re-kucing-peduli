.class public final Lcom/onesignal/notifications/internal/data/impl/b$c;
.super Lo8/g;
.source "SourceFile"

# interfaces
.implements Lu8/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/onesignal/notifications/internal/data/impl/b;->createNotification(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Lm8/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $androidId:I

.field final synthetic $body:Ljava/lang/String;

.field final synthetic $collapseKey:Ljava/lang/String;

.field final synthetic $expireTime:J

.field final synthetic $groupId:Ljava/lang/String;

.field final synthetic $id:Ljava/lang/String;

.field final synthetic $isOpened:Z

.field final synthetic $jsonPayload:Ljava/lang/String;

.field final synthetic $shouldDismissIdenticals:Z

.field final synthetic $title:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/onesignal/notifications/internal/data/impl/b;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZILcom/onesignal/notifications/internal/data/impl/b;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Lm8/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "ZI",
            "Lcom/onesignal/notifications/internal/data/impl/b;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "J",
            "Ljava/lang/String;",
            "Lm8/d<",
            "-",
            "Lcom/onesignal/notifications/internal/data/impl/b$c;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->$id:Ljava/lang/String;

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->$shouldDismissIdenticals:Z

    .line 4
    .line 5
    iput p3, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->$androidId:I

    .line 6
    .line 7
    iput-object p4, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->this$0:Lcom/onesignal/notifications/internal/data/impl/b;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->$groupId:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p6, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->$collapseKey:Ljava/lang/String;

    .line 12
    .line 13
    iput-boolean p7, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->$isOpened:Z

    .line 14
    .line 15
    iput-object p8, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->$title:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p9, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->$body:Ljava/lang/String;

    .line 18
    .line 19
    iput-wide p10, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->$expireTime:J

    .line 20
    .line 21
    iput-object p12, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->$jsonPayload:Ljava/lang/String;

    .line 22
    .line 23
    const/4 p1, 0x2

    .line 24
    invoke-direct {p0, p1, p13}, Lo8/g;-><init>(ILm8/d;)V

    .line 25
    .line 26
    .line 27
    return-void
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
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/d;)Lm8/d;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lm8/d<",
            "*>;)",
            "Lm8/d<",
            "Lh8/m;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/onesignal/notifications/internal/data/impl/b$c;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->$id:Ljava/lang/String;

    .line 4
    .line 5
    iget-boolean v2, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->$shouldDismissIdenticals:Z

    .line 6
    .line 7
    iget v3, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->$androidId:I

    .line 8
    .line 9
    iget-object v4, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->this$0:Lcom/onesignal/notifications/internal/data/impl/b;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->$groupId:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v6, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->$collapseKey:Ljava/lang/String;

    .line 14
    .line 15
    iget-boolean v7, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->$isOpened:Z

    .line 16
    .line 17
    iget-object v8, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->$title:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v9, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->$body:Ljava/lang/String;

    .line 20
    .line 21
    iget-wide v10, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->$expireTime:J

    .line 22
    .line 23
    iget-object v12, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->$jsonPayload:Ljava/lang/String;

    .line 24
    .line 25
    move-object/from16 v13, p2

    .line 26
    .line 27
    invoke-direct/range {v0 .. v13}, Lcom/onesignal/notifications/internal/data/impl/b$c;-><init>(Ljava/lang/String;ZILcom/onesignal/notifications/internal/data/impl/b;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Lm8/d;)V

    .line 28
    .line 29
    .line 30
    return-object v0
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

.method public final invoke(LN9/y;Lm8/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LN9/y;",
            "Lm8/d<",
            "-",
            "Lh8/m;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/onesignal/notifications/internal/data/impl/b$c;->create(Ljava/lang/Object;Lm8/d;)Lm8/d;

    move-result-object p1

    check-cast p1, Lcom/onesignal/notifications/internal/data/impl/b$c;

    sget-object p2, Lh8/m;->a:Lh8/m;

    invoke-virtual {p1, p2}, Lcom/onesignal/notifications/internal/data/impl/b$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LN9/y;

    check-cast p2, Lm8/d;

    invoke-virtual {p0, p1, p2}, Lcom/onesignal/notifications/internal/data/impl/b$c;->invoke(LN9/y;Lm8/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    const-string v0, "Notification saved values: "

    .line 2
    .line 3
    const-string v1, "android_notification_id = "

    .line 4
    .line 5
    iget v2, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->label:I

    .line 6
    .line 7
    if-nez v2, :cond_7

    .line 8
    .line 9
    invoke-static {p1}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    new-instance p1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v2, "Saving Notification id="

    .line 15
    .line 16
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->$id:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 v2, 0x0

    .line 29
    const/4 v3, 0x2

    .line 30
    invoke-static {p1, v2, v3, v2}, Lcom/onesignal/debug/internal/logging/b;->debug$default(Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :try_start_0
    iget-boolean p1, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->$shouldDismissIdenticals:Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    const-string v4, "notification"

    .line 36
    .line 37
    const/4 v5, 0x1

    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    :try_start_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget v1, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->$androidId:I

    .line 46
    .line 47
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    new-instance v1, Landroid/content/ContentValues;

    .line 55
    .line 56
    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 57
    .line 58
    .line 59
    const-string v6, "dismissed"

    .line 60
    .line 61
    new-instance v7, Ljava/lang/Integer;

    .line 62
    .line 63
    invoke-direct {v7, v5}, Ljava/lang/Integer;-><init>(I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v6, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 67
    .line 68
    .line 69
    iget-object v5, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->this$0:Lcom/onesignal/notifications/internal/data/impl/b;

    .line 70
    .line 71
    invoke-static {v5}, Lcom/onesignal/notifications/internal/data/impl/b;->access$get_databaseProvider$p(Lcom/onesignal/notifications/internal/data/impl/b;)La5/d;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-interface {v5}, La5/d;->getOs()La5/c;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-interface {v5, v4, v1, p1, v2}, La5/c;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    iget-object p1, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->this$0:Lcom/onesignal/notifications/internal/data/impl/b;

    .line 83
    .line 84
    invoke-static {p1}, Lcom/onesignal/notifications/internal/data/impl/b;->access$get_badgeCountUpdater$p(Lcom/onesignal/notifications/internal/data/impl/b;)LN5/a;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-interface {p1}, LN5/a;->update()V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :catch_0
    move-exception p1

    .line 93
    goto/16 :goto_1

    .line 94
    .line 95
    :cond_0
    :goto_0
    new-instance p1, Landroid/content/ContentValues;

    .line 96
    .line 97
    invoke-direct {p1}, Landroid/content/ContentValues;-><init>()V

    .line 98
    .line 99
    .line 100
    const-string v1, "notification_id"

    .line 101
    .line 102
    iget-object v5, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->$id:Ljava/lang/String;

    .line 103
    .line 104
    invoke-virtual {p1, v1, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    iget-object v1, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->$groupId:Ljava/lang/String;

    .line 108
    .line 109
    if-eqz v1, :cond_1

    .line 110
    .line 111
    const-string v5, "group_id"

    .line 112
    .line 113
    invoke-virtual {p1, v5, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    :cond_1
    iget-object v1, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->$collapseKey:Ljava/lang/String;

    .line 117
    .line 118
    if-eqz v1, :cond_2

    .line 119
    .line 120
    const-string v5, "collapse_id"

    .line 121
    .line 122
    invoke-virtual {p1, v5, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    :cond_2
    const-string v1, "opened"

    .line 126
    .line 127
    iget-boolean v5, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->$isOpened:Z

    .line 128
    .line 129
    new-instance v6, Ljava/lang/Integer;

    .line 130
    .line 131
    invoke-direct {v6, v5}, Ljava/lang/Integer;-><init>(I)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1, v1, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 135
    .line 136
    .line 137
    iget-boolean v1, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->$isOpened:Z

    .line 138
    .line 139
    if-nez v1, :cond_3

    .line 140
    .line 141
    const-string v1, "android_notification_id"

    .line 142
    .line 143
    iget v5, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->$androidId:I

    .line 144
    .line 145
    new-instance v6, Ljava/lang/Integer;

    .line 146
    .line 147
    invoke-direct {v6, v5}, Ljava/lang/Integer;-><init>(I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1, v1, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 151
    .line 152
    .line 153
    :cond_3
    iget-object v1, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->$title:Ljava/lang/String;

    .line 154
    .line 155
    if-eqz v1, :cond_4

    .line 156
    .line 157
    const-string v5, "title"

    .line 158
    .line 159
    invoke-virtual {p1, v5, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    :cond_4
    iget-object v1, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->$body:Ljava/lang/String;

    .line 163
    .line 164
    if-eqz v1, :cond_5

    .line 165
    .line 166
    const-string v5, "message"

    .line 167
    .line 168
    invoke-virtual {p1, v5, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    :cond_5
    const-string v1, "expire_time"

    .line 172
    .line 173
    iget-wide v5, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->$expireTime:J

    .line 174
    .line 175
    new-instance v7, Ljava/lang/Long;

    .line 176
    .line 177
    invoke-direct {v7, v5, v6}, Ljava/lang/Long;-><init>(J)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1, v1, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 181
    .line 182
    .line 183
    const-string v1, "full_data"

    .line 184
    .line 185
    iget-object v5, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->$jsonPayload:Ljava/lang/String;

    .line 186
    .line 187
    invoke-virtual {p1, v1, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    iget-object v1, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->this$0:Lcom/onesignal/notifications/internal/data/impl/b;

    .line 191
    .line 192
    invoke-static {v1}, Lcom/onesignal/notifications/internal/data/impl/b;->access$get_databaseProvider$p(Lcom/onesignal/notifications/internal/data/impl/b;)La5/d;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    invoke-interface {v1}, La5/d;->getOs()La5/c;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    invoke-interface {v1, v4, v2, p1}, La5/c;->insertOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)V

    .line 201
    .line 202
    .line 203
    new-instance v1, Ljava/lang/StringBuilder;

    .line 204
    .line 205
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    invoke-static {p1, v2, v3, v2}, Lcom/onesignal/debug/internal/logging/b;->debug$default(Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    iget-boolean p1, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->$isOpened:Z

    .line 219
    .line 220
    if-nez p1, :cond_6

    .line 221
    .line 222
    iget-object p1, p0, Lcom/onesignal/notifications/internal/data/impl/b$c;->this$0:Lcom/onesignal/notifications/internal/data/impl/b;

    .line 223
    .line 224
    invoke-static {p1}, Lcom/onesignal/notifications/internal/data/impl/b;->access$get_badgeCountUpdater$p(Lcom/onesignal/notifications/internal/data/impl/b;)LN5/a;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    invoke-interface {p1}, LN5/a;->update()V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 229
    .line 230
    .line 231
    goto :goto_2

    .line 232
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 233
    .line 234
    .line 235
    :cond_6
    :goto_2
    sget-object p1, Lh8/m;->a:Lh8/m;

    .line 236
    .line 237
    return-object p1

    .line 238
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 239
    .line 240
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 241
    .line 242
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    throw p1
    .line 246
    .line 247
.end method
