package A9;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;

/* JADX INFO: renamed from: A9.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0148v implements Comparator {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f390b;

    public /* synthetic */ C0148v(Object obj, int i10) {
        this.a = i10;
        this.f390b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                AbstractC0151y abstractC0151y = (AbstractC0151y) obj;
                p210v8.i.e(abstractC0151y, "it");
                p200u8.b bVar = (p200u8.b) this.f390b;
                String string = bVar.invoke(abstractC0151y).toString();
                AbstractC0151y abstractC0151y2 = (AbstractC0151y) obj2;
                p210v8.i.e(abstractC0151y2, "it");
                return C3.a.d(string, bVar.invoke(abstractC0151y2).toString());
            default:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int iCompareTo = Boolean.valueOf(materialButton.f9555G).compareTo(Boolean.valueOf(materialButton2.f9555G));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                if (iCompareTo2 != 0) {
                    return iCompareTo2;
                }
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f390b;
                return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
        }
    }
}
