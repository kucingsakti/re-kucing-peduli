package Q5;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private boolean isDeniedByLifecycleCallback;
    private boolean isOneSignalPayload;
    private boolean isWorkManagerProcessing;

    public final boolean isProcessed() {
        return !this.isOneSignalPayload || this.isDeniedByLifecycleCallback || this.isWorkManagerProcessing;
    }

    public final boolean isWorkManagerProcessing() {
        return this.isWorkManagerProcessing;
    }

    public final void setDeniedByLifecycleCallback(boolean z6) {
        this.isDeniedByLifecycleCallback = z6;
    }

    public final void setOneSignalPayload(boolean z6) {
        this.isOneSignalPayload = z6;
    }

    public final void setWorkManagerProcessing(boolean z6) {
        this.isWorkManagerProcessing = z6;
    }
}
