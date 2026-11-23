.class public abstract synthetic Lcom/onesignal/user/internal/operations/impl/executors/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic $EnumSwitchMapping$0:[I

.field public static final synthetic $EnumSwitchMapping$1:[I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    invoke-static {}, Lcom/onesignal/common/g$a;->values()[Lcom/onesignal/common/g$a;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sget-object v1, Lcom/onesignal/common/g$a;->RETRYABLE:Lcom/onesignal/common/g$a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1

    sget-object v1, Lcom/onesignal/common/g$a;->CONFLICT:Lcom/onesignal/common/g$a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v3, 0x2

    aput v3, v0, v1

    sget-object v1, Lcom/onesignal/common/g$a;->INVALID:Lcom/onesignal/common/g$a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v4, 0x3

    aput v4, v0, v1

    sget-object v1, Lcom/onesignal/common/g$a;->UNAUTHORIZED:Lcom/onesignal/common/g$a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v4, 0x4

    aput v4, v0, v1

    sget-object v1, Lcom/onesignal/common/g$a;->MISSING:Lcom/onesignal/common/g$a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v4, 0x5

    aput v4, v0, v1

    sput-object v0, Lcom/onesignal/user/internal/operations/impl/executors/k;->$EnumSwitchMapping$0:[I

    invoke-static {}, Lv6/g;->values()[Lv6/g;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sget-object v1, Lv6/g;->SMS:Lv6/g;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v2, v0, v1

    sget-object v1, Lv6/g;->EMAIL:Lv6/g;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v3, v0, v1

    sput-object v0, Lcom/onesignal/user/internal/operations/impl/executors/k;->$EnumSwitchMapping$1:[I

    return-void
.end method
