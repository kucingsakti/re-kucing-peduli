.class public Lcom/rollbar/api/payload/data/body/Body;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/rollbar/api/json/JsonSerializable;
.implements Lcom/rollbar/api/truncation/StringTruncatable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rollbar/api/payload/data/body/Body$Builder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/rollbar/api/json/JsonSerializable;",
        "Lcom/rollbar/api/truncation/StringTruncatable<",
        "Lcom/rollbar/api/payload/data/body/Body;",
        ">;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x26a02ceae25d5b78L


# instance fields
.field private final bodyContent:Lcom/rollbar/api/payload/data/body/BodyContent;


# direct methods
.method private constructor <init>(Lcom/rollbar/api/payload/data/body/Body$Builder;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lcom/rollbar/api/payload/data/body/Body$Builder;->access$000(Lcom/rollbar/api/payload/data/body/Body$Builder;)Lcom/rollbar/api/payload/data/body/BodyContent;

    move-result-object p1

    iput-object p1, p0, Lcom/rollbar/api/payload/data/body/Body;->bodyContent:Lcom/rollbar/api/payload/data/body/BodyContent;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/rollbar/api/payload/data/body/Body$Builder;Lcom/rollbar/api/payload/data/body/Body$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/rollbar/api/payload/data/body/Body;-><init>(Lcom/rollbar/api/payload/data/body/Body$Builder;)V

    return-void
.end method

.method public static synthetic access$100(Lcom/rollbar/api/payload/data/body/Body;)Lcom/rollbar/api/payload/data/body/BodyContent;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/rollbar/api/payload/data/body/Body;->bodyContent:Lcom/rollbar/api/payload/data/body/BodyContent;

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
    iget-object v1, p0, Lcom/rollbar/api/payload/data/body/Body;->bodyContent:Lcom/rollbar/api/payload/data/body/BodyContent;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-interface {v1}, Lcom/rollbar/api/payload/data/body/BodyContent;->getKeyName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v2, p0, Lcom/rollbar/api/payload/data/body/Body;->bodyContent:Lcom/rollbar/api/payload/data/body/BodyContent;

    .line 15
    .line 16
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    :cond_0
    return-object v0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
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
    if-eqz p1, :cond_3

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
    goto :goto_0

    .line 19
    :cond_1
    check-cast p1, Lcom/rollbar/api/payload/data/body/Body;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/rollbar/api/payload/data/body/Body;->bodyContent:Lcom/rollbar/api/payload/data/body/BodyContent;

    .line 22
    .line 23
    iget-object p1, p1, Lcom/rollbar/api/payload/data/body/Body;->bodyContent:Lcom/rollbar/api/payload/data/body/BodyContent;

    .line 24
    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1

    .line 32
    :cond_2
    if-nez p1, :cond_3

    .line 33
    .line 34
    return v0

    .line 35
    :cond_3
    :goto_0
    return v1
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
.end method

.method public getContents()Lcom/rollbar/api/payload/data/body/BodyContent;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/rollbar/api/payload/data/body/Body;->bodyContent:Lcom/rollbar/api/payload/data/body/BodyContent;

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
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/rollbar/api/payload/data/body/Body;->bodyContent:Lcom/rollbar/api/payload/data/body/BodyContent;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
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
    const-string v1, "Body{bodyContent="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/rollbar/api/payload/data/body/Body;->bodyContent:Lcom/rollbar/api/payload/data/body/BodyContent;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x7d

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public truncateStrings(I)Lcom/rollbar/api/payload/data/body/Body;
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/rollbar/api/payload/data/body/Body;->bodyContent:Lcom/rollbar/api/payload/data/body/BodyContent;

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Lcom/rollbar/api/payload/data/body/Body$Builder;

    invoke-direct {v0, p0}, Lcom/rollbar/api/payload/data/body/Body$Builder;-><init>(Lcom/rollbar/api/payload/data/body/Body;)V

    iget-object v1, p0, Lcom/rollbar/api/payload/data/body/Body;->bodyContent:Lcom/rollbar/api/payload/data/body/BodyContent;

    .line 4
    invoke-interface {v1, p1}, Lcom/rollbar/api/truncation/StringTruncatable;->truncateStrings(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/rollbar/api/payload/data/body/BodyContent;

    invoke-virtual {v0, p1}, Lcom/rollbar/api/payload/data/body/Body$Builder;->bodyContent(Lcom/rollbar/api/payload/data/body/BodyContent;)Lcom/rollbar/api/payload/data/body/Body$Builder;

    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/rollbar/api/payload/data/body/Body$Builder;->build()Lcom/rollbar/api/payload/data/body/Body;

    move-result-object p1

    return-object p1

    :cond_0
    return-object p0
.end method

.method public bridge synthetic truncateStrings(I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/rollbar/api/payload/data/body/Body;->truncateStrings(I)Lcom/rollbar/api/payload/data/body/Body;

    move-result-object p1

    return-object p1
.end method
