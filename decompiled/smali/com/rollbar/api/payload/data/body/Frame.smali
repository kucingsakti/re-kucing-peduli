.class public Lcom/rollbar/api/payload/data/body/Frame;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/rollbar/api/json/JsonSerializable;
.implements Lcom/rollbar/api/truncation/StringTruncatable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rollbar/api/payload/data/body/Frame$Builder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/rollbar/api/json/JsonSerializable;",
        "Lcom/rollbar/api/truncation/StringTruncatable<",
        "Lcom/rollbar/api/payload/data/body/Frame;",
        ">;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x710cedb3a3276128L


# instance fields
.field private final args:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final className:Ljava/lang/String;

.field private final code:Ljava/lang/String;

.field private final columnNumber:Ljava/lang/Integer;

.field private final context:Lcom/rollbar/api/payload/data/body/CodeContext;

.field private final filename:Ljava/lang/String;

.field private final keywordArgs:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final lineNumber:Ljava/lang/Integer;

.field private final locals:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final method:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lcom/rollbar/api/payload/data/body/Frame$Builder;)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lcom/rollbar/api/payload/data/body/Frame$Builder;->access$000(Lcom/rollbar/api/payload/data/body/Frame$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/body/Frame;->filename:Ljava/lang/String;

    .line 4
    invoke-static {p1}, Lcom/rollbar/api/payload/data/body/Frame$Builder;->access$100(Lcom/rollbar/api/payload/data/body/Frame$Builder;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/body/Frame;->lineNumber:Ljava/lang/Integer;

    .line 5
    invoke-static {p1}, Lcom/rollbar/api/payload/data/body/Frame$Builder;->access$200(Lcom/rollbar/api/payload/data/body/Frame$Builder;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/body/Frame;->columnNumber:Ljava/lang/Integer;

    .line 6
    invoke-static {p1}, Lcom/rollbar/api/payload/data/body/Frame$Builder;->access$300(Lcom/rollbar/api/payload/data/body/Frame$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/body/Frame;->method:Ljava/lang/String;

    .line 7
    invoke-static {p1}, Lcom/rollbar/api/payload/data/body/Frame$Builder;->access$400(Lcom/rollbar/api/payload/data/body/Frame$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/body/Frame;->code:Ljava/lang/String;

    .line 8
    invoke-static {p1}, Lcom/rollbar/api/payload/data/body/Frame$Builder;->access$500(Lcom/rollbar/api/payload/data/body/Frame$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/body/Frame;->className:Ljava/lang/String;

    .line 9
    invoke-static {p1}, Lcom/rollbar/api/payload/data/body/Frame$Builder;->access$600(Lcom/rollbar/api/payload/data/body/Frame$Builder;)Lcom/rollbar/api/payload/data/body/CodeContext;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/data/body/Frame;->context:Lcom/rollbar/api/payload/data/body/CodeContext;

    .line 10
    invoke-static {p1}, Lcom/rollbar/api/payload/data/body/Frame$Builder;->access$700(Lcom/rollbar/api/payload/data/body/Frame$Builder;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1}, Lcom/rollbar/api/payload/data/body/Frame$Builder;->access$700(Lcom/rollbar/api/payload/data/body/Frame$Builder;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iput-object v0, p0, Lcom/rollbar/api/payload/data/body/Frame;->args:Ljava/util/List;

    .line 11
    invoke-static {p1}, Lcom/rollbar/api/payload/data/body/Frame$Builder;->access$800(Lcom/rollbar/api/payload/data/body/Frame$Builder;)Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/util/HashMap;

    .line 12
    invoke-static {p1}, Lcom/rollbar/api/payload/data/body/Frame$Builder;->access$800(Lcom/rollbar/api/payload/data/body/Frame$Builder;)Ljava/util/Map;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    iput-object v0, p0, Lcom/rollbar/api/payload/data/body/Frame;->keywordArgs:Ljava/util/Map;

    .line 13
    invoke-static {p1}, Lcom/rollbar/api/payload/data/body/Frame$Builder;->access$900(Lcom/rollbar/api/payload/data/body/Frame$Builder;)Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/util/HashMap;

    .line 14
    invoke-static {p1}, Lcom/rollbar/api/payload/data/body/Frame$Builder;->access$900(Lcom/rollbar/api/payload/data/body/Frame$Builder;)Ljava/util/Map;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    :cond_2
    iput-object v1, p0, Lcom/rollbar/api/payload/data/body/Frame;->locals:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/rollbar/api/payload/data/body/Frame$Builder;Lcom/rollbar/api/payload/data/body/Frame$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/rollbar/api/payload/data/body/Frame;-><init>(Lcom/rollbar/api/payload/data/body/Frame$Builder;)V

    return-void
.end method

.method public static synthetic access$1000(Lcom/rollbar/api/payload/data/body/Frame;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/body/Frame;->filename:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public static synthetic access$1100(Lcom/rollbar/api/payload/data/body/Frame;)Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/body/Frame;->lineNumber:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public static synthetic access$1200(Lcom/rollbar/api/payload/data/body/Frame;)Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/body/Frame;->columnNumber:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public static synthetic access$1300(Lcom/rollbar/api/payload/data/body/Frame;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/body/Frame;->method:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public static synthetic access$1400(Lcom/rollbar/api/payload/data/body/Frame;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/body/Frame;->code:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public static synthetic access$1500(Lcom/rollbar/api/payload/data/body/Frame;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/body/Frame;->className:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public static synthetic access$1600(Lcom/rollbar/api/payload/data/body/Frame;)Lcom/rollbar/api/payload/data/body/CodeContext;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/body/Frame;->context:Lcom/rollbar/api/payload/data/body/CodeContext;

    .line 2
    .line 3
    return-object p0
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public static synthetic access$1700(Lcom/rollbar/api/payload/data/body/Frame;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/body/Frame;->args:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public static synthetic access$1800(Lcom/rollbar/api/payload/data/body/Frame;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/body/Frame;->keywordArgs:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public static synthetic access$1900(Lcom/rollbar/api/payload/data/body/Frame;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/body/Frame;->locals:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method


# virtual methods
.method public asJson()Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/rollbar/api/payload/data/body/Frame;->filename:Ljava/lang/String;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const-string v1, "[unknown]"

    .line 12
    .line 13
    :goto_0
    const-string v2, "filename"

    .line 14
    .line 15
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/rollbar/api/payload/data/body/Frame;->lineNumber:Ljava/lang/Integer;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    const-string v2, "lineno"

    .line 23
    .line 24
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    :cond_1
    iget-object v1, p0, Lcom/rollbar/api/payload/data/body/Frame;->columnNumber:Ljava/lang/Integer;

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    const-string v2, "colno"

    .line 32
    .line 33
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    :cond_2
    iget-object v1, p0, Lcom/rollbar/api/payload/data/body/Frame;->method:Ljava/lang/String;

    .line 37
    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    const-string v2, "method"

    .line 41
    .line 42
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    :cond_3
    iget-object v1, p0, Lcom/rollbar/api/payload/data/body/Frame;->code:Ljava/lang/String;

    .line 46
    .line 47
    if-eqz v1, :cond_4

    .line 48
    .line 49
    const-string v2, "code"

    .line 50
    .line 51
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    :cond_4
    iget-object v1, p0, Lcom/rollbar/api/payload/data/body/Frame;->className:Ljava/lang/String;

    .line 55
    .line 56
    if-eqz v1, :cond_5

    .line 57
    .line 58
    const-string v2, "class_name"

    .line 59
    .line 60
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    :cond_5
    iget-object v1, p0, Lcom/rollbar/api/payload/data/body/Frame;->context:Lcom/rollbar/api/payload/data/body/CodeContext;

    .line 64
    .line 65
    if-eqz v1, :cond_6

    .line 66
    .line 67
    const-string v2, "context"

    .line 68
    .line 69
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    :cond_6
    iget-object v1, p0, Lcom/rollbar/api/payload/data/body/Frame;->args:Ljava/util/List;

    .line 73
    .line 74
    if-eqz v1, :cond_7

    .line 75
    .line 76
    const-string v2, "args"

    .line 77
    .line 78
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    :cond_7
    iget-object v1, p0, Lcom/rollbar/api/payload/data/body/Frame;->keywordArgs:Ljava/util/Map;

    .line 82
    .line 83
    if-eqz v1, :cond_8

    .line 84
    .line 85
    const-string v2, "kwargs"

    .line 86
    .line 87
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    :cond_8
    iget-object v1, p0, Lcom/rollbar/api/payload/data/body/Frame;->locals:Ljava/util/Map;

    .line 91
    .line 92
    if-eqz v1, :cond_9

    .line 93
    .line 94
    const-string v2, "locals"

    .line 95
    .line 96
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    :cond_9
    return-object v0
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

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_15

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    if-eq v2, v3, :cond_1

    .line 17
    .line 18
    goto/16 :goto_9

    .line 19
    .line 20
    :cond_1
    check-cast p1, Lcom/rollbar/api/payload/data/body/Frame;

    .line 21
    .line 22
    iget-object v2, p0, Lcom/rollbar/api/payload/data/body/Frame;->filename:Ljava/lang/String;

    .line 23
    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    iget-object v3, p1, Lcom/rollbar/api/payload/data/body/Frame;->filename:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_3

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    iget-object v2, p1, Lcom/rollbar/api/payload/data/body/Frame;->filename:Ljava/lang/String;

    .line 36
    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    :goto_0
    return v1

    .line 40
    :cond_3
    iget-object v2, p0, Lcom/rollbar/api/payload/data/body/Frame;->lineNumber:Ljava/lang/Integer;

    .line 41
    .line 42
    if-eqz v2, :cond_4

    .line 43
    .line 44
    iget-object v3, p1, Lcom/rollbar/api/payload/data/body/Frame;->lineNumber:Ljava/lang/Integer;

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-nez v2, :cond_5

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_4
    iget-object v2, p1, Lcom/rollbar/api/payload/data/body/Frame;->lineNumber:Ljava/lang/Integer;

    .line 54
    .line 55
    if-eqz v2, :cond_5

    .line 56
    .line 57
    :goto_1
    return v1

    .line 58
    :cond_5
    iget-object v2, p0, Lcom/rollbar/api/payload/data/body/Frame;->columnNumber:Ljava/lang/Integer;

    .line 59
    .line 60
    if-eqz v2, :cond_6

    .line 61
    .line 62
    iget-object v3, p1, Lcom/rollbar/api/payload/data/body/Frame;->columnNumber:Ljava/lang/Integer;

    .line 63
    .line 64
    invoke-virtual {v2, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-nez v2, :cond_7

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_6
    iget-object v2, p1, Lcom/rollbar/api/payload/data/body/Frame;->columnNumber:Ljava/lang/Integer;

    .line 72
    .line 73
    if-eqz v2, :cond_7

    .line 74
    .line 75
    :goto_2
    return v1

    .line 76
    :cond_7
    iget-object v2, p0, Lcom/rollbar/api/payload/data/body/Frame;->method:Ljava/lang/String;

    .line 77
    .line 78
    if-eqz v2, :cond_8

    .line 79
    .line 80
    iget-object v3, p1, Lcom/rollbar/api/payload/data/body/Frame;->method:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-nez v2, :cond_9

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_8
    iget-object v2, p1, Lcom/rollbar/api/payload/data/body/Frame;->method:Ljava/lang/String;

    .line 90
    .line 91
    if-eqz v2, :cond_9

    .line 92
    .line 93
    :goto_3
    return v1

    .line 94
    :cond_9
    iget-object v2, p0, Lcom/rollbar/api/payload/data/body/Frame;->code:Ljava/lang/String;

    .line 95
    .line 96
    if-eqz v2, :cond_a

    .line 97
    .line 98
    iget-object v3, p1, Lcom/rollbar/api/payload/data/body/Frame;->code:Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-nez v2, :cond_b

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_a
    iget-object v2, p1, Lcom/rollbar/api/payload/data/body/Frame;->code:Ljava/lang/String;

    .line 108
    .line 109
    if-eqz v2, :cond_b

    .line 110
    .line 111
    :goto_4
    return v1

    .line 112
    :cond_b
    iget-object v2, p0, Lcom/rollbar/api/payload/data/body/Frame;->className:Ljava/lang/String;

    .line 113
    .line 114
    if-eqz v2, :cond_c

    .line 115
    .line 116
    iget-object v3, p1, Lcom/rollbar/api/payload/data/body/Frame;->className:Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-nez v2, :cond_d

    .line 123
    .line 124
    goto :goto_5

    .line 125
    :cond_c
    iget-object v2, p1, Lcom/rollbar/api/payload/data/body/Frame;->className:Ljava/lang/String;

    .line 126
    .line 127
    if-eqz v2, :cond_d

    .line 128
    .line 129
    :goto_5
    return v1

    .line 130
    :cond_d
    iget-object v2, p0, Lcom/rollbar/api/payload/data/body/Frame;->context:Lcom/rollbar/api/payload/data/body/CodeContext;

    .line 131
    .line 132
    if-eqz v2, :cond_e

    .line 133
    .line 134
    iget-object v3, p1, Lcom/rollbar/api/payload/data/body/Frame;->context:Lcom/rollbar/api/payload/data/body/CodeContext;

    .line 135
    .line 136
    invoke-virtual {v2, v3}, Lcom/rollbar/api/payload/data/body/CodeContext;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    if-nez v2, :cond_f

    .line 141
    .line 142
    goto :goto_6

    .line 143
    :cond_e
    iget-object v2, p1, Lcom/rollbar/api/payload/data/body/Frame;->context:Lcom/rollbar/api/payload/data/body/CodeContext;

    .line 144
    .line 145
    if-eqz v2, :cond_f

    .line 146
    .line 147
    :goto_6
    return v1

    .line 148
    :cond_f
    iget-object v2, p0, Lcom/rollbar/api/payload/data/body/Frame;->args:Ljava/util/List;

    .line 149
    .line 150
    if-eqz v2, :cond_10

    .line 151
    .line 152
    iget-object v3, p1, Lcom/rollbar/api/payload/data/body/Frame;->args:Ljava/util/List;

    .line 153
    .line 154
    invoke-interface {v2, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    if-nez v2, :cond_11

    .line 159
    .line 160
    goto :goto_7

    .line 161
    :cond_10
    iget-object v2, p1, Lcom/rollbar/api/payload/data/body/Frame;->args:Ljava/util/List;

    .line 162
    .line 163
    if-eqz v2, :cond_11

    .line 164
    .line 165
    :goto_7
    return v1

    .line 166
    :cond_11
    iget-object v2, p0, Lcom/rollbar/api/payload/data/body/Frame;->keywordArgs:Ljava/util/Map;

    .line 167
    .line 168
    if-eqz v2, :cond_12

    .line 169
    .line 170
    iget-object v3, p1, Lcom/rollbar/api/payload/data/body/Frame;->keywordArgs:Ljava/util/Map;

    .line 171
    .line 172
    invoke-interface {v2, v3}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    if-nez v2, :cond_13

    .line 177
    .line 178
    goto :goto_8

    .line 179
    :cond_12
    iget-object v2, p1, Lcom/rollbar/api/payload/data/body/Frame;->keywordArgs:Ljava/util/Map;

    .line 180
    .line 181
    if-eqz v2, :cond_13

    .line 182
    .line 183
    :goto_8
    return v1

    .line 184
    :cond_13
    iget-object v2, p0, Lcom/rollbar/api/payload/data/body/Frame;->locals:Ljava/util/Map;

    .line 185
    .line 186
    iget-object p1, p1, Lcom/rollbar/api/payload/data/body/Frame;->locals:Ljava/util/Map;

    .line 187
    .line 188
    if-eqz v2, :cond_14

    .line 189
    .line 190
    invoke-interface {v2, p1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result p1

    .line 194
    return p1

    .line 195
    :cond_14
    if-nez p1, :cond_15

    .line 196
    .line 197
    return v0

    .line 198
    :cond_15
    :goto_9
    return v1
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

.method public getArgs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/rollbar/api/payload/data/body/Frame;->args:Ljava/util/List;

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

.method public getClassName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/rollbar/api/payload/data/body/Frame;->className:Ljava/lang/String;

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

.method public getCode()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/rollbar/api/payload/data/body/Frame;->code:Ljava/lang/String;

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

.method public getColumnNumber()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/rollbar/api/payload/data/body/Frame;->columnNumber:Ljava/lang/Integer;

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

.method public getContext()Lcom/rollbar/api/payload/data/body/CodeContext;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/rollbar/api/payload/data/body/Frame;->context:Lcom/rollbar/api/payload/data/body/CodeContext;

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

.method public getFilename()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/rollbar/api/payload/data/body/Frame;->filename:Ljava/lang/String;

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

.method public getKeywordArgs()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/rollbar/api/payload/data/body/Frame;->keywordArgs:Ljava/util/Map;

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

.method public getLineNumber()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/rollbar/api/payload/data/body/Frame;->lineNumber:Ljava/lang/Integer;

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

.method public getLocals()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/rollbar/api/payload/data/body/Frame;->locals:Ljava/util/Map;

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

.method public getMethod()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/rollbar/api/payload/data/body/Frame;->method:Ljava/lang/String;

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

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/rollbar/api/payload/data/body/Frame;->filename:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 13
    .line 14
    iget-object v2, p0, Lcom/rollbar/api/payload/data/body/Frame;->lineNumber:Ljava/lang/Integer;

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Integer;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v2, v1

    .line 24
    :goto_1
    add-int/2addr v0, v2

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-object v2, p0, Lcom/rollbar/api/payload/data/body/Frame;->columnNumber:Ljava/lang/Integer;

    .line 28
    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/Integer;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    goto :goto_2

    .line 36
    :cond_2
    move v2, v1

    .line 37
    :goto_2
    add-int/2addr v0, v2

    .line 38
    mul-int/lit8 v0, v0, 0x1f

    .line 39
    .line 40
    iget-object v2, p0, Lcom/rollbar/api/payload/data/body/Frame;->method:Ljava/lang/String;

    .line 41
    .line 42
    if-eqz v2, :cond_3

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    goto :goto_3

    .line 49
    :cond_3
    move v2, v1

    .line 50
    :goto_3
    add-int/2addr v0, v2

    .line 51
    mul-int/lit8 v0, v0, 0x1f

    .line 52
    .line 53
    iget-object v2, p0, Lcom/rollbar/api/payload/data/body/Frame;->code:Ljava/lang/String;

    .line 54
    .line 55
    if-eqz v2, :cond_4

    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    goto :goto_4

    .line 62
    :cond_4
    move v2, v1

    .line 63
    :goto_4
    add-int/2addr v0, v2

    .line 64
    mul-int/lit8 v0, v0, 0x1f

    .line 65
    .line 66
    iget-object v2, p0, Lcom/rollbar/api/payload/data/body/Frame;->className:Ljava/lang/String;

    .line 67
    .line 68
    if-eqz v2, :cond_5

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    goto :goto_5

    .line 75
    :cond_5
    move v2, v1

    .line 76
    :goto_5
    add-int/2addr v0, v2

    .line 77
    mul-int/lit8 v0, v0, 0x1f

    .line 78
    .line 79
    iget-object v2, p0, Lcom/rollbar/api/payload/data/body/Frame;->context:Lcom/rollbar/api/payload/data/body/CodeContext;

    .line 80
    .line 81
    if-eqz v2, :cond_6

    .line 82
    .line 83
    invoke-virtual {v2}, Lcom/rollbar/api/payload/data/body/CodeContext;->hashCode()I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    goto :goto_6

    .line 88
    :cond_6
    move v2, v1

    .line 89
    :goto_6
    add-int/2addr v0, v2

    .line 90
    mul-int/lit8 v0, v0, 0x1f

    .line 91
    .line 92
    iget-object v2, p0, Lcom/rollbar/api/payload/data/body/Frame;->args:Ljava/util/List;

    .line 93
    .line 94
    if-eqz v2, :cond_7

    .line 95
    .line 96
    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    goto :goto_7

    .line 101
    :cond_7
    move v2, v1

    .line 102
    :goto_7
    add-int/2addr v0, v2

    .line 103
    mul-int/lit8 v0, v0, 0x1f

    .line 104
    .line 105
    iget-object v2, p0, Lcom/rollbar/api/payload/data/body/Frame;->keywordArgs:Ljava/util/Map;

    .line 106
    .line 107
    if-eqz v2, :cond_8

    .line 108
    .line 109
    invoke-interface {v2}, Ljava/util/Map;->hashCode()I

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    goto :goto_8

    .line 114
    :cond_8
    move v2, v1

    .line 115
    :goto_8
    add-int/2addr v0, v2

    .line 116
    mul-int/lit8 v0, v0, 0x1f

    .line 117
    .line 118
    iget-object v2, p0, Lcom/rollbar/api/payload/data/body/Frame;->locals:Ljava/util/Map;

    .line 119
    .line 120
    if-eqz v2, :cond_9

    .line 121
    .line 122
    invoke-interface {v2}, Ljava/util/Map;->hashCode()I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    :cond_9
    add-int/2addr v0, v1

    .line 127
    return v0
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

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Frame{filename=\'"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/rollbar/api/payload/data/body/Frame;->filename:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "\', lineNumber="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/rollbar/api/payload/data/body/Frame;->lineNumber:Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", columnNumber="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lcom/rollbar/api/payload/data/body/Frame;->columnNumber:Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", method=\'"

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lcom/rollbar/api/payload/data/body/Frame;->method:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, "\', code=\'"

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lcom/rollbar/api/payload/data/body/Frame;->code:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, "\', className=\'"

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lcom/rollbar/api/payload/data/body/Frame;->className:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, "\', context="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, Lcom/rollbar/api/payload/data/body/Frame;->context:Lcom/rollbar/api/payload/data/body/CodeContext;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", args="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, Lcom/rollbar/api/payload/data/body/Frame;->args:Ljava/util/List;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, ", keywordArgs="

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget-object v1, p0, Lcom/rollbar/api/payload/data/body/Frame;->keywordArgs:Ljava/util/Map;

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v1, ", locals="

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget-object v1, p0, Lcom/rollbar/api/payload/data/body/Frame;->locals:Ljava/util/Map;

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const/16 v1, 0x7d

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    return-object v0
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

.method public truncateStrings(I)Lcom/rollbar/api/payload/data/body/Frame;
    .locals 2

    .line 2
    new-instance v0, Lcom/rollbar/api/payload/data/body/Frame$Builder;

    invoke-direct {v0, p0}, Lcom/rollbar/api/payload/data/body/Frame$Builder;-><init>(Lcom/rollbar/api/payload/data/body/Frame;)V

    iget-object v1, p0, Lcom/rollbar/api/payload/data/body/Frame;->filename:Ljava/lang/String;

    .line 3
    invoke-static {v1, p1}, Lcom/rollbar/api/truncation/TruncationHelper;->truncateString(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/rollbar/api/payload/data/body/Frame$Builder;->filename(Ljava/lang/String;)Lcom/rollbar/api/payload/data/body/Frame$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/rollbar/api/payload/data/body/Frame;->method:Ljava/lang/String;

    .line 4
    invoke-static {v1, p1}, Lcom/rollbar/api/truncation/TruncationHelper;->truncateString(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/rollbar/api/payload/data/body/Frame$Builder;->method(Ljava/lang/String;)Lcom/rollbar/api/payload/data/body/Frame$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/rollbar/api/payload/data/body/Frame;->code:Ljava/lang/String;

    .line 5
    invoke-static {v1, p1}, Lcom/rollbar/api/truncation/TruncationHelper;->truncateString(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/rollbar/api/payload/data/body/Frame$Builder;->code(Ljava/lang/String;)Lcom/rollbar/api/payload/data/body/Frame$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/rollbar/api/payload/data/body/Frame;->className:Ljava/lang/String;

    .line 6
    invoke-static {v1, p1}, Lcom/rollbar/api/truncation/TruncationHelper;->truncateString(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/rollbar/api/payload/data/body/Frame$Builder;->className(Ljava/lang/String;)Lcom/rollbar/api/payload/data/body/Frame$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/rollbar/api/payload/data/body/Frame;->context:Lcom/rollbar/api/payload/data/body/CodeContext;

    .line 7
    invoke-static {v1, p1}, Lcom/rollbar/api/truncation/TruncationHelper;->truncateStringsInObject(Lcom/rollbar/api/truncation/StringTruncatable;I)Lcom/rollbar/api/truncation/StringTruncatable;

    move-result-object v1

    check-cast v1, Lcom/rollbar/api/payload/data/body/CodeContext;

    invoke-virtual {v0, v1}, Lcom/rollbar/api/payload/data/body/Frame$Builder;->context(Lcom/rollbar/api/payload/data/body/CodeContext;)Lcom/rollbar/api/payload/data/body/Frame$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/rollbar/api/payload/data/body/Frame;->args:Ljava/util/List;

    .line 8
    invoke-static {v1, p1}, Lcom/rollbar/api/truncation/TruncationHelper;->truncateStringsInObjectList(Ljava/util/List;I)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/rollbar/api/payload/data/body/Frame$Builder;->args(Ljava/util/List;)Lcom/rollbar/api/payload/data/body/Frame$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/rollbar/api/payload/data/body/Frame;->keywordArgs:Ljava/util/Map;

    .line 9
    invoke-static {v1, p1}, Lcom/rollbar/api/truncation/TruncationHelper;->truncateStringsInMap(Ljava/util/Map;I)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/rollbar/api/payload/data/body/Frame$Builder;->keywordArgs(Ljava/util/Map;)Lcom/rollbar/api/payload/data/body/Frame$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/rollbar/api/payload/data/body/Frame;->locals:Ljava/util/Map;

    .line 10
    invoke-static {v1, p1}, Lcom/rollbar/api/truncation/TruncationHelper;->truncateStringsInMap(Ljava/util/Map;I)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/rollbar/api/payload/data/body/Frame$Builder;->locals(Ljava/util/Map;)Lcom/rollbar/api/payload/data/body/Frame$Builder;

    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lcom/rollbar/api/payload/data/body/Frame$Builder;->build()Lcom/rollbar/api/payload/data/body/Frame;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic truncateStrings(I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/rollbar/api/payload/data/body/Frame;->truncateStrings(I)Lcom/rollbar/api/payload/data/body/Frame;

    move-result-object p1

    return-object p1
.end method
