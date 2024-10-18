# Activity-Life-Cycle

Android Activity Lifecycle explains how an Android app's activity (a single screen in the app) behaves during its life cycle. In short, this explains how Android handles activities and what happens to them as users interact with the app, switch between apps, or close them. Here's a simplified breakdown of the procedure:

**1) Activity Launched:** The app's activity (screen) is started.
    - The system calls onCreate(), initializing the activity.
    - Then, onStart() is called, indicating the activity is about to become visible.
    - After that, onResume() is called when the activity is fully visible and interactive (activity is running).
**2) Activity Running:** The app is in the foreground and the user is interacting with it.

**3) onPause():** When another activity comes to the foreground (for example, a new screen appears, or the user switches to another app), the current activity goes into the background, but it’s still partially alive. The activity is no longer visible to the user.

**4) onStop():** If the activity is completely obscured (not visible to the user at all, like when another app fully takes over the screen), the system calls onStop(). The activity is no longer visible and might be killed by the system if memory is needed.

**5) onDestroy():** If the activity is being fully shut down or destroyed by the system (for example, the user closes the app), onDestroy() is called.

**6) App Process Killed:** If the system needs memory, it might kill the app process even before onDestroy() is called.

**7) Returning to the activity:** If the user returns to the paused or stopped activity:
    - onRestart() is called, followed by onStart() and onResume(), bringing the activity back into the foreground.
