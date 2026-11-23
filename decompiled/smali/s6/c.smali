.class public final Ls6/c;
.super Lh5/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls6/c$a;
    }
.end annotation


# static fields
.field public static final Companion:Ls6/c$a;


# instance fields
.field private final _configModelStore:Lcom/onesignal/core/internal/config/b;

.field private final _identityModelStore:Lq6/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ls6/c$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ls6/c$a;-><init>(Lv8/e;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ls6/c;->Companion:Ls6/c$a;

    .line 8
    .line 9
    return-void
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

.method public constructor <init>(Lv6/e;Lg5/f;Lq6/b;Lcom/onesignal/core/internal/config/b;)V
    .locals 1

    .line 1
    const-string v0, "store"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "opRepo"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "_identityModelStore"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "_configModelStore"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, p1, p2}, Lh5/a;-><init>(Lcom/onesignal/common/modeling/c;Lg5/f;)V

    .line 22
    .line 23
    .line 24
    iput-object p3, p0, Ls6/c;->_identityModelStore:Lq6/b;

    .line 25
    .line 26
    iput-object p4, p0, Ls6/c;->_configModelStore:Lcom/onesignal/core/internal/config/b;

    .line 27
    .line 28
    return-void
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


# virtual methods
.method public bridge synthetic getAddOperation(Lcom/onesignal/common/modeling/i;)Lg5/g;
    .locals 0

    .line 1
    check-cast p1, Lv6/d;

    invoke-virtual {p0, p1}, Ls6/c;->getAddOperation(Lv6/d;)Lg5/g;

    move-result-object p1

    return-object p1
.end method

.method public getAddOperation(Lv6/d;)Lg5/g;
    .locals 9

    const-string v0, "model"

    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Ls6/c;->Companion:Ls6/c$a;

    iget-object v1, p0, Ls6/c;->_identityModelStore:Lq6/b;

    iget-object v2, p0, Ls6/c;->_configModelStore:Lcom/onesignal/core/internal/config/b;

    invoke-virtual {v0, p1, v1, v2}, Ls6/c$a;->getSubscriptionEnabledAndStatus(Lv6/d;Lq6/b;Lcom/onesignal/core/internal/config/b;)Lh8/f;

    move-result-object v0

    .line 3
    new-instance v1, Lr6/a;

    .line 4
    iget-object v2, p0, Ls6/c;->_configModelStore:Lcom/onesignal/core/internal/config/b;

    invoke-virtual {v2}, Lcom/onesignal/common/modeling/m;->getModel()Lcom/onesignal/common/modeling/i;

    move-result-object v2

    check-cast v2, Lcom/onesignal/core/internal/config/a;

    invoke-virtual {v2}, Lcom/onesignal/core/internal/config/a;->getAppId()Ljava/lang/String;

    move-result-object v2

    .line 5
    iget-object v3, p0, Ls6/c;->_identityModelStore:Lq6/b;

    invoke-virtual {v3}, Lcom/onesignal/common/modeling/m;->getModel()Lcom/onesignal/common/modeling/i;

    move-result-object v3

    check-cast v3, Lq6/a;

    invoke-virtual {v3}, Lq6/a;->getOnesignalId()Ljava/lang/String;

    move-result-object v3

    .line 6
    invoke-virtual {p1}, Lcom/onesignal/common/modeling/i;->getId()Ljava/lang/String;

    move-result-object v4

    .line 7
    invoke-virtual {p1}, Lv6/d;->getType()Lv6/g;

    move-result-object v5

    .line 8
    iget-object v6, v0, Lh8/f;->s:Ljava/lang/Object;

    .line 9
    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    .line 10
    invoke-virtual {p1}, Lv6/d;->getAddress()Ljava/lang/String;

    move-result-object v7

    .line 11
    iget-object p1, v0, Lh8/f;->t:Ljava/lang/Object;

    move-object v8, p1

    check-cast v8, Lv6/f;

    .line 12
    invoke-direct/range {v1 .. v8}, Lr6/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv6/g;ZLjava/lang/String;Lv6/f;)V

    return-object v1
.end method

.method public bridge synthetic getRemoveOperation(Lcom/onesignal/common/modeling/i;)Lg5/g;
    .locals 0

    .line 1
    check-cast p1, Lv6/d;

    invoke-virtual {p0, p1}, Ls6/c;->getRemoveOperation(Lv6/d;)Lg5/g;

    move-result-object p1

    return-object p1
.end method

.method public getRemoveOperation(Lv6/d;)Lg5/g;
    .locals 3

    const-string v0, "model"

    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lr6/c;

    iget-object v1, p0, Ls6/c;->_configModelStore:Lcom/onesignal/core/internal/config/b;

    invoke-virtual {v1}, Lcom/onesignal/common/modeling/m;->getModel()Lcom/onesignal/common/modeling/i;

    move-result-object v1

    check-cast v1, Lcom/onesignal/core/internal/config/a;

    invoke-virtual {v1}, Lcom/onesignal/core/internal/config/a;->getAppId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ls6/c;->_identityModelStore:Lq6/b;

    invoke-virtual {v2}, Lcom/onesignal/common/modeling/m;->getModel()Lcom/onesignal/common/modeling/i;

    move-result-object v2

    check-cast v2, Lq6/a;

    invoke-virtual {v2}, Lq6/a;->getOnesignalId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/onesignal/common/modeling/i;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lr6/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic getUpdateOperation(Lcom/onesignal/common/modeling/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Lg5/g;
    .locals 0

    .line 1
    check-cast p1, Lv6/d;

    invoke-virtual/range {p0 .. p5}, Ls6/c;->getUpdateOperation(Lv6/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Lg5/g;

    move-result-object p1

    return-object p1
.end method

.method public getUpdateOperation(Lv6/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Lg5/g;
    .locals 11

    const-string v0, "model"

    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "path"

    invoke-static {p2, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "property"

    invoke-static {p3, p2}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object p2, Ls6/c;->Companion:Ls6/c$a;

    iget-object v0, p0, Ls6/c;->_identityModelStore:Lq6/b;

    iget-object v1, p0, Ls6/c;->_configModelStore:Lcom/onesignal/core/internal/config/b;

    invoke-virtual {p2, p1, v0, v1}, Ls6/c$a;->getSubscriptionEnabledAndStatus(Lv6/d;Lq6/b;Lcom/onesignal/core/internal/config/b;)Lh8/f;

    move-result-object p2

    .line 3
    new-instance v0, Lr6/p;

    .line 4
    iget-object v1, p0, Ls6/c;->_configModelStore:Lcom/onesignal/core/internal/config/b;

    invoke-virtual {v1}, Lcom/onesignal/common/modeling/m;->getModel()Lcom/onesignal/common/modeling/i;

    move-result-object v1

    check-cast v1, Lcom/onesignal/core/internal/config/a;

    invoke-virtual {v1}, Lcom/onesignal/core/internal/config/a;->getAppId()Ljava/lang/String;

    move-result-object v1

    .line 5
    iget-object v2, p0, Ls6/c;->_identityModelStore:Lq6/b;

    invoke-virtual {v2}, Lcom/onesignal/common/modeling/m;->getModel()Lcom/onesignal/common/modeling/i;

    move-result-object v2

    check-cast v2, Lq6/a;

    invoke-virtual {v2}, Lq6/a;->getOnesignalId()Ljava/lang/String;

    move-result-object v2

    .line 6
    invoke-virtual {p1}, Lcom/onesignal/common/modeling/i;->getId()Ljava/lang/String;

    move-result-object v3

    .line 7
    invoke-virtual {p1}, Lv6/d;->getType()Lv6/g;

    move-result-object v4

    .line 8
    iget-object v5, p2, Lh8/f;->s:Ljava/lang/Object;

    .line 9
    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    .line 10
    invoke-virtual {p1}, Lv6/d;->getAddress()Ljava/lang/String;

    move-result-object v6

    .line 11
    iget-object p1, p2, Lh8/f;->t:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Lv6/f;

    const/16 v9, 0x80

    const/4 v10, 0x0

    const/4 v8, 0x0

    .line 12
    invoke-direct/range {v0 .. v10}, Lr6/p;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv6/g;ZLjava/lang/String;Lv6/f;Ljava/lang/String;ILv8/e;)V

    return-object v0
.end method
