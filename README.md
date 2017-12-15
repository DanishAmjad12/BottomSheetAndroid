# BottomSheetAndroid

Bottom sheets is basically a slide up from the bottom of the screen to reveal more content.You can find more detailed information of Bottom Sheet on Google Material Design guidelines.
https://material.io/guidelines/components/bottom-sheets.html

# The Types of Bottom Sheets
1). Persistent Bottom Sheet.

2). Modal Bottom Sheet.

# Persistent Bottom Sheet

Persistent bottom sheets display in-app content that supplements the main view. It remains visible even when not actively in use, resting at the same elevation as an app and integrating with its content.

# Modal Bottom Sheet

Modal bottom sheets are alternatives to menus, or simple dialogs, and can display deep-linked content from another app. They appear above other UI elements and must be dismissed in order to interact with the underlying content. When a modal bottom sheet slides into the screen, the rest of the screen dims, giving focus to the bottom sheet.

# Important Attributes
Here few important attributes has to observed.

> app:layout_behavior: This attribute makes the layout act as bottom sheet. The value should be android.support.design.widget.BottomSheetBehavior

> app:behavior_peekHeight: This is the height of the bottom sheet when it is minimized.

> app:behavior_hideable: Makes bottom sheet hidden when swiped it down.


