.class public abstract synthetic Lcom/onesignal/inAppMessages/internal/triggers/impl/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic $EnumSwitchMapping$0:[I

.field public static final synthetic $EnumSwitchMapping$1:[I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    invoke-static {}, Lcom/onesignal/inAppMessages/internal/l$a;->values()[Lcom/onesignal/inAppMessages/internal/l$a;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sget-object v1, Lcom/onesignal/inAppMessages/internal/l$a;->SESSION_TIME:Lcom/onesignal/inAppMessages/internal/l$a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1

    sget-object v1, Lcom/onesignal/inAppMessages/internal/l$a;->TIME_SINCE_LAST_IN_APP:Lcom/onesignal/inAppMessages/internal/l$a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v3, 0x2

    aput v3, v0, v1

    sput-object v0, Lcom/onesignal/inAppMessages/internal/triggers/impl/b;->$EnumSwitchMapping$0:[I

    invoke-static {}, Lcom/onesignal/inAppMessages/internal/l$b;->values()[Lcom/onesignal/inAppMessages/internal/l$b;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sget-object v1, Lcom/onesignal/inAppMessages/internal/l$b;->LESS_THAN:Lcom/onesignal/inAppMessages/internal/l$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v2, v0, v1

    sget-object v1, Lcom/onesignal/inAppMessages/internal/l$b;->LESS_THAN_OR_EQUAL_TO:Lcom/onesignal/inAppMessages/internal/l$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v3, v0, v1

    sget-object v1, Lcom/onesignal/inAppMessages/internal/l$b;->GREATER_THAN:Lcom/onesignal/inAppMessages/internal/l$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1

    sget-object v1, Lcom/onesignal/inAppMessages/internal/l$b;->GREATER_THAN_OR_EQUAL_TO:Lcom/onesignal/inAppMessages/internal/l$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1

    sget-object v1, Lcom/onesignal/inAppMessages/internal/l$b;->EQUAL_TO:Lcom/onesignal/inAppMessages/internal/l$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1

    sget-object v1, Lcom/onesignal/inAppMessages/internal/l$b;->NOT_EQUAL_TO:Lcom/onesignal/inAppMessages/internal/l$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1

    sput-object v0, Lcom/onesignal/inAppMessages/internal/triggers/impl/b;->$EnumSwitchMapping$1:[I

    return-void
.end method
