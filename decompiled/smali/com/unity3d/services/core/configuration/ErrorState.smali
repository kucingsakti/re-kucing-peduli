.class public final enum Lcom/unity3d/services/core/configuration/ErrorState;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/unity3d/services/core/configuration/ErrorState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/unity3d/services/core/configuration/ErrorState;

.field public static final enum CreateWebApp:Lcom/unity3d/services/core/configuration/ErrorState;

.field public static final enum CreateWebview:Lcom/unity3d/services/core/configuration/ErrorState;

.field public static final enum CreateWebviewConfigError:Lcom/unity3d/services/core/configuration/ErrorState;

.field public static final enum CreateWebviewGameIdDisabled:Lcom/unity3d/services/core/configuration/ErrorState;

.field public static final enum CreateWebviewInvalidArgument:Lcom/unity3d/services/core/configuration/ErrorState;

.field public static final enum CreateWebviewTimeout:Lcom/unity3d/services/core/configuration/ErrorState;

.field public static final enum InitModules:Lcom/unity3d/services/core/configuration/ErrorState;

.field public static final enum InvalidHash:Lcom/unity3d/services/core/configuration/ErrorState;

.field public static final enum LoadCache:Lcom/unity3d/services/core/configuration/ErrorState;

.field public static final enum MalformedWebviewRequest:Lcom/unity3d/services/core/configuration/ErrorState;

.field public static final enum NetworkConfigRequest:Lcom/unity3d/services/core/configuration/ErrorState;

.field public static final enum NetworkWebviewRequest:Lcom/unity3d/services/core/configuration/ErrorState;

.field public static final enum ResetWebApp:Lcom/unity3d/services/core/configuration/ErrorState;


# instance fields
.field private _stateMetricName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 28

    .line 1
    new-instance v0, Lcom/unity3d/services/core/configuration/ErrorState;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "create_webapp"

    .line 5
    .line 6
    const-string v3, "CreateWebApp"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lcom/unity3d/services/core/configuration/ErrorState;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/unity3d/services/core/configuration/ErrorState;->CreateWebApp:Lcom/unity3d/services/core/configuration/ErrorState;

    .line 12
    .line 13
    new-instance v2, Lcom/unity3d/services/core/configuration/ErrorState;

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    const-string v4, "network_config"

    .line 17
    .line 18
    const-string v5, "NetworkConfigRequest"

    .line 19
    .line 20
    invoke-direct {v2, v5, v3, v4}, Lcom/unity3d/services/core/configuration/ErrorState;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v2, Lcom/unity3d/services/core/configuration/ErrorState;->NetworkConfigRequest:Lcom/unity3d/services/core/configuration/ErrorState;

    .line 24
    .line 25
    new-instance v4, Lcom/unity3d/services/core/configuration/ErrorState;

    .line 26
    .line 27
    const/4 v5, 0x2

    .line 28
    const-string v6, "network_webview"

    .line 29
    .line 30
    const-string v7, "NetworkWebviewRequest"

    .line 31
    .line 32
    invoke-direct {v4, v7, v5, v6}, Lcom/unity3d/services/core/configuration/ErrorState;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v4, Lcom/unity3d/services/core/configuration/ErrorState;->NetworkWebviewRequest:Lcom/unity3d/services/core/configuration/ErrorState;

    .line 36
    .line 37
    new-instance v6, Lcom/unity3d/services/core/configuration/ErrorState;

    .line 38
    .line 39
    const/4 v7, 0x3

    .line 40
    const-string v8, "invalid_hash"

    .line 41
    .line 42
    const-string v9, "InvalidHash"

    .line 43
    .line 44
    invoke-direct {v6, v9, v7, v8}, Lcom/unity3d/services/core/configuration/ErrorState;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v6, Lcom/unity3d/services/core/configuration/ErrorState;->InvalidHash:Lcom/unity3d/services/core/configuration/ErrorState;

    .line 48
    .line 49
    new-instance v8, Lcom/unity3d/services/core/configuration/ErrorState;

    .line 50
    .line 51
    const/4 v9, 0x4

    .line 52
    const-string v10, "create_webview"

    .line 53
    .line 54
    const-string v11, "CreateWebview"

    .line 55
    .line 56
    invoke-direct {v8, v11, v9, v10}, Lcom/unity3d/services/core/configuration/ErrorState;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v8, Lcom/unity3d/services/core/configuration/ErrorState;->CreateWebview:Lcom/unity3d/services/core/configuration/ErrorState;

    .line 60
    .line 61
    new-instance v10, Lcom/unity3d/services/core/configuration/ErrorState;

    .line 62
    .line 63
    const/4 v11, 0x5

    .line 64
    const-string v12, "malformed_webview"

    .line 65
    .line 66
    const-string v13, "MalformedWebviewRequest"

    .line 67
    .line 68
    invoke-direct {v10, v13, v11, v12}, Lcom/unity3d/services/core/configuration/ErrorState;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sput-object v10, Lcom/unity3d/services/core/configuration/ErrorState;->MalformedWebviewRequest:Lcom/unity3d/services/core/configuration/ErrorState;

    .line 72
    .line 73
    new-instance v12, Lcom/unity3d/services/core/configuration/ErrorState;

    .line 74
    .line 75
    const/4 v13, 0x6

    .line 76
    const-string v14, "reset_webapp"

    .line 77
    .line 78
    const-string v15, "ResetWebApp"

    .line 79
    .line 80
    invoke-direct {v12, v15, v13, v14}, Lcom/unity3d/services/core/configuration/ErrorState;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    sput-object v12, Lcom/unity3d/services/core/configuration/ErrorState;->ResetWebApp:Lcom/unity3d/services/core/configuration/ErrorState;

    .line 84
    .line 85
    new-instance v14, Lcom/unity3d/services/core/configuration/ErrorState;

    .line 86
    .line 87
    const/4 v15, 0x7

    .line 88
    move/from16 v16, v1

    .line 89
    .line 90
    const-string v1, "load_cache"

    .line 91
    .line 92
    move/from16 v17, v3

    .line 93
    .line 94
    const-string v3, "LoadCache"

    .line 95
    .line 96
    invoke-direct {v14, v3, v15, v1}, Lcom/unity3d/services/core/configuration/ErrorState;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 97
    .line 98
    .line 99
    sput-object v14, Lcom/unity3d/services/core/configuration/ErrorState;->LoadCache:Lcom/unity3d/services/core/configuration/ErrorState;

    .line 100
    .line 101
    new-instance v1, Lcom/unity3d/services/core/configuration/ErrorState;

    .line 102
    .line 103
    const/16 v3, 0x8

    .line 104
    .line 105
    move/from16 v18, v5

    .line 106
    .line 107
    const-string v5, "init_modules"

    .line 108
    .line 109
    move/from16 v19, v7

    .line 110
    .line 111
    const-string v7, "InitModules"

    .line 112
    .line 113
    invoke-direct {v1, v7, v3, v5}, Lcom/unity3d/services/core/configuration/ErrorState;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 114
    .line 115
    .line 116
    sput-object v1, Lcom/unity3d/services/core/configuration/ErrorState;->InitModules:Lcom/unity3d/services/core/configuration/ErrorState;

    .line 117
    .line 118
    new-instance v5, Lcom/unity3d/services/core/configuration/ErrorState;

    .line 119
    .line 120
    const/16 v7, 0x9

    .line 121
    .line 122
    move/from16 v20, v3

    .line 123
    .line 124
    const-string v3, "create_webview_timeout"

    .line 125
    .line 126
    move/from16 v21, v9

    .line 127
    .line 128
    const-string v9, "CreateWebviewTimeout"

    .line 129
    .line 130
    invoke-direct {v5, v9, v7, v3}, Lcom/unity3d/services/core/configuration/ErrorState;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 131
    .line 132
    .line 133
    sput-object v5, Lcom/unity3d/services/core/configuration/ErrorState;->CreateWebviewTimeout:Lcom/unity3d/services/core/configuration/ErrorState;

    .line 134
    .line 135
    new-instance v3, Lcom/unity3d/services/core/configuration/ErrorState;

    .line 136
    .line 137
    const/16 v9, 0xa

    .line 138
    .line 139
    move/from16 v22, v7

    .line 140
    .line 141
    const-string v7, "create_webview_game_id_disabled"

    .line 142
    .line 143
    move/from16 v23, v11

    .line 144
    .line 145
    const-string v11, "CreateWebviewGameIdDisabled"

    .line 146
    .line 147
    invoke-direct {v3, v11, v9, v7}, Lcom/unity3d/services/core/configuration/ErrorState;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 148
    .line 149
    .line 150
    sput-object v3, Lcom/unity3d/services/core/configuration/ErrorState;->CreateWebviewGameIdDisabled:Lcom/unity3d/services/core/configuration/ErrorState;

    .line 151
    .line 152
    new-instance v7, Lcom/unity3d/services/core/configuration/ErrorState;

    .line 153
    .line 154
    const/16 v11, 0xb

    .line 155
    .line 156
    move/from16 v24, v9

    .line 157
    .line 158
    const-string v9, "create_webview_config_error"

    .line 159
    .line 160
    move/from16 v25, v13

    .line 161
    .line 162
    const-string v13, "CreateWebviewConfigError"

    .line 163
    .line 164
    invoke-direct {v7, v13, v11, v9}, Lcom/unity3d/services/core/configuration/ErrorState;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 165
    .line 166
    .line 167
    sput-object v7, Lcom/unity3d/services/core/configuration/ErrorState;->CreateWebviewConfigError:Lcom/unity3d/services/core/configuration/ErrorState;

    .line 168
    .line 169
    new-instance v9, Lcom/unity3d/services/core/configuration/ErrorState;

    .line 170
    .line 171
    const/16 v13, 0xc

    .line 172
    .line 173
    move/from16 v26, v11

    .line 174
    .line 175
    const-string v11, "create_webview_invalid_arg"

    .line 176
    .line 177
    move/from16 v27, v15

    .line 178
    .line 179
    const-string v15, "CreateWebviewInvalidArgument"

    .line 180
    .line 181
    invoke-direct {v9, v15, v13, v11}, Lcom/unity3d/services/core/configuration/ErrorState;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 182
    .line 183
    .line 184
    sput-object v9, Lcom/unity3d/services/core/configuration/ErrorState;->CreateWebviewInvalidArgument:Lcom/unity3d/services/core/configuration/ErrorState;

    .line 185
    .line 186
    const/16 v11, 0xd

    .line 187
    .line 188
    new-array v11, v11, [Lcom/unity3d/services/core/configuration/ErrorState;

    .line 189
    .line 190
    aput-object v0, v11, v16

    .line 191
    .line 192
    aput-object v2, v11, v17

    .line 193
    .line 194
    aput-object v4, v11, v18

    .line 195
    .line 196
    aput-object v6, v11, v19

    .line 197
    .line 198
    aput-object v8, v11, v21

    .line 199
    .line 200
    aput-object v10, v11, v23

    .line 201
    .line 202
    aput-object v12, v11, v25

    .line 203
    .line 204
    aput-object v14, v11, v27

    .line 205
    .line 206
    aput-object v1, v11, v20

    .line 207
    .line 208
    aput-object v5, v11, v22

    .line 209
    .line 210
    aput-object v3, v11, v24

    .line 211
    .line 212
    aput-object v7, v11, v26

    .line 213
    .line 214
    aput-object v9, v11, v13

    .line 215
    .line 216
    sput-object v11, Lcom/unity3d/services/core/configuration/ErrorState;->$VALUES:[Lcom/unity3d/services/core/configuration/ErrorState;

    .line 217
    .line 218
    return-void
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

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/unity3d/services/core/configuration/ErrorState;->_stateMetricName:Ljava/lang/String;

    .line 5
    .line 6
    return-void
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

.method public static valueOf(Ljava/lang/String;)Lcom/unity3d/services/core/configuration/ErrorState;
    .locals 1

    .line 1
    const-class v0, Lcom/unity3d/services/core/configuration/ErrorState;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/unity3d/services/core/configuration/ErrorState;

    .line 8
    .line 9
    return-object p0
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

.method public static values()[Lcom/unity3d/services/core/configuration/ErrorState;
    .locals 1

    .line 1
    sget-object v0, Lcom/unity3d/services/core/configuration/ErrorState;->$VALUES:[Lcom/unity3d/services/core/configuration/ErrorState;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/unity3d/services/core/configuration/ErrorState;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/unity3d/services/core/configuration/ErrorState;

    .line 8
    .line 9
    return-object v0
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


# virtual methods
.method public getMetricName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/unity3d/services/core/configuration/ErrorState;->_stateMetricName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
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
