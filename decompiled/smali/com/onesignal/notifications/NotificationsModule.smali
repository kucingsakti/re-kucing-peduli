.class public final Lcom/onesignal/notifications/NotificationsModule;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT4/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/onesignal/notifications/NotificationsModule;",
        "LT4/a;",
        "<init>",
        "()V",
        "LU4/c;",
        "builder",
        "Lh8/m;",
        "register",
        "(LU4/c;)V",
        "com.onesignal.notifications"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
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


# virtual methods
.method public register(LU4/c;)V
    .locals 4

    .line 1
    const-string v0, "builder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-class v0, Lcom/onesignal/notifications/internal/backend/impl/a;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, LU4/c;->register(Ljava/lang/Class;)LU4/e;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-class v1, LM5/a;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, LU4/e;->provides(Ljava/lang/Class;)LU4/e;

    .line 15
    .line 16
    .line 17
    const-class v0, Lcom/onesignal/notifications/internal/restoration/impl/NotificationRestoreWorkManager;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, LU4/c;->register(Ljava/lang/Class;)LU4/e;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-class v1, Le6/c;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, LU4/e;->provides(Ljava/lang/Class;)LU4/e;

    .line 26
    .line 27
    .line 28
    const-class v0, Lcom/onesignal/notifications/internal/data/impl/a;

    .line 29
    .line 30
    invoke-virtual {p1, v0}, LU4/c;->register(Ljava/lang/Class;)LU4/e;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-class v1, LV5/a;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, LU4/e;->provides(Ljava/lang/Class;)LU4/e;

    .line 37
    .line 38
    .line 39
    const-class v0, Lcom/onesignal/notifications/internal/badges/impl/a;

    .line 40
    .line 41
    const-class v1, LN5/a;

    .line 42
    .line 43
    const-class v2, Lcom/onesignal/notifications/internal/data/impl/b;

    .line 44
    .line 45
    const-class v3, LV5/d;

    .line 46
    .line 47
    invoke-static {p1, v0, v1, v2, v3}, LE0/a;->n(LU4/c;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 48
    .line 49
    .line 50
    const-class v0, Lcom/onesignal/notifications/internal/generation/impl/NotificationGenerationWorkManager;

    .line 51
    .line 52
    const-class v1, LX5/b;

    .line 53
    .line 54
    const-class v2, LR5/a;

    .line 55
    .line 56
    const-class v3, LQ5/b;

    .line 57
    .line 58
    invoke-static {p1, v0, v1, v2, v3}, LE0/a;->n(LU4/c;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 59
    .line 60
    .line 61
    const-class v0, LT5/b;

    .line 62
    .line 63
    const-class v1, LS5/a;

    .line 64
    .line 65
    const-class v2, Lcom/onesignal/notifications/internal/limiting/impl/a;

    .line 66
    .line 67
    const-class v3, LZ5/b;

    .line 68
    .line 69
    invoke-static {p1, v0, v1, v2, v3}, LE0/a;->n(LU4/c;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 70
    .line 71
    .line 72
    const-class v0, Lcom/onesignal/notifications/internal/display/impl/c;

    .line 73
    .line 74
    const-class v1, LW5/b;

    .line 75
    .line 76
    const-class v2, Lcom/onesignal/notifications/internal/display/impl/d;

    .line 77
    .line 78
    const-class v3, LW5/c;

    .line 79
    .line 80
    invoke-static {p1, v0, v1, v2, v3}, LE0/a;->n(LU4/c;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 81
    .line 82
    .line 83
    const-class v0, Lcom/onesignal/notifications/internal/display/impl/b;

    .line 84
    .line 85
    const-class v1, LW5/a;

    .line 86
    .line 87
    const-class v2, Lcom/onesignal/notifications/internal/generation/impl/a;

    .line 88
    .line 89
    const-class v3, LX5/a;

    .line 90
    .line 91
    invoke-static {p1, v0, v1, v2, v3}, LE0/a;->n(LU4/c;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 92
    .line 93
    .line 94
    const-class v0, Lcom/onesignal/notifications/internal/restoration/impl/a;

    .line 95
    .line 96
    const-class v1, Le6/b;

    .line 97
    .line 98
    const-class v2, Lcom/onesignal/notifications/internal/summary/impl/a;

    .line 99
    .line 100
    const-class v3, Lf6/a;

    .line 101
    .line 102
    invoke-static {p1, v0, v1, v2, v3}, LE0/a;->n(LU4/c;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 103
    .line 104
    .line 105
    const-class v0, Lcom/onesignal/notifications/internal/open/impl/b;

    .line 106
    .line 107
    const-class v1, La6/a;

    .line 108
    .line 109
    const-class v2, Lcom/onesignal/notifications/internal/open/impl/c;

    .line 110
    .line 111
    const-class v3, La6/b;

    .line 112
    .line 113
    invoke-static {p1, v0, v1, v2, v3}, LE0/a;->n(LU4/c;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 114
    .line 115
    .line 116
    const-class v0, Lcom/onesignal/notifications/internal/permissions/impl/b;

    .line 117
    .line 118
    const-class v1, Lb6/b;

    .line 119
    .line 120
    const-class v2, Lcom/onesignal/notifications/internal/lifecycle/impl/a;

    .line 121
    .line 122
    const-class v3, LY5/c;

    .line 123
    .line 124
    invoke-static {p1, v0, v1, v2, v3}, LE0/a;->n(LU4/c;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 125
    .line 126
    .line 127
    sget-object v0, Lcom/onesignal/notifications/NotificationsModule$a;->INSTANCE:Lcom/onesignal/notifications/NotificationsModule$a;

    .line 128
    .line 129
    invoke-virtual {p1, v0}, LU4/c;->register(Lu8/b;)LU4/e;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    const-class v1, LK5/a;

    .line 134
    .line 135
    invoke-virtual {v0, v1}, LU4/e;->provides(Ljava/lang/Class;)LU4/e;

    .line 136
    .line 137
    .line 138
    sget-object v0, Lcom/onesignal/notifications/NotificationsModule$b;->INSTANCE:Lcom/onesignal/notifications/NotificationsModule$b;

    .line 139
    .line 140
    invoke-virtual {p1, v0}, LU4/c;->register(Lu8/b;)LU4/e;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    const-class v1, Ld6/b;

    .line 145
    .line 146
    invoke-virtual {v0, v1}, LU4/e;->provides(Ljava/lang/Class;)LU4/e;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    const-class v1, Lcom/onesignal/notifications/internal/registration/impl/b;

    .line 151
    .line 152
    invoke-virtual {v0, v1}, LU4/e;->provides(Ljava/lang/Class;)LU4/e;

    .line 153
    .line 154
    .line 155
    const-class v0, Lcom/onesignal/notifications/internal/registration/impl/a;

    .line 156
    .line 157
    invoke-virtual {p1, v0}, LU4/c;->register(Ljava/lang/Class;)LU4/e;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-virtual {v1, v0}, LU4/e;->provides(Ljava/lang/Class;)LU4/e;

    .line 162
    .line 163
    .line 164
    const-class v0, Lcom/onesignal/notifications/internal/pushtoken/c;

    .line 165
    .line 166
    invoke-virtual {p1, v0}, LU4/c;->register(Ljava/lang/Class;)LU4/e;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    const-class v1, Lcom/onesignal/notifications/internal/pushtoken/a;

    .line 171
    .line 172
    invoke-virtual {v0, v1}, LU4/e;->provides(Ljava/lang/Class;)LU4/e;

    .line 173
    .line 174
    .line 175
    const-class v0, Lcom/onesignal/notifications/internal/receivereceipt/impl/ReceiveReceiptWorkManager;

    .line 176
    .line 177
    const-class v1, Lc6/b;

    .line 178
    .line 179
    const-class v2, Lcom/onesignal/notifications/internal/receivereceipt/impl/a;

    .line 180
    .line 181
    const-class v3, Lc6/a;

    .line 182
    .line 183
    invoke-static {p1, v0, v1, v2, v3}, LE0/a;->n(LU4/c;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 184
    .line 185
    .line 186
    const-class v0, Lcom/onesignal/notifications/internal/listeners/DeviceRegistrationListener;

    .line 187
    .line 188
    const-class v1, Lk5/b;

    .line 189
    .line 190
    const-class v2, Lcom/onesignal/notifications/internal/listeners/a;

    .line 191
    .line 192
    invoke-static {p1, v0, v1, v2, v1}, LE0/a;->n(LU4/c;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 193
    .line 194
    .line 195
    const-class v0, Lcom/onesignal/notifications/internal/h;

    .line 196
    .line 197
    invoke-virtual {p1, v0}, LU4/c;->register(Ljava/lang/Class;)LU4/e;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    const-class v0, LJ5/n;

    .line 202
    .line 203
    invoke-virtual {p1, v0}, LU4/e;->provides(Ljava/lang/Class;)LU4/e;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    const-class v0, Lcom/onesignal/notifications/internal/a;

    .line 208
    .line 209
    invoke-virtual {p1, v0}, LU4/e;->provides(Ljava/lang/Class;)LU4/e;

    .line 210
    .line 211
    .line 212
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
