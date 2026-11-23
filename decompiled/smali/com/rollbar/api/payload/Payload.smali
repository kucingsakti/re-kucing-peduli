.class public Lcom/rollbar/api/payload/Payload;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/rollbar/api/json/JsonSerializable;
.implements Lcom/rollbar/api/truncation/StringTruncatable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rollbar/api/payload/Payload$Builder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/rollbar/api/json/JsonSerializable;",
        "Lcom/rollbar/api/truncation/StringTruncatable<",
        "Lcom/rollbar/api/payload/Payload;",
        ">;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x2a6222831729b18fL


# instance fields
.field private final accessToken:Ljava/lang/String;

.field private final data:Lcom/rollbar/api/payload/data/Data;

.field public final json:Ljava/lang/String;

.field private sendAttemptCount:I


# direct methods
.method private constructor <init>(Lcom/rollbar/api/payload/Payload$Builder;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lcom/rollbar/api/payload/Payload$Builder;->access$000(Lcom/rollbar/api/payload/Payload$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/rollbar/api/payload/Payload;->accessToken:Ljava/lang/String;

    .line 4
    invoke-static {p1}, Lcom/rollbar/api/payload/Payload$Builder;->access$100(Lcom/rollbar/api/payload/Payload$Builder;)Lcom/rollbar/api/payload/data/Data;

    move-result-object p1

    iput-object p1, p0, Lcom/rollbar/api/payload/Payload;->data:Lcom/rollbar/api/payload/data/Data;

    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lcom/rollbar/api/payload/Payload;->json:Ljava/lang/String;

    const/4 p1, 0x0

    .line 6
    iput p1, p0, Lcom/rollbar/api/payload/Payload;->sendAttemptCount:I

    return-void
.end method

.method public synthetic constructor <init>(Lcom/rollbar/api/payload/Payload$Builder;Lcom/rollbar/api/payload/Payload$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/rollbar/api/payload/Payload;-><init>(Lcom/rollbar/api/payload/Payload$Builder;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Lcom/rollbar/api/payload/Payload;->accessToken:Ljava/lang/String;

    .line 9
    iput-object v0, p0, Lcom/rollbar/api/payload/Payload;->data:Lcom/rollbar/api/payload/data/Data;

    .line 10
    iput-object p1, p0, Lcom/rollbar/api/payload/Payload;->json:Ljava/lang/String;

    const/4 p1, 0x0

    .line 11
    iput p1, p0, Lcom/rollbar/api/payload/Payload;->sendAttemptCount:I

    return-void
.end method

.method public static synthetic access$200(Lcom/rollbar/api/payload/Payload;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/Payload;->accessToken:Ljava/lang/String;

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

.method public static synthetic access$300(Lcom/rollbar/api/payload/Payload;)Lcom/rollbar/api/payload/data/Data;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/Payload;->data:Lcom/rollbar/api/payload/data/Data;

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
.method public bridge synthetic asJson()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/rollbar/api/payload/Payload;->asJson()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public asJson()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 3
    iget-object v1, p0, Lcom/rollbar/api/payload/Payload;->accessToken:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 4
    const-string v2, "access_token"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    :cond_0
    iget-object v1, p0, Lcom/rollbar/api/payload/Payload;->data:Lcom/rollbar/api/payload/data/Data;

    if-eqz v1, :cond_1

    .line 6
    const-string v2, "data"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
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
    if-eqz p1, :cond_5

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
    goto :goto_1

    .line 19
    :cond_1
    check-cast p1, Lcom/rollbar/api/payload/Payload;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/rollbar/api/payload/Payload;->accessToken:Ljava/lang/String;

    .line 22
    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    iget-object v3, p1, Lcom/rollbar/api/payload/Payload;->accessToken:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_3

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    iget-object v2, p1, Lcom/rollbar/api/payload/Payload;->accessToken:Ljava/lang/String;

    .line 35
    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    :goto_0
    return v1

    .line 39
    :cond_3
    iget-object v2, p0, Lcom/rollbar/api/payload/Payload;->data:Lcom/rollbar/api/payload/data/Data;

    .line 40
    .line 41
    iget-object p1, p1, Lcom/rollbar/api/payload/Payload;->data:Lcom/rollbar/api/payload/data/Data;

    .line 42
    .line 43
    if-eqz v2, :cond_4

    .line 44
    .line 45
    invoke-virtual {v2, p1}, Lcom/rollbar/api/payload/data/Data;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    return p1

    .line 50
    :cond_4
    if-nez p1, :cond_5

    .line 51
    .line 52
    return v0

    .line 53
    :cond_5
    :goto_1
    return v1
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
.end method

.method public getAccessToken()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/rollbar/api/payload/Payload;->accessToken:Ljava/lang/String;

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

.method public getData()Lcom/rollbar/api/payload/data/Data;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/rollbar/api/payload/Payload;->data:Lcom/rollbar/api/payload/data/Data;

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

.method public getSendAttemptCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/rollbar/api/payload/Payload;->sendAttemptCount:I

    .line 2
    .line 3
    return v0
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
    iget-object v0, p0, Lcom/rollbar/api/payload/Payload;->accessToken:Ljava/lang/String;

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
    iget-object v2, p0, Lcom/rollbar/api/payload/Payload;->data:Lcom/rollbar/api/payload/data/Data;

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {v2}, Lcom/rollbar/api/payload/data/Data;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    :cond_1
    add-int/2addr v0, v1

    .line 23
    return v0
    .line 24
    .line 25
    .line 26
.end method

.method public incrementSendAttemptCount()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/rollbar/api/payload/Payload;->sendAttemptCount:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lcom/rollbar/api/payload/Payload;->sendAttemptCount:I

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
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Payload{accessToken=\'"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/rollbar/api/payload/Payload;->accessToken:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "\', data="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/rollbar/api/payload/Payload;->data:Lcom/rollbar/api/payload/data/Data;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const/16 v1, 0x7d

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0
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
.end method

.method public truncateStrings(I)Lcom/rollbar/api/payload/Payload;
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/rollbar/api/payload/Payload;->data:Lcom/rollbar/api/payload/data/Data;

    if-nez v0, :cond_0

    return-object p0

    .line 3
    :cond_0
    new-instance v0, Lcom/rollbar/api/payload/Payload$Builder;

    invoke-direct {v0, p0}, Lcom/rollbar/api/payload/Payload$Builder;-><init>(Lcom/rollbar/api/payload/Payload;)V

    iget-object v1, p0, Lcom/rollbar/api/payload/Payload;->data:Lcom/rollbar/api/payload/data/Data;

    .line 4
    invoke-static {v1, p1}, Lcom/rollbar/api/truncation/TruncationHelper;->truncateStringsInObject(Lcom/rollbar/api/truncation/StringTruncatable;I)Lcom/rollbar/api/truncation/StringTruncatable;

    move-result-object p1

    check-cast p1, Lcom/rollbar/api/payload/data/Data;

    invoke-virtual {v0, p1}, Lcom/rollbar/api/payload/Payload$Builder;->data(Lcom/rollbar/api/payload/data/Data;)Lcom/rollbar/api/payload/Payload$Builder;

    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/rollbar/api/payload/Payload$Builder;->build()Lcom/rollbar/api/payload/Payload;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic truncateStrings(I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/rollbar/api/payload/Payload;->truncateStrings(I)Lcom/rollbar/api/payload/Payload;

    move-result-object p1

    return-object p1
.end method
